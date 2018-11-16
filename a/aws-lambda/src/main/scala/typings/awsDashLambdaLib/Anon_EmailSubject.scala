package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_EmailSubject extends js.Object {
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
  var privateChallengeParameters: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var publicChallengeParameters: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var smsMessage: js.UndefOr[java.lang.String] = js.undefined
  var userAttributes: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

