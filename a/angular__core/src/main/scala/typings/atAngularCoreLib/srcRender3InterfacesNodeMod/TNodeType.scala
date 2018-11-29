package typings
package atAngularCoreLib.srcRender3InterfacesNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TNodeType extends js.Object

@JSImport("@angular/core/src/render3/interfaces/node", "TNodeType")
@js.native
object TNodeType extends js.Object {
  @js.native
  sealed trait Container
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType
  
  @js.native
  sealed trait Element
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType
  
  @js.native
  sealed trait ElementContainer
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType
  
  @js.native
  sealed trait IcuContainer
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType
  
  @js.native
  sealed trait Projection
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType
  
  @js.native
  sealed trait View
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType
  
  @js.native
  sealed trait ViewOrElement
    extends atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType
  
  /* 0 */ val Container: Container with scala.Double = js.native
  /* 3 */ val Element: Element with scala.Double = js.native
  /* 4 */ val ElementContainer: ElementContainer with scala.Double = js.native
  /* 5 */ val IcuContainer: IcuContainer with scala.Double = js.native
  /* 1 */ val Projection: Projection with scala.Double = js.native
  /* 2 */ val View: View with scala.Double = js.native
  /* 2 */ val ViewOrElement: ViewOrElement with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3InterfacesNodeMod.TNodeType with scala.Double] = js.native
}

