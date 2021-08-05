package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  var Button: Double
  
  var Shift: Double
  
  var X: Double
  
  var Y: Double
}
object Button {
  
  inline def apply(Button: Double, Shift: Double, X: Double, Y: Double): Button = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  extension [Self <: Button](x: Self) {
    
    inline def setButton(value: Double): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
