package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlkTimeZoneControl extends StObject {
  
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
  implicit class OlkTimeZoneControlMutableBuilder[Self <: OlkTimeZoneControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppointmentTimeField(value: OlAppointmentTimeField): Self = StObject.set(x, "AppointmentTimeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: OlBorderStyle): Self = StObject.set(x, "BorderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDown(value: () => Unit): Self = StObject.set(x, "DropDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOlkTimeZoneControl_typekey(value: OlkTimeZoneControl): Self = StObject.set(x, "Outlook.OlkTimeZoneControl_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTimeZoneIndex(value: Double): Self = StObject.set(x, "SelectedTimeZoneIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
