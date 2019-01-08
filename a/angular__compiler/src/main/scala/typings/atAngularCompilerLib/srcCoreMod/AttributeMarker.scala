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
    * This marker indicates that the following attribute names were extracted from bindings (ex.:
    * [foo]="exp") and / or event handlers (ex. (bar)="doSth()").
    * Taking the above bindings and outputs as an example an attributes array could look as follows:
    * ['class', 'fade in', AttributeMarker.SelectOnly, 'foo', 'bar']
    */
  @js.native
  sealed trait SelectOnly
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
  
  /* 1 */ val Classes: Classes with scala.Double = js.native
  /* 0 */ val NamespaceURI: NamespaceURI with scala.Double = js.native
  /* 3 */ val SelectOnly: SelectOnly with scala.Double = js.native
  /* 2 */ val Styles: Styles with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.AttributeMarker with scala.Double] = js.native
}

