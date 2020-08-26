package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.ADMIN_NO_SRP_AUTH
import typings.awsLambda.awsLambdaStrings.CUSTOM_CHALLENGE
import typings.awsLambda.awsLambdaStrings.DEVICE_PASSWORD_VERIFIER
import typings.awsLambda.awsLambdaStrings.DEVICE_SRP_AUTH
import typings.awsLambda.awsLambdaStrings.PASSWORD_VERIFIER
import typings.awsLambda.awsLambdaStrings.SMS_MFA
import typings.awsLambda.awsLambdaStrings.SRP_A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChallengeMetadata extends js.Object {
  var challengeMetadata: js.UndefOr[String] = js.native
  var challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A = js.native
  var challengeResult: Boolean = js.native
}

object ChallengeMetadata {
  @scala.inline
  def apply(
    challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A,
    challengeResult: Boolean
  ): ChallengeMetadata = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], challengeResult = challengeResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeMetadata]
  }
  @scala.inline
  implicit class ChallengeMetadataOps[Self <: ChallengeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChallengeName(
      value: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A
    ): Self = this.set("challengeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setChallengeResult(value: Boolean): Self = this.set("challengeResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setChallengeMetadata(value: String): Self = this.set("challengeMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChallengeMetadata: Self = this.set("challengeMetadata", js.undefined)
  }
  
}

