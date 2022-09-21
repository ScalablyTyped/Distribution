package typings.awsLambda

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.ClientMetadata
import typings.awsLambda.awsLambdaStrings.CustomSMSSender_AdminCreateUser
import typings.awsLambda.awsLambdaStrings.CustomSMSSender_Authentication
import typings.awsLambda.awsLambdaStrings.CustomSMSSender_ForgotPassword
import typings.awsLambda.awsLambdaStrings.CustomSMSSender_ResendCode
import typings.awsLambda.awsLambdaStrings.CustomSMSSender_SignUp
import typings.awsLambda.awsLambdaStrings.CustomSMSSender_UpdateUserAttribute
import typings.awsLambda.awsLambdaStrings.CustomSMSSender_VerifyUserAttribute
import typings.awsLambda.commonMod.BaseTriggerEvent
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customSmsSenderMod {
  
  trait BaseCustomSMSSenderTriggerEvent[T /* <: String */]
    extends StObject
       with BaseTriggerEvent[T] {
    
    var request: ClientMetadata
  }
  object BaseCustomSMSSenderTriggerEvent {
    
    inline def apply[T /* <: String */](
      callerContext: AwsSdkVersion,
      region: String,
      request: ClientMetadata,
      triggerSource: T,
      userName: String,
      userPoolId: String,
      version: String
    ): BaseCustomSMSSenderTriggerEvent[T] = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseCustomSMSSenderTriggerEvent[T]]
    }
    
    extension [Self <: BaseCustomSMSSenderTriggerEvent[?], T /* <: String */](x: Self & BaseCustomSMSSenderTriggerEvent[T]) {
      
      inline def setRequest(value: ClientMetadata): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomSMSSenderAdminCreateUserTriggerEvent = BaseCustomSMSSenderTriggerEvent[CustomSMSSender_AdminCreateUser]
  
  type CustomSMSSenderAuthenticationUserTriggerEvent = BaseCustomSMSSenderTriggerEvent[CustomSMSSender_Authentication]
  
  type CustomSMSSenderForgotPasswordTriggerEvent = BaseCustomSMSSenderTriggerEvent[CustomSMSSender_ForgotPassword]
  
  type CustomSMSSenderResendCodeTriggerEvent = BaseCustomSMSSenderTriggerEvent[CustomSMSSender_ResendCode]
  
  type CustomSMSSenderSignUpTriggerEvent = BaseCustomSMSSenderTriggerEvent[CustomSMSSender_SignUp]
  
  type CustomSMSSenderTriggerEvent = CustomSMSSenderSignUpTriggerEvent | CustomSMSSenderResendCodeTriggerEvent | CustomSMSSenderForgotPasswordTriggerEvent | CustomSMSSenderUpdateUserAttributeTriggerEvent | CustomSMSSenderVerifyUserAttributeTriggerEvent | CustomSMSSenderAdminCreateUserTriggerEvent | CustomSMSSenderAuthenticationUserTriggerEvent
  
  type CustomSMSSenderTriggerHandler = Handler[CustomSMSSenderTriggerEvent, Any]
  
  type CustomSMSSenderUpdateUserAttributeTriggerEvent = BaseCustomSMSSenderTriggerEvent[CustomSMSSender_UpdateUserAttribute]
  
  type CustomSMSSenderVerifyUserAttributeTriggerEvent = BaseCustomSMSSenderTriggerEvent[CustomSMSSender_VerifyUserAttribute]
}
