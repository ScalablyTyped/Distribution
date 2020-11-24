package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLScreen extends js.Object {
  
  @JSName("MSHTML.HTMLScreen_typekey")
  var MSHTMLDotHTMLScreen_typekey: HTMLScreen = js.native
  
  val availHeight: Double = js.native
  
  val availWidth: Double = js.native
  
  var bufferDepth: Double = js.native
  
  val colorDepth: Double = js.native
  
  val constructor: js.Any = js.native
  
  val deviceXDPI: Double = js.native
  
  val deviceYDPI: Double = js.native
  
  val fontSmoothingEnabled: Boolean = js.native
  
  val height: Double = js.native
  
  val logicalXDPI: Double = js.native
  
  val logicalYDPI: Double = js.native
  
  val pixelDepth: Double = js.native
  
  val systemXDPI: Double = js.native
  
  val systemYDPI: Double = js.native
  
  var updateInterval: Double = js.native
  
  val width: Double = js.native
}
object HTMLScreen {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLScreen_typekey: HTMLScreen,
    availHeight: Double,
    availWidth: Double,
    bufferDepth: Double,
    colorDepth: Double,
    constructor: js.Any,
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
  
  @scala.inline
  implicit class HTMLScreenOps[Self <: HTMLScreen] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotHTMLScreen_typekey(value: HTMLScreen): Self = this.set("MSHTML.HTMLScreen_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailHeight(value: Double): Self = this.set("availHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailWidth(value: Double): Self = this.set("availWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferDepth(value: Double): Self = this.set("bufferDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorDepth(value: Double): Self = this.set("colorDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructor(value: js.Any): Self = this.set("constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceXDPI(value: Double): Self = this.set("deviceXDPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceYDPI(value: Double): Self = this.set("deviceYDPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSmoothingEnabled(value: Boolean): Self = this.set("fontSmoothingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalXDPI(value: Double): Self = this.set("logicalXDPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalYDPI(value: Double): Self = this.set("logicalYDPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelDepth(value: Double): Self = this.set("pixelDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemXDPI(value: Double): Self = this.set("systemXDPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemYDPI(value: Double): Self = this.set("systemYDPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateInterval(value: Double): Self = this.set("updateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
