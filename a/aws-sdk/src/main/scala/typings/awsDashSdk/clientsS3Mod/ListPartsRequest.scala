package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartsRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var Key: ObjectKey
  /**
    * Sets the maximum number of parts to return.
    */
  var MaxParts: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MaxParts] = js.undefined
  /**
    * Specifies the part after which listing should begin. Only parts with higher part numbers will be listed.
    */
  var PartNumberMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.PartNumberMarker] = js.undefined
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.undefined
  /**
    * Upload ID identifying the multipart upload whose parts are being listed.
    */
  var UploadId: MultipartUploadId
}

object ListPartsRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    UploadId: MultipartUploadId,
    MaxParts: Int | Double = null,
    PartNumberMarker: Int | Double = null,
    RequestPayer: RequestPayer = null
  ): ListPartsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key, UploadId = UploadId)
    if (MaxParts != null) __obj.updateDynamic("MaxParts")(MaxParts.asInstanceOf[js.Any])
    if (PartNumberMarker != null) __obj.updateDynamic("PartNumberMarker")(PartNumberMarker.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsRequest]
  }
}

