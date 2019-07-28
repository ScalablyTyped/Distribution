package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.atAngularCoreNumbers.`0`
import typings.atAngularCore.atAngularCoreNumbers.`1`
import typings.atAngularCore.atAngularCoreNumbers.`2`
import typings.atAngularCore.atAngularCoreNumbers.`3`
import typings.atAngularCore.atAngularCoreNumbers.`4`
import typings.atAngularCore.atAngularCoreNumbers.`5`
import typings.atAngularCore.atAngularCoreNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAngularCore.atAngularCoreNumbers.`0`
  - typings.atAngularCore.atAngularCoreNumbers.`1`
  - typings.atAngularCore.atAngularCoreNumbers.`2`
  - typings.atAngularCore.atAngularCoreNumbers.`3`
  - typings.atAngularCore.atAngularCoreNumbers.`4`
  - typings.atAngularCore.atAngularCoreNumbers.`5`
  - typings.atAngularCore.atAngularCoreNumbers.`6`
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
  def Bindings: `3` = this.cast(3)
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
  def Classes: `1` = this.cast(1)
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
  def I18n: `6` = this.cast(6)
  /**
    * Marker indicates that the following 3 values in the attributes array are:
    * namespaceUri, attributeName, attributeValue
    * in that order.
    */
  @scala.inline
  def NamespaceURI: `0` = this.cast(0)
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
  def ProjectAs: `5` = this.cast(5)
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
  def Styles: `2` = this.cast(2)
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
  def Template: `4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

