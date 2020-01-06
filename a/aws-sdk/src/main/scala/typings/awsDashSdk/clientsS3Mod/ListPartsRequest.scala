package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartsRequest extends js.Object {
  /**
    * Name of the bucket to which the parts are being uploaded.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: ObjectKey = js.native
  /**
    * Sets the maximum number of parts to return.
    */
  var MaxParts: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MaxParts] = js.native
  /**
    * Specifies the part after which listing should begin. Only parts with higher part numbers will be listed.
    */
  var PartNumberMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.PartNumberMarker] = js.native
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.native
  /**
    * Upload ID identifying the multipart upload whose parts are being listed.
    */
  var UploadId: MultipartUploadId = js.native
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
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    if (MaxParts != null) __obj.updateDynamic("MaxParts")(MaxParts.asInstanceOf[js.Any])
    if (PartNumberMarker != null) __obj.updateDynamic("PartNumberMarker")(PartNumberMarker.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsRequest]
  }
}

