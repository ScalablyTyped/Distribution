package typings.antd.libUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowUploadListInterface extends js.Object {
  var showDownloadIcon: js.UndefOr[Boolean] = js.undefined
  var showPreviewIcon: js.UndefOr[Boolean] = js.undefined
  var showRemoveIcon: js.UndefOr[Boolean] = js.undefined
}

object ShowUploadListInterface {
  @scala.inline
  def apply(
    showDownloadIcon: js.UndefOr[Boolean] = js.undefined,
    showPreviewIcon: js.UndefOr[Boolean] = js.undefined,
    showRemoveIcon: js.UndefOr[Boolean] = js.undefined
  ): ShowUploadListInterface = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showDownloadIcon)) __obj.updateDynamic("showDownloadIcon")(showDownloadIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreviewIcon)) __obj.updateDynamic("showPreviewIcon")(showPreviewIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemoveIcon)) __obj.updateDynamic("showRemoveIcon")(showRemoveIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowUploadListInterface]
  }
}

