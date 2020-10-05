package typings.antd.uploadInterfaceMod

import typings.antd.antdStrings.PATCH
import typings.antd.antdStrings.POST
import typings.antd.antdStrings.PUT
import typings.antd.antdStrings.patch_
import typings.antd.antdStrings.post_
import typings.antd.antdStrings.put_
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadProps[T] extends js.Object {
  var accept: js.UndefOr[String] = js.native
  var action: js.UndefOr[String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]])] = js.native
  var beforeUpload: js.UndefOr[
    js.Function2[/* file */ RcFile, /* FileList */ js.Array[RcFile], Boolean | js.Thenable[Unit]]
  ] = js.native
  var className: js.UndefOr[String] = js.native
  var customRequest: js.UndefOr[js.Function1[/* options */ RcCustomRequestOptions, Unit]] = js.native
  var data: js.UndefOr[js.Object | (js.Function1[/* file */ UploadFile[T], js.Object])] = js.native
  var defaultFileList: js.UndefOr[js.Array[UploadFile[T]]] = js.native
  var directory: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fileList: js.UndefOr[js.Array[UploadFile[T]]] = js.native
  var headers: js.UndefOr[HttpRequestHeader] = js.native
  var iconRender: js.UndefOr[
    js.Function2[/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType], ReactNode]
  ] = js.native
  var id: js.UndefOr[String] = js.native
  var isImageUrl: js.UndefOr[js.Function1[/* file */ UploadFile[_], Boolean]] = js.native
  var listType: js.UndefOr[UploadListType] = js.native
  var locale: js.UndefOr[UploadLocale] = js.native
  var method: js.UndefOr[POST | PUT | PATCH | post_ | put_ | patch_] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function1[/* info */ UploadChangeParam[UploadFile[_]], Unit]] = js.native
  var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.native
  var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.native
  var onRemove: js.UndefOr[
    js.Function1[/* file */ UploadFile[T], Unit | Boolean | (js.Promise[Unit | Boolean])]
  ] = js.native
  var openFileDialogOnClick: js.UndefOr[Boolean] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var previewFile: js.UndefOr[PreviewFileHandler] = js.native
  var progress: js.UndefOr[UploadListProgressProps] = js.native
  var showUploadList: js.UndefOr[Boolean | ShowUploadListInterface] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var supportServerRender: js.UndefOr[Boolean] = js.native
  var transformFile: js.UndefOr[TransformFileHandler] = js.native
  var `type`: js.UndefOr[UploadType] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object UploadProps {
  @scala.inline
  def apply[T](): UploadProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadProps[T]]
  }
  @scala.inline
  implicit class UploadPropsOps[Self <: UploadProps[_], T] (val x: Self with UploadProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setActionFunction1(value: /* file */ RcFile => String | js.Thenable[String]): Self = this.set("action", js.Any.fromFunction1(value))
    @scala.inline
    def setAction(value: String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]])): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setBeforeUpload(value: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => Boolean | js.Thenable[Unit]): Self = this.set("beforeUpload", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeUpload: Self = this.set("beforeUpload", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCustomRequest(value: /* options */ RcCustomRequestOptions => Unit): Self = this.set("customRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomRequest: Self = this.set("customRequest", js.undefined)
    @scala.inline
    def setDataFunction1(value: /* file */ UploadFile[T] => js.Object): Self = this.set("data", js.Any.fromFunction1(value))
    @scala.inline
    def setData(value: js.Object | (js.Function1[/* file */ UploadFile[T], js.Object])): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDefaultFileListVarargs(value: UploadFile[T]*): Self = this.set("defaultFileList", js.Array(value :_*))
    @scala.inline
    def setDefaultFileList(value: js.Array[UploadFile[T]]): Self = this.set("defaultFileList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFileList: Self = this.set("defaultFileList", js.undefined)
    @scala.inline
    def setDirectory(value: Boolean): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFileListVarargs(value: UploadFile[T]*): Self = this.set("fileList", js.Array(value :_*))
    @scala.inline
    def setFileList(value: js.Array[UploadFile[T]]): Self = this.set("fileList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileList: Self = this.set("fileList", js.undefined)
    @scala.inline
    def setHeaders(value: HttpRequestHeader): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIconRender(value: (/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType]) => ReactNode): Self = this.set("iconRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIconRender: Self = this.set("iconRender", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsImageUrl(value: /* file */ UploadFile[_] => Boolean): Self = this.set("isImageUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsImageUrl: Self = this.set("isImageUrl", js.undefined)
    @scala.inline
    def setListType(value: UploadListType): Self = this.set("listType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListType: Self = this.set("listType", js.undefined)
    @scala.inline
    def setLocale(value: UploadLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMethod(value: POST | PUT | PATCH | post_ | put_ | patch_): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnChange(value: /* info */ UploadChangeParam[UploadFile[_]] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnDownload(value: /* file */ UploadFile[T] => Unit): Self = this.set("onDownload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDownload: Self = this.set("onDownload", js.undefined)
    @scala.inline
    def setOnPreview(value: /* file */ UploadFile[T] => Unit): Self = this.set("onPreview", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPreview: Self = this.set("onPreview", js.undefined)
    @scala.inline
    def setOnRemove(value: /* file */ UploadFile[T] => Unit | Boolean | (js.Promise[Unit | Boolean])): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    @scala.inline
    def setOpenFileDialogOnClick(value: Boolean): Self = this.set("openFileDialogOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenFileDialogOnClick: Self = this.set("openFileDialogOnClick", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setPreviewFile(value: /* file */ File | Blob => js.Thenable[String]): Self = this.set("previewFile", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreviewFile: Self = this.set("previewFile", js.undefined)
    @scala.inline
    def setProgress(value: UploadListProgressProps): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setShowUploadList(value: Boolean | ShowUploadListInterface): Self = this.set("showUploadList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowUploadList: Self = this.set("showUploadList", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSupportServerRender(value: Boolean): Self = this.set("supportServerRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportServerRender: Self = this.set("supportServerRender", js.undefined)
    @scala.inline
    def setTransformFile(value: /* file */ RcFile => String | Blob | File | (js.Thenable[String | Blob | File])): Self = this.set("transformFile", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformFile: Self = this.set("transformFile", js.undefined)
    @scala.inline
    def setType(value: UploadType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

