package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketPolicyRequest extends js.Object {
  /**
    * The bucket name for which to get the bucket policy.
    */
  var Bucket: BucketName = js.native
}

object GetBucketPolicyRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketPolicyRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBucketPolicyRequest]
  }
}

