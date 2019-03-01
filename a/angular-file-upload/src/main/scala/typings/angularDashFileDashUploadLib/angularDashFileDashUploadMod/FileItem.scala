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
    cancel: js.Function0[scala.Unit],
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
    onBeforeUpload: js.Function0[scala.Unit],
    onCancel: js.Function3[stdLib.Response, scala.Double, stdLib.Headers, scala.Unit],
    onComplete: js.Function3[stdLib.Response, scala.Double, stdLib.Headers, scala.Unit],
    onError: js.Function3[stdLib.Response, scala.Double, stdLib.Headers, scala.Unit],
    onProgress: js.Function1[scala.Double, scala.Unit],
    onSuccess: js.Function3[stdLib.Response, scala.Double, stdLib.Headers, scala.Unit],
    progress: scala.Double,
    remove: js.Function0[scala.Unit],
    removeAfterUpload: scala.Boolean,
    upload: js.Function0[scala.Unit],
    uploader: FileUploader,
    url: java.lang.String,
    withCredentials: scala.Boolean
  ): FileItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alias")(alias)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("formData")(formData)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("isCancel")(isCancel)
    __obj.updateDynamic("isError")(isError)
    __obj.updateDynamic("isReady")(isReady)
    __obj.updateDynamic("isSuccess")(isSuccess)
    __obj.updateDynamic("isUploaded")(isUploaded)
    __obj.updateDynamic("isUploading")(isUploading)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("onBeforeUpload")(onBeforeUpload)
    __obj.updateDynamic("onCancel")(onCancel)
    __obj.updateDynamic("onComplete")(onComplete)
    __obj.updateDynamic("onError")(onError)
    __obj.updateDynamic("onProgress")(onProgress)
    __obj.updateDynamic("onSuccess")(onSuccess)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeAfterUpload")(removeAfterUpload)
    __obj.updateDynamic("upload")(upload)
    __obj.updateDynamic("uploader")(uploader)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[FileItem]
  }
}

