package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkTimeZoneControl extends js.Object {
  var AppointmentTimeField: OlAppointmentTimeField
  var BorderStyle: OlBorderStyle
  var Enabled: Boolean
  var Locked: Boolean
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  @JSName("Outlook.OlkTimeZoneControl_typekey")
  var OutlookDotOlkTimeZoneControl_typekey: OlkTimeZoneControl
  var SelectedTimeZoneIndex: Double
  var Value: js.Any
  def DropDown(): Unit
}

object OlkTimeZoneControl {
  @scala.inline
  def apply(
    AppointmentTimeField: OlAppointmentTimeField,
    BorderStyle: OlBorderStyle,
    DropDown: () => Unit,
    Enabled: Boolean,
    Locked: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkTimeZoneControl_typekey: OlkTimeZoneControl,
    SelectedTimeZoneIndex: Double,
    Value: js.Any
  ): OlkTimeZoneControl = {
    val __obj = js.Dynamic.literal(AppointmentTimeField = AppointmentTimeField.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], DropDown = js.Any.fromFunction0(DropDown), Enabled = Enabled.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], SelectedTimeZoneIndex = SelectedTimeZoneIndex.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkTimeZoneControl_typekey")(OutlookDotOlkTimeZoneControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkTimeZoneControl]
  }
}

