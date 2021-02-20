package typings.atom.mod

import typings.atom.atomStrings.renamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesystemChangeRename extends FilesystemChangeBasic[renamed] {
  
  /**
    *  For rename events, a string containing the filesystem entry's former
    *  absolute path.
    */
  var oldPath: String = js.native
}
object FilesystemChangeRename {
  
  @scala.inline
  def apply(action: renamed, oldPath: String, path: String): FilesystemChangeRename = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesystemChangeRename]
  }
  
  @scala.inline
  implicit class FilesystemChangeRenameMutableBuilder[Self <: FilesystemChangeRename] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldPath(value: String): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
  }
}
