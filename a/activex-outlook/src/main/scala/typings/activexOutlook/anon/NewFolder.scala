package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewFolder extends StObject {
  
  var Cancel: Boolean = js.native
  
  val NewFolder: js.Any = js.native
}
object NewFolder {
  
  @scala.inline
  def apply(Cancel: Boolean, NewFolder: js.Any): NewFolder = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], NewFolder = NewFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewFolder]
  }
  
  @scala.inline
  implicit class NewFolderMutableBuilder[Self <: NewFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewFolder(value: js.Any): Self = StObject.set(x, "NewFolder", value.asInstanceOf[js.Any])
  }
}
