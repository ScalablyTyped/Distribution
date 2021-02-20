package typings.activexWord.anon

import typings.activexWord.Word.ProtectedViewWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseReason extends StObject {
  
  var Cancel: Boolean = js.native
  
  val CloseReason: Double = js.native
  
  val PvWindow: ProtectedViewWindow = js.native
}
object CloseReason {
  
  @scala.inline
  def apply(Cancel: Boolean, CloseReason: Double, PvWindow: ProtectedViewWindow): CloseReason = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], CloseReason = CloseReason.asInstanceOf[js.Any], PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseReason]
  }
  
  @scala.inline
  implicit class CloseReasonMutableBuilder[Self <: CloseReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseReason(value: Double): Self = StObject.set(x, "CloseReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPvWindow(value: ProtectedViewWindow): Self = StObject.set(x, "PvWindow", value.asInstanceOf[js.Any])
  }
}
