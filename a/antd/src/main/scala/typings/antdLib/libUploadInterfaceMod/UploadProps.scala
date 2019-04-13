package typings
package antdLib.libUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadProps extends js.Object {
  var accept: js.UndefOr[java.lang.String] = js.undefined
  var action: js.UndefOr[java.lang.String | (js.Function1[/* file */ UploadFile, js.Thenable[_]])] = js.undefined
  var beforeUpload: js.UndefOr[
    js.Function2[/* file */ RcFile, /* FileList */ js.Array[RcFile], scala.Boolean | js.Thenable[_]]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var customRequest: js.UndefOr[js.Function1[/* option */ js.Any, scala.Unit]] = js.undefined
  var data: js.UndefOr[js.Object | (js.Function1[/* file */ UploadFile, _])] = js.undefined
  var defaultFileList: js.UndefOr[js.Array[UploadFile]] = js.undefined
  var directory: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var fileList: js.UndefOr[js.Array[UploadFile]] = js.undefined
  var headers: js.UndefOr[HttpRequestHeader] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var listType: js.UndefOr[UploadListType] = js.undefined
  var locale: js.UndefOr[UploadLocale] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* info */ UploadChangeParam, scala.Unit]] = js.undefined
  var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile, scala.Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* file */ UploadFile, scala.Unit | scala.Boolean]] = js.undefined
  var openFileDialogOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showUploadList: js.UndefOr[scala.Boolean | ShowUploadListInterface] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var supportServerRender: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[UploadType] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object UploadProps {
  @scala.inline
  def apply(
    accept: java.lang.String = null,
    action: java.lang.String | (js.Function1[/* file */ UploadFile, js.Thenable[_]]) = null,
    beforeUpload: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => scala.Boolean | js.Thenable[_] = null,
    className: java.lang.String = null,
    customRequest: /* option */ js.Any => scala.Unit = null,
    data: js.Object | (js.Function1[/* file */ UploadFile, _]) = null,
    defaultFileList: js.Array[UploadFile] = null,
    directory: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fileList: js.Array[UploadFile] = null,
    headers: HttpRequestHeader = null,
    id: java.lang.String = null,
    listType: UploadListType = null,
    locale: UploadLocale = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onChange: /* info */ UploadChangeParam => scala.Unit = null,
    onPreview: /* file */ UploadFile => scala.Unit = null,
    onRemove: /* file */ UploadFile => scala.Unit | scala.Boolean = null,
    openFileDialogOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    prefixCls: java.lang.String = null,
    showUploadList: scala.Boolean | ShowUploadListInterface = null,
    style: reactLib.reactMod.CSSProperties = null,
    supportServerRender: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: UploadType = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): UploadProps = {
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
    if (showUploadList != null) __obj.updateDynamic("showUploadList")(showUploadList.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(supportServerRender)) __obj.updateDynamic("supportServerRender")(supportServerRender)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[UploadProps]
  }
}

