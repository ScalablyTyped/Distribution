package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditModeEnum extends js.Object

@JSGlobal("ADODB.EditModeEnum")
@js.native
object EditModeEnum extends js.Object {
  @js.native
  sealed trait adEditAdd
    extends activexDashAdodbLib.ADODBNs.EditModeEnum
  
  @js.native
  sealed trait adEditDelete
    extends activexDashAdodbLib.ADODBNs.EditModeEnum
  
  @js.native
  sealed trait adEditInProgress
    extends activexDashAdodbLib.ADODBNs.EditModeEnum
  
  @js.native
  sealed trait adEditNone
    extends activexDashAdodbLib.ADODBNs.EditModeEnum
  
  /* 2 */ val adEditAdd: adEditAdd with scala.Double = js.native
  /* 4 */ val adEditDelete: adEditDelete with scala.Double = js.native
  /* 1 */ val adEditInProgress: adEditInProgress with scala.Double = js.native
  /* 0 */ val adEditNone: adEditNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.EditModeEnum with scala.Double] = js.native
}

