package typings.apolloServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadOptions extends js.Object {
  var maxFieldSize: js.UndefOr[Double] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var maxFiles: js.UndefOr[Double] = js.undefined
}

object FileUploadOptions {
  @scala.inline
  def apply(
    maxFieldSize: js.UndefOr[Double] = js.undefined,
    maxFileSize: js.UndefOr[Double] = js.undefined,
    maxFiles: js.UndefOr[Double] = js.undefined
  ): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxFieldSize)) __obj.updateDynamic("maxFieldSize")(maxFieldSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFiles)) __obj.updateDynamic("maxFiles")(maxFiles.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadOptions]
  }
}

