package typings.apolloServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploadOptions extends js.Object {
  var maxFieldSize: js.UndefOr[Double] = js.native
  var maxFileSize: js.UndefOr[Double] = js.native
  var maxFiles: js.UndefOr[Double] = js.native
}

object FileUploadOptions {
  @scala.inline
  def apply(): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadOptions]
  }
  @scala.inline
  implicit class FileUploadOptionsOps[Self <: FileUploadOptions] (val x: Self) extends AnyVal {
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
    def setMaxFieldSize(value: Double): Self = this.set("maxFieldSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFieldSize: Self = this.set("maxFieldSize", js.undefined)
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    @scala.inline
    def setMaxFiles(value: Double): Self = this.set("maxFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFiles: Self = this.set("maxFiles", js.undefined)
  }
  
}

