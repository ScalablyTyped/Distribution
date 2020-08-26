package typings.atom.mod

import typings.atom.atomStrings.renamed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class FilesystemChangeRenameOps[Self <: FilesystemChangeRename] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOldPath(value: String): Self = this.set("oldPath", value.asInstanceOf[js.Any])
  }
  
}

