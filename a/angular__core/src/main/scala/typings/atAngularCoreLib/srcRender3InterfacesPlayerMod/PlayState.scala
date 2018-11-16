package typings
package atAngularCoreLib.srcRender3InterfacesPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayState extends js.Object

@JSImport("@angular/core/src/render3/interfaces/player", "PlayState")
@js.native
object PlayState extends js.Object {
  @js.native
  sealed trait Destroyed
    extends atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayState
  
  @js.native
  sealed trait Finished
    extends atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayState
  
  @js.native
  sealed trait Paused
    extends atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayState
  
  @js.native
  sealed trait Pending
    extends atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayState
  
  @js.native
  sealed trait Running
    extends atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayState
  
  /* 200 */ val Destroyed: Destroyed with scala.Double = js.native
  /* 100 */ val Finished: Finished with scala.Double = js.native
  /* 2 */ val Paused: Paused with scala.Double = js.native
  /* 0 */ val Pending: Pending with scala.Double = js.native
  /* 1 */ val Running: Running with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3InterfacesPlayerMod.PlayState with scala.Double] = js.native
}

