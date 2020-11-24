package typings.awsLambda.commonMod

import typings.awsLambda.awsLambdaStrings.CUSTOM_CHALLENGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomChallengeResult extends js.Object {
  
  var challengeMetadata: js.UndefOr[String] = js.native
  
  var challengeName: CUSTOM_CHALLENGE = js.native
  
  var challengeResult: Boolean = js.native
}
object CustomChallengeResult {
  
  @scala.inline
  def apply(challengeName: CUSTOM_CHALLENGE, challengeResult: Boolean): CustomChallengeResult = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], challengeResult = challengeResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomChallengeResult]
  }
  
  @scala.inline
  implicit class CustomChallengeResultOps[Self <: CustomChallengeResult] (val x: Self) extends AnyVal {
    
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
    def setChallengeName(value: CUSTOM_CHALLENGE): Self = this.set("challengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeResult(value: Boolean): Self = this.set("challengeResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeMetadata(value: String): Self = this.set("challengeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengeMetadata: Self = this.set("challengeMetadata", js.undefined)
  }
}
