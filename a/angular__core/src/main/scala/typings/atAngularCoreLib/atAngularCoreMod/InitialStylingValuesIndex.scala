package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InitialStylingValuesIndex extends js.Object

/**
  * Used as an offset/position index to figure out where initial styling
  * values are located.
  *
  * Used as a reference point to provide markers to all static styling
  * values (the initial style and class values on an element) within an
  * array within the `StylingContext`. This array contains key/value pairs
  * where the key is the style property name or className and the value is
  * the style value or whether or not a class is present on the elment.
  *
  * The first value is always null so that a initial index value of
  * `0` will always point to a null value.
  *
  * The second value is also always null unless a string-based representation
  * of the styling data was constructed (it gets cached in this slot).
  *
  * If a <div> elements contains a list of static styling values like so:
  *
  * <div class="foo bar baz" style="width:100px; height:200px;">
  *
  * Then the initial styles for that will look like so:
  *
  * Styles:
  * ```
  * StylingContext[InitialStylesIndex] = [
  *   null, null, 'width', '100px', height, '200px'
  * ]
  * ```
  *
  * Classes:
  * ```
  * StylingContext[InitialClassesIndex] = [
  *   null, null, 'foo', true, 'bar', true, 'baz', true
  * ]
  * ```
  *
  * Initial style and class entries have their own arrays. This is because
  * it's easier to add to the end of one array and not then have to update
  * every context entries' pointer index to the newly offseted values.
  *
  * When property bindinds are added to a context then initial style/class
  * values will also be inserted into the array. This is to create a space
  * in the situation when a follow-up directive inserts static styling into
  * the array. By default, style values are `null` and class values are
  * `false` when inserted by property bindings.
  *
  * For example:
  * ```
  * <div class="foo bar baz"
  *      [class.car]="myCarExp"
  *      style="width:100px; height:200px;"
  *      [style.opacity]="myOpacityExp">
  * ```
  *
  * Will construct initial styling values that look like:
  *
  * Styles:
  * ```
  * StylingContext[InitialStylesIndex] = [
  *   null, null, 'width', '100px', height, '200px', 'opacity', null
  * ]
  * ```
  *
  * Classes:
  * ```
  * StylingContext[InitialClassesIndex] = [
  *   null, null, 'foo', true, 'bar', true, 'baz', true, 'car', false
  * ]
  * ```
  *
  * Now if a directive comes along and introduces `car` as a static
  * class value or `opacity` then those values will be filled into
  * the initial styles array.
  *
  * For example:
  *
  * ```
  * @Directive({
  *   selector: 'opacity-car-directive',
  *   host: {
  *     'style': 'opacity:0.5',
  *     'class': 'car'
  *   }
  * })
  * class OpacityCarDirective {}
  * ```
  *
  * This will render itself as:
  *
  * Styles:
  * ```
  * StylingContext[InitialStylesIndex] = [
  *   null, null, 'width', '100px', height, '200px', 'opacity', '0.5'
  * ]
  * ```
  *
  * Classes:
  * ```
  * StylingContext[InitialClassesIndex] = [
  *   null, null, 'foo', true, 'bar', true, 'baz', true, 'car', true
  * ]
  * ```
  */
@JSImport("@angular/core", "InitialStylingValuesIndex")
@js.native
object InitialStylingValuesIndex extends js.Object {
  @js.native
  sealed trait AppliedFlagBitLength
    extends atAngularCoreLib.atAngularCoreMod.InitialStylingValuesIndex
  
  /**
    * The first bit set aside to mark if the initial style was already rendere
    */
  @js.native
  sealed trait AppliedFlagBitPosition
    extends atAngularCoreLib.atAngularCoreMod.InitialStylingValuesIndex
  
  /**
    * Used for non-styling code to examine what the style or className string is:
    * styles: ['width', '100px', 0, 'opacity', null, 0, 'height', '200px', 0]
    *    => initialStyles[CachedStringValuePosition] = 'width:100px;height:200px';
    * classes: ['foo', true, 0, 'bar', false, 0, 'baz', true, 0]
    *    => initialClasses[CachedStringValuePosition] = 'foo bar';
    *
    * Note that this value is `null` by default and it will only be populated
    * once `getInitialStyleStringValue` or `getInitialClassNameValue` is executed.
    */
  @js.native
  sealed trait CachedStringValuePosition
    extends atAngularCoreLib.atAngularCoreMod.InitialStylingValuesIndex
  
  /**
    * The first value is always `null` so that `styles[0] == null` for unassigned values
    */
  @js.native
  sealed trait DefaultNullValuePosition
    extends atAngularCoreLib.atAngularCoreMod.InitialStylingValuesIndex
  
  /**
    * The offset value (index + offset) for the style/class directive owner for each style/class
    entry
    */
  @js.native
  sealed trait DirectiveOwnerOffset
    extends atAngularCoreLib.atAngularCoreMod.InitialStylingValuesIndex
  
  /**
    * Where the style or class values start in the tuple
    */
  @js.native
  sealed trait KeyValueStartPosition
    extends atAngularCoreLib.atAngularCoreMod.InitialStylingValuesIndex
  
  /**
    * The offset value (index + offset) for the property value for each style/class entry
    */
  @js.native
  sealed trait PropOffset
    extends atAngularCoreLib.atAngularCoreMod.InitialStylingValuesIndex
  
  /**
    * The total size for each style/class entry (prop + value + directiveOwner)
    */
  @js.native
  sealed trait Size
    extends atAngularCoreLib.atAngularCoreMod.InitialStylingValuesIndex
  
  /**
    * The offset value (index + offset) for the style/class value for each style/class entry
    */
  @js.native
  sealed trait ValueOffset
    extends atAngularCoreLib.atAngularCoreMod.InitialStylingValuesIndex
  
}

