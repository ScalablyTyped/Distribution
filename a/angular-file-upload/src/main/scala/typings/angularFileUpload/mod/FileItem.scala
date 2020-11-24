package typings.angularFileUpload.mod

import typings.std.FormData
import typings.std.Headers
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileItem extends js.Object {
  
  /**
    * Name of the field which will contain the file, default is file
    */
  var alias: String = js.native
  
  // **Methods**
  /**
    * Cancels uploading of this file
    */
  def cancel(): Unit = js.native
  
  // **Properties**
  var file: FileLikeObject = js.native
  
  /**
    * Data to be sent along with this file
    */
  var formData: js.Array[FormData] = js.native
  
  /**
    * Headers to be sent along with this file. HTML5 browsers only.
    */
  var headers: Headers = js.native
  
  /**
    * A sequence number upload. Read only.
    */
  var index: Double = js.native
  
  /**
    * true if uploading was canceled. Read only.
    */
  var isCancel: Boolean = js.native
  
  /**
    * true if occurred error while file uploading. Read only.
    */
  var isError: Boolean = js.native
  
  /**
    * File is ready to upload. Read only.
    */
  var isReady: Boolean = js.native
  
  /**
    * true if the file was uploaded successfully. Read only.
    */
  var isSuccess: Boolean = js.native
  
  /**
    * true if the file was uploaded. Read only.
    */
  var isUploaded: Boolean = js.native
  
  /**
    * true if the file is being uploaded. Read only.
    */
  var isUploading: Boolean = js.native
  
  /**
    * It's a request method. By default POST. HTML5 browsers only.
    */
  var method: String = js.native
  
  // **Callbacks**
  /**
    *  Fires before uploading an item.
    */
  def onBeforeUpload(): Unit = js.native
  
  /**
    * On cancel uploading
    */
  def onCancel(response: Response, status: Double, headers: Headers): Unit = js.native
  
  /**
    * On file upload complete (independently of the sucess of the operation)
    */
  def onComplete(response: Response, status: Double, headers: Headers): Unit = js.native
  
  /**
    * On upload error
    */
  def onError(response: Response, status: Double, headers: Headers): Unit = js.native
  
  /**
    * On file upload progress.
    */
  def onProgress(progress: Double): Unit = js.native
  
  /**
    * On file successfully uploaded
    */
  def onSuccess(response: Response, status: Double, headers: Headers): Unit = js.native
  
  /**
    * File upload progress percentage. Read only.
    */
  var progress: Double = js.native
  
  /**
    * Remove this file from the queue
    */
  def remove(): Unit = js.native
  
  /**
    * Remove this file from the queue after uploading
    */
  var removeAfterUpload: Boolean = js.native
  
  /**
    * Upload this file
    */
  def upload(): Unit = js.native
  
  /**
    * Reference to the parent Uploader object for this file. Read only.
    */
  var uploader: FileUploader = js.native
  
  /**
    * Path on the server in which this file will be uploaded
    */
  var url: String = js.native
  
  /**
    * enable CORS. HTML5 browsers only.
    */
  var withCredentials: Boolean = js.native
}
object FileItem {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FileItemOps[Self <: FileItem] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFile(value: FileLikeObject): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataVarargs(value: FormData*): Self = this.set("formData", js.Array(value :_*))
    
    @scala.inline
    def setFormData(value: js.Array[FormData]): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCancel(value: Boolean): Self = this.set("isCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsError(value: Boolean): Self = this.set("isError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReady(value: Boolean): Self = this.set("isReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuccess(value: Boolean): Self = this.set("isSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUploaded(value: Boolean): Self = this.set("isUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUploading(value: Boolean): Self = this.set("isUploading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBeforeUpload(value: () => Unit): Self = this.set("onBeforeUpload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCancel(value: (Response, Double, Headers) => Unit): Self = this.set("onCancel", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnComplete(value: (Response, Double, Headers) => Unit): Self = this.set("onComplete", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnError(value: (Response, Double, Headers) => Unit): Self = this.set("onError", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnProgress(value: Double => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuccess(value: (Response, Double, Headers) => Unit): Self = this.set("onSuccess", js.Any.fromFunction3(value))
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAfterUpload(value: Boolean): Self = this.set("removeAfterUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload(value: () => Unit): Self = this.set("upload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUploader(value: FileUploader): Self = this.set("uploader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
  }
}
