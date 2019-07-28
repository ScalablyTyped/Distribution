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
    if (!js.isUndefined(answerCorrect)) __obj.updateDynamic("answerCorrect")(answerCorrect)
    if (!js.isUndefined(autoConfirmUser)) __obj.updateDynamic("autoConfirmUser")(autoConfirmUser)
    if (!js.isUndefined(autoVerifyEmail)) __obj.updateDynamic("autoVerifyEmail")(autoVerifyEmail)
    if (!js.isUndefined(autoVerifyPhone)) __obj.updateDynamic("autoVerifyPhone")(autoVerifyPhone)
    if (challengeMetadata != null) __obj.updateDynamic("challengeMetadata")(challengeMetadata)
    if (challengeName != null) __obj.updateDynamic("challengeName")(challengeName)
    if (claimsOverrideDetails != null) __obj.updateDynamic("claimsOverrideDetails")(claimsOverrideDetails)
    if (desiredDeliveryMediums != null) __obj.updateDynamic("desiredDeliveryMediums")(desiredDeliveryMediums)
    if (emailMessage != null) __obj.updateDynamic("emailMessage")(emailMessage)
    if (emailSubject != null) __obj.updateDynamic("emailSubject")(emailSubject)
    if (!js.isUndefined(failAuthentication)) __obj.updateDynamic("failAuthentication")(failAuthentication)
    if (finalUserStatus != null) __obj.updateDynamic("finalUserStatus")(finalUserStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(forceAliasCreation)) __obj.updateDynamic("forceAliasCreation")(forceAliasCreation)
    if (!js.isUndefined(issueTokens)) __obj.updateDynamic("issueTokens")(issueTokens)
    if (messageAction != null) __obj.updateDynamic("messageAction")(messageAction)
    if (privateChallengeParameters != null) __obj.updateDynamic("privateChallengeParameters")(privateChallengeParameters)
    if (publicChallengeParameters != null) __obj.updateDynamic("publicChallengeParameters")(publicChallengeParameters)
    if (smsMessage != null) __obj.updateDynamic("smsMessage")(smsMessage)
    if (userAttributes != null) __obj.updateDynamic("userAttributes")(userAttributes)
    __obj.asInstanceOf[Anon_AnswerCorrect]
  }
}

