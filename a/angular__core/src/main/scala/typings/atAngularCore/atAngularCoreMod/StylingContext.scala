package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The styling context acts as a styling manifest (shaped as an array) for determining which
  * styling properties have been assigned via the provided `updateStylingMap`, `updateStyleProp`
  * and `updateClassProp` functions. It also stores the static style/class values that were
  * extracted from the template by the compiler.
  *
  * A context is created by Angular when:
  * 1. An element contains static styling values (like style="..." or class="...")
  * 2. An element contains single property binding values (like [style.prop]="x" or
  * [class.prop]="y")
  * 3. An element contains multi property binding values (like [style]="x" or [class]="y")
  * 4. A directive contains host bindings for static, single or multi styling properties/bindings.
  * 5. An animation player is added to an element via `addPlayer`
  *
  * Note that even if an element contains static styling then this context will be created and
  * attached to it. The reason why this happens (instead of treating styles/classes as regular
  * HTML attributes) is because the style/class bindings must be able to default themselves back
  * to their respective static values when they are set to null.
  *
  * Say for example we have this:
  * ```
  * <!-- when `myWidthExp=null` then a width of `100px`
  *      will be used a default value for width -->
  * <div style="width:100px" [style.width]="myWidthExp"></div>
  * ```
  *
  * Even in the situation where there are no bindings, the static styling is still placed into the
  * context because there may be another directive on the same element that has styling.
  *
  * When Angular initializes styling data for an element then it will first register the static
  * styling values on the element using one of these two instructions:
  *
  * 1. elementStart or element (within the template function of a component)
  * 2. elementHostAttrs (for directive host bindings)
  *
  * In either case, a styling context will be created and stored within an element's `LViewData`.
  * Once the styling context is created then single and multi properties can be stored within it.
  * For this to happen, the following function needs to be called:
  *
  * `styling` (called with style properties, class properties and a sanitizer + a directive
  * instance).
  *
  * When this instruction is called it will populate the styling context with the provided style
  * and class names into the context.
  *
  * The context itself looks like this:
  *
  * context = [
  *   // 0-8: header values (about 8 entries of configuration data)
  *   // 9+: this is where each entry is stored:
  * ]
  *
  * Let's say we have the following template code:
  *
  * ```
  * <div class="foo bar"
  *      style="width:200px; color:red"
  *      [style.width]="myWidthExp"
  *      [style.height]="myHeightExp"
  *      [class.baz]="myBazExp">
  * ```
  *
  * The context generated from these values will look like this (note that
  * for each binding name (the class and style bindings) the values will
  * be inserted twice into the array (once for single property entries and
  * again for multi property entries).
  *
  * context = [
  *   // 0-8: header values (about 8 entries of configuration data)
  *   // 9+: this is where each entry is stored:
  *
  *   // SINGLE PROPERTIES
  *   configForWidth,
  *   'width'
  *   myWidthExp, // the binding value not the binding itself
  *   0, // the directive owner
  *
  *   configForHeight,
  *   'height'
  *   myHeightExp, // the binding value not the binding itself
  *   0, // the directive owner
  *
  *   configForBazClass,
  *   'baz
  *   myBazClassExp, // the binding value not the binding itself
  *   0, // the directive owner
  *
  *   // MULTI PROPERTIES
  *   configForWidth,
  *   'width'
  *   myWidthExp, // the binding value not the binding itself
  *   0, // the directive owner
  *
  *   configForHeight,
  *   'height'
  *   myHeightExp, // the binding value not the binding itself
  *   0, // the directive owner
  *
  *   configForBazClass,
  *   'baz
  *   myBazClassExp, // the binding value not the binding itself
  *   0, // the directive owner
  * ]
  *
  * The configuration values are left out of the example above because
  * the ordering of them could change between code patches. Please read the
  * documentation below to get a better understand of what the configuration
  * values are and how they work.
  *
  * Each time a binding property is updated (whether it be through a single
  * property instruction like `styleProp`, `classProp`,
  * `styleMap` or `classMap`) then the values in the context will be updated as
  * well.
  *
  * If for example `[style.width]` updates to `555px` then its value will be reflected
  * in the context as so:
  *
  * context = [
  *   // ...
  *   configForWidth, // this will be marked DIRTY
  *   'width'
  *   '555px',
  *   0,
  *   //..
  * ]
  *
  * The context and directive data will also be marked dirty.
  *
  * Despite the context being updated, nothing has been rendered on screen (not styles or
  * classes have been set on the element). To kick off rendering for an element the following
  * function needs to be run `stylingApply`.
  *
  * `stylingApply` will run through the context and find each dirty value and render them onto
  * the element. Once complete, all styles/classes will be set to clean. Because of this, the render
  * function will now know not to rerun itself again if called again unless new style/class values
  * have changed.
  *
  * ## Directives
  * Directive style/class values (which are provided through host bindings) are also supported and
  * housed within the same styling context as are template-level style/class properties/bindings
  * So long as they are all assigned to the same element, both directive-level and template-level
  * styling bindings share the same context.
  *
  * Each of the following instructions supports accepting a directive instance as an input parameter:
  *
  * - `elementHostAttrs`
  * - `styling`
  * - `styleProp`
  * - `classProp`
  * - `styleMap`
  * - `classMap`
  * - `stylingApply`
  *
  * Each time a directive value is passed in, it will be converted into an index by examining the
  * directive registry (which lives in the context configuration area). The index is then used
  * to help single style properties figure out where a value is located in the context.
  *
  *
  * ## Single-level styling bindings (`[style.prop]` and `[class.name]`)
  *
  * Both `[style.prop]` and `[class.name]` bindings are run through the `updateStyleProp`
  * and `updateClassProp` functions respectively. They work by examining the provided
  * `offset` value and are able to locate the exact spot in the context where the
  * matching style is located.
  *
  * Both `[style.prop]` and `[class.name]` bindings are able to process these values
  * from directive host bindings. When evaluated (from the host binding function) the
  * `directiveRef` value is then passed in.
  *
  * If two directives or a directive + a template binding both write to the same style/class
  * binding then the styling context code will decide which one wins based on the following
  * rule:
  *
  * 1. If the template binding has a value then it always wins
  * 2. Otherwise whichever first-registered directive that has that value first will win
  *
  * The code example helps make this clear:
  *
  * ```
  * <!--
  * <div [style.width]="myWidth"
  *      [my-width-directive]="'600px'">
  * -->
  *
  * @Directive({
  *  selector: '[my-width-directive']
  * })
  * class MyWidthDirective {
  *   @Input('my-width-directive')
  *   @HostBinding('style.width')
  *   public width = null;
  * }
  * ```
  *
  * Since there is a style binding for width present on the element (`[style.width]`) then
  * it will always win over the width binding that is present as a host binding within
  * the `MyWidthDirective`. However, if `[style.width]` renders as `null` (so `myWidth=null`)
  * then the `MyWidthDirective` will be able to write to the `width` style within the context.
  * Simply put, whichever directive writes to a value first ends up having ownership of it as
  * long as the template didn't set anything.
  *
  * The way in which the ownership is facilitated is through index value. The earliest directives
  * get the smallest index values (with 0 being reserved for the template element bindings). Each
  * time a value is written from a directive or the template bindings, the value itself gets
  * assigned the directive index value in its data. If another directive writes a value again then
  * its directive index gets compared against the directive index that exists on the element. Only
  * when the new value's directive index is less than the existing directive index then the new
  * value will be written to the context. But, if the existing value is null then the new value is
  * written by the less important directive.
  *
  * Each directive also has its own sanitizer and dirty flags. These values are consumed within the
  * rendering function.
  *
  *
  * ## Multi-level styling bindings (`[style]` and `[class]`)
  *
  * Multi-level styling bindings are treated as less important (less specific) as single-level
  * bindings (things like `[style.prop]` and `[class.name]`).
  *
  * Multi-level bindings are still applied to the context in a similar way as are single level
  * bindings, but this process works by diffing the new multi-level values (which are key/value
  * maps) against the existing set of styles that live in the context. Each time a new map value
  * is detected (via identity check) then it will loop through the values and figure out what
  * has changed and reorder the context array to match the ordering of the keys. This reordering
  * of the context makes sure that follow-up traversals of the context when updated against the
  * key/value map are as close as possible to o(n) (where "n" is the size of the key/value map).
  *
  * If a `directiveRef` value is passed in then the styling algorithm code will take the directive's
  * prioritization index into account and update the values with respect to more important
  * directives. This means that if a value such as `width` is updated in two different `[style]`
  * bindings (say one on the template and another within a directive that sits on the same element)
  * then the algorithm will decide how to update the value based on the following heuristic:
  *
  * 1. If the template binding has a value then it always wins
  * 2. If not then whichever first-registered directive that has that value first will win
  *
  * It will also update the value if it was set to `null` by a previous directive (or the template).
  *
  * Each time a value is updated (or removed) then the context will change shape to better match
  * the ordering of the styling data as well as the ordering of each directive that contains styling
  * data. (See `patchStylingMapIntoContext` inside of class_and_style_bindings.ts to better
  * understand how this works.)
  *
  * ## Rendering
  * The rendering mechanism (when the styling data is applied on screen) occurs via the
  * `stylingApply` function and is designed to run after **all** styling functions have been
  * evaluated. The rendering algorithm will loop over the context and only apply the styles that are
  * flagged as dirty (either because they are new, updated or have been removed via multi or
  * single bindings).
  */
@js.native
trait StylingContext
  extends Array[
      StringDictionary[js.Any] | Double | String | Boolean | RElement | StyleSanitizeFn | PlayerContext | Null
    ]

