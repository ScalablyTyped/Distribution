package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: String
  
  var desiredContrast: Double
  
  var foreground: String
}
object Background {
  
  inline def apply(background: String, desiredContrast: Double, foreground: String): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], desiredContrast = desiredContrast.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setDesiredContrast(value: Double): Self = StObject.set(x, "desiredContrast", value.asInstanceOf[js.Any])
    
    inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
  }
}
