package typings
package atAngularCoreLib.srcRender3InterfacesViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RootContextFlags extends js.Object

@JSImport("@angular/core/src/render3/interfaces/view", "RootContextFlags")
@js.native
object RootContextFlags extends js.Object {
  @js.native
  sealed trait DetectChanges
    extends atAngularCoreLib.srcRender3InterfacesViewMod.RootContextFlags
  
  @js.native
  sealed trait Empty
    extends atAngularCoreLib.srcRender3InterfacesViewMod.RootContextFlags
  
  @js.native
  sealed trait FlushPlayers
    extends atAngularCoreLib.srcRender3InterfacesViewMod.RootContextFlags
  
  /* 1 */ val DetectChanges: DetectChanges with scala.Double = js.native
  /* 0 */ val Empty: Empty with scala.Double = js.native
  /* 2 */ val FlushPlayers: FlushPlayers with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3InterfacesViewMod.RootContextFlags with scala.Double] = js.native
}

