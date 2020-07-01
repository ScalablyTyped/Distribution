package typings.antd.draggerMod

import typings.antd.antdStrings.PATCH
import typings.antd.antdStrings.POST
import typings.antd.antdStrings.PUT
import typings.antd.antdStrings.patch_
import typings.antd.antdStrings.post_
import typings.antd.antdStrings.put_
import typings.antd.uploadInterfaceMod.HttpRequestHeader
import typings.antd.uploadInterfaceMod.PreviewFileHandler
import typings.antd.uploadInterfaceMod.RcCustomRequestOptions
import typings.antd.uploadInterfaceMod.RcFile
import typings.antd.uploadInterfaceMod.ShowUploadListInterface
import typings.antd.uploadInterfaceMod.TransformFileHandler
import typings.antd.uploadInterfaceMod.UploadChangeParam
import typings.antd.uploadInterfaceMod.UploadFile
import typings.antd.uploadInterfaceMod.UploadListProgressProps
import typings.antd.uploadInterfaceMod.UploadListType
import typings.antd.uploadInterfaceMod.UploadLocale
import typings.antd.uploadInterfaceMod.UploadType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/lib/upload/interface.UploadProps<any> & {  height ? :number} */
trait DraggerProps extends js.Object {
  var accept: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]])] = js.undefined
  var beforeUpload: js.UndefOr[
    js.Function2[/* file */ RcFile, /* FileList */ js.Array[RcFile], Boolean | js.Thenable[Unit]]
  ] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var customRequest: js.UndefOr[js.Function1[/* options */ RcCustomRequestOptions, Unit]] = js.undefined
  var data: js.UndefOr[js.Object | (js.Function1[/* file */ UploadFile[_], js.Object])] = js.undefined
  var defaultFileList: js.UndefOr[js.Array[UploadFile[_]]] = js.undefined
  var directory: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fileList: js.UndefOr[js.Array[UploadFile[_]]] = js.undefined
  var headers: js.UndefOr[HttpRequestHeader] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var iconRender: js.UndefOr[
    js.Function2[/* file */ UploadFile[_], /* listType */ js.UndefOr[UploadListType], ReactNode]
  ] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isImageUrl: js.UndefOr[js.Function1[/* file */ UploadFile[_], Boolean]] = js.undefined
  var listType: js.UndefOr[UploadListType] = js.undefined
  var locale: js.UndefOr[UploadLocale] = js.undefined
  var method: js.UndefOr[POST | PUT | PATCH | post_ | put_ | patch_] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* info */ UploadChangeParam[UploadFile[_]], Unit]] = js.undefined
  var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[_], Unit]] = js.undefined
  var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[_], Unit]] = js.undefined
  var onRemove: js.UndefOr[
    js.Function1[/* file */ UploadFile[_], Unit | Boolean | (js.Promise[Unit | Boolean])]
  ] = js.undefined
  var openFileDialogOnClick: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var previewFile: js.UndefOr[PreviewFileHandler] = js.undefined
  var progress: js.UndefOr[UploadListProgressProps] = js.undefined
  var showUploadList: js.UndefOr[Boolean | ShowUploadListInterface] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var supportServerRender: js.UndefOr[Boolean] = js.undefined
  var transformFile: js.UndefOr[TransformFileHandler] = js.undefined
  var `type`: js.UndefOr[UploadType] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object DraggerProps {
  @scala.inline
  def apply(
    accept: String = null,
    action: String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]]) = null,
    beforeUpload: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => Boolean | js.Thenable[Unit] = null,
    className: String = null,
    customRequest: /* options */ RcCustomRequestOptions => Unit = null,
    data: js.Object | (js.Function1[/* file */ UploadFile[_], js.Object]) = null,
    defaultFileList: js.Array[UploadFile[_]] = null,
    directory: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fileList: js.Array[UploadFile[_]] = null,
    headers: HttpRequestHeader = null,
    height: js.UndefOr[Double] = js.undefined,
    iconRender: (/* file */ UploadFile[_], /* listType */ js.UndefOr[UploadListType]) => ReactNode = null,
    id: String = null,
    isImageUrl: /* file */ UploadFile[_] => Boolean = null,
    listType: UploadListType = null,
    locale: UploadLocale = null,
    method: POST | PUT | PATCH | post_ | put_ | patch_ = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* info */ UploadChangeParam[UploadFile[_]] => Unit = null,
    onDownload: /* file */ UploadFile[_] => Unit = null,
    onPreview: /* file */ UploadFile[_] => Unit = null,
    onRemove: /* file */ UploadFile[_] => Unit | Boolean | (js.Promise[Unit | Boolean]) = null,
    openFileDialogOnClick: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    previewFile: /* file */ File | Blob => js.Thenable[String] = null,
    progress: UploadListProgressProps = null,
    showUploadList: Boolean | ShowUploadListInterface = null,
    style: CSSProperties = null,
    supportServerRender: js.UndefOr[Boolean] = js.undefined,
    transformFile: /* file */ RcFile => String | Blob | File | (js.Thenable[String | Blob | File]) = null,
    `type`: UploadType = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): DraggerProps = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (beforeUpload != null) __obj.updateDynamic("beforeUpload")(js.Any.fromFunction2(beforeUpload))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customRequest != null) __obj.updateDynamic("customRequest")(js.Any.fromFunction1(customRequest))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultFileList != null) __obj.updateDynamic("defaultFileList")(defaultFileList.asInstanceOf[js.Any])
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (fileList != null) __obj.updateDynamic("fileList")(fileList.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (iconRender != null) __obj.updateDynamic("iconRender")(js.Any.fromFunction2(iconRender))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (isImageUrl != null) __obj.updateDynamic("isImageUrl")(js.Any.fromFunction1(isImageUrl))
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDownload != null) __obj.updateDynamic("onDownload")(js.Any.fromFunction1(onDownload))
    if (onPreview != null) __obj.updateDynamic("onPreview")(js.Any.fromFunction1(onPreview))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (!js.isUndefined(openFileDialogOnClick)) __obj.updateDynamic("openFileDialogOnClick")(openFileDialogOnClick.get.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (previewFile != null) __obj.updateDynamic("previewFile")(js.Any.fromFunction1(previewFile))
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (showUploadList != null) __obj.updateDynamic("showUploadList")(showUploadList.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(supportServerRender)) __obj.updateDynamic("supportServerRender")(supportServerRender.get.asInstanceOf[js.Any])
    if (transformFile != null) __obj.updateDynamic("transformFile")(js.Any.fromFunction1(transformFile))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggerProps]
  }
}

