package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketPolicyRequest extends js.Object {
  /**
    * The name of the bucket.
    */
  var Bucket: BucketName = js.native
  /**
    * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in the future.
    */
  var ConfirmRemoveSelfBucketAccess: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ConfirmRemoveSelfBucketAccess] = js.native
  /**
    * The MD5 hash of the request body.
    */
  var ContentMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentMD5] = js.native
  /**
    * The bucket policy as a JSON document.
    */
  var Policy: typings.awsDashSdk.clientsS3Mod.Policy = js.native
}

object PutBucketPolicyRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Policy: Policy,
    ConfirmRemoveSelfBucketAccess: js.UndefOr[Boolean] = js.undefined,
    ContentMD5: ContentMD5 = null
  ): PutBucketPolicyRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    if (!js.isUndefined(ConfirmRemoveSelfBucketAccess)) __obj.updateDynamic("ConfirmRemoveSelfBucketAccess")(ConfirmRemoveSelfBucketAccess.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketPolicyRequest]
  }
}

