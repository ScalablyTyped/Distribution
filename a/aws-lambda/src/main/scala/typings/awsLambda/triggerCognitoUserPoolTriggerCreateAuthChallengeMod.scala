package typings.awsLambda

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.ChallengeMetadata
import typings.awsLambda.anon.ChallengeName
import typings.awsLambda.awsLambdaStrings.CreateAuthChallenge_Authentication
import typings.awsLambda.handlerMod.Handler
import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.BaseTriggerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCognitoUserPoolTriggerCreateAuthChallengeMod {
  
  trait CreateAuthChallengeTriggerEvent
    extends StObject
       with BaseTriggerEvent[CreateAuthChallenge_Authentication] {
    
    var request: ChallengeName
    
    var response: ChallengeMetadata
  }
  object CreateAuthChallengeTriggerEvent {
    
    inline def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: ChallengeName,
      response: ChallengeMetadata,
      userName: String,
      userPoolId: String,
      version: String
    ): CreateAuthChallengeTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = "CreateAuthChallenge_Authentication", userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAuthChallengeTriggerEvent]
    }
    
    extension [Self <: CreateAuthChallengeTriggerEvent](x: Self) {
      
      inline def setRequest(value: ChallengeName): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: ChallengeMetadata): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type CreateAuthChallengeTriggerHandler = Handler[CreateAuthChallengeTriggerEvent, Any]
}
