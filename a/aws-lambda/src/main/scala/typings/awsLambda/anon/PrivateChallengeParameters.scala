package typings.awsLambda.anon

import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateChallengeParameters extends StObject {
  
  var challengeAnswer: String
  
  var clientMetadata: js.UndefOr[StringMap] = js.undefined
  
  var privateChallengeParameters: StringMap
  
  var userAttributes: StringMap
  
  var userNotFound: js.UndefOr[Boolean] = js.undefined
}
object PrivateChallengeParameters {
  
  inline def apply(challengeAnswer: String, privateChallengeParameters: StringMap, userAttributes: StringMap): PrivateChallengeParameters = {
    val __obj = js.Dynamic.literal(challengeAnswer = challengeAnswer.asInstanceOf[js.Any], privateChallengeParameters = privateChallengeParameters.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateChallengeParameters]
  }
  
  extension [Self <: PrivateChallengeParameters](x: Self) {
    
    inline def setChallengeAnswer(value: String): Self = StObject.set(x, "challengeAnswer", value.asInstanceOf[js.Any])
    
    inline def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    inline def setPrivateChallengeParameters(value: StringMap): Self = StObject.set(x, "privateChallengeParameters", value.asInstanceOf[js.Any])
    
    inline def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserNotFound(value: Boolean): Self = StObject.set(x, "userNotFound", value.asInstanceOf[js.Any])
    
    inline def setUserNotFoundUndefined: Self = StObject.set(x, "userNotFound", js.undefined)
  }
}
