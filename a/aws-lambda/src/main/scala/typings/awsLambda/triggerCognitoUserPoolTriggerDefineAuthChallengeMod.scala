package typings.awsLambda

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.FailAuthentication
import typings.awsLambda.anon.Session
import typings.awsLambda.awsLambdaStrings.DefineAuthChallenge_Authentication
import typings.awsLambda.handlerMod.Handler
import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.BaseTriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerDefineAuthChallengeMod {
  
  trait DefineAuthChallengeTriggerEvent
    extends StObject
       with BaseTriggerEvent[DefineAuthChallenge_Authentication] {
    
    var request: Session
    
    var response: FailAuthentication
  }
  object DefineAuthChallengeTriggerEvent {
    
    inline def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: Session,
      response: FailAuthentication,
      userName: String,
      userPoolId: String,
      version: String
    ): DefineAuthChallengeTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = "DefineAuthChallenge_Authentication", userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefineAuthChallengeTriggerEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefineAuthChallengeTriggerEvent] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: Session): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: FailAuthentication): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type DefineAuthChallengeTriggerHandler = Handler[DefineAuthChallengeTriggerEvent, Any]
}
