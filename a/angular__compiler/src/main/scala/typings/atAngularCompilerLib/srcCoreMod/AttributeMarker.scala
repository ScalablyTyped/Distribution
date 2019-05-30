package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttributeMarker extends js.Object

@JSImport("@angular/compiler/src/core", "AttributeMarker")
@js.native
object AttributeMarker extends js.Object {
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
  @js.native
  sealed trait Bindings
    extends atAngularCompilerLib.srcCoreMod.AttributeMarker
  
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
  @js.native
  sealed trait Classes
    extends atAngularCompilerLib.srcCoreMod.AttributeMarker
  
  /**
    * Marker indicates that the following 3 values in the attributes array are:
    * namespaceUri, attributeName, attributeValue
    * in that order.
    */
  @js.native
  sealed trait NamespaceURI
    extends atAngularCompilerLib.srcCoreMod.AttributeMarker
  
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
  @js.native
  sealed trait ProjectAs
    extends atAngularCompilerLib.srcCoreMod.AttributeMarker
  
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
  @js.native
  sealed trait Styles
    extends atAngularCompilerLib.srcCoreMod.AttributeMarker
  
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
  @js.native
  sealed trait Template
    extends atAngularCompilerLib.srcCoreMod.AttributeMarker
  
  /* 3 */ val Bindings: Bindings with scala.Double = js.native
  /* 1 */ val Classes: Classes with scala.Double = js.native
  /* 0 */ val NamespaceURI: NamespaceURI with scala.Double = js.native
  /* 5 */ val ProjectAs: ProjectAs with scala.Double = js.native
  /* 2 */ val Styles: Styles with scala.Double = js.native
  /* 4 */ val Template: Template with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.AttributeMarker with scala.Double] = js.native
}

