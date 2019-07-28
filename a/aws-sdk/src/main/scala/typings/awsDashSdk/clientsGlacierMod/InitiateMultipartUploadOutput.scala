package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateMultipartUploadOutput extends js.Object {
  /**
    * The relative URI path of the multipart upload ID Amazon S3 Glacier created.
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    * The ID of the multipart upload. This value is also included as part of the location.
    */
  var uploadId: js.UndefOr[String] = js.undefined
}

object InitiateMultipartUploadOutput {
  @scala.inline
  def apply(location: String = null, uploadId: String = null): InitiateMultipartUploadOutput = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId)
    __obj.asInstanceOf[InitiateMultipartUploadOutput]
  }
}

