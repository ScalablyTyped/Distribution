package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartsOutput extends js.Object {
  /**
    * Date when multipart upload will become eligible for abort operation by lifecycle.
    */
  var AbortDate: js.UndefOr[typings.awsDashSdk.clientsS3Mod.AbortDate] = js.undefined
  /**
    * Id of the lifecycle rule that makes a multipart upload eligible for abort operation.
    */
  var AbortRuleId: js.UndefOr[typings.awsDashSdk.clientsS3Mod.AbortRuleId] = js.undefined
  /**
    * Name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: js.UndefOr[BucketName] = js.undefined
  /**
    * Identifies who initiated the multipart upload.
    */
  var Initiator: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Initiator] = js.undefined
  /**
    * Indicates whether the returned list of parts is truncated.
    */
  var IsTruncated: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IsTruncated] = js.undefined
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: js.UndefOr[ObjectKey] = js.undefined
  /**
    * Maximum number of parts that were allowed in the response.
    */
  var MaxParts: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MaxParts] = js.undefined
  /**
    * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.
    */
  var NextPartNumberMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.NextPartNumberMarker] = js.undefined
  /**
    * 
    */
  var Owner: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Owner] = js.undefined
  /**
    * Part number after which listing begins.
    */
  var PartNumberMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.PartNumberMarker] = js.undefined
  /**
    * 
    */
  var Parts: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Parts] = js.undefined
  var RequestCharged: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestCharged] = js.undefined
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[typings.awsDashSdk.clientsS3Mod.StorageClass] = js.undefined
  /**
    * Upload ID identifying the multipart upload whose parts are being listed.
    */
  var UploadId: js.UndefOr[MultipartUploadId] = js.undefined
}

object ListPartsOutput {
  @scala.inline
  def apply(
    AbortDate: AbortDate = null,
    AbortRuleId: AbortRuleId = null,
    Bucket: BucketName = null,
    Initiator: Initiator = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    Key: ObjectKey = null,
    MaxParts: Int | Double = null,
    NextPartNumberMarker: Int | Double = null,
    Owner: Owner = null,
    PartNumberMarker: Int | Double = null,
    Parts: Parts = null,
    RequestCharged: RequestCharged = null,
    StorageClass: StorageClass = null,
    UploadId: MultipartUploadId = null
  ): ListPartsOutput = {
    val __obj = js.Dynamic.literal()
    if (AbortDate != null) __obj.updateDynamic("AbortDate")(AbortDate)
    if (AbortRuleId != null) __obj.updateDynamic("AbortRuleId")(AbortRuleId)
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (Initiator != null) __obj.updateDynamic("Initiator")(Initiator)
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (MaxParts != null) __obj.updateDynamic("MaxParts")(MaxParts.asInstanceOf[js.Any])
    if (NextPartNumberMarker != null) __obj.updateDynamic("NextPartNumberMarker")(NextPartNumberMarker.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (PartNumberMarker != null) __obj.updateDynamic("PartNumberMarker")(PartNumberMarker.asInstanceOf[js.Any])
    if (Parts != null) __obj.updateDynamic("Parts")(Parts)
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (UploadId != null) __obj.updateDynamic("UploadId")(UploadId)
    __obj.asInstanceOf[ListPartsOutput]
  }
}

