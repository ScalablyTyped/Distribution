package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChallengeMetadata extends js.Object {
  
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
  implicit class ChallengeMetadataOps[Self <: ChallengeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChallengeMetadata(value: String): Self = this.set("challengeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateChallengeParameters(value: StringMap): Self = this.set("privateChallengeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicChallengeParameters(value: StringMap): Self = this.set("publicChallengeParameters", value.asInstanceOf[js.Any])
  }
}
