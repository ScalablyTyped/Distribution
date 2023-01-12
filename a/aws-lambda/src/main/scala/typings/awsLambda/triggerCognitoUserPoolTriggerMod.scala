package typings.awsLambda

import typings.awsLambda.anon.AnswerCorrect
import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.ChallengeAnswer
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
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerMod {
  
  type CognitoUserPoolEvent = CognitoUserPoolTriggerEvent
  
  trait CognitoUserPoolTriggerEvent extends StObject {
    
    var callerContext: AwsSdkVersion
    
    var region: String
    
    var request: ChallengeAnswer
    
    var response: AnswerCorrect
    
    var triggerSource: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword
    
    var userName: js.UndefOr[String] = js.undefined
    
    var userPoolId: String
    
    var version: Double
  }
  object CognitoUserPoolTriggerEvent {
    
    inline def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: ChallengeAnswer,
      response: AnswerCorrect,
      triggerSource: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword,
      userPoolId: String,
      version: Double
    ): CognitoUserPoolTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoUserPoolTriggerEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CognitoUserPoolTriggerEvent] (val x: Self) extends AnyVal {
      
      inline def setCallerContext(value: AwsSdkVersion): Self = StObject.set(x, "callerContext", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: ChallengeAnswer): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: AnswerCorrect): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setTriggerSource(
        value: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword
      ): Self = StObject.set(x, "triggerSource", value.asInstanceOf[js.Any])
      
      inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
      
      inline def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type CognitoUserPoolTriggerHandler = Handler[CognitoUserPoolTriggerEvent, Any]
}
