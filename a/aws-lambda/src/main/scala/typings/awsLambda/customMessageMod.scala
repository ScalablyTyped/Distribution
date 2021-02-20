package typings.awsLambda

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.ClientMetadata
import typings.awsLambda.anon.EmailMessage
import typings.awsLambda.awsLambdaStrings.CustomMessage_AdminCreateUser
import typings.awsLambda.awsLambdaStrings.CustomMessage_Authentication
import typings.awsLambda.awsLambdaStrings.CustomMessage_ForgotPassword
import typings.awsLambda.awsLambdaStrings.CustomMessage_ResendCode
import typings.awsLambda.awsLambdaStrings.CustomMessage_SignUp
import typings.awsLambda.awsLambdaStrings.CustomMessage_UpdateUserAttribute
import typings.awsLambda.awsLambdaStrings.CustomMessage_VerifyUserAttribute
import typings.awsLambda.commonMod.BaseTriggerEvent
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customMessageMod {
  
  @js.native
  trait BaseCustomMessageTriggerEvent[T /* <: String */] extends BaseTriggerEvent[T] {
    
    var request: ClientMetadata = js.native
    
    var response: EmailMessage = js.native
  }
  object BaseCustomMessageTriggerEvent {
    
    @scala.inline
    def apply[T /* <: String */](
      callerContext: AwsSdkVersion,
      region: String,
      request: ClientMetadata,
      response: EmailMessage,
      triggerSource: T,
      userName: String,
      userPoolId: String,
      version: String
    ): BaseCustomMessageTriggerEvent[T] = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseCustomMessageTriggerEvent[T]]
    }
    
    @scala.inline
    implicit class BaseCustomMessageTriggerEventMutableBuilder[Self <: BaseCustomMessageTriggerEvent[_], T /* <: String */] (val x: Self with BaseCustomMessageTriggerEvent[T]) extends AnyVal {
      
      @scala.inline
      def setRequest(value: ClientMetadata): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: EmailMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomMessageAdminCreateUserTriggerEvent = BaseCustomMessageTriggerEvent[CustomMessage_AdminCreateUser]
  
  type CustomMessageAuthenticationTriggerEvent = BaseCustomMessageTriggerEvent[CustomMessage_Authentication]
  
  type CustomMessageForgotPasswordTriggerEvent = BaseCustomMessageTriggerEvent[CustomMessage_ForgotPassword]
  
  type CustomMessageResendCodeTriggerEvent = BaseCustomMessageTriggerEvent[CustomMessage_ResendCode]
  
  type CustomMessageSignUpTriggerEvent = BaseCustomMessageTriggerEvent[CustomMessage_SignUp]
  
  type CustomMessageTriggerEvent = CustomMessageSignUpTriggerEvent | CustomMessageAdminCreateUserTriggerEvent | CustomMessageResendCodeTriggerEvent | CustomMessageForgotPasswordTriggerEvent | CustomMessageUpdateUserAttributeTriggerEvent | CustomMessageVerifyUserAttributeTriggerEvent | CustomMessageAuthenticationTriggerEvent
  
  type CustomMessageTriggerHandler = Handler[CustomMessageTriggerEvent, js.Any]
  
  type CustomMessageUpdateUserAttributeTriggerEvent = BaseCustomMessageTriggerEvent[CustomMessage_UpdateUserAttribute]
  
  type CustomMessageVerifyUserAttributeTriggerEvent = BaseCustomMessageTriggerEvent[CustomMessage_VerifyUserAttribute]
}
