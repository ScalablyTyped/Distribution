package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ɵPlayState extends js.Object

@JSImport("@angular/core", "ɵPlayState")
@js.native
object ɵPlayState extends js.Object {
  @js.native
  sealed trait Destroyed
    extends atAngularCoreLib.atAngularCoreMod.ɵPlayState
  
  @js.native
  sealed trait Finished
    extends atAngularCoreLib.atAngularCoreMod.ɵPlayState
  
  @js.native
  sealed trait Paused
    extends atAngularCoreLib.atAngularCoreMod.ɵPlayState
  
  @js.native
  sealed trait Pending
    extends atAngularCoreLib.atAngularCoreMod.ɵPlayState
  
  @js.native
  sealed trait Running
    extends atAngularCoreLib.atAngularCoreMod.ɵPlayState
  
  /* 200 */ val Destroyed: Destroyed with scala.Double = js.native
  /* 100 */ val Finished: Finished with scala.Double = js.native
  /* 2 */ val Paused: Paused with scala.Double = js.native
  /* 0 */ val Pending: Pending with scala.Double = js.native
  /* 1 */ val Running: Running with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.atAngularCoreMod.ɵPlayState with scala.Double] = js.native
}

