package typings.awsLambda

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.UserNotFound
import typings.awsLambda.awsLambdaStrings.PreAuthentication_Authentication
import typings.awsLambda.commonMod.BaseTriggerEvent
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preAuthenticationMod {
  
  @js.native
  trait PreAuthenticationTriggerEvent extends BaseTriggerEvent[PreAuthentication_Authentication] {
    
    var request: UserNotFound = js.native
  }
  object PreAuthenticationTriggerEvent {
    
    @scala.inline
    def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: UserNotFound,
      triggerSource: PreAuthentication_Authentication,
      userName: String,
      userPoolId: String,
      version: String
    ): PreAuthenticationTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreAuthenticationTriggerEvent]
    }
    
    @scala.inline
    implicit class PreAuthenticationTriggerEventMutableBuilder[Self <: PreAuthenticationTriggerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: UserNotFound): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type PreAuthenticationTriggerHandler = Handler[PreAuthenticationTriggerEvent, js.Any]
}
