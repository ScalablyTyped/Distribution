package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.`bottom-left`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DividerText extends StObject {
  
  var activeTextStyle: Fill
  
  var dividerText: String
  
  var position: `bottom-left`
  
  var rootText: String
  
  var textStyle: Cursor
}
object DividerText {
  
  inline def apply(activeTextStyle: Fill, dividerText: String, rootText: String, textStyle: Cursor): DividerText = {
    val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle.asInstanceOf[js.Any], dividerText = dividerText.asInstanceOf[js.Any], position = "bottom-left", rootText = rootText.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DividerText]
  }
  
  extension [Self <: DividerText](x: Self) {
    
    inline def setActiveTextStyle(value: Fill): Self = StObject.set(x, "activeTextStyle", value.asInstanceOf[js.Any])
    
    inline def setDividerText(value: String): Self = StObject.set(x, "dividerText", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: `bottom-left`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRootText(value: String): Self = StObject.set(x, "rootText", value.asInstanceOf[js.Any])
    
    inline def setTextStyle(value: Cursor): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
  }
}
