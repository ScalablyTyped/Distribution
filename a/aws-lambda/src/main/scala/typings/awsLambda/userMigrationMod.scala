package typings.awsLambda

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.DesiredDeliveryMediums
import typings.awsLambda.anon.Password
import typings.awsLambda.awsLambdaStrings.UserMigration_Authentication
import typings.awsLambda.awsLambdaStrings.UserMigration_ForgotPassword
import typings.awsLambda.commonMod.BaseTriggerEvent
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMigrationMod {
  
  trait BaseUserMigrationTriggerEvent[T /* <: String */]
    extends StObject
       with BaseTriggerEvent[T] {
    
    var request: Password
    
    var response: DesiredDeliveryMediums
  }
  object BaseUserMigrationTriggerEvent {
    
    @scala.inline
    def apply[T /* <: String */](
      callerContext: AwsSdkVersion,
      region: String,
      request: Password,
      response: DesiredDeliveryMediums,
      triggerSource: T,
      userName: String,
      userPoolId: String,
      version: String
    ): BaseUserMigrationTriggerEvent[T] = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUserMigrationTriggerEvent[T]]
    }
    
    @scala.inline
    implicit class BaseUserMigrationTriggerEventMutableBuilder[Self <: BaseUserMigrationTriggerEvent[?], T /* <: String */] (val x: Self & BaseUserMigrationTriggerEvent[T]) extends AnyVal {
      
      @scala.inline
      def setRequest(value: Password): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: DesiredDeliveryMediums): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type UserMigrationAuthenticationTriggerEvent = BaseUserMigrationTriggerEvent[UserMigration_Authentication]
  
  type UserMigrationForgotPasswordTriggerEvent = BaseUserMigrationTriggerEvent[UserMigration_ForgotPassword]
  
  type UserMigrationTriggerEvent = UserMigrationAuthenticationTriggerEvent | UserMigrationForgotPasswordTriggerEvent
  
  type UserMigrationTriggerHandler = Handler[UserMigrationTriggerEvent, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.UNCONFIRMED
    - typings.awsLambda.awsLambdaStrings.CONFIRMED
    - typings.awsLambda.awsLambdaStrings.ARCHIVED
    - typings.awsLambda.awsLambdaStrings.COMPROMISED
    - typings.awsLambda.awsLambdaStrings.UNKNOWN
    - typings.awsLambda.awsLambdaStrings.RESET_REQUIRED
    - typings.awsLambda.awsLambdaStrings.FORCE_CHANGE_PASSWORD
  */
  trait UserStatus extends StObject
  object UserStatus {
    
    @scala.inline
    def ARCHIVED: typings.awsLambda.awsLambdaStrings.ARCHIVED = "ARCHIVED".asInstanceOf[typings.awsLambda.awsLambdaStrings.ARCHIVED]
    
    @scala.inline
    def COMPROMISED: typings.awsLambda.awsLambdaStrings.COMPROMISED = "COMPROMISED".asInstanceOf[typings.awsLambda.awsLambdaStrings.COMPROMISED]
    
    @scala.inline
    def CONFIRMED: typings.awsLambda.awsLambdaStrings.CONFIRMED = "CONFIRMED".asInstanceOf[typings.awsLambda.awsLambdaStrings.CONFIRMED]
    
    @scala.inline
    def FORCE_CHANGE_PASSWORD: typings.awsLambda.awsLambdaStrings.FORCE_CHANGE_PASSWORD = "FORCE_CHANGE_PASSWORD".asInstanceOf[typings.awsLambda.awsLambdaStrings.FORCE_CHANGE_PASSWORD]
    
    @scala.inline
    def RESET_REQUIRED: typings.awsLambda.awsLambdaStrings.RESET_REQUIRED = "RESET_REQUIRED".asInstanceOf[typings.awsLambda.awsLambdaStrings.RESET_REQUIRED]
    
    @scala.inline
    def UNCONFIRMED: typings.awsLambda.awsLambdaStrings.UNCONFIRMED = "UNCONFIRMED".asInstanceOf[typings.awsLambda.awsLambdaStrings.UNCONFIRMED]
    
    @scala.inline
    def UNKNOWN: typings.awsLambda.awsLambdaStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.awsLambda.awsLambdaStrings.UNKNOWN]
  }
}
