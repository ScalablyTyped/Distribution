package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OlMouseButton
import typings.activexOutlook.Outlook.OlShiftState
import typings.activexStdole.stdole.OLE_XPOS_CONTAINER
import typings.activexStdole.stdole.OLE_YPOS_CONTAINER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  val Button: OlMouseButton
  
  val Shift: OlShiftState
  
  val X: OLE_XPOS_CONTAINER
  
  val Y: OLE_YPOS_CONTAINER
}
object Button {
  
  inline def apply(Button: OlMouseButton, Shift: OlShiftState, X: OLE_XPOS_CONTAINER, Y: OLE_YPOS_CONTAINER): Button = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
    
    inline def setButton(value: OlMouseButton): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
    
    inline def setShift(value: OlShiftState): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
    
    inline def setX(value: OLE_XPOS_CONTAINER): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    inline def setY(value: OLE_YPOS_CONTAINER): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
