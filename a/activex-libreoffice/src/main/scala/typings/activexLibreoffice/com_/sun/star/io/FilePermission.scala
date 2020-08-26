package typings.activexLibreoffice.com_.sun.star.io

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This permission represents access to a file or directory. A {@link FilePermission} consists of a file url and a set of actions valid for that url.
  *
  * The path of the file url that ends in `"/ *"` indicates all the files and directories contained in that directory. A path that ends with `"/-"`
  * indicates (recursively) all files and subdirectories contained in that directory. A file url string consisting of the special token `"<<ALL FILES>>"`
  * matches any file. ;  Note: A file url string consisting of a single `"*"` indicates all the files in the current directory, while a string consisting
  * of a single `"-"` indicates all the files in the current directory and (recursively) all files and subdirectories contained in the current directory.
  * ;  The actions to be granted is a list of one or more comma-separated keywords. The possible keywords are `"read"` , `"write"` , `"execute"` , and
  * `"delete"` . Their meaning is defined as follows: `read` -  read permission`write` -  write permission`execute` -  execute permission`delete` -
  * delete permission;  The actions string is processed case-insensitive.
  * @since OOo 1.1.2
  */
@js.native
trait FilePermission extends js.Object {
  /** comma separated actions list */
  var Actions: String = js.native
  /** target file url */
  var URL: String = js.native
}

object FilePermission {
  @scala.inline
  def apply(Actions: String, URL: String): FilePermission = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePermission]
  }
  @scala.inline
  implicit class FilePermissionOps[Self <: FilePermission] (val x: Self) extends AnyVal {
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
    def setActions(value: String): Self = this.set("Actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
  }
  
}

