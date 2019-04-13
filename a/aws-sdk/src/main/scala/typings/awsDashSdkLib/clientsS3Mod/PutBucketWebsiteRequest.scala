package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketWebsiteRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
  /**
    * 
    */
  var WebsiteConfiguration: awsDashSdkLib.clientsS3Mod.WebsiteConfiguration
}

object PutBucketWebsiteRequest {
  @scala.inline
  def apply(Bucket: BucketName, WebsiteConfiguration: WebsiteConfiguration, ContentMD5: ContentMD5 = null): PutBucketWebsiteRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, WebsiteConfiguration = WebsiteConfiguration)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    __obj.asInstanceOf[PutBucketWebsiteRequest]
  }
}

