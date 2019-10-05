package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateLayerUploadResponse extends js.Object {
  /**
    * The size, in bytes, that Amazon ECR expects future layer part uploads to be.
    */
  var partSize: js.UndefOr[PartSize] = js.undefined
  /**
    * The upload ID for the layer upload. This parameter is passed to further UploadLayerPart and CompleteLayerUpload operations.
    */
  var uploadId: js.UndefOr[UploadId] = js.undefined
}

object InitiateLayerUploadResponse {
  @scala.inline
  def apply(partSize: Int | Double = null, uploadId: UploadId = null): InitiateLayerUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (partSize != null) __obj.updateDynamic("partSize")(partSize.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId)
    __obj.asInstanceOf[InitiateLayerUploadResponse]
  }
}

