package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`-1`
import typings.angularCore.angularCoreNumbers.`0`
import typings.angularCore.angularCoreNumbers.`1`
import typings.angularCore.angularCoreNumbers.`2`
import typings.angularCore.angularCoreNumbers.`3`
import typings.angularCore.angularCoreNumbers.`4`
import typings.angularCore.angularCoreNumbers.`5`
import typings.angularCore.angularCoreNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreNumbers.`-1`
  - typings.angularCore.angularCoreNumbers.`0`
  - typings.angularCore.angularCoreNumbers.`1`
  - typings.angularCore.angularCoreNumbers.`2`
  - typings.angularCore.angularCoreNumbers.`3`
  - typings.angularCore.angularCoreNumbers.`4`
  - typings.angularCore.angularCoreNumbers.`5`
  - typings.angularCore.angularCoreNumbers.`6`
*/
trait ɵAttributeMarker extends js.Object

object ɵAttributeMarker {
  /**
    * Signals that the following attribute names were extracted from input or output bindings.
    *
    * For example, given the following HTML:
    *
    * ```
    * <div moo="car" [foo]="exp" (bar)="doSth()">
    * ```
    *
    * the generated code is:
    *
    * ```
    * var _c1 = ['moo', 'car', AttributeMarker.Bindings, 'foo', 'bar'];
    * ```
    */
  @scala.inline
  def Bindings: `3` = 3.asInstanceOf[`3`]
  /**
    * Signals class declaration.
    *
    * Each value following `Classes` designates a class name to include on the element.
    * ## Example:
    *
    * Given:
    * ```
    * <div class="foo bar baz">...<d/vi>
    * ```
    *
    * the generated code is:
    * ```
    * var _c1 = [AttributeMarker.Classes, 'foo', 'bar', 'baz'];
    * ```
    */
  @scala.inline
  def Classes: `1` = 1.asInstanceOf[`1`]
  /**
    * Signals that the following attribute will be translated by runtime i18n
    *
    * For example, given the following HTML:
    *
    * ```
    * <div moo="car" foo="value" i18n-foo [bar]="binding" i18n-bar>
    * ```
    *
    * the generated code is:
    *
    * ```
    * var _c1 = ['moo', 'car', AttributeMarker.I18n, 'foo', 'bar'];
    */
  @scala.inline
  def I18n: `6` = 6.asInstanceOf[`6`]
  /**
    * An implicit marker which indicates that the value in the array are of `attributeKey`,
    * `attributeValue` format.
    *
    * NOTE: This is implicit as it is the type when no marker is present in array. We indicate that
    * it should not be present at runtime by the negative number.
    */
  @scala.inline
  def ImplicitAttributes: `-1` = -1.asInstanceOf[`-1`]
  /**
    * Marker indicates that the following 3 values in the attributes array are:
    * namespaceUri, attributeName, attributeValue
    * in that order.
    */
  @scala.inline
  def NamespaceURI: `0` = 0.asInstanceOf[`0`]
  /**
    * Signals that the following attribute is `ngProjectAs` and its value is a parsed `CssSelector`.
    *
    * For example, given the following HTML:
    *
    * ```
    * <h1 attr="value" ngProjectAs="[title]">
    * ```
    *
    * the generated code for the `element()` instruction would include:
    *
    * ```
    * ['attr', 'value', AttributeMarker.ProjectAs, ['', 'title', '']]
    * ```
    */
  @scala.inline
  def ProjectAs: `5` = 5.asInstanceOf[`5`]
  /**
    * Signals style declaration.
    *
    * Each pair of values following `Styles` designates a style name and value to include on the
    * element.
    * ## Example:
    *
    * Given:
    * ```
    * <div style="width:100px; height:200px; color:red">...</div>
    * ```
    *
    * the generated code is:
    * ```
    * var _c1 = [AttributeMarker.Styles, 'width', '100px', 'height'. '200px', 'color', 'red'];
    * ```
    */
  @scala.inline
  def Styles: `2` = 2.asInstanceOf[`2`]
  /**
    * Signals that the following attribute names were hoisted from an inline-template declaration.
    *
    * For example, given the following HTML:
    *
    * ```
    * <div *ngFor="let value of values; trackBy:trackBy" dirA [dirB]="value">
    * ```
    *
    * the generated code for the `template()` instruction would include:
    *
    * ```
    * ['dirA', '', AttributeMarker.Bindings, 'dirB', AttributeMarker.Template, 'ngFor', 'ngForOf',
    * 'ngForTrackBy', 'let-value']
    * ```
    *
    * while the generated code for the `element()` instruction inside the template function would
    * include:
    *
    * ```
    * ['dirA', '', AttributeMarker.Bindings, 'dirB']
    * ```
    */
  @scala.inline
  def Template: `4` = 4.asInstanceOf[`4`]
}

