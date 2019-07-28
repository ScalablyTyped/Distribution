package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.atAngularCoreNumbers.`0`
import typings.atAngularCore.atAngularCoreNumbers.`1`
import typings.atAngularCore.atAngularCoreNumbers.`2`
import typings.atAngularCore.atAngularCoreNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
/* Rewritten from type alias, can be one of: 
  - typings.atAngularCore.atAngularCoreNumbers.`0`
  - typings.atAngularCore.atAngularCoreNumbers.`1`
  - typings.atAngularCore.atAngularCoreNumbers.`2`
  - typings.atAngularCore.atAngularCoreNumbers.`3`
*/
trait InitialStylingValuesIndex extends js.Object

object InitialStylingValuesIndex {
  @scala.inline
  def AppliedFlagBitLength: `1` = this.cast(1)
  /**
    * The first bit set aside to mark if the initial style was already rendere
    */
  @scala.inline
  def AppliedFlagBitPosition: `0` = this.cast(0)
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
  @scala.inline
  def CachedStringValuePosition: `1` = this.cast(1)
  /**
    * The first value is always `null` so that `styles[0] == null` for unassigned values
    */
  @scala.inline
  def DefaultNullValuePosition: `0` = this.cast(0)
  /**
    * The offset value (index + offset) for the style/class directive owner for each style/class
    entry
    */
  @scala.inline
  def DirectiveOwnerOffset: `2` = this.cast(2)
  /**
    * Where the style or class values start in the tuple
    */
  @scala.inline
  def KeyValueStartPosition: `2` = this.cast(2)
  /**
    * The offset value (index + offset) for the property value for each style/class entry
    */
  @scala.inline
  def PropOffset: `0` = this.cast(0)
  /**
    * The total size for each style/class entry (prop + value + directiveOwner)
    */
  @scala.inline
  def Size: `3` = this.cast(3)
  /**
    * The offset value (index + offset) for the style/class value for each style/class entry
    */
  @scala.inline
  def ValueOffset: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

