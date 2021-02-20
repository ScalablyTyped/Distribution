package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shift extends StObject {
  
  val FieldList: Double = js.native
  
  var KeyCode: Double = js.native
  
  val Shift: Double = js.native
}
object Shift {
  
  @scala.inline
  def apply(FieldList: Double, KeyCode: Double, Shift: Double): Shift = {
    val __obj = js.Dynamic.literal(FieldList = FieldList.asInstanceOf[js.Any], KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shift]
  }
  
  @scala.inline
  implicit class ShiftMutableBuilder[Self <: Shift] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldList(value: Double): Self = StObject.set(x, "FieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCode(value: Double): Self = StObject.set(x, "KeyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
  }
}
