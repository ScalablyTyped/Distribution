package typings.awsLambda.mod

import typings.awsLambda.AnonAnswerCorrect
import typings.awsLambda.AnonAwsSdkVersion
import typings.awsLambda.AnonChallengeAnswer
import typings.awsLambda.awsLambdaStrings.CreateAuthChallenge_Authentication
import typings.awsLambda.awsLambdaStrings.CustomMessage_AdminCreateUser
import typings.awsLambda.awsLambdaStrings.CustomMessage_Authentication
import typings.awsLambda.awsLambdaStrings.CustomMessage_ForgotPassword
import typings.awsLambda.awsLambdaStrings.CustomMessage_ResendCode
import typings.awsLambda.awsLambdaStrings.CustomMessage_SignUp
import typings.awsLambda.awsLambdaStrings.CustomMessage_UpdateUserAttribute
import typings.awsLambda.awsLambdaStrings.CustomMessage_VerifyUserAttribute
import typings.awsLambda.awsLambdaStrings.DefineAuthChallenge_Authentication
import typings.awsLambda.awsLambdaStrings.PostAuthentication_Authentication
import typings.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmForgotPassword
import typings.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmSignUp
import typings.awsLambda.awsLambdaStrings.PreAuthentication_Authentication
import typings.awsLambda.awsLambdaStrings.PreSignUp_AdminCreateUser
import typings.awsLambda.awsLambdaStrings.PreSignUp_ExternalProvider
import typings.awsLambda.awsLambdaStrings.PreSignUp_SignUp
import typings.awsLambda.awsLambdaStrings.TokenGeneration_AuthenticateDevice
import typings.awsLambda.awsLambdaStrings.TokenGeneration_Authentication
import typings.awsLambda.awsLambdaStrings.TokenGeneration_HostedAuth
import typings.awsLambda.awsLambdaStrings.TokenGeneration_NewPasswordChallenge
import typings.awsLambda.awsLambdaStrings.TokenGeneration_RefreshTokens
import typings.awsLambda.awsLambdaStrings.UserMigration_Authentication
import typings.awsLambda.awsLambdaStrings.UserMigration_ForgotPassword
import typings.awsLambda.awsLambdaStrings.VerifyAuthChallengeResponse_Authentication
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoUserPoolTriggerEvent extends js.Object {
  var callerContext: AnonAwsSdkVersion
  var region: String
  var request: AnonChallengeAnswer
  var response: AnonAnswerCorrect
  var triggerSource: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword
  var userName: js.UndefOr[String] = js.undefined
  var userPoolId: String
  var version: Double
}

object CognitoUserPoolTriggerEvent {
  @scala.inline
  def apply(
    callerContext: AnonAwsSdkVersion,
    region: String,
    request: AnonChallengeAnswer,
    response: AnonAnswerCorrect,
    triggerSource: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword,
    userPoolId: String,
    version: Double,
    userName: String = null
  ): CognitoUserPoolTriggerEvent = {
    val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoUserPoolTriggerEvent]
  }
}

