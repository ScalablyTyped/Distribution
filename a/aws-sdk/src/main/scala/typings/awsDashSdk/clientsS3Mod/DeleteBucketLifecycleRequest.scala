package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketLifecycleRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object DeleteBucketLifecycleRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketLifecycleRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[DeleteBucketLifecycleRequest]
  }
}

