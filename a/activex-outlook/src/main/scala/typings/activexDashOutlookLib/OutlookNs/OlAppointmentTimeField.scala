package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlAppointmentTimeField extends js.Object

@JSGlobal("Outlook.OlAppointmentTimeField")
@js.native
object OlAppointmentTimeField extends js.Object {
  @js.native
  sealed trait olAppointmentTimeFieldEnd
    extends activexDashOutlookLib.OutlookNs.OlAppointmentTimeField
  
  @js.native
  sealed trait olAppointmentTimeFieldNone
    extends activexDashOutlookLib.OutlookNs.OlAppointmentTimeField
  
  @js.native
  sealed trait olAppointmentTimeFieldStart
    extends activexDashOutlookLib.OutlookNs.OlAppointmentTimeField
  
  /* 3 */ val olAppointmentTimeFieldEnd: olAppointmentTimeFieldEnd with scala.Double = js.native
  /* 1 */ val olAppointmentTimeFieldNone: olAppointmentTimeFieldNone with scala.Double = js.native
  /* 2 */ val olAppointmentTimeFieldStart: olAppointmentTimeFieldStart with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlAppointmentTimeField with scala.Double] = js.native
}

