package typings.atom.mod

import typings.atom.atomStrings.created
import typings.atom.atomStrings.deleted
import typings.atom.atomStrings.modified
import typings.atom.atomStrings.renamed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesystemChangeBasic[Action /* <: created | modified | deleted | renamed */] extends js.Object {
  /** A string describing the filesystem action that occurred. */
  var action: Action = js.native
  /** The absolute path to the filesystem entry that was acted upon. */
  var path: String = js.native
}

object FilesystemChangeBasic {
  @scala.inline
  def apply[/* <: typings.atom.atomStrings.created | typings.atom.atomStrings.modified | typings.atom.atomStrings.deleted | typings.atom.atomStrings.renamed */ Action](action: Action, path: String): FilesystemChangeBasic[Action] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesystemChangeBasic[Action]]
  }
  @scala.inline
  implicit class FilesystemChangeBasicOps[Self <: FilesystemChangeBasic[_], /* <: typings.atom.atomStrings.created | typings.atom.atomStrings.modified | typings.atom.atomStrings.deleted | typings.atom.atomStrings.renamed */ Action] (val x: Self with FilesystemChangeBasic[Action]) extends AnyVal {
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
    def setAction(value: Action): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

