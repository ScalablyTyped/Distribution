package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains information about a device. */
trait DeviceInfo extends StObject {
  
  /** contains the color-depth of the device. */
  var BitsPerPixel: Double
  
  /** contains the inset from the bottom. */
  var BottomInset: Double
  
  /**
    * specifies special operations which are possible on the device.
    * @see DeviceCapability
    */
  var Capabilities: Double
  
  /** contains the height of the device in pixels. */
  var Height: Double
  
  /** contains the inset from the left. */
  var LeftInset: Double
  
  /** contains the X-axis resolution of the device in pixel/meter. */
  var PixelPerMeterX: Double
  
  /** contains the Y-axis resolution of the device in pixel/meter. */
  var PixelPerMeterY: Double
  
  /** contains the inset from the right. */
  var RightInset: Double
  
  /** contains the inset from the top. */
  var TopInset: Double
  
  /** contains the width of the device in pixels. */
  var Width: Double
}
object DeviceInfo {
  
  inline def apply(
    BitsPerPixel: Double,
    BottomInset: Double,
    Capabilities: Double,
    Height: Double,
    LeftInset: Double,
    PixelPerMeterX: Double,
    PixelPerMeterY: Double,
    RightInset: Double,
    TopInset: Double,
    Width: Double
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(BitsPerPixel = BitsPerPixel.asInstanceOf[js.Any], BottomInset = BottomInset.asInstanceOf[js.Any], Capabilities = Capabilities.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], LeftInset = LeftInset.asInstanceOf[js.Any], PixelPerMeterX = PixelPerMeterX.asInstanceOf[js.Any], PixelPerMeterY = PixelPerMeterY.asInstanceOf[js.Any], RightInset = RightInset.asInstanceOf[js.Any], TopInset = TopInset.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceInfo] (val x: Self) extends AnyVal {
    
    inline def setBitsPerPixel(value: Double): Self = StObject.set(x, "BitsPerPixel", value.asInstanceOf[js.Any])
    
    inline def setBottomInset(value: Double): Self = StObject.set(x, "BottomInset", value.asInstanceOf[js.Any])
    
    inline def setCapabilities(value: Double): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLeftInset(value: Double): Self = StObject.set(x, "LeftInset", value.asInstanceOf[js.Any])
    
    inline def setPixelPerMeterX(value: Double): Self = StObject.set(x, "PixelPerMeterX", value.asInstanceOf[js.Any])
    
    inline def setPixelPerMeterY(value: Double): Self = StObject.set(x, "PixelPerMeterY", value.asInstanceOf[js.Any])
    
    inline def setRightInset(value: Double): Self = StObject.set(x, "RightInset", value.asInstanceOf[js.Any])
    
    inline def setTopInset(value: Double): Self = StObject.set(x, "TopInset", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
