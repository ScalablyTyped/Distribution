package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryValueType extends js.Object

@JSImport("@angular/core/src/view/types", "QueryValueType")
@js.native
object QueryValueType extends js.Object {
  @js.native
  sealed trait ElementRef
    extends atAngularCoreLib.srcViewTypesMod.QueryValueType
  
  @js.native
  sealed trait Provider
    extends atAngularCoreLib.srcViewTypesMod.QueryValueType
  
  @js.native
  sealed trait RenderElement
    extends atAngularCoreLib.srcViewTypesMod.QueryValueType
  
  @js.native
  sealed trait TemplateRef
    extends atAngularCoreLib.srcViewTypesMod.QueryValueType
  
  @js.native
  sealed trait ViewContainerRef
    extends atAngularCoreLib.srcViewTypesMod.QueryValueType
  
  /* 0 */ val ElementRef: ElementRef with scala.Double = js.native
  /* 4 */ val Provider: Provider with scala.Double = js.native
  /* 1 */ val RenderElement: RenderElement with scala.Double = js.native
  /* 2 */ val TemplateRef: TemplateRef with scala.Double = js.native
  /* 3 */ val ViewContainerRef: ViewContainerRef with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcViewTypesMod.QueryValueType with scala.Double] = js.native
}

