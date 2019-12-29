package typings.activexDashOutlook.Outlook

import typings.activexDashStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkTimeZoneControl")
@js.native
class OlkTimeZoneControl protected () extends js.Object {
  var AppointmentTimeField: OlAppointmentTimeField = js.native
  var BorderStyle: OlBorderStyle = js.native
  var Enabled: Boolean = js.native
  var Locked: Boolean = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkTimeZoneControl_typekey")
  var OutlookDotOlkTimeZoneControl_typekey: OlkTimeZoneControl = js.native
  var SelectedTimeZoneIndex: Double = js.native
  var Value: js.Any = js.native
  def DropDown(): Unit = js.native
}

