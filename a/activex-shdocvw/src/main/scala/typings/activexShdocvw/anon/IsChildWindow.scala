package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsChildWindow extends StObject {
  
  var Cancel: Boolean
  
  val IsChildWindow: Boolean
}
object IsChildWindow {
  
  inline def apply(Cancel: Boolean, IsChildWindow: Boolean): IsChildWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], IsChildWindow = IsChildWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsChildWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsChildWindow] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setIsChildWindow(value: Boolean): Self = StObject.set(x, "IsChildWindow", value.asInstanceOf[js.Any])
  }
}
