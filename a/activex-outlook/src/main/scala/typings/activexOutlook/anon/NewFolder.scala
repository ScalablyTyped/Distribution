package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewFolder extends StObject {
  
  var Cancel: Boolean
  
  val NewFolder: js.Any
}
object NewFolder {
  
  inline def apply(Cancel: Boolean, NewFolder: js.Any): NewFolder = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], NewFolder = NewFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewFolder]
  }
  
  extension [Self <: NewFolder](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setNewFolder(value: js.Any): Self = StObject.set(x, "NewFolder", value.asInstanceOf[js.Any])
  }
}
