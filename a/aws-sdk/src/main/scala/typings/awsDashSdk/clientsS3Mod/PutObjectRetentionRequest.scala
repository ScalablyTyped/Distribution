package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectRetentionRequest extends js.Object {
  /**
    * The bucket that contains the object you want to apply this Object Retention configuration to.
    */
  var Bucket: BucketName
  /**
    * Indicates whether this operation should bypass Governance-mode restrictions.j
    */
  var BypassGovernanceRetention: js.UndefOr[typings.awsDashSdk.clientsS3Mod.BypassGovernanceRetention] = js.undefined
  /**
    * The MD5 hash for the request body.
    */
  var ContentMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentMD5] = js.undefined
  /**
    * The key name for the object that you want to apply this Object Retention configuration to.
    */
  var Key: ObjectKey
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.undefined
  /**
    * The container element for the Object Retention configuration.
    */
  var Retention: js.UndefOr[ObjectLockRetention] = js.undefined
  /**
    * The version ID for the object that you want to apply this Object Retention configuration to.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object PutObjectRetentionRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    BypassGovernanceRetention: js.UndefOr[Boolean] = js.undefined,
    ContentMD5: ContentMD5 = null,
    RequestPayer: RequestPayer = null,
    Retention: ObjectLockRetention = null,
    VersionId: ObjectVersionId = null
  ): PutObjectRetentionRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key)
    if (!js.isUndefined(BypassGovernanceRetention)) __obj.updateDynamic("BypassGovernanceRetention")(BypassGovernanceRetention)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (Retention != null) __obj.updateDynamic("Retention")(Retention)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[PutObjectRetentionRequest]
  }
}

