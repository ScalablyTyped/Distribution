package typings.activexWord.anon

import typings.activexWord.Word.ProtectedViewWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseReason extends StObject {
  
  var Cancel: Boolean
  
  val CloseReason: Double
  
  val PvWindow: ProtectedViewWindow
}
object CloseReason {
  
  inline def apply(Cancel: Boolean, CloseReason: Double, PvWindow: ProtectedViewWindow): CloseReason = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], CloseReason = CloseReason.asInstanceOf[js.Any], PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseReason]
  }
  
  extension [Self <: CloseReason](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setCloseReason(value: Double): Self = StObject.set(x, "CloseReason", value.asInstanceOf[js.Any])
    
    inline def setPvWindow(value: ProtectedViewWindow): Self = StObject.set(x, "PvWindow", value.asInstanceOf[js.Any])
  }
}
