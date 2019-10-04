package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputDataConfig extends js.Object {
  /**
    * When you use the OutputDataConfig object with asynchronous operations, you specify the Amazon S3 location where you want to write the output data. The URI must be in the same region as the API endpoint that you are calling. The location is used as the prefix for the actual location of the output.
    */
  var S3Bucket: typings.awsDashSdk.clientsComprehendmedicalMod.S3Bucket
  /**
    * The path to the output data files in the S3 bucket. Amazon Comprehend Medical creates an output directory using the job ID so that the output from one job does not overwrite the output of another.
    */
  var S3Key: js.UndefOr[typings.awsDashSdk.clientsComprehendmedicalMod.S3Key] = js.undefined
}

object OutputDataConfig {
  @scala.inline
  def apply(S3Bucket: S3Bucket, S3Key: S3Key = null): OutputDataConfig = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket)
    if (S3Key != null) __obj.updateDynamic("S3Key")(S3Key)
    __obj.asInstanceOf[OutputDataConfig]
  }
}

