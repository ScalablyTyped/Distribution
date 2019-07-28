package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserBucketDetails extends js.Object {
  /**
    * The S3 bucket from which the disk image was created.
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  /**
    * The file name of the disk image.
    */
  var S3Key: js.UndefOr[String] = js.undefined
}

object UserBucketDetails {
  @scala.inline
  def apply(S3Bucket: String = null, S3Key: String = null): UserBucketDetails = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket)
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key)
    __obj.asInstanceOf[UserBucketDetails]
  }
}

