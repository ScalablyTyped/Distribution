package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLocationRequest extends js.Object {
  /**
    * The name of the bucket for which to get the location.
    */
  var Bucket: BucketName = js.native
}

object GetBucketLocationRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketLocationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBucketLocationRequest]
  }
}

