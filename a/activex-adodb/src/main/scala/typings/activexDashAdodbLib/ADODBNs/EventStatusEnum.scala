package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventStatusEnum extends js.Object

@JSGlobal("ADODB.EventStatusEnum")
@js.native
object EventStatusEnum extends js.Object {
  @js.native
  sealed trait adStatusCancel
    extends activexDashAdodbLib.ADODBNs.EventStatusEnum
  
  @js.native
  sealed trait adStatusCantDeny
    extends activexDashAdodbLib.ADODBNs.EventStatusEnum
  
  @js.native
  sealed trait adStatusErrorsOccurred
    extends activexDashAdodbLib.ADODBNs.EventStatusEnum
  
  @js.native
  sealed trait adStatusOK
    extends activexDashAdodbLib.ADODBNs.EventStatusEnum
  
  @js.native
  sealed trait adStatusUnwantedEvent
    extends activexDashAdodbLib.ADODBNs.EventStatusEnum
  
  /* 4 */ val adStatusCancel: adStatusCancel with scala.Double = js.native
  /* 3 */ val adStatusCantDeny: adStatusCantDeny with scala.Double = js.native
  /* 2 */ val adStatusErrorsOccurred: adStatusErrorsOccurred with scala.Double = js.native
  /* 1 */ val adStatusOK: adStatusOK with scala.Double = js.native
  /* 5 */ val adStatusUnwantedEvent: adStatusUnwantedEvent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.EventStatusEnum with scala.Double] = js.native
}

