package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Location extends js.Object {
  /**
    * The Amazon S3 bucket where the data is located.
    */
  var S3Bucket: js.UndefOr[S3Bucket] = js.undefined
  /**
    * The Amazon S3 key where the data is located.
    */
  var S3Key: js.UndefOr[S3Key] = js.undefined
}

object S3Location {
  @scala.inline
  def apply(S3Bucket: S3Bucket = null, S3Key: S3Key = null): S3Location = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket)
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key)
    __obj.asInstanceOf[S3Location]
  }
}

