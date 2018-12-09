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
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var supportServerRender: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[UploadType] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

