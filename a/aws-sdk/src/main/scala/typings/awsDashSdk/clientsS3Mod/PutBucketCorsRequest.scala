package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketCorsRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var CORSConfiguration: typings.awsDashSdk.clientsS3Mod.CORSConfiguration
  /**
    * 
    */
  var ContentMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ContentMD5] = js.undefined
}

object PutBucketCorsRequest {
  @scala.inline
  def apply(Bucket: BucketName, CORSConfiguration: CORSConfiguration, ContentMD5: ContentMD5 = null): PutBucketCorsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, CORSConfiguration = CORSConfiguration)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    __obj.asInstanceOf[PutBucketCorsRequest]
  }
}

