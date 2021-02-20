package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChallengeMetadata extends StObject {
  
  var challengeMetadata: String = js.native
  
  var privateChallengeParameters: StringMap = js.native
  
  var publicChallengeParameters: StringMap = js.native
}
object ChallengeMetadata {
  
  @scala.inline
  def apply(
    challengeMetadata: String,
    privateChallengeParameters: StringMap,
    publicChallengeParameters: StringMap
  ): ChallengeMetadata = {
    val __obj = js.Dynamic.literal(challengeMetadata = challengeMetadata.asInstanceOf[js.Any], privateChallengeParameters = privateChallengeParameters.asInstanceOf[js.Any], publicChallengeParameters = publicChallengeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeMetadata]
  }
  
  @scala.inline
  implicit class ChallengeMetadataMutableBuilder[Self <: ChallengeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallengeMetadata(value: String): Self = StObject.set(x, "challengeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateChallengeParameters(value: StringMap): Self = StObject.set(x, "privateChallengeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicChallengeParameters(value: StringMap): Self = StObject.set(x, "publicChallengeParameters", value.asInstanceOf[js.Any])
  }
}
