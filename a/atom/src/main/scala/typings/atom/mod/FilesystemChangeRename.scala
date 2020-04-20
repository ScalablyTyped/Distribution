package typings.atom.mod

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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesystemChangeRename]
  }
}

