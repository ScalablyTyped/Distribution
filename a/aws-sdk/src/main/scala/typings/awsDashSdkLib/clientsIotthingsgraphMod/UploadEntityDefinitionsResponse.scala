package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadEntityDefinitionsResponse extends js.Object {
  /**
    * The ID that specifies the upload action. You can use this to track the status of the upload.
    */
  var uploadId: UploadId
}

object UploadEntityDefinitionsResponse {
  @scala.inline
  def apply(uploadId: UploadId): UploadEntityDefinitionsResponse = {
    val __obj = js.Dynamic.literal(uploadId = uploadId)
  
    __obj.asInstanceOf[UploadEntityDefinitionsResponse]
  }
}

