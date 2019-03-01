package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesystemChangeRename
  extends FilesystemChangeBasic[atomLib.atomLibStrings.renamed] {
  /**
    *  For rename events, a string containing the filesystem entry's former
    *  absolute path.
    */
  var oldPath: java.lang.String
}

object FilesystemChangeRename {
  @scala.inline
  def apply(action: atomLib.atomLibStrings.renamed, oldPath: java.lang.String, path: java.lang.String): FilesystemChangeRename = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("oldPath")(oldPath)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[FilesystemChangeRename]
  }
}

