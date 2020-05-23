package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlAppointmentTimeField
import typings.activexOutlook.Outlook.OlBorderStyle
import typings.activexOutlook.Outlook.OlMousePointer
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkTimeZoneControl")
@js.native
class OlkTimeZoneControl protected ()
  extends typings.activexOutlook.Outlook.OlkTimeZoneControl {
  /* CompleteClass */
  override var AppointmentTimeField: OlAppointmentTimeField = js.native
  /* CompleteClass */
  override var BorderStyle: OlBorderStyle = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override var Locked: Boolean = js.native
  /* CompleteClass */
  override var MouseIcon: StdPicture = js.native
  /* CompleteClass */
  override var MousePointer: OlMousePointer = js.native
  /* CompleteClass */
  @JSName("Outlook.OlkTimeZoneControl_typekey")
  override var OutlookDotOlkTimeZoneControl_typekey: typings.activexOutlook.Outlook.OlkTimeZoneControl = js.native
  /* CompleteClass */
  override var SelectedTimeZoneIndex: Double = js.native
  /* CompleteClass */
  override var Value: js.Any = js.native
  /* CompleteClass */
  override def DropDown(): Unit = js.native
}

