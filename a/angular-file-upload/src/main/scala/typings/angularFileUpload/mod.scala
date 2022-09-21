package typings.angularFileUpload

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.angular.mod.IDeferred
import typings.angularFileUpload.anon.PartialFileUploaderOption
import typings.std.File
import typings.std.FileList
import typings.std.FormData
import typings.std.HTMLInputElement
import typings.std.Headers
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type AsyncFilter = js.Function3[
    /* item */ File | FileLikeObject, 
    /* options */ js.UndefOr[js.Object], 
    /* deferred */ IDeferred[Any], 
    Unit
  ]
  
  trait FileItem extends StObject {
    
    /**
      * Name of the field which will contain the file, default is file
      */
    var alias: String
    
    // **Methods**
    /**
      * Cancels uploading of this file
      */
    def cancel(): Unit
    
    // **Properties**
    var file: FileLikeObject
    
    /**
      * Data to be sent along with this file
      */
    var formData: js.Array[FormData]
    
    /**
      * Headers to be sent along with this file. HTML5 browsers only.
      */
    var headers: Headers
    
    /**
      * A sequence number upload. Read only.
      */
    var index: Double
    
    /**
      * true if uploading was canceled. Read only.
      */
    var isCancel: Boolean
    
    /**
      * true if occurred error while file uploading. Read only.
      */
    var isError: Boolean
    
    /**
      * File is ready to upload. Read only.
      */
    var isReady: Boolean
    
    /**
      * true if the file was uploaded successfully. Read only.
      */
    var isSuccess: Boolean
    
    /**
      * true if the file was uploaded. Read only.
      */
    var isUploaded: Boolean
    
    /**
      * true if the file is being uploaded. Read only.
      */
    var isUploading: Boolean
    
    /**
      * It's a request method. By default POST. HTML5 browsers only.
      */
    var method: String
    
    // **Callbacks**
    /**
      *  Fires before uploading an item.
      */
    def onBeforeUpload(): Unit
    
    /**
      * On cancel uploading
      */
    def onCancel(response: Response, status: Double, headers: Headers): Unit
    
    /**
      * On file upload complete (independently of the sucess of the operation)
      */
    def onComplete(response: Response, status: Double, headers: Headers): Unit
    
    /**
      * On upload error
      */
    def onError(response: Response, status: Double, headers: Headers): Unit
    
    /**
      * On file upload progress.
      */
    def onProgress(progress: Double): Unit
    
    /**
      * On file successfully uploaded
      */
    def onSuccess(response: Response, status: Double, headers: Headers): Unit
    
    /**
      * File upload progress percentage. Read only.
      */
    var progress: Double
    
    /**
      * Remove this file from the queue
      */
    def remove(): Unit
    
    /**
      * Remove this file from the queue after uploading
      */
    var removeAfterUpload: Boolean
    
    /**
      * Upload this file
      */
    def upload(): Unit
    
    /**
      * Reference to the parent Uploader object for this file. Read only.
      */
    var uploader: FileUploader
    
    /**
      * Path on the server in which this file will be uploaded
      */
    var url: String
    
    /**
      * enable CORS. HTML5 browsers only.
      */
    var withCredentials: Boolean
  }
  object FileItem {
    
    inline def apply(
      alias: String,
      cancel: () => Unit,
      file: FileLikeObject,
      formData: js.Array[FormData],
      headers: Headers,
      index: Double,
      isCancel: Boolean,
      isError: Boolean,
      isReady: Boolean,
      isSuccess: Boolean,
      isUploaded: Boolean,
      isUploading: Boolean,
      method: String,
      onBeforeUpload: () => Unit,
      onCancel: (Response, Double, Headers) => Unit,
      onComplete: (Response, Double, Headers) => Unit,
      onError: (Response, Double, Headers) => Unit,
      onProgress: Double => Unit,
      onSuccess: (Response, Double, Headers) => Unit,
      progress: Double,
      remove: () => Unit,
      removeAfterUpload: Boolean,
      upload: () => Unit,
      uploader: FileUploader,
      url: String,
      withCredentials: Boolean
    ): FileItem = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), file = file.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isCancel = isCancel.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], isSuccess = isSuccess.asInstanceOf[js.Any], isUploaded = isUploaded.asInstanceOf[js.Any], isUploading = isUploading.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], onBeforeUpload = js.Any.fromFunction0(onBeforeUpload), onCancel = js.Any.fromFunction3(onCancel), onComplete = js.Any.fromFunction3(onComplete), onError = js.Any.fromFunction3(onError), onProgress = js.Any.fromFunction1(onProgress), onSuccess = js.Any.fromFunction3(onSuccess), progress = progress.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removeAfterUpload = removeAfterUpload.asInstanceOf[js.Any], upload = js.Any.fromFunction0(upload), uploader = uploader.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileItem]
    }
    
    extension [Self <: FileItem](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setFile(value: FileLikeObject): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: js.Array[FormData]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataVarargs(value: FormData*): Self = StObject.set(x, "formData", js.Array(value*))
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsCancel(value: Boolean): Self = StObject.set(x, "isCancel", value.asInstanceOf[js.Any])
      
      inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
      
      inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
      
      inline def setIsSuccess(value: Boolean): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
      
      inline def setIsUploaded(value: Boolean): Self = StObject.set(x, "isUploaded", value.asInstanceOf[js.Any])
      
      inline def setIsUploading(value: Boolean): Self = StObject.set(x, "isUploading", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeUpload(value: () => Unit): Self = StObject.set(x, "onBeforeUpload", js.Any.fromFunction0(value))
      
      inline def setOnCancel(value: (Response, Double, Headers) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction3(value))
      
      inline def setOnComplete(value: (Response, Double, Headers) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction3(value))
      
      inline def setOnError(value: (Response, Double, Headers) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
      
      inline def setOnProgress(value: Double => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnSuccess(value: (Response, Double, Headers) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setRemoveAfterUpload(value: Boolean): Self = StObject.set(x, "removeAfterUpload", value.asInstanceOf[js.Any])
      
      inline def setUpload(value: () => Unit): Self = StObject.set(x, "upload", js.Any.fromFunction0(value))
      
      inline def setUploader(value: FileUploader): Self = StObject.set(x, "uploader", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileLikeObject extends StObject {
    
    /**
      * Equals File.lastModifiedDate
      */
    var lastModifiedDate: Any
    
    /**
      * Equals File.name
      */
    var name: String
    
    /**
      * Equals Blob.size, in octet
      */
    var size: Double
    
    /**
      * Equals Blob.type, in octet
      */
    var `type`: String
  }
  object FileLikeObject {
    
    inline def apply(lastModifiedDate: Any, name: String, size: Double, `type`: String): FileLikeObject = {
      val __obj = js.Dynamic.literal(lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileLikeObject]
    }
    
    extension [Self <: FileLikeObject](x: Self) {
      
      inline def setLastModifiedDate(value: Any): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileUploader
    extends StObject
       with FileUploaderOptions {
    
    def addToQueue(files: js.Array[js.Object], options: js.Object, filters: String): Unit = js.native
    def addToQueue(files: js.Array[js.Object], options: js.Object, filters: js.Array[Filter]): Unit = js.native
    def addToQueue(files: js.Object, options: js.Object, filters: String): Unit = js.native
    def addToQueue(files: js.Object, options: js.Object, filters: js.Array[Filter]): Unit = js.native
    def addToQueue(files: FileList, options: js.Object, filters: String): Unit = js.native
    def addToQueue(files: FileList, options: js.Object, filters: js.Array[Filter]): Unit = js.native
    def addToQueue(files: File, options: js.Object, filters: String): Unit = js.native
    // **Methods**
    /**
      * Add items to the queue
      */
    def addToQueue(files: File, options: js.Object, filters: js.Array[Filter]): Unit = js.native
    def addToQueue(files: HTMLInputElement, options: js.Object, filters: String): Unit = js.native
    def addToQueue(files: HTMLInputElement, options: js.Object, filters: js.Array[Filter]): Unit = js.native
    
    /**
      * Cancels all current uploads.
      */
    def cancelAll(): Unit = js.native
    
    def cancelItem(value: Double): Unit = js.native
    /**
      * Cancels uploading of item, where value is {FileItem} or index of item.
      */
    def cancelItem(value: FileItem): Unit = js.native
    
    /**
      * Removes all elements from the queue.
      */
    def clearQueue(): Unit = js.native
    
    /**
      * Destroys a uploader.
      */
    def destroy(): Unit = js.native
    
    /**
      * Returns the index of the {FileItem} queue element.
      */
    def getIndexOfItem(fileItem: FileItem): Double = js.native
    
    /**
      * Return an array of all pending items on the queue
      */
    def getNotUploadedItems(): js.Array[FileItem] = js.native
    
    /**
      * Return items are ready to upload.
      */
    def getReadyItems(): js.Array[FileItem] = js.native
    
    /**
      * Returns true if value is {File}.
      */
    def isFile(value: Any): Boolean = js.native
    
    /**
      * Returns true if value is {FileLikeObject}.
      */
    def isFileLikeObject(value: Any): Boolean = js.native
    
    /**
      * true if uploader is html5-uploader. Read only.
      */
    var isHTML5: Boolean = js.native
    
    /**
      * true if an upload is in progress. Read only.
      */
    var isUploading: Boolean = js.native
    
    // **Callbacks**
    /**
      * Fires after adding all the dragged or selected files to the queue.
      */
    def onAfterAddingAll(addedItems: js.Array[FileItem]): Unit = js.native
    
    /**
      * Fires after adding a single file to the queue.
      */
    def onAfterAddingFile(item: FileItem): Unit = js.native
    
    /**
      * Fires before uploading an item.
      */
    def onBeforeUploadItem(item: FileItem): Unit = js.native
    
    /**
      * On cancel uploading
      */
    def onCancelItem(item: FileItem, response: Response, status: Double, headers: Headers): Unit = js.native
    
    /**
      * On all loaded when uploading an entire queue, or on file loaded when uploading a single independent file
      */
    def onCompleteAll(): Unit = js.native
    
    /**
      * On file upload complete (independently of the sucess of the operation)
      */
    def onCompleteItem(item: FileItem, response: Response, status: Double, headers: Headers): Unit = js.native
    
    /**
      * On upload error
      */
    def onErrorItem(item: FileItem, response: Response, status: Double, headers: Headers): Unit = js.native
    
    /**
      * On upload queue progress
      */
    def onProgressAll(progress: Double): Unit = js.native
    
    /**
      * On file upload progress.
      */
    def onProgressItem(item: FileItem, progress: Double): Unit = js.native
    
    /**
      * On file successfully uploaded
      */
    def onSuccessItem(item: FileItem, response: Response, status: Double, headers: Headers): Unit = js.native
    
    /**
      * When adding a file failed
      */
    def onWhenAddingFileFailed(item: FileItem, filter: Filter, options: js.Object): Unit = js.native
    
    /**
      * Upload queue progress percentage. Read only.
      */
    var progress: Double = js.native
    
    def removeFromQueue(value: Double): Unit = js.native
    /**
      * Remove an item from the queue, where value is {FileItem} or index of item.
      */
    def removeFromQueue(value: FileItem): Unit = js.native
    
    /**
      * Upload all pending items on the queue.
      */
    def uploadAll(): Unit = js.native
    
    def uploadItem(value: Double): Unit = js.native
    /**
      * Uploads an item, where value is {FileItem} or index of item.
      */
    def uploadItem(value: FileItem): Unit = js.native
  }
  
  @js.native
  trait FileUploaderFactory
    extends StObject
       with Instantiable0[FileUploader]
       with Instantiable1[/* options */ PartialFileUploaderOption, FileUploader]
  
  trait FileUploaderOptions extends StObject {
    
    /**
      * Name of the field which will contain the file, default is file
      * @default file
      */
    var alias: String
    
    /**
      * Automatically upload files after adding them to the queue
      * @default false
      */
    var autoUpload: Boolean
    
    /**
      * Disable multipart.
      * @default false
      */
    var disableMultipart: Boolean
    
    /**
      * Filters to be applied to the files before adding them to the queue. If the filter returns true the file will be added to the queue
      * @default [folderFilter, queueLimitFilter]
      */
    var filters: js.Array[Filter]
    
    /**
      * Data to be sent along with the files
      * @default []
      */
    var formData: js.Array[FormData]
    
    /**
      * Headers to be sent along with the files. HTML5 browsers only.
      * @default {}
      */
    var headers: Headers
    
    /**
      * It's a request method. HTML5 browsers only.
      * @default POST
      */
    var method: String
    
    /**
      * Items to be uploaded
      * @default []
      */
    var queue: js.Array[FileItem]
    
    /**
      * Maximum count of files.
      * @default Number.MAX_VALUE
      */
    var queueLimit: Double
    
    /**
      * Remove files from the queue after uploading
      * @default false
      */
    var removeAfterUpload: Boolean
    
    /**
      * Path on the server to upload files
      * @default /
      */
    var url: String
    
    /**
      * enable CORS. HTML5 browsers only.
      * @default false
      */
    var withCredentials: Boolean
  }
  object FileUploaderOptions {
    
    inline def apply(
      alias: String,
      autoUpload: Boolean,
      disableMultipart: Boolean,
      filters: js.Array[Filter],
      formData: js.Array[FormData],
      headers: Headers,
      method: String,
      queue: js.Array[FileItem],
      queueLimit: Double,
      removeAfterUpload: Boolean,
      url: String,
      withCredentials: Boolean
    ): FileUploaderOptions = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], autoUpload = autoUpload.asInstanceOf[js.Any], disableMultipart = disableMultipart.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], queueLimit = queueLimit.asInstanceOf[js.Any], removeAfterUpload = removeAfterUpload.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploaderOptions]
    }
    
    extension [Self <: FileUploaderOptions](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
      
      inline def setDisableMultipart(value: Boolean): Self = StObject.set(x, "disableMultipart", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: js.Array[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setFormData(value: js.Array[FormData]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataVarargs(value: FormData*): Self = StObject.set(x, "formData", js.Array(value*))
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: js.Array[FileItem]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueLimit(value: Double): Self = StObject.set(x, "queueLimit", value.asInstanceOf[js.Any])
      
      inline def setQueueVarargs(value: FileItem*): Self = StObject.set(x, "queue", js.Array(value*))
      
      inline def setRemoveAfterUpload(value: Boolean): Self = StObject.set(x, "removeAfterUpload", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
  
  trait Filter extends StObject {
    
    var fn: SyncFilter | AsyncFilter
    
    var name: String
  }
  object Filter {
    
    inline def apply(fn: SyncFilter | AsyncFilter, name: String): Filter = {
      val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setFn(value: SyncFilter | AsyncFilter): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnFunction2(value: (/* item */ File | FileLikeObject, /* options */ js.UndefOr[js.Object]) => Boolean): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
      
      inline def setFnFunction3(
        value: (/* item */ File | FileLikeObject, /* options */ js.UndefOr[js.Object], /* deferred */ IDeferred[Any]) => Unit
      ): Self = StObject.set(x, "fn", js.Any.fromFunction3(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type SyncFilter = js.Function2[/* item */ File | FileLikeObject, /* options */ js.UndefOr[js.Object], Boolean]
}
