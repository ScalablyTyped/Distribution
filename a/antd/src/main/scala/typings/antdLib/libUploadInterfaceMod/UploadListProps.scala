package typings
package antdLib.libUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadListProps extends js.Object {
  var items: js.UndefOr[js.Array[UploadFile]] = js.undefined
  var listType: js.UndefOr[UploadListType] = js.undefined
  var locale: UploadLocale
  var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile, scala.Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* file */ UploadFile, scala.Unit | scala.Boolean]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var progressAttr: js.UndefOr[js.Object] = js.undefined
  var showPreviewIcon: js.UndefOr[scala.Boolean] = js.undefined
  var showRemoveIcon: js.UndefOr[scala.Boolean] = js.undefined
}

object UploadListProps {
  @scala.inline
  def apply(
    locale: UploadLocale,
    items: js.Array[UploadFile] = null,
    listType: UploadListType = null,
    onPreview: js.Function1[/* file */ UploadFile, scala.Unit] = null,
    onRemove: js.Function1[/* file */ UploadFile, scala.Unit | scala.Boolean] = null,
    prefixCls: java.lang.String = null,
    progressAttr: js.Object = null,
    showPreviewIcon: js.UndefOr[scala.Boolean] = js.undefined,
    showRemoveIcon: js.UndefOr[scala.Boolean] = js.undefined
  ): UploadListProps = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (items != null) __obj.updateDynamic("items")(items)
    if (listType != null) __obj.updateDynamic("listType")(listType)
    if (onPreview != null) __obj.updateDynamic("onPreview")(onPreview)
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (progressAttr != null) __obj.updateDynamic("progressAttr")(progressAttr)
    if (!js.isUndefined(showPreviewIcon)) __obj.updateDynamic("showPreviewIcon")(showPreviewIcon)
    if (!js.isUndefined(showRemoveIcon)) __obj.updateDynamic("showRemoveIcon")(showRemoveIcon)
    __obj.asInstanceOf[UploadListProps]
  }
}

