package typings
package atAngularCoreLib.srcMetadataDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directive extends js.Object {
  /**
    * Defines the name that can be used in the template to assign this directive to a variable.
    *
    * @usageNotes
    *
    * ### Simple Example
    *
    * ```
    * @Directive({
    *   selector: 'child-dir',
    *   exportAs: 'child'
    * })
    * class ChildDir {
    * }
    *
    * @Component({
    *   selector: 'main',
    *   template: `<child-dir #c="child"></child-dir>`
    * })
    * class MainComponent {
    * }
    * ```
    *
    */
  /**
    * The name or names that can be used in the template to assign this directive to a variable.
    * For multiple names, use a comma-separated string.
    *
    */
  var exportAs: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maps class properties to host element bindings for properties,
    * attributes, and events, using a set of key-value pairs.
    *
    * Angular automatically checks host property bindings during change detection.
    * If a binding changes, Angular updates the directive's host element.
    *
    * When the key is a property of the host element, the property value is
    * the propagated to the specified DOM property.
    *
    * When the key is a static attribute in the DOM, the attribute value
    * is propagated to the specified property in the host element.
    *
    * For event handling:
    * - The key is the DOM event that the directive listens to.
    * To listen to global events, add the target to the event name.
    * The target can be `window`, `document` or `body`.
    * - The value is the statement to execute when the event occurs. If the
    * statement evalueates to `false`, then `preventDefault` is applied on the DOM
    * event. A handler method can refer to the `$event` local variable.
    *
    */
  var host: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Enumerates the set of data-bound input properties for a directive
    *
    * Angular automatically updates input properties during change detection.
    * The `inputs` property defines a set of `directiveProperty` to `bindingProperty`
    * configuration:
    *
    * - `directiveProperty` specifies the component property where the value is written.
    * - `bindingProperty` specifies the DOM property where the value is read from.
    *
    * When `bindingProperty` is not provided, it is assumed to be equal to `directiveProperty`.
    * @usageNotes
    *
    * ### Example
    *
    * The following example creates a component with two data-bound properties.
    *
    * ```typescript
    * @Component({
    *   selector: 'bank-account',
    *   inputs: ['bankName', 'id: account-id'],
    *   template: `
    *     Bank Name: {{bankName}}
    *     Account Id: {{id}}
    *   `
    * })
    * class BankAccount {
    *   bankName: string;
    *   id: string;
    *
    * ```
    *
    */
  var inputs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If true, this directive/component will be skipped by the AOT compiler and so will always be
    * compiled using JIT.
    *
    * This exists to support future Ivy work and has no effect currently.
    */
  var jit: js.UndefOr[atAngularCoreLib.atAngularCoreLibNumbers.`true`] = js.undefined
  /**
    * Enumerates the set of event-bound output properties.
    *
    * When an output property emits an event, an event handler attached to that event
    * in the template is invoked.
    *
    * The `outputs` property defines a set of `directiveProperty` to `bindingProperty`
    * configuration:
    *
    * - `directiveProperty` specifies the component property that emits events.
    * - `bindingProperty` specifies the DOM property the event handler is attached to.
    *
    * @usageNotes
    *
    * ### Example
    *
    * ```typescript
    * @Directive({
    *   selector: 'child-dir',
    *   exportAs: 'child'
    * })
    * class ChildDir {
    * }
    *
    * @Component({
    *   selector: 'main',
    *   template: `<child-dir #c="child"></child-dir>`
    * })
    * class MainComponent {
    * }
    * ```
    *
    */
  /**
    * The set of event-bound output properties.
    * When an output property emits an event, an event handler attached
    * to that event in the template is invoked.
    *
    * Each output property maps a `directiveProperty` to a `bindingProperty`:
    * - `directiveProperty` specifies the component property that emits events.
    * - `bindingProperty` specifies the HTML attribute the event handler is attached to.
    *
    */
  var outputs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A set of injection tokens that allow the DI system to
    * provide a dependency to this directive or component.
    */
  /**
    * Configures the [injector](guide/glossary#injector) of this
    * directive or component with a [token](guide/glossary#di-token)
    * that maps to a [provider](guide/glossary#provider) of a dependency.
    */
  var providers: js.UndefOr[js.Array[atAngularCoreLib.srcDiProviderMod.Provider]] = js.undefined
  /**
    * Configures the queries that will be injected into the directive.
    *
    * Content queries are set before the `ngAfterContentInit` callback is called.
    * View queries are set before the `ngAfterViewInit` callback is called.
    *
    * @usageNotes
    *
    * ### Example
    *
    * The following example shows how queries are defined
    * and when their results are available in lifecycle hooks:
    *
    * ```
    * @Component({
    *   selector: 'someDir',
    *   queries: {
    *     contentChildren: new ContentChildren(ChildDirective),
    *     viewChildren: new ViewChildren(ChildDirective)
    *   },
    *   template: '<child-directive></child-directive>'
    * })
    * class SomeDir {
    *   contentChildren: QueryList<ChildDirective>,
    *   viewChildren: QueryList<ChildDirective>
    *
    *   ngAfterContentInit() {
    *     // contentChildren is set
    *   }
    *
    *   ngAfterViewInit() {
    *     // viewChildren is set
    *   }
    * }
    * ```
    *
    * @Annotation
    */
  /**
    * Configures the queries that will be injected into the directive.
    *
    * Content queries are set before the `ngAfterContentInit` callback is called.
    * View queries are set before the `ngAfterViewInit` callback is called.
    *
    */
  var queries: /* import warning: ImportType.apply Failed type conversion: {indexed, indexed} */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: {indexed, indexed} */ js.Any
  ] = js.undefined
  /**
    * The CSS selector that triggers the instantiation of a directive.
    *
    * Declare as one of the following:
    *
    * - `element-name`: select by element name.
    * - `.class`: select by class name.
    * - `[attribute]`: select by attribute name.
    * - `[attribute=value]`: select by attribute name and value.
    * - `:not(sub_selector)`: select only if the element does not match the `sub_selector`.
    * - `selector1, selector2`: select if either `selector1` or `selector2` matches.
    *
    * Angular only allows directives to trigger on CSS selectors that do not cross element
    * boundaries. For example, consider a directive with an `input[type=text]` selector.
    * For the following HTML, the directive is instantiated only on the
    * `<input type="text">` element.
    *
    * ```html
    * <form>
    *   <input type="text">
    *   <input type="radio">
    * <form>
    * ```
    *
    */
  /**
    * The CSS selector that identifies this directive in a template
    * and triggers instantiation of the directive.
    *
    * Declare as one of the following:
    *
    * - `element-name`: Select by element name.
    * - `.class`: Select by class name.
    * - `[attribute]`: Select by attribute name.
    * - `[attribute=value]`: Select by attribute name and value.
    * - `:not(sub_selector)`: Select only if the element does not match the `sub_selector`.
    * - `selector1, selector2`: Select if either `selector1` or `selector2` matches.
    *
    * Angular only allows directives to apply on CSS selectors that do not cross
    * element boundaries.
    *
    * For the following template HTML, a directive with an `input[type=text]` selector,
    * would be instantiated only on the `<input type="text">` element.
    *
    * ```html
    * <form>
    *   <input type="text">
    *   <input type="radio">
    * <form>
    * ```
    *
    */
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

