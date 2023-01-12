package typings.awsLambda

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.UserNotFound
import typings.awsLambda.awsLambdaStrings.PreAuthentication_Authentication
import typings.awsLambda.handlerMod.Handler
import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.BaseTriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerPreAuthenticationMod {
  
  trait PreAuthenticationTriggerEvent
    extends StObject
       with BaseTriggerEvent[PreAuthentication_Authentication] {
    
    var request: UserNotFound
  }
  object PreAuthenticationTriggerEvent {
    
    inline def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: UserNotFound,
      userName: String,
      userPoolId: String,
      version: String
    ): PreAuthenticationTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], triggerSource = "PreAuthentication_Authentication", userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreAuthenticationTriggerEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreAuthenticationTriggerEvent] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: UserNotFound): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type PreAuthenticationTriggerHandler = Handler[PreAuthenticationTriggerEvent, Any]
}
