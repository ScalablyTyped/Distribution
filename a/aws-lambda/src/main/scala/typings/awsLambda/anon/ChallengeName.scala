package typings.awsLambda.anon

import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.CustomChallengeResult
import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChallengeName extends StObject {
  
  var challengeName: String
  
  var clientMetadata: js.UndefOr[StringMap] = js.undefined
  
  var session: js.Array[
    typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.ChallengeResult | CustomChallengeResult
  ]
  
  var userAttributes: StringMap
  
  var userNotFound: js.UndefOr[Boolean] = js.undefined
}
object ChallengeName {
  
  inline def apply(
    challengeName: String,
    session: js.Array[
      typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.ChallengeResult | CustomChallengeResult
    ],
    userAttributes: StringMap
  ): ChallengeName = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChallengeName] (val x: Self) extends AnyVal {
    
    inline def setChallengeName(value: String): Self = StObject.set(x, "challengeName", value.asInstanceOf[js.Any])
    
    inline def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    inline def setSession(
      value: js.Array[
          typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.ChallengeResult | CustomChallengeResult
        ]
    ): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionVarargs(
      value: (typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.ChallengeResult | CustomChallengeResult)*
    ): Self = StObject.set(x, "session", js.Array(value*))
    
    inline def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserNotFound(value: Boolean): Self = StObject.set(x, "userNotFound", value.asInstanceOf[js.Any])
    
    inline def setUserNotFoundUndefined: Self = StObject.set(x, "userNotFound", js.undefined)
  }
}
