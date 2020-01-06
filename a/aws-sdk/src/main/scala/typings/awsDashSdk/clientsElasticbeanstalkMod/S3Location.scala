package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * The Amazon S3 bucket where the data is located.
    */
  var S3Bucket: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.S3Bucket] = js.native
  /**
    * The Amazon S3 key where the data is located.
    */
  var S3Key: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.S3Key] = js.native
}

object S3Location {
  @scala.inline
  def apply(S3Bucket: S3Bucket = null, S3Key: S3Key = null): S3Location = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket.asInstanceOf[js.Any])
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
}

