package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketLoggingRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * 
    */
  var BucketLoggingStatus: awsDashSdkLib.clientsS3Mod.BucketLoggingStatus
  /**
    * 
    */
  var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
}

object PutBucketLoggingRequest {
  @scala.inline
  def apply(Bucket: BucketName, BucketLoggingStatus: BucketLoggingStatus, ContentMD5: ContentMD5 = null): PutBucketLoggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, BucketLoggingStatus = BucketLoggingStatus)
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5)
    __obj.asInstanceOf[PutBucketLoggingRequest]
  }
}

