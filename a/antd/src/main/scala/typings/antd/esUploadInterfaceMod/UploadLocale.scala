package typings.antd.esUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadLocale extends js.Object {
  var downloadFile: js.UndefOr[String] = js.undefined
  var previewFile: js.UndefOr[String] = js.undefined
  var removeFile: js.UndefOr[String] = js.undefined
  var uploadError: js.UndefOr[String] = js.undefined
  var uploading: js.UndefOr[String] = js.undefined
}

object UploadLocale {
  @scala.inline
  def apply(
    downloadFile: String = null,
    previewFile: String = null,
    removeFile: String = null,
    uploadError: String = null,
    uploading: String = null
  ): UploadLocale = {
    val __obj = js.Dynamic.literal()
    if (downloadFile != null) __obj.updateDynamic("downloadFile")(downloadFile.asInstanceOf[js.Any])
    if (previewFile != null) __obj.updateDynamic("previewFile")(previewFile.asInstanceOf[js.Any])
    if (removeFile != null) __obj.updateDynamic("removeFile")(removeFile.asInstanceOf[js.Any])
    if (uploadError != null) __obj.updateDynamic("uploadError")(uploadError.asInstanceOf[js.Any])
    if (uploading != null) __obj.updateDynamic("uploading")(uploading.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadLocale]
  }
}

