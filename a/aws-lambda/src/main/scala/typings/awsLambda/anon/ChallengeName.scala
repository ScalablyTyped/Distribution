package typings.awsLambda.anon

import typings.awsLambda.commonMod.CustomChallengeResult
import typings.awsLambda.commonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChallengeName extends StObject {
  
  var challengeName: String = js.native
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var session: js.Array[typings.awsLambda.commonMod.ChallengeResult | CustomChallengeResult] = js.native
  
  var userAttributes: StringMap = js.native
  
  var userNotFound: js.UndefOr[Boolean] = js.native
}
object ChallengeName {
  
  @scala.inline
  def apply(
    challengeName: String,
    session: js.Array[typings.awsLambda.commonMod.ChallengeResult | CustomChallengeResult],
    userAttributes: StringMap
  ): ChallengeName = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeName]
  }
  
  @scala.inline
  implicit class ChallengeNameMutableBuilder[Self <: ChallengeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallengeName(value: String): Self = StObject.set(x, "challengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    @scala.inline
    def setSession(value: js.Array[typings.awsLambda.commonMod.ChallengeResult | CustomChallengeResult]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionVarargs(value: (typings.awsLambda.commonMod.ChallengeResult | CustomChallengeResult)*): Self = StObject.set(x, "session", js.Array(value :_*))
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNotFound(value: Boolean): Self = StObject.set(x, "userNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNotFoundUndefined: Self = StObject.set(x, "userNotFound", js.undefined)
  }
}
