package typings.awsLambda

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.ChallengeMetadata
import typings.awsLambda.anon.ChallengeName
import typings.awsLambda.awsLambdaStrings.CreateAuthChallenge_Authentication
import typings.awsLambda.commonMod.BaseTriggerEvent
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createAuthChallengeMod {
  
  @js.native
  trait CreateAuthChallengeTriggerEvent extends BaseTriggerEvent[CreateAuthChallenge_Authentication] {
    
    var request: ChallengeName = js.native
    
    var response: ChallengeMetadata = js.native
  }
  object CreateAuthChallengeTriggerEvent {
    
    @scala.inline
    def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: ChallengeName,
      response: ChallengeMetadata,
      triggerSource: CreateAuthChallenge_Authentication,
      userName: String,
      userPoolId: String,
      version: String
    ): CreateAuthChallengeTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAuthChallengeTriggerEvent]
    }
    
    @scala.inline
    implicit class CreateAuthChallengeTriggerEventMutableBuilder[Self <: CreateAuthChallengeTriggerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: ChallengeName): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: ChallengeMetadata): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type CreateAuthChallengeTriggerHandler = Handler[CreateAuthChallengeTriggerEvent, js.Any]
}
