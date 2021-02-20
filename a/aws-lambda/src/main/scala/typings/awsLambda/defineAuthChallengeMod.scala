package typings.awsLambda

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.FailAuthentication
import typings.awsLambda.anon.Session
import typings.awsLambda.awsLambdaStrings.DefineAuthChallenge_Authentication
import typings.awsLambda.commonMod.BaseTriggerEvent
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defineAuthChallengeMod {
  
  @js.native
  trait DefineAuthChallengeTriggerEvent extends BaseTriggerEvent[DefineAuthChallenge_Authentication] {
    
    var request: Session = js.native
    
    var response: FailAuthentication = js.native
  }
  object DefineAuthChallengeTriggerEvent {
    
    @scala.inline
    def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: Session,
      response: FailAuthentication,
      triggerSource: DefineAuthChallenge_Authentication,
      userName: String,
      userPoolId: String,
      version: String
    ): DefineAuthChallengeTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefineAuthChallengeTriggerEvent]
    }
    
    @scala.inline
    implicit class DefineAuthChallengeTriggerEventMutableBuilder[Self <: DefineAuthChallengeTriggerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: Session): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: FailAuthentication): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type DefineAuthChallengeTriggerHandler = Handler[DefineAuthChallengeTriggerEvent, js.Any]
}
