package typings.activexExcel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  val Button: Double
  
  val Shift: Double
  
  val x: Double
  
  val y: Double
}
object Button {
  
  @scala.inline
  def apply(Button: Double, Shift: Double, x: Double, y: Double): Button = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit class ButtonMutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: Double): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
