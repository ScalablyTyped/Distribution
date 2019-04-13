package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketPolicyStatusRequest extends js.Object {
  /**
    * The name of the Amazon S3 bucket whose policy status you want to retrieve.
    */
  var Bucket: BucketName
}

object GetBucketPolicyStatusRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketPolicyStatusRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketPolicyStatusRequest]
  }
}

