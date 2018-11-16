package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlAppointmentCopyOptions extends js.Object

@JSGlobal("Outlook.OlAppointmentCopyOptions")
@js.native
object OlAppointmentCopyOptions extends js.Object {
  @js.native
  sealed trait olCopyAsAccept
    extends activexDashOutlookLib.OutlookNs.OlAppointmentCopyOptions
  
  @js.native
  sealed trait olCreateAppointment
    extends activexDashOutlookLib.OutlookNs.OlAppointmentCopyOptions
  
  @js.native
  sealed trait olPromptUser
    extends activexDashOutlookLib.OutlookNs.OlAppointmentCopyOptions
  
  /* 2 */ val olCopyAsAccept: olCopyAsAccept with scala.Double = js.native
  /* 1 */ val olCreateAppointment: olCreateAppointment with scala.Double = js.native
  /* 0 */ val olPromptUser: olPromptUser with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlAppointmentCopyOptions with scala.Double] = js.native
}

