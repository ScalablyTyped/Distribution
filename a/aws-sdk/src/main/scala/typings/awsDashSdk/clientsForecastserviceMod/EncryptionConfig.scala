package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key.
    */
  var KMSKeyArn: typings.awsDashSdk.clientsForecastserviceMod.KMSKeyArn
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the AWS KMS key. Cross-account pass role is not allowed. If you pass a role that doesn't belong to your account, an InvalidInputException is thrown.
    */
  var RoleArn: Arn
}

object EncryptionConfig {
  @scala.inline
  def apply(KMSKeyArn: KMSKeyArn, RoleArn: Arn): EncryptionConfig = {
    val __obj = js.Dynamic.literal(KMSKeyArn = KMSKeyArn, RoleArn = RoleArn)
  
    __obj.asInstanceOf[EncryptionConfig]
  }
}

