package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketPolicyRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object GetBucketPolicyRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketPolicyRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketPolicyRequest]
  }
}

