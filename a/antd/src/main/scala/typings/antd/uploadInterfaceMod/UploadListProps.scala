package typings.antd.uploadInterfaceMod

import typings.react.mod.ReactNode
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadListProps[T] extends js.Object {
  var downloadIcon: js.UndefOr[ReactNode] = js.undefined
  var iconRender: js.UndefOr[
    js.Function2[/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType], ReactNode]
  ] = js.undefined
  var isImageUrl: js.UndefOr[js.Function1[/* file */ UploadFile[_], Boolean]] = js.undefined
  var items: js.UndefOr[js.Array[UploadFile[T]]] = js.undefined
  var listType: js.UndefOr[UploadListType] = js.undefined
  var locale: UploadLocale
  var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.undefined
  var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit | Boolean]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var previewFile: js.UndefOr[PreviewFileHandler] = js.undefined
  var progress: js.UndefOr[UploadListProgressProps] = js.undefined
  var removeIcon: js.UndefOr[ReactNode] = js.undefined
  var showDownloadIcon: js.UndefOr[Boolean] = js.undefined
  var showPreviewIcon: js.UndefOr[Boolean] = js.undefined
  var showRemoveIcon: js.UndefOr[Boolean] = js.undefined
}

object UploadListProps {
  @scala.inline
  def apply[T](
    locale: UploadLocale,
    downloadIcon: ReactNode = null,
    iconRender: (/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType]) => ReactNode = null,
    isImageUrl: /* file */ UploadFile[_] => Boolean = null,
    items: js.Array[UploadFile[T]] = null,
    listType: UploadListType = null,
    onDownload: /* file */ UploadFile[T] => Unit = null,
    onPreview: /* file */ UploadFile[T] => Unit = null,
    onRemove: /* file */ UploadFile[T] => Unit | Boolean = null,
    prefixCls: String = null,
    previewFile: /* file */ File | Blob => js.Thenable[String] = null,
    progress: UploadListProgressProps = null,
    removeIcon: ReactNode = null,
    showDownloadIcon: js.UndefOr[Boolean] = js.undefined,
    showPreviewIcon: js.UndefOr[Boolean] = js.undefined,
    showRemoveIcon: js.UndefOr[Boolean] = js.undefined
  ): UploadListProps[T] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (downloadIcon != null) __obj.updateDynamic("downloadIcon")(downloadIcon.asInstanceOf[js.Any])
    if (iconRender != null) __obj.updateDynamic("iconRender")(js.Any.fromFunction2(iconRender))
    if (isImageUrl != null) __obj.updateDynamic("isImageUrl")(js.Any.fromFunction1(isImageUrl))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (onDownload != null) __obj.updateDynamic("onDownload")(js.Any.fromFunction1(onDownload))
    if (onPreview != null) __obj.updateDynamic("onPreview")(js.Any.fromFunction1(onPreview))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (previewFile != null) __obj.updateDynamic("previewFile")(js.Any.fromFunction1(previewFile))
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showDownloadIcon)) __obj.updateDynamic("showDownloadIcon")(showDownloadIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreviewIcon)) __obj.updateDynamic("showPreviewIcon")(showPreviewIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemoveIcon)) __obj.updateDynamic("showRemoveIcon")(showRemoveIcon.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadListProps[T]]
  }
}

