package typings.atom.srcOtherTypesMod

import typings.atom.atomStrings.renamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesystemChangeRename
  extends StObject
     with FilesystemChangeBasic[renamed] {
  
  /**
    *  For rename events, a string containing the filesystem entry's former
    *  absolute path.
    */
  var oldPath: String
}
object FilesystemChangeRename {
  
  inline def apply(oldPath: String, path: String): FilesystemChangeRename = {
    val __obj = js.Dynamic.literal(action = "renamed", oldPath = oldPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesystemChangeRename]
  }
  
  extension [Self <: FilesystemChangeRename](x: Self) {
    
    inline def setOldPath(value: String): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
  }
}
