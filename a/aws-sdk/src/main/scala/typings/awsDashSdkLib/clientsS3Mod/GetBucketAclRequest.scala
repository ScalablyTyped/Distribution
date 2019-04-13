package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketAclRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object GetBucketAclRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketAclRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketAclRequest]
  }
}

