package typings
package atAngularCoreLib.srcRender3InterfacesRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RendererStyleFlags3 extends js.Object

@JSImport("@angular/core/src/render3/interfaces/renderer", "RendererStyleFlags3")
@js.native
object RendererStyleFlags3 extends js.Object {
  @js.native
  sealed trait DashCase
    extends atAngularCoreLib.srcRender3InterfacesRendererMod.RendererStyleFlags3
  
  @js.native
  sealed trait Important
    extends atAngularCoreLib.srcRender3InterfacesRendererMod.RendererStyleFlags3
  
  /* 2 */ val DashCase: DashCase with scala.Double = js.native
  /* 1 */ val Important: Important with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCoreLib.srcRender3InterfacesRendererMod.RendererStyleFlags3 with scala.Double
  ] = js.native
}

