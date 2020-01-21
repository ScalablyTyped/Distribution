package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownloadFile extends js.Object {
  var downloadFile: String
  var previewFile: String
  var removeFile: String
  var uploadError: String
  var uploading: String
}

object AnonDownloadFile {
  @scala.inline
  def apply(
    downloadFile: String,
    previewFile: String,
    removeFile: String,
    uploadError: String,
    uploading: String
  ): AnonDownloadFile = {
    val __obj = js.Dynamic.literal(downloadFile = downloadFile.asInstanceOf[js.Any], previewFile = previewFile.asInstanceOf[js.Any], removeFile = removeFile.asInstanceOf[js.Any], uploadError = uploadError.asInstanceOf[js.Any], uploading = uploading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDownloadFile]
  }
}

