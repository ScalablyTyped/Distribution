package typings.antd

import org.scalablytyped.runtime.StringDictionary
import typings.antd.anon.PercentNumber
import typings.antd.antdStrings.PATCH
import typings.antd.antdStrings.POST
import typings.antd.antdStrings.PUT
import typings.antd.antdStrings.active
import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.butt
import typings.antd.antdStrings.exception
import typings.antd.antdStrings.left
import typings.antd.antdStrings.normal
import typings.antd.antdStrings.patch_
import typings.antd.antdStrings.post_
import typings.antd.antdStrings.put_
import typings.antd.antdStrings.right
import typings.antd.antdStrings.round
import typings.antd.antdStrings.select_
import typings.antd.antdStrings.square
import typings.antd.antdStrings.success
import typings.antd.antdStrings.text_
import typings.antd.antdStrings.top
import typings.antd.progressProgressMod.ProgressGradient
import typings.antd.progressProgressMod.ProgressSize
import typings.antd.progressProgressMod.SuccessProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Blob
import typings.std.Date
import typings.std.Error
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadInterfaceMod {
  
  type HttpRequestHeader = StringDictionary[String]
  
  type ItemRender[T] = js.Function3[
    /* originNode */ ReactElement, 
    /* file */ UploadFile[js.Any], 
    /* fileList */ js.UndefOr[js.Array[UploadFile[T]]], 
    ReactNode
  ]
  
  type PreviewFileHandler = js.Function1[/* file */ File | Blob, js.Thenable[String]]
  
  @js.native
  trait RcCustomRequestOptions extends StObject {
    
    var action: String = js.native
    
    var data: js.Object = js.native
    
    var file: RcFile = js.native
    
    var filename: String = js.native
    
    var headers: js.Object = js.native
    
    def onError(error: Error): Unit = js.native
    def onError(error: Error, response: js.UndefOr[scala.Nothing], file: RcFile): Unit = js.native
    def onError(error: Error, response: js.Any): Unit = js.native
    def onError(error: Error, response: js.Any, file: RcFile): Unit = js.native
    
    def onProgress(event: PercentNumber, file: RcFile): Unit = js.native
    
    def onSuccess(response: js.Object, file: RcFile): Unit = js.native
    
    var withCredentials: Boolean = js.native
  }
  
  @js.native
  trait RcFile extends File {
    
    val lastModifiedDate: Date = js.native
    
    var uid: String = js.native
    
    val webkitRelativePath: String = js.native
  }
  
  @js.native
  trait ShowUploadListInterface extends StObject {
    
    var downloadIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[_], ReactNode])] = js.native
    
    var removeIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[_], ReactNode])] = js.native
    
    var showDownloadIcon: js.UndefOr[Boolean] = js.native
    
    var showPreviewIcon: js.UndefOr[Boolean] = js.native
    
    var showRemoveIcon: js.UndefOr[Boolean] = js.native
  }
  object ShowUploadListInterface {
    
    @scala.inline
    def apply(): ShowUploadListInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowUploadListInterface]
    }
    
    @scala.inline
    implicit class ShowUploadListInterfaceMutableBuilder[Self <: ShowUploadListInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloadIcon(value: ReactNode | (js.Function1[/* file */ UploadFile[_], ReactNode])): Self = StObject.set(x, "downloadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadIconFunction1(value: /* file */ UploadFile[_] => ReactNode): Self = StObject.set(x, "downloadIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownloadIconUndefined: Self = StObject.set(x, "downloadIcon", js.undefined)
      
      @scala.inline
      def setRemoveIcon(value: ReactNode | (js.Function1[/* file */ UploadFile[_], ReactNode])): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconFunction1(value: /* file */ UploadFile[_] => ReactNode): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setShowDownloadIcon(value: Boolean): Self = StObject.set(x, "showDownloadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDownloadIconUndefined: Self = StObject.set(x, "showDownloadIcon", js.undefined)
      
      @scala.inline
      def setShowPreviewIcon(value: Boolean): Self = StObject.set(x, "showPreviewIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPreviewIconUndefined: Self = StObject.set(x, "showPreviewIcon", js.undefined)
      
      @scala.inline
      def setShowRemoveIcon(value: Boolean): Self = StObject.set(x, "showRemoveIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRemoveIconUndefined: Self = StObject.set(x, "showRemoveIcon", js.undefined)
    }
  }
  
  type TransformFileHandler = js.Function1[/* file */ RcFile, String | Blob | File | (js.Thenable[String | Blob | File])]
  
  @js.native
  trait UploadChangeParam[T /* <: js.Object */] extends StObject {
    
    var event: js.UndefOr[PercentNumber] = js.native
    
    var file: T = js.native
    
    var fileList: js.Array[UploadFile[_]] = js.native
  }
  object UploadChangeParam {
    
    @scala.inline
    def apply[T /* <: js.Object */](file: T, fileList: js.Array[UploadFile[_]]): UploadChangeParam[T] = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadChangeParam[T]]
    }
    
    @scala.inline
    implicit class UploadChangeParamMutableBuilder[Self <: UploadChangeParam[_], T /* <: js.Object */] (val x: Self with UploadChangeParam[T]) extends AnyVal {
      
      @scala.inline
      def setEvent(value: PercentNumber): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setFile(value: T): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileList(value: js.Array[UploadFile[_]]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListVarargs(value: UploadFile[js.Any]*): Self = StObject.set(x, "fileList", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UploadFile[T] extends StObject {
    
    var error: js.UndefOr[js.Any] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var lastModified: js.UndefOr[Double] = js.native
    
    var lastModifiedDate: js.UndefOr[Date] = js.native
    
    var linkProps: js.UndefOr[js.Any] = js.native
    
    var name: String = js.native
    
    var originFileObj: js.UndefOr[File | Blob] = js.native
    
    var percent: js.UndefOr[Double] = js.native
    
    var preview: js.UndefOr[String] = js.native
    
    var response: js.UndefOr[T] = js.native
    
    var size: Double = js.native
    
    var status: js.UndefOr[UploadFileStatus] = js.native
    
    var thumbUrl: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
    
    var uid: String = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var xhr: js.UndefOr[T] = js.native
  }
  object UploadFile {
    
    @scala.inline
    def apply[T](name: String, size: Double, `type`: String, uid: String): UploadFile[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadFile[T]]
    }
    
    @scala.inline
    implicit class UploadFileMutableBuilder[Self <: UploadFile[_], T] (val x: Self with UploadFile[T]) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDate(value: Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      @scala.inline
      def setLinkProps(value: js.Any): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginFileObj(value: File | Blob): Self = StObject.set(x, "originFileObj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginFileObjUndefined: Self = StObject.set(x, "originFileObj", js.undefined)
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      @scala.inline
      def setResponse(value: T): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: UploadFileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setThumbUrl(value: String): Self = StObject.set(x, "thumbUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbUrlUndefined: Self = StObject.set(x, "thumbUrl", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setXhr(value: T): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.error
    - typings.antd.antdStrings.success
    - typings.antd.antdStrings.done
    - typings.antd.antdStrings.uploading
    - typings.antd.antdStrings.removed
  */
  trait UploadFileStatus extends StObject
  object UploadFileStatus {
    
    @scala.inline
    def done: typings.antd.antdStrings.done = "done".asInstanceOf[typings.antd.antdStrings.done]
    
    @scala.inline
    def error: typings.antd.antdStrings.error = "error".asInstanceOf[typings.antd.antdStrings.error]
    
    @scala.inline
    def removed: typings.antd.antdStrings.removed = "removed".asInstanceOf[typings.antd.antdStrings.removed]
    
    @scala.inline
    def success: typings.antd.antdStrings.success = "success".asInstanceOf[typings.antd.antdStrings.success]
    
    @scala.inline
    def uploading: typings.antd.antdStrings.uploading = "uploading".asInstanceOf[typings.antd.antdStrings.uploading]
  }
  
  /* Inlined std.Omit<antd.antd/lib/progress.ProgressProps, 'percent' | 'type'> */
  @js.native
  trait UploadListProgressProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[
        js.Function2[/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double], ReactNode]
      ] = js.native
    
    var gapDegree: js.UndefOr[Double] = js.native
    
    var gapPosition: js.UndefOr[top | bottom | left | right] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var showInfo: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[ProgressSize] = js.native
    
    var status: js.UndefOr[normal | exception | active | success] = js.native
    
    var steps: js.UndefOr[Double] = js.native
    
    var strokeColor: js.UndefOr[String | ProgressGradient] = js.native
    
    var strokeLinecap: js.UndefOr[butt | square | round] = js.native
    
    var strokeWidth: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var success: js.UndefOr[SuccessProps] = js.native
    
    var successPercent: js.UndefOr[Double] = js.native
    
    var trailColor: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object UploadListProgressProps {
    
    @scala.inline
    def apply(): UploadListProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadListProgressProps]
    }
    
    @scala.inline
    implicit class UploadListProgressPropsMutableBuilder[Self <: UploadListProgressProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFormat(value: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => ReactNode): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGapDegree(value: Double): Self = StObject.set(x, "gapDegree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapDegreeUndefined: Self = StObject.set(x, "gapDegree", js.undefined)
      
      @scala.inline
      def setGapPosition(value: top | bottom | left | right): Self = StObject.set(x, "gapPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapPositionUndefined: Self = StObject.set(x, "gapPosition", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShowInfo(value: Boolean): Self = StObject.set(x, "showInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInfoUndefined: Self = StObject.set(x, "showInfo", js.undefined)
      
      @scala.inline
      def setSize(value: ProgressSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: normal | exception | active | success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: String | ProgressGradient): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: butt | square | round): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuccess(value: SuccessProps): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessPercent(value: Double): Self = StObject.set(x, "successPercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessPercentUndefined: Self = StObject.set(x, "successPercent", js.undefined)
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setTrailColor(value: String): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait UploadListProps[T] extends StObject {
    
    var appendAction: js.UndefOr[ReactNode] = js.native
    
    var downloadIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[_], ReactNode])] = js.native
    
    var iconRender: js.UndefOr[
        js.Function2[/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType], ReactNode]
      ] = js.native
    
    var isImageUrl: js.UndefOr[js.Function1[/* file */ UploadFile[_], Boolean]] = js.native
    
    var itemRender: js.UndefOr[ItemRender[T]] = js.native
    
    var items: js.UndefOr[js.Array[UploadFile[T]]] = js.native
    
    var listType: js.UndefOr[UploadListType] = js.native
    
    var locale: UploadLocale = js.native
    
    var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.native
    
    var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.native
    
    var onRemove: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit | Boolean]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var previewFile: js.UndefOr[PreviewFileHandler] = js.native
    
    var progress: js.UndefOr[UploadListProgressProps] = js.native
    
    var removeIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[_], ReactNode])] = js.native
    
    var showDownloadIcon: js.UndefOr[Boolean] = js.native
    
    var showPreviewIcon: js.UndefOr[Boolean] = js.native
    
    var showRemoveIcon: js.UndefOr[Boolean] = js.native
  }
  object UploadListProps {
    
    @scala.inline
    def apply[T](locale: UploadLocale): UploadListProps[T] = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadListProps[T]]
    }
    
    @scala.inline
    implicit class UploadListPropsMutableBuilder[Self <: UploadListProps[_], T] (val x: Self with UploadListProps[T]) extends AnyVal {
      
      @scala.inline
      def setAppendAction(value: ReactNode): Self = StObject.set(x, "appendAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendActionUndefined: Self = StObject.set(x, "appendAction", js.undefined)
      
      @scala.inline
      def setDownloadIcon(value: ReactNode | (js.Function1[/* file */ UploadFile[_], ReactNode])): Self = StObject.set(x, "downloadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadIconFunction1(value: /* file */ UploadFile[_] => ReactNode): Self = StObject.set(x, "downloadIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownloadIconUndefined: Self = StObject.set(x, "downloadIcon", js.undefined)
      
      @scala.inline
      def setIconRender(value: (/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType]) => ReactNode): Self = StObject.set(x, "iconRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
      
      @scala.inline
      def setIsImageUrl(value: /* file */ UploadFile[_] => Boolean): Self = StObject.set(x, "isImageUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsImageUrlUndefined: Self = StObject.set(x, "isImageUrl", js.undefined)
      
      @scala.inline
      def setItemRender(
        value: (/* originNode */ ReactElement, /* file */ UploadFile[js.Any], /* fileList */ js.UndefOr[js.Array[UploadFile[T]]]) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: UploadFile[T]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setListType(value: UploadListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      @scala.inline
      def setLocale(value: UploadLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDownload(value: /* file */ UploadFile[T] => Unit): Self = StObject.set(x, "onDownload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDownloadUndefined: Self = StObject.set(x, "onDownload", js.undefined)
      
      @scala.inline
      def setOnPreview(value: /* file */ UploadFile[T] => Unit): Self = StObject.set(x, "onPreview", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPreviewUndefined: Self = StObject.set(x, "onPreview", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* file */ UploadFile[T] => Unit | Boolean): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPreviewFile(value: /* file */ File | Blob => js.Thenable[String]): Self = StObject.set(x, "previewFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreviewFileUndefined: Self = StObject.set(x, "previewFile", js.undefined)
      
      @scala.inline
      def setProgress(value: UploadListProgressProps): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setRemoveIcon(value: ReactNode | (js.Function1[/* file */ UploadFile[_], ReactNode])): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconFunction1(value: /* file */ UploadFile[_] => ReactNode): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setShowDownloadIcon(value: Boolean): Self = StObject.set(x, "showDownloadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDownloadIconUndefined: Self = StObject.set(x, "showDownloadIcon", js.undefined)
      
      @scala.inline
      def setShowPreviewIcon(value: Boolean): Self = StObject.set(x, "showPreviewIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPreviewIconUndefined: Self = StObject.set(x, "showPreviewIcon", js.undefined)
      
      @scala.inline
      def setShowRemoveIcon(value: Boolean): Self = StObject.set(x, "showRemoveIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRemoveIconUndefined: Self = StObject.set(x, "showRemoveIcon", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.text_
    - typings.antd.antdStrings.picture
    - typings.antd.antdStrings.`picture-card`
  */
  trait UploadListType extends StObject
  object UploadListType {
    
    @scala.inline
    def picture: typings.antd.antdStrings.picture = "picture".asInstanceOf[typings.antd.antdStrings.picture]
    
    @scala.inline
    def `picture-card`: typings.antd.antdStrings.`picture-card` = "picture-card".asInstanceOf[typings.antd.antdStrings.`picture-card`]
    
    @scala.inline
    def text: text_ = "text".asInstanceOf[text_]
  }
  
  @js.native
  trait UploadLocale extends StObject {
    
    var downloadFile: js.UndefOr[String] = js.native
    
    var previewFile: js.UndefOr[String] = js.native
    
    var removeFile: js.UndefOr[String] = js.native
    
    var uploadError: js.UndefOr[String] = js.native
    
    var uploading: js.UndefOr[String] = js.native
  }
  object UploadLocale {
    
    @scala.inline
    def apply(): UploadLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadLocale]
    }
    
    @scala.inline
    implicit class UploadLocaleMutableBuilder[Self <: UploadLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloadFile(value: String): Self = StObject.set(x, "downloadFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadFileUndefined: Self = StObject.set(x, "downloadFile", js.undefined)
      
      @scala.inline
      def setPreviewFile(value: String): Self = StObject.set(x, "previewFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewFileUndefined: Self = StObject.set(x, "previewFile", js.undefined)
      
      @scala.inline
      def setRemoveFile(value: String): Self = StObject.set(x, "removeFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveFileUndefined: Self = StObject.set(x, "removeFile", js.undefined)
      
      @scala.inline
      def setUploadError(value: String): Self = StObject.set(x, "uploadError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadErrorUndefined: Self = StObject.set(x, "uploadError", js.undefined)
      
      @scala.inline
      def setUploading(value: String): Self = StObject.set(x, "uploading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadingUndefined: Self = StObject.set(x, "uploading", js.undefined)
    }
  }
  
  @js.native
  trait UploadProps[T] extends StObject {
    
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
    
    var itemRender: js.UndefOr[ItemRender[T]] = js.native
    
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
    implicit class UploadPropsMutableBuilder[Self <: UploadProps[_], T] (val x: Self with UploadProps[T]) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAction(value: String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]])): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionFunction1(value: /* file */ RcFile => String | js.Thenable[String]): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setBeforeUpload(value: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => Boolean | js.Thenable[Unit]): Self = StObject.set(x, "beforeUpload", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeUploadUndefined: Self = StObject.set(x, "beforeUpload", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCustomRequest(value: /* options */ RcCustomRequestOptions => Unit): Self = StObject.set(x, "customRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomRequestUndefined: Self = StObject.set(x, "customRequest", js.undefined)
      
      @scala.inline
      def setData(value: js.Object | (js.Function1[/* file */ UploadFile[T], js.Object])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFunction1(value: /* file */ UploadFile[T] => js.Object): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDefaultFileList(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "defaultFileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFileListUndefined: Self = StObject.set(x, "defaultFileList", js.undefined)
      
      @scala.inline
      def setDefaultFileListVarargs(value: UploadFile[T]*): Self = StObject.set(x, "defaultFileList", js.Array(value :_*))
      
      @scala.inline
      def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFileList(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
      
      @scala.inline
      def setFileListVarargs(value: UploadFile[T]*): Self = StObject.set(x, "fileList", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: HttpRequestHeader): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIconRender(value: (/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType]) => ReactNode): Self = StObject.set(x, "iconRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsImageUrl(value: /* file */ UploadFile[_] => Boolean): Self = StObject.set(x, "isImageUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsImageUrlUndefined: Self = StObject.set(x, "isImageUrl", js.undefined)
      
      @scala.inline
      def setItemRender(
        value: (/* originNode */ ReactElement, /* file */ UploadFile[js.Any], /* fileList */ js.UndefOr[js.Array[UploadFile[T]]]) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setListType(value: UploadListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      @scala.inline
      def setLocale(value: UploadLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMethod(value: POST | PUT | PATCH | post_ | put_ | patch_): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* info */ UploadChangeParam[UploadFile[_]] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnDownload(value: /* file */ UploadFile[T] => Unit): Self = StObject.set(x, "onDownload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDownloadUndefined: Self = StObject.set(x, "onDownload", js.undefined)
      
      @scala.inline
      def setOnPreview(value: /* file */ UploadFile[T] => Unit): Self = StObject.set(x, "onPreview", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPreviewUndefined: Self = StObject.set(x, "onPreview", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* file */ UploadFile[T] => Unit | Boolean | (js.Promise[Unit | Boolean])): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setOpenFileDialogOnClick(value: Boolean): Self = StObject.set(x, "openFileDialogOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenFileDialogOnClickUndefined: Self = StObject.set(x, "openFileDialogOnClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPreviewFile(value: /* file */ File | Blob => js.Thenable[String]): Self = StObject.set(x, "previewFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreviewFileUndefined: Self = StObject.set(x, "previewFile", js.undefined)
      
      @scala.inline
      def setProgress(value: UploadListProgressProps): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setShowUploadList(value: Boolean | ShowUploadListInterface): Self = StObject.set(x, "showUploadList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUploadListUndefined: Self = StObject.set(x, "showUploadList", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSupportServerRender(value: Boolean): Self = StObject.set(x, "supportServerRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportServerRenderUndefined: Self = StObject.set(x, "supportServerRender", js.undefined)
      
      @scala.inline
      def setTransformFile(value: /* file */ RcFile => String | Blob | File | (js.Thenable[String | Blob | File])): Self = StObject.set(x, "transformFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformFileUndefined: Self = StObject.set(x, "transformFile", js.undefined)
      
      @scala.inline
      def setType(value: UploadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  @js.native
  trait UploadState[T] extends StObject {
    
    var dragState: String = js.native
    
    var fileList: js.Array[UploadFile[T]] = js.native
  }
  object UploadState {
    
    @scala.inline
    def apply[T](dragState: String, fileList: js.Array[UploadFile[T]]): UploadState[T] = {
      val __obj = js.Dynamic.literal(dragState = dragState.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadState[T]]
    }
    
    @scala.inline
    implicit class UploadStateMutableBuilder[Self <: UploadState[_], T] (val x: Self with UploadState[T]) extends AnyVal {
      
      @scala.inline
      def setDragState(value: String): Self = StObject.set(x, "dragState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileList(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListVarargs(value: UploadFile[T]*): Self = StObject.set(x, "fileList", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.drag
    - typings.antd.antdStrings.select_
  */
  trait UploadType extends StObject
  object UploadType {
    
    @scala.inline
    def drag: typings.antd.antdStrings.drag = "drag".asInstanceOf[typings.antd.antdStrings.drag]
    
    @scala.inline
    def select: select_ = "select".asInstanceOf[select_]
  }
}
