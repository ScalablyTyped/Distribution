package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketPolicyRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in the future.
    */
  var ConfirmRemoveSelfBucketAccess: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ConfirmRemoveSelfBucketAccess] = js.undefined
  /**
    * 
    */
  var ContentMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentMD5] = js.undefined
  /**
    * The bucket policy as a JSON document.
    */
  var Policy: typings.awsDashSdk.clientsS3Mod.Policy
}

object PutBucketPolicyRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Policy: Policy,
    ConfirmRemoveSelfBucketAccess: js.UndefOr[Boolean] = js.undefined,
    ContentMD5: ContentMD5 = null
  ): PutBucketPolicyRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Policy = Policy)
    if (!js.isUndefined(ConfirmRemoveSelfBucketAccess)) __obj.updateDynamic("ConfirmRemoveSelfBucketAccess")(ConfirmRemoveSelfBucketAccess)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    __obj.asInstanceOf[PutBucketPolicyRequest]
  }
}

