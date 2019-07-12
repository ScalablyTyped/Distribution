package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateMultipartUploadOutput extends js.Object {
  /**
    * The relative URI path of the multipart upload ID Amazon S3 Glacier created.
    */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the multipart upload. This value is also included as part of the location.
    */
  var uploadId: js.UndefOr[java.lang.String] = js.undefined
}

object InitiateMultipartUploadOutput {
  @scala.inline
  def apply(location: java.lang.String = null, uploadId: java.lang.String = null): InitiateMultipartUploadOutput = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId)
    __obj.asInstanceOf[InitiateMultipartUploadOutput]
  }
}

