package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartsOutput extends js.Object {
  /**
    * If the bucket has a lifecycle rule configured with an action to abort incomplete multipart uploads and the prefix in the lifecycle rule matches the object name in the request, then the response includes this header indicating when the initiated multipart upload will become eligible for abort operation. For more information, see Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy. The response will also include the x-amz-abort-rule-id header that will provide the ID of the lifecycle configuration rule that defines this action.
    */
  var AbortDate: js.UndefOr[typings.awsDashSdk.clientsS3Mod.AbortDate] = js.native
  /**
    * This header is returned along with the x-amz-abort-date header. It identifies applicable lifecycle configuration rule that defines the action to abort incomplete multipart uploads.
    */
  var AbortRuleId: js.UndefOr[typings.awsDashSdk.clientsS3Mod.AbortRuleId] = js.native
  /**
    * Name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: js.UndefOr[BucketName] = js.native
  /**
    * Container element that identifies who initiated the multipart upload. If the initiator is an AWS account, this element provides the same information as the Owner element. If the initiator is an IAM User, this element provides the user ARN and display name.
    */
  var Initiator: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Initiator] = js.native
  /**
    *  Indicates whether the returned list of parts is truncated. A true value indicates that the list was truncated. A list can be truncated if the number of parts exceeds the limit returned in the MaxParts element.
    */
  var IsTruncated: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IsTruncated] = js.native
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  /**
    * Maximum number of parts that were allowed in the response.
    */
  var MaxParts: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MaxParts] = js.native
  /**
    * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.
    */
  var NextPartNumberMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.NextPartNumberMarker] = js.native
  /**
    *  Container element that identifies the object owner, after the object is created. If multipart upload is initiated by an IAM user, this element provides the parent account ID and display name.
    */
  var Owner: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Owner] = js.native
  /**
    * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.
    */
  var PartNumberMarker: js.UndefOr[typings.awsDashSdk.clientsS3Mod.PartNumberMarker] = js.native
  /**
    *  Container for elements related to a particular part. A response can contain zero or more Part elements.
    */
  var Parts: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Parts] = js.native
  var RequestCharged: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestCharged] = js.native
  /**
    * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the uploaded object.
    */
  var StorageClass: js.UndefOr[typings.awsDashSdk.clientsS3Mod.StorageClass] = js.native
  /**
    * Upload ID identifying the multipart upload whose parts are being listed.
    */
  var UploadId: js.UndefOr[MultipartUploadId] = js.native
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
    if (AbortDate != null) __obj.updateDynamic("AbortDate")(AbortDate.asInstanceOf[js.Any])
    if (AbortRuleId != null) __obj.updateDynamic("AbortRuleId")(AbortRuleId.asInstanceOf[js.Any])
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (Initiator != null) __obj.updateDynamic("Initiator")(Initiator.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (MaxParts != null) __obj.updateDynamic("MaxParts")(MaxParts.asInstanceOf[js.Any])
    if (NextPartNumberMarker != null) __obj.updateDynamic("NextPartNumberMarker")(NextPartNumberMarker.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (PartNumberMarker != null) __obj.updateDynamic("PartNumberMarker")(PartNumberMarker.asInstanceOf[js.Any])
    if (Parts != null) __obj.updateDynamic("Parts")(Parts.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (UploadId != null) __obj.updateDynamic("UploadId")(UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsOutput]
  }
}

