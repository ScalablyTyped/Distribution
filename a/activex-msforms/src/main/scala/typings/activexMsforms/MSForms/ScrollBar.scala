package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollBar extends StObject {
  
  var BackColor: Double
  
  var Delay: Double
  
  var Enabled: Boolean
  
  var ForeColor: Double
  
  var LargeChange: Double
  
  /* private */ @JSName("MSForms.ScrollBar_typekey")
  var MSFormsDotScrollBar_typekey: ScrollBar
  
  var Max: Double
  
  var Min: Double
  
  var MouseIcon: StdPicture
  
  var MousePointer: fmMousePointer
  
  var Orientation: fmOrientation
  
  var ProportionalThumb: Boolean
  
  var SmallChange: Double
  
  var Value: Double
}
object ScrollBar {
  
  inline def apply(
    BackColor: Double,
    Delay: Double,
    Enabled: Boolean,
    ForeColor: Double,
    LargeChange: Double,
    MSFormsDotScrollBar_typekey: ScrollBar,
    Max: Double,
    Min: Double,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    Orientation: fmOrientation,
    ProportionalThumb: Boolean,
    SmallChange: Double,
    Value: Double
  ): ScrollBar = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], Delay = Delay.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], LargeChange = LargeChange.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], ProportionalThumb = ProportionalThumb.asInstanceOf[js.Any], SmallChange = SmallChange.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ScrollBar_typekey")(MSFormsDotScrollBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBar]
  }
  
  extension [Self <: ScrollBar](x: Self) {
    
    inline def setBackColor(value: Double): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "Delay", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: Double): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setLargeChange(value: Double): Self = StObject.set(x, "LargeChange", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotScrollBar_typekey(value: ScrollBar): Self = StObject.set(x, "MSForms.ScrollBar_typekey", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: fmMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: fmOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setProportionalThumb(value: Boolean): Self = StObject.set(x, "ProportionalThumb", value.asInstanceOf[js.Any])
    
    inline def setSmallChange(value: Double): Self = StObject.set(x, "SmallChange", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
