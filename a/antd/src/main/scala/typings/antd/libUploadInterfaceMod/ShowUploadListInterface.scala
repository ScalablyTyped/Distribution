package typings.antd.libUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowUploadListInterface extends js.Object {
  var showPreviewIcon: js.UndefOr[Boolean] = js.undefined
  var showRemoveIcon: js.UndefOr[Boolean] = js.undefined
}

object ShowUploadListInterface {
  @scala.inline
  def apply(
    showPreviewIcon: js.UndefOr[Boolean] = js.undefined,
    showRemoveIcon: js.UndefOr[Boolean] = js.undefined
  ): ShowUploadListInterface = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showPreviewIcon)) __obj.updateDynamic("showPreviewIcon")(showPreviewIcon)
    if (!js.isUndefined(showRemoveIcon)) __obj.updateDynamic("showRemoveIcon")(showRemoveIcon)
    __obj.asInstanceOf[ShowUploadListInterface]
  }
}

