package typings.awsLambda.anon

import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.CustomChallengeResult
import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.undefined
  
  var session: js.Array[
    typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.ChallengeResult | CustomChallengeResult
  ]
  
  var userAttributes: StringMap
  
  var userNotFound: js.UndefOr[Boolean] = js.undefined
}
object Session {
  
  inline def apply(
    session: js.Array[
      typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.ChallengeResult | CustomChallengeResult
    ],
    userAttributes: StringMap
  ): Session = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  extension [Self <: Session](x: Self) {
    
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
