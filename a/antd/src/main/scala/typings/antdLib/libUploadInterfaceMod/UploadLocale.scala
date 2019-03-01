package typings
package antdLib.libUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadLocale extends js.Object {
  var previewFile: js.UndefOr[java.lang.String] = js.undefined
  var removeFile: js.UndefOr[java.lang.String] = js.undefined
  var uploadError: js.UndefOr[java.lang.String] = js.undefined
  var uploading: js.UndefOr[java.lang.String] = js.undefined
}

object UploadLocale {
  @scala.inline
  def apply(
    previewFile: java.lang.String = null,
    removeFile: java.lang.String = null,
    uploadError: java.lang.String = null,
    uploading: java.lang.String = null
  ): UploadLocale = {
    val __obj = js.Dynamic.literal()
    if (previewFile != null) __obj.updateDynamic("previewFile")(previewFile)
    if (removeFile != null) __obj.updateDynamic("removeFile")(removeFile)
    if (uploadError != null) __obj.updateDynamic("uploadError")(uploadError)
    if (uploading != null) __obj.updateDynamic("uploading")(uploading)
    __obj.asInstanceOf[UploadLocale]
  }
}

