package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esUploadDraggerMod.DraggerProps
import typings.antd.esUploadInterfaceMod.HttpRequestHeader
import typings.antd.esUploadInterfaceMod.RcFile
import typings.antd.esUploadInterfaceMod.ShowUploadListInterface
import typings.antd.esUploadInterfaceMod.UploadChangeParam
import typings.antd.esUploadInterfaceMod.UploadFile
import typings.antd.esUploadInterfaceMod.UploadListType
import typings.antd.esUploadInterfaceMod.UploadLocale
import typings.antd.esUploadInterfaceMod.UploadType
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: name, accept, style, id, className, disabled, multiple */
object UploadDragger
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esMod.Upload.Dragger.asInstanceOf[String | js.Object]
  def apply(
    action: String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]]) = null,
    beforeUpload: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => Boolean | js.Thenable[Unit] = null,
    customRequest: /* option */ js.Object => Unit = null,
    data: js.Object | (js.Function1[/* file */ UploadFile, js.Object]) = null,
    defaultFileList: js.Array[UploadFile] = null,
    directory: js.UndefOr[Boolean] = js.undefined,
    fileList: js.Array[UploadFile] = null,
    headers: HttpRequestHeader = null,
    height: Int | Double = null,
    listType: UploadListType = null,
    locale: UploadLocale = null,
    onChange: /* info */ UploadChangeParam[UploadFile] => Unit = null,
    onPreview: /* file */ UploadFile => Unit = null,
    onRemove: /* file */ UploadFile => Unit | Boolean | (js.Promise[Unit | Boolean]) = null,
    openFileDialogOnClick: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    previewFile: /* file */ File | Blob => js.Thenable[String] = null,
    showUploadList: Boolean | ShowUploadListInterface = null,
    supportServerRender: js.UndefOr[Boolean] = js.undefined,
    transformFile: /* file */ RcFile => String | Blob | File | (js.Thenable[String | Blob | File]) = null,
    `type`: UploadType = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (beforeUpload != null) __obj.updateDynamic("beforeUpload")(js.Any.fromFunction2(beforeUpload))
    if (customRequest != null) __obj.updateDynamic("customRequest")(js.Any.fromFunction1(customRequest))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultFileList != null) __obj.updateDynamic("defaultFileList")(defaultFileList)
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory)
    if (fileList != null) __obj.updateDynamic("fileList")(fileList)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPreview != null) __obj.updateDynamic("onPreview")(js.Any.fromFunction1(onPreview))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (!js.isUndefined(openFileDialogOnClick)) __obj.updateDynamic("openFileDialogOnClick")(openFileDialogOnClick)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (previewFile != null) __obj.updateDynamic("previewFile")(js.Any.fromFunction1(previewFile))
    if (showUploadList != null) __obj.updateDynamic("showUploadList")(showUploadList.asInstanceOf[js.Any])
    if (!js.isUndefined(supportServerRender)) __obj.updateDynamic("supportServerRender")(supportServerRender)
    if (transformFile != null) __obj.updateDynamic("transformFile")(js.Any.fromFunction1(transformFile))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DraggerProps
}

