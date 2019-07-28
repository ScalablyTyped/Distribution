package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLoggingRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object GetBucketLoggingRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketLoggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketLoggingRequest]
  }
}

