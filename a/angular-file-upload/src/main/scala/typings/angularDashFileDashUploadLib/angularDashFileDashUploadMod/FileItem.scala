package typings
package angularDashFileDashUploadLib.angularDashFileDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileItem extends js.Object {
  /**
    * Name of the field which will contain the file, default is file
    */
  var alias: java.lang.String
  // **Properties**
  var file: FileLikeObject
  /**
    * Data to be sent along with this file
    */
  var formData: js.Array[stdLib.FormData]
  /**
    * Headers to be sent along with this file. HTML5 browsers only.
    */
  var headers: stdLib.Headers
  /**
    * A sequence number upload. Read only.
    */
  var index: scala.Double
  /**
    * true if uploading was canceled. Read only.
    */
  var isCancel: scala.Boolean
  /**
    * true if occurred error while file uploading. Read only.
    */
  var isError: scala.Boolean
  /**
    * File is ready to upload. Read only.
    */
  var isReady: scala.Boolean
  /**
    * true if the file was uploaded successfully. Read only.
    */
  var isSuccess: scala.Boolean
  /**
    * true if the file was uploaded. Read only.
    */
  var isUploaded: scala.Boolean
  /**
    * true if the file is being uploaded. Read only.
    */
  var isUploading: scala.Boolean
  /**
    * It's a request method. By default POST. HTML5 browsers only.
    */
  var method: java.lang.String
  /**
    * File upload progress percentage. Read only.
    */
  var progress: scala.Double
  /**
    * Remove this file from the queue after uploading
    */
  var removeAfterUpload: scala.Boolean
  /**
    * Reference to the parent Uploader object for this file. Read only.
    */
  var uploader: FileUploader
  /**
    * Path on the server in which this file will be uploaded
    */
  var url: java.lang.String
  /**
    * enable CORS. HTML5 browsers only.
    */
  var withCredentials: scala.Boolean
  // **Methods**
  /**
    * Cancels uploading of this file
    */
  def cancel(): scala.Unit
  // **Callbacks**
  /**
    *  Fires before uploading an item.
    */
  def onBeforeUpload(): scala.Unit
  /**
    * On cancel uploading
    */
  def onCancel(response: stdLib.Response, status: scala.Double, headers: stdLib.Headers): scala.Unit
  /**
    * On file upload complete (independently of the sucess of the operation)
    */
  def onComplete(response: stdLib.Response, status: scala.Double, headers: stdLib.Headers): scala.Unit
  /**
    * On upload error
    */
  def onError(response: stdLib.Response, status: scala.Double, headers: stdLib.Headers): scala.Unit
  /**
    * On file upload progress.
    */
  def onProgress(progress: scala.Double): scala.Unit
  /**
    * On file successfully uploaded
    */
  def onSuccess(response: stdLib.Response, status: scala.Double, headers: stdLib.Headers): scala.Unit
  /**
    * Remove this file from the queue
    */
  def remove(): scala.Unit
  /**
    * Upload this file
    */
  def upload(): scala.Unit
}

object FileItem {
  @scala.inline
  def apply(
    alias: java.lang.String,
    cancel: () => scala.Unit,
    file: FileLikeObject,
    formData: js.Array[stdLib.FormData],
    headers: stdLib.Headers,
    index: scala.Double,
    isCancel: scala.Boolean,
    isError: scala.Boolean,
    isReady: scala.Boolean,
    isSuccess: scala.Boolean,
    isUploaded: scala.Boolean,
    isUploading: scala.Boolean,
    method: java.lang.String,
    onBeforeUpload: () => scala.Unit,
    onCancel: (stdLib.Response, scala.Double, stdLib.Headers) => scala.Unit,
    onComplete: (stdLib.Response, scala.Double, stdLib.Headers) => scala.Unit,
    onError: (stdLib.Response, scala.Double, stdLib.Headers) => scala.Unit,
    onProgress: scala.Double => scala.Unit,
    onSuccess: (stdLib.Response, scala.Double, stdLib.Headers) => scala.Unit,
    progress: scala.Double,
    remove: () => scala.Unit,
    removeAfterUpload: scala.Boolean,
    upload: () => scala.Unit,
    uploader: FileUploader,
    url: java.lang.String,
    withCredentials: scala.Boolean
  ): FileItem = {
    val __obj = js.Dynamic.literal(alias = alias, cancel = js.Any.fromFunction0(cancel), file = file, formData = formData, headers = headers, index = index, isCancel = isCancel, isError = isError, isReady = isReady, isSuccess = isSuccess, isUploaded = isUploaded, isUploading = isUploading, method = method, onBeforeUpload = js.Any.fromFunction0(onBeforeUpload), onCancel = js.Any.fromFunction3(onCancel), onComplete = js.Any.fromFunction3(onComplete), onError = js.Any.fromFunction3(onError), onProgress = js.Any.fromFunction1(onProgress), onSuccess = js.Any.fromFunction3(onSuccess), progress = progress, remove = js.Any.fromFunction0(remove), removeAfterUpload = removeAfterUpload, upload = js.Any.fromFunction0(upload), uploader = uploader, url = url, withCredentials = withCredentials)
  
    __obj.asInstanceOf[FileItem]
  }
}

