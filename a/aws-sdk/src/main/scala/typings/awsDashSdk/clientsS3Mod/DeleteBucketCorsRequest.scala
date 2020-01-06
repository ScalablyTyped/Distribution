package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketCorsRequest extends js.Object {
  /**
    * Specifies the bucket whose cors configuration is being deleted.
    */
  var Bucket: BucketName = js.native
}

object DeleteBucketCorsRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketCorsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketCorsRequest]
  }
}

