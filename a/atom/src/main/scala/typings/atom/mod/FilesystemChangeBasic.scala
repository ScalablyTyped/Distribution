package typings.atom.mod

import typings.atom.atomStrings.created
import typings.atom.atomStrings.deleted
import typings.atom.atomStrings.modified
import typings.atom.atomStrings.renamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesystemChangeBasic[Action /* <: created | modified | deleted | renamed */] extends StObject {
  
  /** A string describing the filesystem action that occurred. */
  var action: Action
  
  /** The absolute path to the filesystem entry that was acted upon. */
  var path: String
}
object FilesystemChangeBasic {
  
  @scala.inline
  def apply[Action /* <: created | modified | deleted | renamed */](action: Action, path: String): FilesystemChangeBasic[Action] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesystemChangeBasic[Action]]
  }
  
  @scala.inline
  implicit class FilesystemChangeBasicMutableBuilder[Self <: FilesystemChangeBasic[?], Action /* <: created | modified | deleted | renamed */] (val x: Self & FilesystemChangeBasic[Action]) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
