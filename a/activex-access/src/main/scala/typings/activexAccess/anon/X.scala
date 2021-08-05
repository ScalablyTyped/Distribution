package typings.activexAccess.anon

import typings.activexStdole.stdole.OLE_XPOS_PIXELS
import typings.activexStdole.stdole.OLE_YPOS_PIXELS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  val Button: Double
  
  val FieldList: Double
  
  val Shift: Double
  
  val X: OLE_XPOS_PIXELS
  
  val Y: OLE_YPOS_PIXELS
}
object X {
  
  inline def apply(Button: Double, FieldList: Double, Shift: Double, X: OLE_XPOS_PIXELS, Y: OLE_YPOS_PIXELS): X = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], FieldList = FieldList.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  
  extension [Self <: X](x: Self) {
    
    inline def setButton(value: Double): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
    
    inline def setFieldList(value: Double): Self = StObject.set(x, "FieldList", value.asInstanceOf[js.Any])
    
    inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
    
    inline def setX(value: OLE_XPOS_PIXELS): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    inline def setY(value: OLE_YPOS_PIXELS): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
