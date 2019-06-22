package typings
package antdLib.libUploadDraggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/lib/upload/interface.UploadProps & {  height ? :number} */
trait DraggerProps extends js.Object {
  var accept: js.UndefOr[java.lang.String] = js.undefined
  var action: js.UndefOr[
    java.lang.String | (js.Function1[
      /* file */ antdLib.libUploadInterfaceMod.RcFile, 
      java.lang.String | js.Thenable[java.lang.String]
    ])
  ] = js.undefined
  var beforeUpload: js.UndefOr[
    js.Function2[
      /* file */ antdLib.libUploadInterfaceMod.RcFile, 
      /* FileList */ js.Array[antdLib.libUploadInterfaceMod.RcFile], 
      scala.Boolean | js.Thenable[scala.Unit]
    ]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var customRequest: js.UndefOr[js.Function1[/* option */ js.Object, scala.Unit]] = js.undefined
  var data: js.UndefOr[
    js.Object | (js.Function1[/* file */ antdLib.libUploadInterfaceMod.UploadFile, js.Object])
  ] = js.undefined
  var defaultFileList: js.UndefOr[js.Array[antdLib.libUploadInterfaceMod.UploadFile]] = js.undefined
  var directory: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var fileList: js.UndefOr[js.Array[antdLib.libUploadInterfaceMod.UploadFile]] = js.undefined
  var headers: js.UndefOr[antdLib.libUploadInterfaceMod.HttpRequestHeader] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var listType: js.UndefOr[antdLib.libUploadInterfaceMod.UploadListType] = js.undefined
  var locale: js.UndefOr[antdLib.libUploadInterfaceMod.UploadLocale] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* info */ antdLib.libUploadInterfaceMod.UploadChangeParam[antdLib.libUploadInterfaceMod.UploadFile], 
      scala.Unit
    ]
  ] = js.undefined
  var onPreview: js.UndefOr[js.Function1[/* file */ antdLib.libUploadInterfaceMod.UploadFile, scala.Unit]] = js.undefined
  var onRemove: js.UndefOr[
    js.Function1[
      /* file */ antdLib.libUploadInterfaceMod.UploadFile, 
      scala.Unit | scala.Boolean | (js.Promise[scala.Unit | scala.Boolean])
    ]
  ] = js.undefined
  var openFileDialogOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var previewFile: js.UndefOr[antdLib.libUploadInterfaceMod.PreviewFileHandler] = js.undefined
  var showUploadList: js.UndefOr[scala.Boolean | antdLib.libUploadInterfaceMod.ShowUploadListInterface] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var supportServerRender: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[antdLib.libUploadInterfaceMod.UploadType] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object DraggerProps {
  @scala.inline
  def apply(
    accept: java.lang.String = null,
    action: java.lang.String | (js.Function1[
      /* file */ antdLib.libUploadInterfaceMod.RcFile, 
      java.lang.String | js.Thenable[java.lang.String]
    ]) = null,
    beforeUpload: (/* file */ antdLib.libUploadInterfaceMod.RcFile, /* FileList */ js.Array[antdLib.libUploadInterfaceMod.RcFile]) => scala.Boolean | js.Thenable[scala.Unit] = null,
    className: java.lang.String = null,
    customRequest: /* option */ js.Object => scala.Unit = null,
    data: js.Object | (js.Function1[/* file */ antdLib.libUploadInterfaceMod.UploadFile, js.Object]) = null,
    defaultFileList: js.Array[antdLib.libUploadInterfaceMod.UploadFile] = null,
    directory: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fileList: js.Array[antdLib.libUploadInterfaceMod.UploadFile] = null,
    headers: antdLib.libUploadInterfaceMod.HttpRequestHeader = null,
    height: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    listType: antdLib.libUploadInterfaceMod.UploadListType = null,
    locale: antdLib.libUploadInterfaceMod.UploadLocale = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onChange: /* info */ antdLib.libUploadInterfaceMod.UploadChangeParam[antdLib.libUploadInterfaceMod.UploadFile] => scala.Unit = null,
    onPreview: /* file */ antdLib.libUploadInterfaceMod.UploadFile => scala.Unit = null,
    onRemove: /* file */ antdLib.libUploadInterfaceMod.UploadFile => scala.Unit | scala.Boolean | (js.Promise[scala.Unit | scala.Boolean]) = null,
    openFileDialogOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    prefixCls: java.lang.String = null,
    previewFile: antdLib.libUploadInterfaceMod.PreviewFileHandler = null,
    showUploadList: scala.Boolean | antdLib.libUploadInterfaceMod.ShowUploadListInterface = null,
    style: reactLib.reactMod.CSSProperties = null,
    supportServerRender: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: antdLib.libUploadInterfaceMod.UploadType = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): DraggerProps = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (beforeUpload != null) __obj.updateDynamic("beforeUpload")(js.Any.fromFunction2(beforeUpload))
    if (className != null) __obj.updateDynamic("className")(className)
    if (customRequest != null) __obj.updateDynamic("customRequest")(js.Any.fromFunction1(customRequest))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultFileList != null) __obj.updateDynamic("defaultFileList")(defaultFileList)
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (fileList != null) __obj.updateDynamic("fileList")(fileList)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (listType != null) __obj.updateDynamic("listType")(listType)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPreview != null) __obj.updateDynamic("onPreview")(js.Any.fromFunction1(onPreview))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (!js.isUndefined(openFileDialogOnClick)) __obj.updateDynamic("openFileDialogOnClick")(openFileDialogOnClick)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (previewFile != null) __obj.updateDynamic("previewFile")(previewFile)
    if (showUploadList != null) __obj.updateDynamic("showUploadList")(showUploadList.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(supportServerRender)) __obj.updateDynamic("supportServerRender")(supportServerRender)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[DraggerProps]
  }
}

