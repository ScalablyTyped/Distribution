package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorFlexFontSize extends StObject {
  
  var color: String
  
  var flex: Double
  
  var fontSize: Double
}
object ColorFlexFontSize {
  
  inline def apply(color: String, flex: Double, fontSize: Double): ColorFlexFontSize = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFlexFontSize]
  }
  
  extension [Self <: ColorFlexFontSize](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
