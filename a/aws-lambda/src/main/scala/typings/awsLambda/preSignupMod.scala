package typings.awsLambda

import typings.awsLambda.anon.AutoConfirmUser
import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.ValidationData
import typings.awsLambda.awsLambdaStrings.PreSignUp_AdminCreateUser
import typings.awsLambda.awsLambdaStrings.PreSignUp_ExternalProvider
import typings.awsLambda.awsLambdaStrings.PreSignUp_SignUp
import typings.awsLambda.commonMod.BaseTriggerEvent
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preSignupMod {
  
  @js.native
  trait BasePreSignUpTriggerEvent[T /* <: String */] extends BaseTriggerEvent[T] {
    
    var request: ValidationData = js.native
    
    var response: AutoConfirmUser = js.native
  }
  object BasePreSignUpTriggerEvent {
    
    @scala.inline
    def apply[T /* <: String */](
      callerContext: AwsSdkVersion,
      region: String,
      request: ValidationData,
      response: AutoConfirmUser,
      triggerSource: T,
      userName: String,
      userPoolId: String,
      version: String
    ): BasePreSignUpTriggerEvent[T] = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePreSignUpTriggerEvent[T]]
    }
    
    @scala.inline
    implicit class BasePreSignUpTriggerEventMutableBuilder[Self <: BasePreSignUpTriggerEvent[_], T /* <: String */] (val x: Self with BasePreSignUpTriggerEvent[T]) extends AnyVal {
      
      @scala.inline
      def setRequest(value: ValidationData): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: AutoConfirmUser): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type PreSignUpAdminCreateUserTriggerEvent = BasePreSignUpTriggerEvent[PreSignUp_AdminCreateUser]
  
  type PreSignUpEmailTriggerEvent = BasePreSignUpTriggerEvent[PreSignUp_SignUp]
  
  type PreSignUpExternalProviderTriggerEvent = BasePreSignUpTriggerEvent[PreSignUp_ExternalProvider]
  
  type PreSignUpTriggerEvent = PreSignUpEmailTriggerEvent | PreSignUpExternalProviderTriggerEvent | PreSignUpAdminCreateUserTriggerEvent
  
  type PreSignUpTriggerHandler = Handler[PreSignUpTriggerEvent, js.Any]
}
