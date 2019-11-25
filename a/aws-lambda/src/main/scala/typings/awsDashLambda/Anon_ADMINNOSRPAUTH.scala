package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaStrings.ADMIN_NO_SRP_AUTH
import typings.awsDashLambda.awsDashLambdaStrings.CUSTOM_CHALLENGE
import typings.awsDashLambda.awsDashLambdaStrings.DEVICE_PASSWORD_VERIFIER
import typings.awsDashLambda.awsDashLambdaStrings.DEVICE_SRP_AUTH
import typings.awsDashLambda.awsDashLambdaStrings.PASSWORD_VERIFIER
import typings.awsDashLambda.awsDashLambdaStrings.SMS_MFA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ADMINNOSRPAUTH extends js.Object {
  var challengeMetadata: js.UndefOr[String] = js.undefined
  var challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH
  var challengeResult: Boolean
}

object Anon_ADMINNOSRPAUTH {
  @scala.inline
  def apply(
    challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH,
    challengeResult: Boolean,
    challengeMetadata: String = null
  ): Anon_ADMINNOSRPAUTH = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], challengeResult = challengeResult.asInstanceOf[js.Any])
    if (challengeMetadata != null) __obj.updateDynamic("challengeMetadata")(challengeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ADMINNOSRPAUTH]
  }
}

