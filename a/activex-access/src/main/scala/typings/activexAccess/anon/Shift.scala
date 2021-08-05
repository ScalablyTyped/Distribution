package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shift extends StObject {
  
  val FieldList: Double
  
  var KeyCode: Double
  
  val Shift: Double
}
object Shift {
  
  inline def apply(FieldList: Double, KeyCode: Double, Shift: Double): Shift = {
    val __obj = js.Dynamic.literal(FieldList = FieldList.asInstanceOf[js.Any], KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shift]
  }
  
  extension [Self <: Shift](x: Self) {
    
    inline def setFieldList(value: Double): Self = StObject.set(x, "FieldList", value.asInstanceOf[js.Any])
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "KeyCode", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
  }
}
