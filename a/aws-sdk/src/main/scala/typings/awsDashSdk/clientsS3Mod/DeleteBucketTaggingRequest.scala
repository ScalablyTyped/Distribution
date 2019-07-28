package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketTaggingRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object DeleteBucketTaggingRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[DeleteBucketTaggingRequest]
  }
}

