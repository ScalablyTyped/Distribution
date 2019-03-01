package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnswerCorrect extends js.Object {
  var answerCorrect: js.UndefOr[scala.Boolean] = js.undefined
  var autoConfirmUser: js.UndefOr[scala.Boolean] = js.undefined
  var challengeMetadata: js.UndefOr[java.lang.String] = js.undefined
  var challengeName: js.UndefOr[java.lang.String] = js.undefined
  var desiredDeliveryMediums: js.UndefOr[
    js.Array[
      awsDashLambdaLib.awsDashLambdaLibStrings.EMAIL | awsDashLambdaLib.awsDashLambdaLibStrings.SMS
    ]
  ] = js.undefined
  var emailMessage: js.UndefOr[java.lang.String] = js.undefined
  var emailSubject: js.UndefOr[java.lang.String] = js.undefined
  var failAuthentication: js.UndefOr[scala.Boolean] = js.undefined
  var finalUserStatus: js.UndefOr[
    awsDashLambdaLib.awsDashLambdaLibStrings.CONFIRMED | awsDashLambdaLib.awsDashLambdaLibStrings.RESET_REQUIRED
  ] = js.undefined
  var forceAliasCreation: js.UndefOr[scala.Boolean] = js.undefined
  var issueTokens: js.UndefOr[scala.Boolean] = js.undefined
  var messageAction: js.UndefOr[awsDashLambdaLib.awsDashLambdaLibStrings.SUPPRESS] = js.undefined
  var privateChallengeParameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var publicChallengeParameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var smsMessage: js.UndefOr[java.lang.String] = js.undefined
  var userAttributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object Anon_AnswerCorrect {
  @scala.inline
  def apply(
    answerCorrect: js.UndefOr[scala.Boolean] = js.undefined,
    autoConfirmUser: js.UndefOr[scala.Boolean] = js.undefined,
    challengeMetadata: java.lang.String = null,
    challengeName: java.lang.String = null,
    desiredDeliveryMediums: js.Array[
      awsDashLambdaLib.awsDashLambdaLibStrings.EMAIL | awsDashLambdaLib.awsDashLambdaLibStrings.SMS
    ] = null,
    emailMessage: java.lang.String = null,
    emailSubject: java.lang.String = null,
    failAuthentication: js.UndefOr[scala.Boolean] = js.undefined,
    finalUserStatus: awsDashLambdaLib.awsDashLambdaLibStrings.CONFIRMED | awsDashLambdaLib.awsDashLambdaLibStrings.RESET_REQUIRED = null,
    forceAliasCreation: js.UndefOr[scala.Boolean] = js.undefined,
    issueTokens: js.UndefOr[scala.Boolean] = js.undefined,
    messageAction: awsDashLambdaLib.awsDashLambdaLibStrings.SUPPRESS = null,
    privateChallengeParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    publicChallengeParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    smsMessage: java.lang.String = null,
    userAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Anon_AnswerCorrect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(answerCorrect)) __obj.updateDynamic("answerCorrect")(answerCorrect)
    if (!js.isUndefined(autoConfirmUser)) __obj.updateDynamic("autoConfirmUser")(autoConfirmUser)
    if (challengeMetadata != null) __obj.updateDynamic("challengeMetadata")(challengeMetadata)
    if (challengeName != null) __obj.updateDynamic("challengeName")(challengeName)
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

