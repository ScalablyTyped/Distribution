package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pin extends StObject {
  
  var pin: StyleR
  
  var pointer: StyleLineCap
}
object Pin {
  
  inline def apply(pin: StyleR, pointer: StyleLineCap): Pin = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pin]
  }
  
  extension [Self <: Pin](x: Self) {
    
    inline def setPin(value: StyleR): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: StyleLineCap): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}
