package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketWebsiteRequest extends js.Object {
  /**
    * The bucket name for which you want to remove the website configuration. 
    */
  var Bucket: BucketName = js.native
}

object DeleteBucketWebsiteRequest {
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketWebsiteRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketWebsiteRequest]
  }
}

