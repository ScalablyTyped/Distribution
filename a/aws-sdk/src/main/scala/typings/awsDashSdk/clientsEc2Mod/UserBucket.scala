package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserBucket extends js.Object {
  /**
    * The name of the S3 bucket where the disk image is located.
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  /**
    * The file name of the disk image.
    */
  var S3Key: js.UndefOr[String] = js.undefined
}

object UserBucket {
  @scala.inline
  def apply(S3Bucket: String = null, S3Key: String = null): UserBucket = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket)
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key)
    __obj.asInstanceOf[UserBucket]
  }
}

