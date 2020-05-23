package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewFile extends js.Object {
  var previewFile: String
  var removeFile: String
  var uploadError: String
  var uploading: String
}

object PreviewFile {
  @scala.inline
  def apply(previewFile: String, removeFile: String, uploadError: String, uploading: String): PreviewFile = {
    val __obj = js.Dynamic.literal(previewFile = previewFile.asInstanceOf[js.Any], removeFile = removeFile.asInstanceOf[js.Any], uploadError = uploadError.asInstanceOf[js.Any], uploading = uploading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewFile]
  }
}

