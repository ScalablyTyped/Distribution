package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeNumberTextAlignString extends StObject {
  
  var fontSize: Double
  
  var textAlign: String
}
object FontSizeNumberTextAlignString {
  
  inline def apply(fontSize: Double, textAlign: String): FontSizeNumberTextAlignString = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeNumberTextAlignString]
  }
  
  extension [Self <: FontSizeNumberTextAlignString](x: Self) {
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
  }
}
