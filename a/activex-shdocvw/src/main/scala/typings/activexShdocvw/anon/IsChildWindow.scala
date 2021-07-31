package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsChildWindow extends StObject {
  
  var Cancel: Boolean
  
  val IsChildWindow: Boolean
}
object IsChildWindow {
  
  @scala.inline
  def apply(Cancel: Boolean, IsChildWindow: Boolean): IsChildWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], IsChildWindow = IsChildWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsChildWindow]
  }
  
  @scala.inline
  implicit class IsChildWindowMutableBuilder[Self <: IsChildWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChildWindow(value: Boolean): Self = StObject.set(x, "IsChildWindow", value.asInstanceOf[js.Any])
  }
}
