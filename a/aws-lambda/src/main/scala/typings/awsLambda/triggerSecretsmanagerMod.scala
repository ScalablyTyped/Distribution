package typings.awsLambda

import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerSecretsmanagerMod {
  
  trait SecretsManagerRotationEvent extends StObject {
    
    var ClientRequestToken: String
    
    var SecretId: String
    
    var Step: SecretsManagerRotationEventStep
  }
  object SecretsManagerRotationEvent {
    
    inline def apply(ClientRequestToken: String, SecretId: String, Step: SecretsManagerRotationEventStep): SecretsManagerRotationEvent = {
      val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], SecretId = SecretId.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretsManagerRotationEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SecretsManagerRotationEvent] (val x: Self) extends AnyVal {
      
      inline def setClientRequestToken(value: String): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
      
      inline def setSecretId(value: String): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
      
      inline def setStep(value: SecretsManagerRotationEventStep): Self = StObject.set(x, "Step", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.createSecret
    - typings.awsLambda.awsLambdaStrings.setSecret
    - typings.awsLambda.awsLambdaStrings.testSecret
    - typings.awsLambda.awsLambdaStrings.finishSecret
  */
  trait SecretsManagerRotationEventStep extends StObject
  object SecretsManagerRotationEventStep {
    
    inline def createSecret: typings.awsLambda.awsLambdaStrings.createSecret = "createSecret".asInstanceOf[typings.awsLambda.awsLambdaStrings.createSecret]
    
    inline def finishSecret: typings.awsLambda.awsLambdaStrings.finishSecret = "finishSecret".asInstanceOf[typings.awsLambda.awsLambdaStrings.finishSecret]
    
    inline def setSecret: typings.awsLambda.awsLambdaStrings.setSecret = "setSecret".asInstanceOf[typings.awsLambda.awsLambdaStrings.setSecret]
    
    inline def testSecret: typings.awsLambda.awsLambdaStrings.testSecret = "testSecret".asInstanceOf[typings.awsLambda.awsLambdaStrings.testSecret]
  }
  
  type SecretsManagerRotationHandler = Handler[SecretsManagerRotationEvent, Unit]
}
