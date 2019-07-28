package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketVersioningRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object GetBucketVersioningRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketVersioningRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketVersioningRequest]
  }
}

