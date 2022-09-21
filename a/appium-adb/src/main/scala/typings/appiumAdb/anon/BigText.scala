package typings.appiumAdb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigText extends StObject {
  
  var bigText: String | Null
  
  var bigTitle: String | Null
  
  var infoText: String | Null
  
  var subText: String | Null
  
  var template: String | Null
  
  var text: String | Null
  
  var tickerText: String | Null
  
  var title: String | Null
}
object BigText {
  
  inline def apply(): BigText = {
    val __obj = js.Dynamic.literal(bigText = null, bigTitle = null, infoText = null, subText = null, template = null, text = null, tickerText = null, title = null)
    __obj.asInstanceOf[BigText]
  }
  
  extension [Self <: BigText](x: Self) {
    
    inline def setBigText(value: String): Self = StObject.set(x, "bigText", value.asInstanceOf[js.Any])
    
    inline def setBigTextNull: Self = StObject.set(x, "bigText", null)
    
    inline def setBigTitle(value: String): Self = StObject.set(x, "bigTitle", value.asInstanceOf[js.Any])
    
    inline def setBigTitleNull: Self = StObject.set(x, "bigTitle", null)
    
    inline def setInfoText(value: String): Self = StObject.set(x, "infoText", value.asInstanceOf[js.Any])
    
    inline def setInfoTextNull: Self = StObject.set(x, "infoText", null)
    
    inline def setSubText(value: String): Self = StObject.set(x, "subText", value.asInstanceOf[js.Any])
    
    inline def setSubTextNull: Self = StObject.set(x, "subText", null)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTickerText(value: String): Self = StObject.set(x, "tickerText", value.asInstanceOf[js.Any])
    
    inline def setTickerTextNull: Self = StObject.set(x, "tickerText", null)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
  }
}
