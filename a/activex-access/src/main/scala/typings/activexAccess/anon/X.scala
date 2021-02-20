package typings.activexAccess.anon

import typings.activexStdole.stdole.OLE_XPOS_PIXELS
import typings.activexStdole.stdole.OLE_YPOS_PIXELS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X extends StObject {
  
  val Button: Double = js.native
  
  val FieldList: Double = js.native
  
  val Shift: Double = js.native
  
  val X: OLE_XPOS_PIXELS = js.native
  
  val Y: OLE_YPOS_PIXELS = js.native
}
object X {
  
  @scala.inline
  def apply(Button: Double, FieldList: Double, Shift: Double, X: OLE_XPOS_PIXELS, Y: OLE_YPOS_PIXELS): X = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], FieldList = FieldList.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  
  @scala.inline
  implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: Double): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldList(value: Double): Self = StObject.set(x, "FieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: OLE_XPOS_PIXELS): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: OLE_YPOS_PIXELS): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
