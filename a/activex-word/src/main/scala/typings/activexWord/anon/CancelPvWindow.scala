package typings.activexWord.anon

import typings.activexWord.Word.ProtectedViewWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelPvWindow extends StObject {
  
  var Cancel: Boolean = js.native
  
  val PvWindow: ProtectedViewWindow = js.native
}
object CancelPvWindow {
  
  @scala.inline
  def apply(Cancel: Boolean, PvWindow: ProtectedViewWindow): CancelPvWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelPvWindow]
  }
  
  @scala.inline
  implicit class CancelPvWindowMutableBuilder[Self <: CancelPvWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPvWindow(value: ProtectedViewWindow): Self = StObject.set(x, "PvWindow", value.asInstanceOf[js.Any])
  }
}
