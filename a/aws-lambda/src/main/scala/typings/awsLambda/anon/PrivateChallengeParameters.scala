package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
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
  
  @scala.inline
  def apply(challengeAnswer: String, privateChallengeParameters: StringMap, userAttributes: StringMap): PrivateChallengeParameters = {
    val __obj = js.Dynamic.literal(challengeAnswer = challengeAnswer.asInstanceOf[js.Any], privateChallengeParameters = privateChallengeParameters.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateChallengeParameters]
  }
  
  @scala.inline
  implicit class PrivateChallengeParametersMutableBuilder[Self <: PrivateChallengeParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallengeAnswer(value: String): Self = StObject.set(x, "challengeAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    @scala.inline
    def setPrivateChallengeParameters(value: StringMap): Self = StObject.set(x, "privateChallengeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNotFound(value: Boolean): Self = StObject.set(x, "userNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNotFoundUndefined: Self = StObject.set(x, "userNotFound", js.undefined)
  }
}
