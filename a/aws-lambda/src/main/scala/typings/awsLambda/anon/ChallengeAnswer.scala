package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChallengeAnswer extends StObject {
  
  var challengeAnswer: js.UndefOr[String] = js.undefined
  
  var challengeName: js.UndefOr[String] = js.undefined
  
  var clientMetadata: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var codeParameter: js.UndefOr[String] = js.undefined
  
  var linkParameter: js.UndefOr[String] = js.undefined
  
  var newDeviceUsed: js.UndefOr[Boolean] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var privateChallengeParameters: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var session: js.UndefOr[js.Array[ChallengeResult]] = js.undefined
  
  var userAttributes: StringDictionary[String]
  
  var userNotFound: js.UndefOr[Boolean] = js.undefined
  
  var usernameParameter: js.UndefOr[String] = js.undefined
  
  var validationData: js.UndefOr[StringDictionary[String]] = js.undefined
}
object ChallengeAnswer {
  
  inline def apply(userAttributes: StringDictionary[String]): ChallengeAnswer = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeAnswer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChallengeAnswer] (val x: Self) extends AnyVal {
    
    inline def setChallengeAnswer(value: String): Self = StObject.set(x, "challengeAnswer", value.asInstanceOf[js.Any])
    
    inline def setChallengeAnswerUndefined: Self = StObject.set(x, "challengeAnswer", js.undefined)
    
    inline def setChallengeName(value: String): Self = StObject.set(x, "challengeName", value.asInstanceOf[js.Any])
    
    inline def setChallengeNameUndefined: Self = StObject.set(x, "challengeName", js.undefined)
    
    inline def setClientMetadata(value: StringDictionary[String]): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    inline def setCodeParameter(value: String): Self = StObject.set(x, "codeParameter", value.asInstanceOf[js.Any])
    
    inline def setCodeParameterUndefined: Self = StObject.set(x, "codeParameter", js.undefined)
    
    inline def setLinkParameter(value: String): Self = StObject.set(x, "linkParameter", value.asInstanceOf[js.Any])
    
    inline def setLinkParameterUndefined: Self = StObject.set(x, "linkParameter", js.undefined)
    
    inline def setNewDeviceUsed(value: Boolean): Self = StObject.set(x, "newDeviceUsed", value.asInstanceOf[js.Any])
    
    inline def setNewDeviceUsedUndefined: Self = StObject.set(x, "newDeviceUsed", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPrivateChallengeParameters(value: StringDictionary[String]): Self = StObject.set(x, "privateChallengeParameters", value.asInstanceOf[js.Any])
    
    inline def setPrivateChallengeParametersUndefined: Self = StObject.set(x, "privateChallengeParameters", js.undefined)
    
    inline def setSession(value: js.Array[ChallengeResult]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSessionVarargs(value: ChallengeResult*): Self = StObject.set(x, "session", js.Array(value*))
    
    inline def setUserAttributes(value: StringDictionary[String]): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserNotFound(value: Boolean): Self = StObject.set(x, "userNotFound", value.asInstanceOf[js.Any])
    
    inline def setUserNotFoundUndefined: Self = StObject.set(x, "userNotFound", js.undefined)
    
    inline def setUsernameParameter(value: String): Self = StObject.set(x, "usernameParameter", value.asInstanceOf[js.Any])
    
    inline def setUsernameParameterUndefined: Self = StObject.set(x, "usernameParameter", js.undefined)
    
    inline def setValidationData(value: StringDictionary[String]): Self = StObject.set(x, "validationData", value.asInstanceOf[js.Any])
    
    inline def setValidationDataUndefined: Self = StObject.set(x, "validationData", js.undefined)
  }
}
