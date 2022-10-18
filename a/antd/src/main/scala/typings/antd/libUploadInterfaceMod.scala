package typings.antd

import org.scalablytyped.runtime.StringDictionary
import typings.antd.anon.Download
import typings.antd.anon.PercentNumber
import typings.antd.antdStrings.PATCH
import typings.antd.antdStrings.POST
import typings.antd.antdStrings.PUT
import typings.antd.antdStrings._empty
import typings.antd.antdStrings.`use-credentials`
import typings.antd.antdStrings.active
import typings.antd.antdStrings.anonymous
import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.butt
import typings.antd.antdStrings.environment
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
import typings.antd.antdStrings.user
import typings.antd.libProgressProgressMod.ProgressGradient
import typings.antd.libProgressProgressMod.ProgressSize
import typings.antd.libProgressProgressMod.SuccessProps
import typings.rcUpload.esInterfaceMod.UploadRequestOption
import typings.react.mod.CSSProperties
import typings.react.mod.DragEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Blob
import typings.std.File
import typings.std.HTMLDivElement
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUploadInterfaceMod {
  
  type BeforeUploadValueType = Unit | Boolean | String | Blob | File
  
  type HttpRequestHeader = StringDictionary[String]
  
  trait InternalUploadFile[T]
    extends StObject
       with UploadFile[T] {
    
    @JSName("originFileObj")
    var originFileObj_InternalUploadFile: RcFile
  }
  object InternalUploadFile {
    
    inline def apply[T](name: String, originFileObj: RcFile, uid: String): InternalUploadFile[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], originFileObj = originFileObj.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalUploadFile[T]]
    }
    
    extension [Self <: InternalUploadFile[?], T](x: Self & InternalUploadFile[T]) {
      
      inline def setOriginFileObj(value: RcFile): Self = StObject.set(x, "originFileObj", value.asInstanceOf[js.Any])
    }
  }
  
  type ItemRender[T] = js.Function4[
    /* originNode */ ReactElement, 
    /* file */ UploadFile[Any], 
    /* fileList */ js.Array[UploadFile[T]], 
    /* actions */ Download, 
    ReactNode
  ]
  
  type PreviewFileHandler = js.Function1[/* file */ File | Blob, PromiseLike[String]]
  
  @js.native
  trait RcFile
    extends StObject
       with typings.rcUpload.esInterfaceMod.RcFile {
    
    val lastModifiedDate: js.Date = js.native
  }
  
  trait ShowUploadListInterface extends StObject {
    
    var downloadIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])] = js.undefined
    
    var previewIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])] = js.undefined
    
    var removeIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])] = js.undefined
    
    var showDownloadIcon: js.UndefOr[Boolean] = js.undefined
    
    var showPreviewIcon: js.UndefOr[Boolean] = js.undefined
    
    var showRemoveIcon: js.UndefOr[Boolean] = js.undefined
  }
  object ShowUploadListInterface {
    
    inline def apply(): ShowUploadListInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowUploadListInterface]
    }
    
    extension [Self <: ShowUploadListInterface](x: Self) {
      
      inline def setDownloadIcon(value: ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])): Self = StObject.set(x, "downloadIcon", value.asInstanceOf[js.Any])
      
      inline def setDownloadIconFunction1(value: /* file */ UploadFile[Any] => ReactNode): Self = StObject.set(x, "downloadIcon", js.Any.fromFunction1(value))
      
      inline def setDownloadIconUndefined: Self = StObject.set(x, "downloadIcon", js.undefined)
      
      inline def setPreviewIcon(value: ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])): Self = StObject.set(x, "previewIcon", value.asInstanceOf[js.Any])
      
      inline def setPreviewIconFunction1(value: /* file */ UploadFile[Any] => ReactNode): Self = StObject.set(x, "previewIcon", js.Any.fromFunction1(value))
      
      inline def setPreviewIconUndefined: Self = StObject.set(x, "previewIcon", js.undefined)
      
      inline def setRemoveIcon(value: ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      inline def setRemoveIconFunction1(value: /* file */ UploadFile[Any] => ReactNode): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
      
      inline def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      inline def setShowDownloadIcon(value: Boolean): Self = StObject.set(x, "showDownloadIcon", value.asInstanceOf[js.Any])
      
      inline def setShowDownloadIconUndefined: Self = StObject.set(x, "showDownloadIcon", js.undefined)
      
      inline def setShowPreviewIcon(value: Boolean): Self = StObject.set(x, "showPreviewIcon", value.asInstanceOf[js.Any])
      
      inline def setShowPreviewIconUndefined: Self = StObject.set(x, "showPreviewIcon", js.undefined)
      
      inline def setShowRemoveIcon(value: Boolean): Self = StObject.set(x, "showRemoveIcon", value.asInstanceOf[js.Any])
      
      inline def setShowRemoveIconUndefined: Self = StObject.set(x, "showRemoveIcon", js.undefined)
    }
  }
  
  type TransformFileHandler = js.Function1[/* file */ RcFile, String | Blob | File | (PromiseLike[String | Blob | File])]
  
  trait UploadChangeParam[T] extends StObject {
    
    var event: js.UndefOr[PercentNumber] = js.undefined
    
    var file: T
    
    var fileList: js.Array[T]
  }
  object UploadChangeParam {
    
    inline def apply[T](file: T, fileList: js.Array[T]): UploadChangeParam[T] = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadChangeParam[T]]
    }
    
    extension [Self <: UploadChangeParam[?], T](x: Self & UploadChangeParam[T]) {
      
      inline def setEvent(value: PercentNumber): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setFile(value: T): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileList(value: js.Array[T]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      inline def setFileListVarargs(value: T*): Self = StObject.set(x, "fileList", js.Array(value*))
    }
  }
  
  trait UploadFile[T] extends StObject {
    
    var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.undefined
    
    var error: js.UndefOr[Any] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var lastModified: js.UndefOr[Double] = js.undefined
    
    var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
    
    var linkProps: js.UndefOr[Any] = js.undefined
    
    var name: String
    
    var originFileObj: js.UndefOr[RcFile] = js.undefined
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var preview: js.UndefOr[String] = js.undefined
    
    var response: js.UndefOr[T] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[UploadFileStatus] = js.undefined
    
    var thumbUrl: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var uid: String
    
    var url: js.UndefOr[String] = js.undefined
    
    var xhr: js.UndefOr[T] = js.undefined
  }
  object UploadFile {
    
    inline def apply[T](name: String, uid: String): UploadFile[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadFile[T]]
    }
    
    extension [Self <: UploadFile[?], T](x: Self & UploadFile[T]) {
      
      inline def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      inline def setLinkProps(value: Any): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
      
      inline def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOriginFileObj(value: RcFile): Self = StObject.set(x, "originFileObj", value.asInstanceOf[js.Any])
      
      inline def setOriginFileObjUndefined: Self = StObject.set(x, "originFileObj", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setResponse(value: T): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: UploadFileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setThumbUrl(value: String): Self = StObject.set(x, "thumbUrl", value.asInstanceOf[js.Any])
      
      inline def setThumbUrlUndefined: Self = StObject.set(x, "thumbUrl", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setXhr(value: T): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
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
    
    inline def done: typings.antd.antdStrings.done = "done".asInstanceOf[typings.antd.antdStrings.done]
    
    inline def error: typings.antd.antdStrings.error = "error".asInstanceOf[typings.antd.antdStrings.error]
    
    inline def removed: typings.antd.antdStrings.removed = "removed".asInstanceOf[typings.antd.antdStrings.removed]
    
    inline def success: typings.antd.antdStrings.success = "success".asInstanceOf[typings.antd.antdStrings.success]
    
    inline def uploading: typings.antd.antdStrings.uploading = "uploading".asInstanceOf[typings.antd.antdStrings.uploading]
  }
  
  /* Inlined std.Omit<antd.antd/lib/progress.ProgressProps, 'percent' | 'type'> */
  trait UploadListProgressProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[
        js.Function2[/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double], ReactNode]
      ] = js.undefined
    
    var gapDegree: js.UndefOr[Double] = js.undefined
    
    var gapPosition: js.UndefOr[top | bottom | left | right] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var showInfo: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[ProgressSize] = js.undefined
    
    var status: js.UndefOr[normal | exception | active | success] = js.undefined
    
    var steps: js.UndefOr[Double] = js.undefined
    
    var strokeColor: js.UndefOr[String | js.Array[String] | ProgressGradient] = js.undefined
    
    var strokeLinecap: js.UndefOr[butt | square | round] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var success: js.UndefOr[SuccessProps] = js.undefined
    
    var successPercent: js.UndefOr[Double] = js.undefined
    
    var trailColor: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object UploadListProgressProps {
    
    inline def apply(): UploadListProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadListProgressProps]
    }
    
    extension [Self <: UploadListProgressProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFormat(value: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => ReactNode): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGapDegree(value: Double): Self = StObject.set(x, "gapDegree", value.asInstanceOf[js.Any])
      
      inline def setGapDegreeUndefined: Self = StObject.set(x, "gapDegree", js.undefined)
      
      inline def setGapPosition(value: top | bottom | left | right): Self = StObject.set(x, "gapPosition", value.asInstanceOf[js.Any])
      
      inline def setGapPositionUndefined: Self = StObject.set(x, "gapPosition", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShowInfo(value: Boolean): Self = StObject.set(x, "showInfo", value.asInstanceOf[js.Any])
      
      inline def setShowInfoUndefined: Self = StObject.set(x, "showInfo", js.undefined)
      
      inline def setSize(value: ProgressSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: normal | exception | active | success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStrokeColor(value: String | js.Array[String] | ProgressGradient): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeColorVarargs(value: String*): Self = StObject.set(x, "strokeColor", js.Array(value*))
      
      inline def setStrokeLinecap(value: butt | square | round): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuccess(value: SuccessProps): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessPercent(value: Double): Self = StObject.set(x, "successPercent", value.asInstanceOf[js.Any])
      
      inline def setSuccessPercentUndefined: Self = StObject.set(x, "successPercent", js.undefined)
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setTrailColor(value: String): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      inline def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait UploadListProps[T] extends StObject {
    
    var appendAction: js.UndefOr[ReactNode] = js.undefined
    
    var appendActionVisible: js.UndefOr[Boolean] = js.undefined
    
    var downloadIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])] = js.undefined
    
    var iconRender: js.UndefOr[
        js.Function2[/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType], ReactNode]
      ] = js.undefined
    
    var isImageUrl: js.UndefOr[js.Function1[/* file */ UploadFile[Any], Boolean]] = js.undefined
    
    var itemRender: js.UndefOr[ItemRender[T]] = js.undefined
    
    var items: js.UndefOr[js.Array[UploadFile[T]]] = js.undefined
    
    var listType: js.UndefOr[UploadListType] = js.undefined
    
    var locale: UploadLocale
    
    var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.undefined
    
    var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.undefined
    
    var onRemove: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit | Boolean]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var previewFile: js.UndefOr[PreviewFileHandler] = js.undefined
    
    var previewIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])] = js.undefined
    
    var progress: js.UndefOr[UploadListProgressProps] = js.undefined
    
    var removeIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])] = js.undefined
    
    var showDownloadIcon: js.UndefOr[Boolean] = js.undefined
    
    var showPreviewIcon: js.UndefOr[Boolean] = js.undefined
    
    var showRemoveIcon: js.UndefOr[Boolean] = js.undefined
  }
  object UploadListProps {
    
    inline def apply[T](locale: UploadLocale): UploadListProps[T] = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadListProps[T]]
    }
    
    extension [Self <: UploadListProps[?], T](x: Self & UploadListProps[T]) {
      
      inline def setAppendAction(value: ReactNode): Self = StObject.set(x, "appendAction", value.asInstanceOf[js.Any])
      
      inline def setAppendActionUndefined: Self = StObject.set(x, "appendAction", js.undefined)
      
      inline def setAppendActionVisible(value: Boolean): Self = StObject.set(x, "appendActionVisible", value.asInstanceOf[js.Any])
      
      inline def setAppendActionVisibleUndefined: Self = StObject.set(x, "appendActionVisible", js.undefined)
      
      inline def setDownloadIcon(value: ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])): Self = StObject.set(x, "downloadIcon", value.asInstanceOf[js.Any])
      
      inline def setDownloadIconFunction1(value: /* file */ UploadFile[Any] => ReactNode): Self = StObject.set(x, "downloadIcon", js.Any.fromFunction1(value))
      
      inline def setDownloadIconUndefined: Self = StObject.set(x, "downloadIcon", js.undefined)
      
      inline def setIconRender(value: (/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType]) => ReactNode): Self = StObject.set(x, "iconRender", js.Any.fromFunction2(value))
      
      inline def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
      
      inline def setIsImageUrl(value: /* file */ UploadFile[Any] => Boolean): Self = StObject.set(x, "isImageUrl", js.Any.fromFunction1(value))
      
      inline def setIsImageUrlUndefined: Self = StObject.set(x, "isImageUrl", js.undefined)
      
      inline def setItemRender(
        value: (/* originNode */ ReactElement, /* file */ UploadFile[Any], /* fileList */ js.Array[UploadFile[T]], /* actions */ Download) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
      
      inline def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      inline def setItems(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: UploadFile[T]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setListType(value: UploadListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      inline def setLocale(value: UploadLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnDownload(value: /* file */ UploadFile[T] => Unit): Self = StObject.set(x, "onDownload", js.Any.fromFunction1(value))
      
      inline def setOnDownloadUndefined: Self = StObject.set(x, "onDownload", js.undefined)
      
      inline def setOnPreview(value: /* file */ UploadFile[T] => Unit): Self = StObject.set(x, "onPreview", js.Any.fromFunction1(value))
      
      inline def setOnPreviewUndefined: Self = StObject.set(x, "onPreview", js.undefined)
      
      inline def setOnRemove(value: /* file */ UploadFile[T] => Unit | Boolean): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPreviewFile(value: /* file */ File | Blob => PromiseLike[String]): Self = StObject.set(x, "previewFile", js.Any.fromFunction1(value))
      
      inline def setPreviewFileUndefined: Self = StObject.set(x, "previewFile", js.undefined)
      
      inline def setPreviewIcon(value: ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])): Self = StObject.set(x, "previewIcon", value.asInstanceOf[js.Any])
      
      inline def setPreviewIconFunction1(value: /* file */ UploadFile[Any] => ReactNode): Self = StObject.set(x, "previewIcon", js.Any.fromFunction1(value))
      
      inline def setPreviewIconUndefined: Self = StObject.set(x, "previewIcon", js.undefined)
      
      inline def setProgress(value: UploadListProgressProps): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setRemoveIcon(value: ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      inline def setRemoveIconFunction1(value: /* file */ UploadFile[Any] => ReactNode): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
      
      inline def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      inline def setShowDownloadIcon(value: Boolean): Self = StObject.set(x, "showDownloadIcon", value.asInstanceOf[js.Any])
      
      inline def setShowDownloadIconUndefined: Self = StObject.set(x, "showDownloadIcon", js.undefined)
      
      inline def setShowPreviewIcon(value: Boolean): Self = StObject.set(x, "showPreviewIcon", value.asInstanceOf[js.Any])
      
      inline def setShowPreviewIconUndefined: Self = StObject.set(x, "showPreviewIcon", js.undefined)
      
      inline def setShowRemoveIcon(value: Boolean): Self = StObject.set(x, "showRemoveIcon", value.asInstanceOf[js.Any])
      
      inline def setShowRemoveIconUndefined: Self = StObject.set(x, "showRemoveIcon", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.text_
    - typings.antd.antdStrings.picture
    - typings.antd.antdStrings.`picture-card`
  */
  trait UploadListType extends StObject
  object UploadListType {
    
    inline def picture: typings.antd.antdStrings.picture = "picture".asInstanceOf[typings.antd.antdStrings.picture]
    
    inline def `picture-card`: typings.antd.antdStrings.`picture-card` = "picture-card".asInstanceOf[typings.antd.antdStrings.`picture-card`]
    
    inline def text: text_ = "text".asInstanceOf[text_]
  }
  
  trait UploadLocale extends StObject {
    
    var downloadFile: js.UndefOr[String] = js.undefined
    
    var previewFile: js.UndefOr[String] = js.undefined
    
    var removeFile: js.UndefOr[String] = js.undefined
    
    var uploadError: js.UndefOr[String] = js.undefined
    
    var uploading: js.UndefOr[String] = js.undefined
  }
  object UploadLocale {
    
    inline def apply(): UploadLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadLocale]
    }
    
    extension [Self <: UploadLocale](x: Self) {
      
      inline def setDownloadFile(value: String): Self = StObject.set(x, "downloadFile", value.asInstanceOf[js.Any])
      
      inline def setDownloadFileUndefined: Self = StObject.set(x, "downloadFile", js.undefined)
      
      inline def setPreviewFile(value: String): Self = StObject.set(x, "previewFile", value.asInstanceOf[js.Any])
      
      inline def setPreviewFileUndefined: Self = StObject.set(x, "previewFile", js.undefined)
      
      inline def setRemoveFile(value: String): Self = StObject.set(x, "removeFile", value.asInstanceOf[js.Any])
      
      inline def setRemoveFileUndefined: Self = StObject.set(x, "removeFile", js.undefined)
      
      inline def setUploadError(value: String): Self = StObject.set(x, "uploadError", value.asInstanceOf[js.Any])
      
      inline def setUploadErrorUndefined: Self = StObject.set(x, "uploadError", js.undefined)
      
      inline def setUploading(value: String): Self = StObject.set(x, "uploading", value.asInstanceOf[js.Any])
      
      inline def setUploadingUndefined: Self = StObject.set(x, "uploading", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<rc-upload.rc-upload/es/interface.UploadProps, 'capture'> */
  trait UploadProps[T] extends StObject {
    
    var accept: js.UndefOr[String] = js.undefined
    
    var action: js.UndefOr[String | (js.Function1[/* file */ RcFile, PromiseLike[String] | String])] = js.undefined
    
    var beforeUpload: js.UndefOr[
        js.Function2[
          /* file */ RcFile, 
          /* FileList */ js.Array[RcFile], 
          BeforeUploadValueType | js.Promise[BeforeUploadValueType]
        ]
      ] = js.undefined
    
    var capture: js.UndefOr[Boolean | user | environment] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var customRequest: js.UndefOr[js.Function1[/* options */ UploadRequestOption[Any], Unit]] = js.undefined
    
    var data: js.UndefOr[
        (Record[String, Any]) | (js.Function1[
          /* file */ UploadFile[T], 
          (Record[String, Any]) | (js.Promise[Record[String, Any]])
        ])
      ] = js.undefined
    
    var defaultFileList: js.UndefOr[js.Array[UploadFile[T]]] = js.undefined
    
    var directory: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fileList: js.UndefOr[js.Array[UploadFile[T]]] = js.undefined
    
    var headers: js.UndefOr[HttpRequestHeader] = js.undefined
    
    var iconRender: js.UndefOr[
        js.Function2[/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType], ReactNode]
      ] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isImageUrl: js.UndefOr[js.Function1[/* file */ UploadFile[Any], Boolean]] = js.undefined
    
    var itemRender: js.UndefOr[ItemRender[T]] = js.undefined
    
    var listType: js.UndefOr[UploadListType] = js.undefined
    
    var locale: js.UndefOr[UploadLocale] = js.undefined
    
    /** Config max count of `fileList`. Will replace current one when `maxCount` is 1 */
    var maxCount: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[POST | PUT | PATCH | post_ | put_ | patch_] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* info */ UploadChangeParam[UploadFile[T]], Unit]] = js.undefined
    
    var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.undefined
    
    var onDrop: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLDivElement], Unit]] = js.undefined
    
    var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[T], Unit]] = js.undefined
    
    var onRemove: js.UndefOr[
        js.Function1[/* file */ UploadFile[T], Unit | Boolean | (js.Promise[Unit | Boolean])]
      ] = js.undefined
    
    var openFileDialogOnClick: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var previewFile: js.UndefOr[PreviewFileHandler] = js.undefined
    
    var progress: js.UndefOr[UploadListProgressProps] = js.undefined
    
    var showUploadList: js.UndefOr[Boolean | ShowUploadListInterface] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var supportServerRender: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Please use `beforeUpload` directly */
    var transformFile: js.UndefOr[TransformFileHandler] = js.undefined
    
    var `type`: js.UndefOr[UploadType] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object UploadProps {
    
    inline def apply[T](): UploadProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadProps[T]]
    }
    
    extension [Self <: UploadProps[?], T](x: Self & UploadProps[T]) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAction(value: String | (js.Function1[/* file */ RcFile, PromiseLike[String] | String])): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionFunction1(value: /* file */ RcFile => PromiseLike[String] | String): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setBeforeUpload(
        value: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => BeforeUploadValueType | js.Promise[BeforeUploadValueType]
      ): Self = StObject.set(x, "beforeUpload", js.Any.fromFunction2(value))
      
      inline def setBeforeUploadUndefined: Self = StObject.set(x, "beforeUpload", js.undefined)
      
      inline def setCapture(value: Boolean | user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCustomRequest(value: /* options */ UploadRequestOption[Any] => Unit): Self = StObject.set(x, "customRequest", js.Any.fromFunction1(value))
      
      inline def setCustomRequestUndefined: Self = StObject.set(x, "customRequest", js.undefined)
      
      inline def setData(
        value: (Record[String, Any]) | (js.Function1[
              /* file */ UploadFile[T], 
              (Record[String, Any]) | (js.Promise[Record[String, Any]])
            ])
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataFunction1(value: /* file */ UploadFile[T] => (Record[String, Any]) | (js.Promise[Record[String, Any]])): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDefaultFileList(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "defaultFileList", value.asInstanceOf[js.Any])
      
      inline def setDefaultFileListUndefined: Self = StObject.set(x, "defaultFileList", js.undefined)
      
      inline def setDefaultFileListVarargs(value: UploadFile[T]*): Self = StObject.set(x, "defaultFileList", js.Array(value*))
      
      inline def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFileList(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      inline def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
      
      inline def setFileListVarargs(value: UploadFile[T]*): Self = StObject.set(x, "fileList", js.Array(value*))
      
      inline def setHeaders(value: HttpRequestHeader): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIconRender(value: (/* file */ UploadFile[T], /* listType */ js.UndefOr[UploadListType]) => ReactNode): Self = StObject.set(x, "iconRender", js.Any.fromFunction2(value))
      
      inline def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsImageUrl(value: /* file */ UploadFile[Any] => Boolean): Self = StObject.set(x, "isImageUrl", js.Any.fromFunction1(value))
      
      inline def setIsImageUrlUndefined: Self = StObject.set(x, "isImageUrl", js.undefined)
      
      inline def setItemRender(
        value: (/* originNode */ ReactElement, /* file */ UploadFile[Any], /* fileList */ js.Array[UploadFile[T]], /* actions */ Download) => ReactNode
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
      
      inline def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      inline def setListType(value: UploadListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      inline def setLocale(value: UploadLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setMethod(value: POST | PUT | PATCH | post_ | put_ | patch_): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* info */ UploadChangeParam[UploadFile[T]] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDownload(value: /* file */ UploadFile[T] => Unit): Self = StObject.set(x, "onDownload", js.Any.fromFunction1(value))
      
      inline def setOnDownloadUndefined: Self = StObject.set(x, "onDownload", js.undefined)
      
      inline def setOnDrop(value: /* event */ DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnPreview(value: /* file */ UploadFile[T] => Unit): Self = StObject.set(x, "onPreview", js.Any.fromFunction1(value))
      
      inline def setOnPreviewUndefined: Self = StObject.set(x, "onPreview", js.undefined)
      
      inline def setOnRemove(value: /* file */ UploadFile[T] => Unit | Boolean | (js.Promise[Unit | Boolean])): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setOpenFileDialogOnClick(value: Boolean): Self = StObject.set(x, "openFileDialogOnClick", value.asInstanceOf[js.Any])
      
      inline def setOpenFileDialogOnClickUndefined: Self = StObject.set(x, "openFileDialogOnClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPreviewFile(value: /* file */ File | Blob => PromiseLike[String]): Self = StObject.set(x, "previewFile", js.Any.fromFunction1(value))
      
      inline def setPreviewFileUndefined: Self = StObject.set(x, "previewFile", js.undefined)
      
      inline def setProgress(value: UploadListProgressProps): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setShowUploadList(value: Boolean | ShowUploadListInterface): Self = StObject.set(x, "showUploadList", value.asInstanceOf[js.Any])
      
      inline def setShowUploadListUndefined: Self = StObject.set(x, "showUploadList", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSupportServerRender(value: Boolean): Self = StObject.set(x, "supportServerRender", value.asInstanceOf[js.Any])
      
      inline def setSupportServerRenderUndefined: Self = StObject.set(x, "supportServerRender", js.undefined)
      
      inline def setTransformFile(value: /* file */ RcFile => String | Blob | File | (PromiseLike[String | Blob | File])): Self = StObject.set(x, "transformFile", js.Any.fromFunction1(value))
      
      inline def setTransformFileUndefined: Self = StObject.set(x, "transformFile", js.undefined)
      
      inline def setType(value: UploadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait UploadState[T] extends StObject {
    
    var dragState: String
    
    var fileList: js.Array[UploadFile[T]]
  }
  object UploadState {
    
    inline def apply[T](dragState: String, fileList: js.Array[UploadFile[T]]): UploadState[T] = {
      val __obj = js.Dynamic.literal(dragState = dragState.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadState[T]]
    }
    
    extension [Self <: UploadState[?], T](x: Self & UploadState[T]) {
      
      inline def setDragState(value: String): Self = StObject.set(x, "dragState", value.asInstanceOf[js.Any])
      
      inline def setFileList(value: js.Array[UploadFile[T]]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      inline def setFileListVarargs(value: UploadFile[T]*): Self = StObject.set(x, "fileList", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.drag
    - typings.antd.antdStrings.select_
  */
  trait UploadType extends StObject
  object UploadType {
    
    inline def drag: typings.antd.antdStrings.drag = "drag".asInstanceOf[typings.antd.antdStrings.drag]
    
    inline def select: select_ = "select".asInstanceOf[select_]
  }
}
