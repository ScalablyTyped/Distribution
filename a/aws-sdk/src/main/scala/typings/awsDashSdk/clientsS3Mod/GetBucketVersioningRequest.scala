package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketVersioningRequest extends js.Object {
  /**
    * The name of the bucket for which to get the versioning information.
    */
  var Bucket: BucketName = js.native
}

object GetBucketVersioningRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketVersioningRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBucketVersioningRequest]
  }
}

