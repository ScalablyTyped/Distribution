package typings.awsLambda

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.DesiredDeliveryMediums
import typings.awsLambda.anon.Password
import typings.awsLambda.awsLambdaStrings.UserMigration_Authentication
import typings.awsLambda.awsLambdaStrings.UserMigration_ForgotPassword
import typings.awsLambda.handlerMod.Handler
import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.BaseTriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerUserMigrationMod {
  
  trait BaseUserMigrationTriggerEvent[T /* <: String */]
    extends StObject
       with BaseTriggerEvent[T] {
    
    var request: Password
    
    var response: DesiredDeliveryMediums
  }
  object BaseUserMigrationTriggerEvent {
    
    inline def apply[T /* <: String */](
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
    
    extension [Self <: BaseUserMigrationTriggerEvent[?], T /* <: String */](x: Self & BaseUserMigrationTriggerEvent[T]) {
      
      inline def setRequest(value: Password): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: DesiredDeliveryMediums): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type UserMigrationAuthenticationTriggerEvent = BaseUserMigrationTriggerEvent[UserMigration_Authentication]
  
  type UserMigrationForgotPasswordTriggerEvent = BaseUserMigrationTriggerEvent[UserMigration_ForgotPassword]
  
  type UserMigrationTriggerEvent = UserMigrationAuthenticationTriggerEvent | UserMigrationForgotPasswordTriggerEvent
  
  type UserMigrationTriggerHandler = Handler[UserMigrationTriggerEvent, Any]
  
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
    
    inline def ARCHIVED: typings.awsLambda.awsLambdaStrings.ARCHIVED = "ARCHIVED".asInstanceOf[typings.awsLambda.awsLambdaStrings.ARCHIVED]
    
    inline def COMPROMISED: typings.awsLambda.awsLambdaStrings.COMPROMISED = "COMPROMISED".asInstanceOf[typings.awsLambda.awsLambdaStrings.COMPROMISED]
    
    inline def CONFIRMED: typings.awsLambda.awsLambdaStrings.CONFIRMED = "CONFIRMED".asInstanceOf[typings.awsLambda.awsLambdaStrings.CONFIRMED]
    
    inline def FORCE_CHANGE_PASSWORD: typings.awsLambda.awsLambdaStrings.FORCE_CHANGE_PASSWORD = "FORCE_CHANGE_PASSWORD".asInstanceOf[typings.awsLambda.awsLambdaStrings.FORCE_CHANGE_PASSWORD]
    
    inline def RESET_REQUIRED: typings.awsLambda.awsLambdaStrings.RESET_REQUIRED = "RESET_REQUIRED".asInstanceOf[typings.awsLambda.awsLambdaStrings.RESET_REQUIRED]
    
    inline def UNCONFIRMED: typings.awsLambda.awsLambdaStrings.UNCONFIRMED = "UNCONFIRMED".asInstanceOf[typings.awsLambda.awsLambdaStrings.UNCONFIRMED]
    
    inline def UNKNOWN: typings.awsLambda.awsLambdaStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.awsLambda.awsLambdaStrings.UNKNOWN]
  }
}
