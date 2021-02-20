package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinButton extends StObject {
  
  var BackColor: Double = js.native
  
  var Delay: Double = js.native
  
  var Enabled: Boolean = js.native
  
  var ForeColor: Double = js.native
  
  @JSName("MSForms.SpinButton_typekey")
  var MSFormsDotSpinButton_typekey: SpinButton = js.native
  
  var Max: Double = js.native
  
  var Min: Double = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: fmMousePointer = js.native
  
  var Orientation: fmOrientation = js.native
  
  var SmallChange: Double = js.native
  
  var Value: Double = js.native
}
object SpinButton {
  
  @scala.inline
  def apply(
    BackColor: Double,
    Delay: Double,
    Enabled: Boolean,
    ForeColor: Double,
    MSFormsDotSpinButton_typekey: SpinButton,
    Max: Double,
    Min: Double,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    Orientation: fmOrientation,
    SmallChange: Double,
    Value: Double
  ): SpinButton = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], Delay = Delay.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], SmallChange = SmallChange.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.SpinButton_typekey")(MSFormsDotSpinButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinButton]
  }
  
  @scala.inline
  implicit class SpinButtonMutableBuilder[Self <: SpinButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackColor(value: Double): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "Delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: Double): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotSpinButton_typekey(value: SpinButton): Self = StObject.set(x, "MSForms.SpinButton_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: fmMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: fmOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallChange(value: Double): Self = StObject.set(x, "SmallChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
