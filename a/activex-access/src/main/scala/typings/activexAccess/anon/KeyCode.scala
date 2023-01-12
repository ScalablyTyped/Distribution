package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyCode extends StObject {
  
  var KeyCode: Double
  
  var Shift: Double
}
object KeyCode {
  
  inline def apply(KeyCode: Double, Shift: Double): KeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyCode] (val x: Self) extends AnyVal {
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "KeyCode", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
  }
}
