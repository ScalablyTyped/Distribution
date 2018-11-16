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
  
  /* 0 */ val NamespaceURI: NamespaceURI with scala.Double = js.native
  /* 1 */ val SelectOnly: SelectOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.AttributeMarker with scala.Double] = js.native
}

