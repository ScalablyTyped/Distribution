package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewFolder extends StObject {
  
  var Cancel: Boolean
  
  val NewFolder: Any
}
object NewFolder {
  
  inline def apply(Cancel: Boolean, NewFolder: Any): NewFolder = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], NewFolder = NewFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewFolder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewFolder] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setNewFolder(value: Any): Self = StObject.set(x, "NewFolder", value.asInstanceOf[js.Any])
  }
}
