package typings
package awsDashSdkLib.clientsS3Mod

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
  var MaxParts: js.UndefOr[MaxParts] = js.undefined
  /**
    * Specifies the part after which listing should begin. Only parts with higher part numbers will be listed.
    */
  var PartNumberMarker: js.UndefOr[PartNumberMarker] = js.undefined
  var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
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
    MaxParts: js.UndefOr[MaxParts] = js.undefined,
    PartNumberMarker: js.UndefOr[PartNumberMarker] = js.undefined,
    RequestPayer: RequestPayer = null
  ): ListPartsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key, UploadId = UploadId)
    if (!js.isUndefined(MaxParts)) __obj.updateDynamic("MaxParts")(MaxParts)
    if (!js.isUndefined(PartNumberMarker)) __obj.updateDynamic("PartNumberMarker")(PartNumberMarker)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsRequest]
  }
}

