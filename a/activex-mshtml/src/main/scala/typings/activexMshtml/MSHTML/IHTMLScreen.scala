package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLScreen extends StObject {
  
  @JSName("MSHTML.IHTMLScreen_typekey")
  var MSHTMLDotIHTMLScreen_typekey: IHTMLScreen = js.native
  
  val availHeight: Double = js.native
  
  val availWidth: Double = js.native
  
  var bufferDepth: Double = js.native
  
  val colorDepth: Double = js.native
  
  val fontSmoothingEnabled: Boolean = js.native
  
  val height: Double = js.native
  
  var updateInterval: Double = js.native
  
  val width: Double = js.native
}
object IHTMLScreen {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLScreen_typekey: IHTMLScreen,
    availHeight: Double,
    availWidth: Double,
    bufferDepth: Double,
    colorDepth: Double,
    fontSmoothingEnabled: Boolean,
    height: Double,
    updateInterval: Double,
    width: Double
  ): IHTMLScreen = {
    val __obj = js.Dynamic.literal(availHeight = availHeight.asInstanceOf[js.Any], availWidth = availWidth.asInstanceOf[js.Any], bufferDepth = bufferDepth.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], fontSmoothingEnabled = fontSmoothingEnabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], updateInterval = updateInterval.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLScreen_typekey")(MSHTMLDotIHTMLScreen_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLScreen]
  }
  
  @scala.inline
  implicit class IHTMLScreenMutableBuilder[Self <: IHTMLScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailHeight(value: Double): Self = StObject.set(x, "availHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailWidth(value: Double): Self = StObject.set(x, "availWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferDepth(value: Double): Self = StObject.set(x, "bufferDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorDepth(value: Double): Self = StObject.set(x, "colorDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSmoothingEnabled(value: Boolean): Self = StObject.set(x, "fontSmoothingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIHTMLScreen_typekey(value: IHTMLScreen): Self = StObject.set(x, "MSHTML.IHTMLScreen_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
