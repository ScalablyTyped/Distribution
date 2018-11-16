package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MoveRecordOptionsEnum extends js.Object

@JSGlobal("ADODB.MoveRecordOptionsEnum")
@js.native
object MoveRecordOptionsEnum extends js.Object {
  @js.native
  sealed trait adMoveAllowEmulation
    extends activexDashAdodbLib.ADODBNs.MoveRecordOptionsEnum
  
  @js.native
  sealed trait adMoveDontUpdateLinks
    extends activexDashAdodbLib.ADODBNs.MoveRecordOptionsEnum
  
  @js.native
  sealed trait adMoveOverWrite
    extends activexDashAdodbLib.ADODBNs.MoveRecordOptionsEnum
  
  @js.native
  sealed trait adMoveUnspecified
    extends activexDashAdodbLib.ADODBNs.MoveRecordOptionsEnum
  
  /* 4 */ val adMoveAllowEmulation: adMoveAllowEmulation with scala.Double = js.native
  /* 2 */ val adMoveDontUpdateLinks: adMoveDontUpdateLinks with scala.Double = js.native
  /* 1 */ val adMoveOverWrite: adMoveOverWrite with scala.Double = js.native
  /* -1 */ val adMoveUnspecified: adMoveUnspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.MoveRecordOptionsEnum with scala.Double] = js.native
}

