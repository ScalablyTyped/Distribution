package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketPolicyStatusRequest extends js.Object {
  /**
    * The name of the Amazon S3 bucket whose policy status you want to retrieve.
    */
  var Bucket: BucketName = js.native
}

object GetBucketPolicyStatusRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketPolicyStatusRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBucketPolicyStatusRequest]
  }
}

