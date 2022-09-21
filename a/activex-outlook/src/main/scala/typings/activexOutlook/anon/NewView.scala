package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewView extends StObject {
  
  var Cancel: Boolean
  
  val NewView: Any
}
object NewView {
  
  inline def apply(Cancel: Boolean, NewView: Any): NewView = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], NewView = NewView.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewView]
  }
  
  extension [Self <: NewView](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setNewView(value: Any): Self = StObject.set(x, "NewView", value.asInstanceOf[js.Any])
  }
}
