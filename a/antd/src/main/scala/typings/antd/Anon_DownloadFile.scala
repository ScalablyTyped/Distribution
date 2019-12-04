package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DownloadFile extends js.Object {
  var downloadFile: String
  var previewFile: String
  var removeFile: String
  var uploadError: String
  var uploading: String
}

object Anon_DownloadFile {
  @scala.inline
  def apply(
    downloadFile: String,
    previewFile: String,
    removeFile: String,
    uploadError: String,
    uploading: String
  ): Anon_DownloadFile = {
    val __obj = js.Dynamic.literal(downloadFile = downloadFile.asInstanceOf[js.Any], previewFile = previewFile.asInstanceOf[js.Any], removeFile = removeFile.asInstanceOf[js.Any], uploadError = uploadError.asInstanceOf[js.Any], uploading = uploading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DownloadFile]
  }
}

