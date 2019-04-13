package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketTaggingRequest extends js.Object {
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
  var Tagging: awsDashSdkLib.clientsS3Mod.Tagging
}

object PutBucketTaggingRequest {
  @scala.inline
  def apply(Bucket: BucketName, Tagging: Tagging, ContentMD5: ContentMD5 = null): PutBucketTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Tagging = Tagging)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    __obj.asInstanceOf[PutBucketTaggingRequest]
  }
}

