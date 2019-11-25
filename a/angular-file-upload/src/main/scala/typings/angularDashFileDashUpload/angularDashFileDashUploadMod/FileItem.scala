package typings.angularDashFileDashUpload.angularDashFileDashUploadMod

import typings.std.FormData
import typings.std.Headers
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileItem extends js.Object {
  /**
    * Name of the field which will contain the file, default is file
    */
  var alias: String
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
  /**
    * File upload progress percentage. Read only.
    */
  var progress: Double
  /**
    * Remove this file from the queue after uploading
    */
  var removeAfterUpload: Boolean
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
  // **Methods**
  /**
    * Cancels uploading of this file
    */
  def cancel(): Unit
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
    * Remove this file from the queue
    */
  def remove(): Unit
  /**
    * Upload this file
    */
  def upload(): Unit
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
}

