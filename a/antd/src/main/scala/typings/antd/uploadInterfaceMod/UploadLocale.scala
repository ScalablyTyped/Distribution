package typings.antd.uploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadLocale extends js.Object {
  var downloadFile: js.UndefOr[String] = js.native
  var previewFile: js.UndefOr[String] = js.native
  var removeFile: js.UndefOr[String] = js.native
  var uploadError: js.UndefOr[String] = js.native
  var uploading: js.UndefOr[String] = js.native
}

object UploadLocale {
  @scala.inline
  def apply(): UploadLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadLocale]
  }
  @scala.inline
  implicit class UploadLocaleOps[Self <: UploadLocale] (val x: Self) extends AnyVal {
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
    def setDownloadFile(value: String): Self = this.set("downloadFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadFile: Self = this.set("downloadFile", js.undefined)
    @scala.inline
    def setPreviewFile(value: String): Self = this.set("previewFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewFile: Self = this.set("previewFile", js.undefined)
    @scala.inline
    def setRemoveFile(value: String): Self = this.set("removeFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveFile: Self = this.set("removeFile", js.undefined)
    @scala.inline
    def setUploadError(value: String): Self = this.set("uploadError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadError: Self = this.set("uploadError", js.undefined)
    @scala.inline
    def setUploading(value: String): Self = this.set("uploading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploading: Self = this.set("uploading", js.undefined)
  }
  
}

