package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketPolicyRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object DeleteBucketPolicyRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketPolicyRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[DeleteBucketPolicyRequest]
  }
}

