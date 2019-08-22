package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Config extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key.
    */
  var KMSKeyArn: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.KMSKeyArn] = js.undefined
  /**
    * The path to an Amazon Simple Storage Service (Amazon S3) bucket or file(s) in an Amazon S3 bucket.
    */
  var Path: S3Path
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket or file(s). Cross-account pass role is not allowed. If you pass a role that doesn't belong to your account, an InvalidInputException is thrown.
    */
  var RoleArn: Arn
}

object S3Config {
  @scala.inline
  def apply(Path: S3Path, RoleArn: Arn, KMSKeyArn: KMSKeyArn = null): S3Config = {
    val __obj = js.Dynamic.literal(Path = Path, RoleArn = RoleArn)
    if (KMSKeyArn != null) __obj.updateDynamic("KMSKeyArn")(KMSKeyArn)
    __obj.asInstanceOf[S3Config]
  }
}

