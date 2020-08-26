package typings.appBuilderLib.platformSpecificBuildOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSet extends js.Object {
  /**
    * The [glob patterns](/file-patterns).
    */
  var filter: js.UndefOr[js.Array[String] | String] = js.native
  /**
    * The source path relative to the project directory.
    */
  var from: js.UndefOr[String] = js.native
  /**
    * The destination path relative to the app's content directory for `extraFiles` and the app's resource directory for `extraResources`.
    */
  var to: js.UndefOr[String] = js.native
}

object FileSet {
  @scala.inline
  def apply(): FileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSet]
  }
  @scala.inline
  implicit class FileSetOps[Self <: FileSet] (val x: Self) extends AnyVal {
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
    def setFilterVarargs(value: String*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: js.Array[String] | String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

