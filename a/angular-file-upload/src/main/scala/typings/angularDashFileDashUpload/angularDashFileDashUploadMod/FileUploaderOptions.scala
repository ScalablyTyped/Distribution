package typings.angularDashFileDashUpload.angularDashFileDashUploadMod

import typings.std.FormData
import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploaderOptions extends js.Object {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(alias = alias, autoUpload = autoUpload, disableMultipart = disableMultipart, filters = filters, formData = formData, headers = headers, method = method, queue = queue, queueLimit = queueLimit, removeAfterUpload = removeAfterUpload, url = url, withCredentials = withCredentials)
  
    __obj.asInstanceOf[FileUploaderOptions]
  }
}

