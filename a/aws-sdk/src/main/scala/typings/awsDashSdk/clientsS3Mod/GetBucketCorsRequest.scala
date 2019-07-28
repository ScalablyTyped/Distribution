package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketCorsRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
}

object GetBucketCorsRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketCorsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
  
    __obj.asInstanceOf[GetBucketCorsRequest]
  }
}

