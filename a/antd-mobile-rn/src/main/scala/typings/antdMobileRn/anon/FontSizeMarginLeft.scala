package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeMarginLeft extends StObject {
  
  var color: String
  
  var fontSize: Double
  
  var marginLeft: Double
}
object FontSizeMarginLeft {
  
  inline def apply(color: String, fontSize: Double, marginLeft: Double): FontSizeMarginLeft = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeMarginLeft]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontSizeMarginLeft] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
  }
}
