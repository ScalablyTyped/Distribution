package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoUserPoolTriggerEvent extends js.Object {
  var callerContext: awsDashLambdaLib.Anon_AwsSdkVersion
  var region: java.lang.String
  var request: awsDashLambdaLib.Anon_ChallengeAnswer
  var response: awsDashLambdaLib.Anon_AnswerCorrect
  var triggerSource: awsDashLambdaLib.awsDashLambdaLibStrings.PreSignUp_SignUp | awsDashLambdaLib.awsDashLambdaLibStrings.PostConfirmation_ConfirmSignUp | awsDashLambdaLib.awsDashLambdaLibStrings.PreAuthentication_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.PostAuthentication_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_SignUp | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_AdminCreateUser | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_ResendCode | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_ForgotPassword | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_UpdateUserAttribute | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_VerifyUserAttribute | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.DefineAuthChallenge_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.CreateAuthChallenge_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.VerifyAuthChallengeResponse_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.PreSignUp_AdminCreateUser | awsDashLambdaLib.awsDashLambdaLibStrings.PostConfirmation_ConfirmForgotPassword | awsDashLambdaLib.awsDashLambdaLibStrings.TokenGeneration_HostedAuth | awsDashLambdaLib.awsDashLambdaLibStrings.TokenGeneration_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.TokenGeneration_NewPasswordChallenge | awsDashLambdaLib.awsDashLambdaLibStrings.TokenGeneration_AuthenticateDevice | awsDashLambdaLib.awsDashLambdaLibStrings.TokenGeneration_RefreshTokens | awsDashLambdaLib.awsDashLambdaLibStrings.UserMigration_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.UserMigration_ForgotPassword
  var userName: js.UndefOr[java.lang.String] = js.undefined
  var userPoolId: java.lang.String
  var version: scala.Double
}

object CognitoUserPoolTriggerEvent {
  @scala.inline
  def apply(
    callerContext: awsDashLambdaLib.Anon_AwsSdkVersion,
    region: java.lang.String,
    request: awsDashLambdaLib.Anon_ChallengeAnswer,
    response: awsDashLambdaLib.Anon_AnswerCorrect,
    triggerSource: awsDashLambdaLib.awsDashLambdaLibStrings.PreSignUp_SignUp | awsDashLambdaLib.awsDashLambdaLibStrings.PostConfirmation_ConfirmSignUp | awsDashLambdaLib.awsDashLambdaLibStrings.PreAuthentication_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.PostAuthentication_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_SignUp | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_AdminCreateUser | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_ResendCode | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_ForgotPassword | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_UpdateUserAttribute | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_VerifyUserAttribute | awsDashLambdaLib.awsDashLambdaLibStrings.CustomMessage_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.DefineAuthChallenge_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.CreateAuthChallenge_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.VerifyAuthChallengeResponse_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.PreSignUp_AdminCreateUser | awsDashLambdaLib.awsDashLambdaLibStrings.PostConfirmation_ConfirmForgotPassword | awsDashLambdaLib.awsDashLambdaLibStrings.TokenGeneration_HostedAuth | awsDashLambdaLib.awsDashLambdaLibStrings.TokenGeneration_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.TokenGeneration_NewPasswordChallenge | awsDashLambdaLib.awsDashLambdaLibStrings.TokenGeneration_AuthenticateDevice | awsDashLambdaLib.awsDashLambdaLibStrings.TokenGeneration_RefreshTokens | awsDashLambdaLib.awsDashLambdaLibStrings.UserMigration_Authentication | awsDashLambdaLib.awsDashLambdaLibStrings.UserMigration_ForgotPassword,
    userPoolId: java.lang.String,
    version: scala.Double,
    userName: java.lang.String = null
  ): CognitoUserPoolTriggerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callerContext")(callerContext)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("triggerSource")(triggerSource.asInstanceOf[js.Any])
    __obj.updateDynamic("userPoolId")(userPoolId)
    __obj.updateDynamic("version")(version)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[CognitoUserPoolTriggerEvent]
  }
}

