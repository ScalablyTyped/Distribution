package typings.activexExcel.anon

import typings.activexExcel.Excel.ProtectedViewWindow
import typings.activexExcel.Excel.XlProtectedViewCloseReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends StObject {
  
  var Cancel: Boolean = js.native
  
  val Pvw: ProtectedViewWindow = js.native
  
  val Reason: XlProtectedViewCloseReason = js.native
}
object Cancel {
  
  @scala.inline
  def apply(Cancel: Boolean, Pvw: ProtectedViewWindow, Reason: XlProtectedViewCloseReason): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pvw = Pvw.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPvw(value: ProtectedViewWindow): Self = StObject.set(x, "Pvw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: XlProtectedViewCloseReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
