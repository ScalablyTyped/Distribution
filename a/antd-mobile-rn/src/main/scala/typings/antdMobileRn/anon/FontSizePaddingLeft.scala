package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizePaddingLeft extends StObject {
  
  var color: String
  
  var fontSize: Double
  
  var paddingLeft: Double
}
object FontSizePaddingLeft {
  
  inline def apply(color: String, fontSize: Double, paddingLeft: Double): FontSizePaddingLeft = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizePaddingLeft]
  }
  
  extension [Self <: FontSizePaddingLeft](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
  }
}
