package typings.awsLambda

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.NewDeviceUsed
import typings.awsLambda.awsLambdaStrings.PostAuthentication_Authentication
import typings.awsLambda.handlerMod.Handler
import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.BaseTriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerPostAuthenticationMod {
  
  trait PostAuthenticationTriggerEvent
    extends StObject
       with BaseTriggerEvent[PostAuthentication_Authentication] {
    
    var request: NewDeviceUsed
  }
  object PostAuthenticationTriggerEvent {
    
    inline def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: NewDeviceUsed,
      userName: String,
      userPoolId: String,
      version: String
    ): PostAuthenticationTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], triggerSource = "PostAuthentication_Authentication", userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostAuthenticationTriggerEvent]
    }
    
    extension [Self <: PostAuthenticationTriggerEvent](x: Self) {
      
      inline def setRequest(value: NewDeviceUsed): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type PostAuthenticationTriggerHandler = Handler[PostAuthenticationTriggerEvent, Any]
}
