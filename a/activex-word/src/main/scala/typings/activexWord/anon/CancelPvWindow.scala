package typings.activexWord.anon

import typings.activexWord.Word.ProtectedViewWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelPvWindow extends StObject {
  
  var Cancel: Boolean
  
  val PvWindow: ProtectedViewWindow
}
object CancelPvWindow {
  
  inline def apply(Cancel: Boolean, PvWindow: ProtectedViewWindow): CancelPvWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelPvWindow]
  }
  
  extension [Self <: CancelPvWindow](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setPvWindow(value: ProtectedViewWindow): Self = StObject.set(x, "PvWindow", value.asInstanceOf[js.Any])
  }
}
