package typings.awsDashLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashLambda.awsDashLambdaStrings.CONFIRMED
import typings.awsDashLambda.awsDashLambdaStrings.EMAIL
import typings.awsDashLambda.awsDashLambdaStrings.RESET_REQUIRED
import typings.awsDashLambda.awsDashLambdaStrings.SMS
import typings.awsDashLambda.awsDashLambdaStrings.SUPPRESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnswerCorrect extends js.Object {
  var answerCorrect: js.UndefOr[Boolean] = js.undefined
  var autoConfirmUser: js.UndefOr[Boolean] = js.undefined
  var autoVerifyEmail: js.UndefOr[Boolean] = js.undefined
  var autoVerifyPhone: js.UndefOr[Boolean] = js.undefined
  var challengeMetadata: js.UndefOr[String] = js.undefined
  var challengeName: js.UndefOr[String] = js.undefined
  var claimsOverrideDetails: js.UndefOr[Anon_ClaimsToAddOrOverride] = js.undefined
  var desiredDeliveryMediums: js.UndefOr[js.Array[EMAIL | SMS]] = js.undefined
  var emailMessage: js.UndefOr[String] = js.undefined
  var emailSubject: js.UndefOr[String] = js.undefined
  var failAuthentication: js.UndefOr[Boolean] = js.undefined
  var finalUserStatus: js.UndefOr[CONFIRMED | RESET_REQUIRED] = js.undefined
  var forceAliasCreation: js.UndefOr[Boolean] = js.undefined
  var issueTokens: js.UndefOr[Boolean] = js.undefined
  var messageAction: js.UndefOr[SUPPRESS] = js.undefined
  var privateChallengeParameters: js.UndefOr[StringDictionary[String]] = js.undefined
  var publicChallengeParameters: js.UndefOr[StringDictionary[String]] = js.undefined
  var smsMessage: js.UndefOr[String] = js.undefined
  var userAttributes: js.UndefOr[StringDictionary[String]] = js.undefined
}

object Anon_AnswerCorrect {
  @scala.inline
  def apply(
    answerCorrect: js.UndefOr[Boolean] = js.undefined,
    autoConfirmUser: js.UndefOr[Boolean] = js.undefined,
    autoVerifyEmail: js.UndefOr[Boolean] = js.undefined,
    autoVerifyPhone: js.UndefOr[Boolean] = js.undefined,
    challengeMetadata: String = null,
    challengeName: String = null,
    claimsOverrideDetails: Anon_ClaimsToAddOrOverride = null,
    desiredDeliveryMediums: js.Array[EMAIL | SMS] = null,
    emailMessage: String = null,
    emailSubject: String = null,
    failAuthentication: js.UndefOr[Boolean] = js.undefined,
    finalUserStatus: CONFIRMED | RESET_REQUIRED = null,
    forceAliasCreation: js.UndefOr[Boolean] = js.undefined,
    issueTokens: js.UndefOr[Boolean] = js.undefined,
    messageAction: SUPPRESS = null,
    privateChallengeParameters: StringDictionary[String] = null,
    publicChallengeParameters: StringDictionary[String] = null,
    smsMessage: String = null,
    userAttributes: StringDictionary[String] = null
  ): Anon_AnswerCorrect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(answerCorrect)) __obj.updateDynamic("answerCorrect")(answerCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoConfirmUser)) __obj.updateDynamic("autoConfirmUser")(autoConfirmUser.asInstanceOf[js.Any])
    if (!js.isUndefined(autoVerifyEmail)) __obj.updateDynamic("autoVerifyEmail")(autoVerifyEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(autoVerifyPhone)) __obj.updateDynamic("autoVerifyPhone")(autoVerifyPhone.asInstanceOf[js.Any])
    if (challengeMetadata != null) __obj.updateDynamic("challengeMetadata")(challengeMetadata.asInstanceOf[js.Any])
    if (challengeName != null) __obj.updateDynamic("challengeName")(challengeName.asInstanceOf[js.Any])
    if (claimsOverrideDetails != null) __obj.updateDynamic("claimsOverrideDetails")(claimsOverrideDetails.asInstanceOf[js.Any])
    if (desiredDeliveryMediums != null) __obj.updateDynamic("desiredDeliveryMediums")(desiredDeliveryMediums.asInstanceOf[js.Any])
    if (emailMessage != null) __obj.updateDynamic("emailMessage")(emailMessage.asInstanceOf[js.Any])
    if (emailSubject != null) __obj.updateDynamic("emailSubject")(emailSubject.asInstanceOf[js.Any])
    if (!js.isUndefined(failAuthentication)) __obj.updateDynamic("failAuthentication")(failAuthentication.asInstanceOf[js.Any])
    if (finalUserStatus != null) __obj.updateDynamic("finalUserStatus")(finalUserStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(forceAliasCreation)) __obj.updateDynamic("forceAliasCreation")(forceAliasCreation.asInstanceOf[js.Any])
    if (!js.isUndefined(issueTokens)) __obj.updateDynamic("issueTokens")(issueTokens.asInstanceOf[js.Any])
    if (messageAction != null) __obj.updateDynamic("messageAction")(messageAction.asInstanceOf[js.Any])
    if (privateChallengeParameters != null) __obj.updateDynamic("privateChallengeParameters")(privateChallengeParameters.asInstanceOf[js.Any])
    if (publicChallengeParameters != null) __obj.updateDynamic("publicChallengeParameters")(publicChallengeParameters.asInstanceOf[js.Any])
    if (smsMessage != null) __obj.updateDynamic("smsMessage")(smsMessage.asInstanceOf[js.Any])
    if (userAttributes != null) __obj.updateDynamic("userAttributes")(userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnswerCorrect]
  }
}

