package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlBusyStatus extends js.Object

@JSGlobal("Outlook.OlBusyStatus")
@js.native
object OlBusyStatus extends js.Object {
  @js.native
  sealed trait olBusy
    extends activexDashOutlookLib.OutlookNs.OlBusyStatus
  
  @js.native
  sealed trait olFree
    extends activexDashOutlookLib.OutlookNs.OlBusyStatus
  
  @js.native
  sealed trait olOutOfOffice
    extends activexDashOutlookLib.OutlookNs.OlBusyStatus
  
  @js.native
  sealed trait olTentative
    extends activexDashOutlookLib.OutlookNs.OlBusyStatus
  
  /* 2 */ val olBusy: olBusy with scala.Double = js.native
  /* 0 */ val olFree: olFree with scala.Double = js.native
  /* 3 */ val olOutOfOffice: olOutOfOffice with scala.Double = js.native
  /* 1 */ val olTentative: olTentative with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlBusyStatus with scala.Double] = js.native
}

