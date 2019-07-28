package typings.antd.esUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadLocale extends js.Object {
  var previewFile: js.UndefOr[String] = js.undefined
  var removeFile: js.UndefOr[String] = js.undefined
  var uploadError: js.UndefOr[String] = js.undefined
  var uploading: js.UndefOr[String] = js.undefined
}

object UploadLocale {
  @scala.inline
  def apply(
    previewFile: String = null,
    removeFile: String = null,
    uploadError: String = null,
    uploading: String = null
  ): UploadLocale = {
    val __obj = js.Dynamic.literal()
    if (previewFile != null) __obj.updateDynamic("previewFile")(previewFile)
    if (removeFile != null) __obj.updateDynamic("removeFile")(removeFile)
    if (uploadError != null) __obj.updateDynamic("uploadError")(uploadError)
    if (uploading != null) __obj.updateDynamic("uploading")(uploading)
    __obj.asInstanceOf[UploadLocale]
  }
}

