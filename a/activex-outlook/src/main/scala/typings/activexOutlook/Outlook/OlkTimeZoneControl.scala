package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlkTimeZoneControl extends js.Object {
  
  var AppointmentTimeField: OlAppointmentTimeField = js.native
  
  var BorderStyle: OlBorderStyle = js.native
  
  def DropDown(): Unit = js.native
  
  var Enabled: Boolean = js.native
  
  var Locked: Boolean = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: OlMousePointer = js.native
  
  @JSName("Outlook.OlkTimeZoneControl_typekey")
  var OutlookDotOlkTimeZoneControl_typekey: OlkTimeZoneControl = js.native
  
  var SelectedTimeZoneIndex: Double = js.native
  
  var Value: js.Any = js.native
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
  
  @scala.inline
  implicit class OlkTimeZoneControlOps[Self <: OlkTimeZoneControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppointmentTimeField(value: OlAppointmentTimeField): Self = this.set("AppointmentTimeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: OlBorderStyle): Self = this.set("BorderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDown(value: () => Unit): Self = this.set("DropDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = this.set("MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOlkTimeZoneControl_typekey(value: OlkTimeZoneControl): Self = this.set("Outlook.OlkTimeZoneControl_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTimeZoneIndex(value: Double): Self = this.set("SelectedTimeZoneIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
