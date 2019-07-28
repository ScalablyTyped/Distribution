package typings.atom.atomMod

import typings.atom.atomStrings.renamed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesystemChangeRename extends FilesystemChangeBasic[renamed] {
  /**
    *  For rename events, a string containing the filesystem entry's former
    *  absolute path.
    */
  var oldPath: String
}

object FilesystemChangeRename {
  @scala.inline
  def apply(action: renamed, oldPath: String, path: String): FilesystemChangeRename = {
    val __obj = js.Dynamic.literal(action = action, oldPath = oldPath, path = path)
  
    __obj.asInstanceOf[FilesystemChangeRename]
  }
}

