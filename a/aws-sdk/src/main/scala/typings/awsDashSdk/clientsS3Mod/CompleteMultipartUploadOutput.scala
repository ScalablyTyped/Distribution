package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteMultipartUploadOutput extends js.Object {
  /**
    * 
    */
  var Bucket: js.UndefOr[BucketName] = js.undefined
  /**
    * Entity tag of the object.
    */
  var ETag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ETag] = js.undefined
  /**
    * If the object expiration is configured, this will contain the expiration date (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.
    */
  var Expiration: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Expiration] = js.undefined
  /**
    * 
    */
  var Key: js.UndefOr[ObjectKey] = js.undefined
  /**
    * 
    */
  var Location: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Location] = js.undefined
  var RequestCharged: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestCharged] = js.undefined
  /**
    * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSEKMSKeyId] = js.undefined
  /**
    * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ServerSideEncryption] = js.undefined
  /**
    * Version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object CompleteMultipartUploadOutput {
  @scala.inline
  def apply(
    Bucket: BucketName = null,
    ETag: ETag = null,
    Expiration: Expiration = null,
    Key: ObjectKey = null,
    Location: Location = null,
    RequestCharged: RequestCharged = null,
    SSEKMSKeyId: SSEKMSKeyId = null,
    ServerSideEncryption: ServerSideEncryption = null,
    VersionId: ObjectVersionId = null
  ): CompleteMultipartUploadOutput = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId)
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[CompleteMultipartUploadOutput]
  }
}

