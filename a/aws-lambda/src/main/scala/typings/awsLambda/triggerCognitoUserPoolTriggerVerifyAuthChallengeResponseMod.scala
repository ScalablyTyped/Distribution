package typings.awsLambda

import typings.awsLambda.anon.AnswerCorrectBoolean
import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.PrivateChallengeParameters
import typings.awsLambda.awsLambdaStrings.VerifyAuthChallengeResponse_Authentication
import typings.awsLambda.handlerMod.Handler
import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.BaseTriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerVerifyAuthChallengeResponseMod {
  
  trait VerifyAuthChallengeResponseTriggerEvent
    extends StObject
       with BaseTriggerEvent[VerifyAuthChallengeResponse_Authentication] {
    
    var request: PrivateChallengeParameters
    
    var response: AnswerCorrectBoolean
  }
  object VerifyAuthChallengeResponseTriggerEvent {
    
    inline def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: PrivateChallengeParameters,
      response: AnswerCorrectBoolean,
      userName: String,
      userPoolId: String,
      version: String
    ): VerifyAuthChallengeResponseTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = "VerifyAuthChallengeResponse_Authentication", userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyAuthChallengeResponseTriggerEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerifyAuthChallengeResponseTriggerEvent] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: PrivateChallengeParameters): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: AnswerCorrectBoolean): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyAuthChallengeResponseTriggerHandler = Handler[VerifyAuthChallengeResponseTriggerEvent, Any]
}
