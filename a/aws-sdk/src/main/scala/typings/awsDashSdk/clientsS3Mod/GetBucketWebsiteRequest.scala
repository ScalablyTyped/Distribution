package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketWebsiteRequest extends js.Object {
  /**
    * The bucket name for which to get the website configuration.
    */
  var Bucket: BucketName = js.native
}

object GetBucketWebsiteRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketWebsiteRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBucketWebsiteRequest]
  }
}

