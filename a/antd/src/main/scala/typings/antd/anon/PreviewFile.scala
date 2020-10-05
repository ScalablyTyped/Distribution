package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewFile extends js.Object {
  var previewFile: String = js.native
  var removeFile: String = js.native
  var uploadError: String = js.native
  var uploading: String = js.native
}

object PreviewFile {
  @scala.inline
  def apply(previewFile: String, removeFile: String, uploadError: String, uploading: String): PreviewFile = {
    val __obj = js.Dynamic.literal(previewFile = previewFile.asInstanceOf[js.Any], removeFile = removeFile.asInstanceOf[js.Any], uploadError = uploadError.asInstanceOf[js.Any], uploading = uploading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewFile]
  }
  @scala.inline
  implicit class PreviewFileOps[Self <: PreviewFile] (val x: Self) extends AnyVal {
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
    def setPreviewFile(value: String): Self = this.set("previewFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveFile(value: String): Self = this.set("removeFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadError(value: String): Self = this.set("uploadError", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploading(value: String): Self = this.set("uploading", value.asInstanceOf[js.Any])
  }
  
}

