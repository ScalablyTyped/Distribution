package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdLockType extends js.Object

@JSGlobal("Word.WdLockType")
@js.native
object WdLockType extends js.Object {
  @js.native
  sealed trait wdLockChanged
    extends activexDashWordLib.WordNs.WdLockType
  
  @js.native
  sealed trait wdLockEphemeral
    extends activexDashWordLib.WordNs.WdLockType
  
  @js.native
  sealed trait wdLockNone
    extends activexDashWordLib.WordNs.WdLockType
  
  @js.native
  sealed trait wdLockReservation
    extends activexDashWordLib.WordNs.WdLockType
  
  /* 3 */ val wdLockChanged: wdLockChanged with scala.Double = js.native
  /* 2 */ val wdLockEphemeral: wdLockEphemeral with scala.Double = js.native
  /* 0 */ val wdLockNone: wdLockNone with scala.Double = js.native
  /* 1 */ val wdLockReservation: wdLockReservation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdLockType with scala.Double] = js.native
}

