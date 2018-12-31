package typings
package angularDashFileDashUploadLib.angularDashFileDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploaderOptions extends js.Object {
  /**
    * Name of the field which will contain the file, default is file
    * @default file
    */
  var alias: java.lang.String
  /**
    * Automatically upload files after adding them to the queue
    * @default false
    */
  var autoUpload: scala.Boolean
  /**
    * Disable multipart.
    * @default false
    */
  var disableMultipart: scala.Boolean
  /**
    * Filters to be applied to the files before adding them to the queue. If the filter returns true the file will be added to the queue
    * @default [folderFilter, queueLimitFilter]
    */
  var filters: js.Array[Filter]
  /**
    * Data to be sent along with the files
    * @default []
    */
  var formData: js.Array[stdLib.FormData]
  /**
    * Headers to be sent along with the files. HTML5 browsers only.
    * @default {}
    */
  var headers: stdLib.Headers
  /**
    * It's a request method. HTML5 browsers only.
    * @default POST
    */
  var method: java.lang.String
  /**
    * Items to be uploaded
    * @default []
    */
  var queue: js.Array[FileItem]
  /**
    * Maximum count of files.
    * @default Number.MAX_VALUE
    */
  var queueLimit: scala.Double
  /**
    * Remove files from the queue after uploading
    * @default false
    */
  var removeAfterUpload: scala.Boolean
  /**
    * Path on the server to upload files
    * @default /
    */
  var url: java.lang.String
  /**
    * enable CORS. HTML5 browsers only.
    * @default false
    */
  var withCredentials: scala.Boolean
}

