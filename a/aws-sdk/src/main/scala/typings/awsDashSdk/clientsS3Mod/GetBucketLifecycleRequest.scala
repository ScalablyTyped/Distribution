package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLifecycleRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object GetBucketLifecycleRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketLifecycleRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketLifecycleRequest]
  }
}

