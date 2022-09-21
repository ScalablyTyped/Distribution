package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLScreen extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLScreen_typekey")
  var MSHTMLDotHTMLScreen_typekey: HTMLScreen
  
  val availHeight: Double
  
  val availWidth: Double
  
  var bufferDepth: Double
  
  val colorDepth: Double
  
  val constructor: Any
  
  val deviceXDPI: Double
  
  val deviceYDPI: Double
  
  val fontSmoothingEnabled: Boolean
  
  val height: Double
  
  val logicalXDPI: Double
  
  val logicalYDPI: Double
  
  val pixelDepth: Double
  
  val systemXDPI: Double
  
  val systemYDPI: Double
  
  var updateInterval: Double
  
  val width: Double
}
object HTMLScreen {
  
  inline def apply(
    MSHTMLDotHTMLScreen_typekey: HTMLScreen,
    availHeight: Double,
    availWidth: Double,
    bufferDepth: Double,
    colorDepth: Double,
    constructor: Any,
    deviceXDPI: Double,
    deviceYDPI: Double,
    fontSmoothingEnabled: Boolean,
    height: Double,
    logicalXDPI: Double,
    logicalYDPI: Double,
    pixelDepth: Double,
    systemXDPI: Double,
    systemYDPI: Double,
    updateInterval: Double,
    width: Double
  ): HTMLScreen = {
    val __obj = js.Dynamic.literal(availHeight = availHeight.asInstanceOf[js.Any], availWidth = availWidth.asInstanceOf[js.Any], bufferDepth = bufferDepth.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], deviceXDPI = deviceXDPI.asInstanceOf[js.Any], deviceYDPI = deviceYDPI.asInstanceOf[js.Any], fontSmoothingEnabled = fontSmoothingEnabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], logicalXDPI = logicalXDPI.asInstanceOf[js.Any], logicalYDPI = logicalYDPI.asInstanceOf[js.Any], pixelDepth = pixelDepth.asInstanceOf[js.Any], systemXDPI = systemXDPI.asInstanceOf[js.Any], systemYDPI = systemYDPI.asInstanceOf[js.Any], updateInterval = updateInterval.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLScreen_typekey")(MSHTMLDotHTMLScreen_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLScreen]
  }
  
  extension [Self <: HTMLScreen](x: Self) {
    
    inline def setAvailHeight(value: Double): Self = StObject.set(x, "availHeight", value.asInstanceOf[js.Any])
    
    inline def setAvailWidth(value: Double): Self = StObject.set(x, "availWidth", value.asInstanceOf[js.Any])
    
    inline def setBufferDepth(value: Double): Self = StObject.set(x, "bufferDepth", value.asInstanceOf[js.Any])
    
    inline def setColorDepth(value: Double): Self = StObject.set(x, "colorDepth", value.asInstanceOf[js.Any])
    
    inline def setConstructor(value: Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setDeviceXDPI(value: Double): Self = StObject.set(x, "deviceXDPI", value.asInstanceOf[js.Any])
    
    inline def setDeviceYDPI(value: Double): Self = StObject.set(x, "deviceYDPI", value.asInstanceOf[js.Any])
    
    inline def setFontSmoothingEnabled(value: Boolean): Self = StObject.set(x, "fontSmoothingEnabled", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLogicalXDPI(value: Double): Self = StObject.set(x, "logicalXDPI", value.asInstanceOf[js.Any])
    
    inline def setLogicalYDPI(value: Double): Self = StObject.set(x, "logicalYDPI", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLScreen_typekey(value: HTMLScreen): Self = StObject.set(x, "MSHTML.HTMLScreen_typekey", value.asInstanceOf[js.Any])
    
    inline def setPixelDepth(value: Double): Self = StObject.set(x, "pixelDepth", value.asInstanceOf[js.Any])
    
    inline def setSystemXDPI(value: Double): Self = StObject.set(x, "systemXDPI", value.asInstanceOf[js.Any])
    
    inline def setSystemYDPI(value: Double): Self = StObject.set(x, "systemYDPI", value.asInstanceOf[js.Any])
    
    inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
