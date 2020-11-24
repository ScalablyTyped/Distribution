package typings.awsLambda.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChallengeResult extends js.Object {
  
  var challengeMetadata: js.UndefOr[scala.Nothing] = js.native
  
  var challengeName: ChallengeName = js.native
  
  var challengeResult: Boolean = js.native
}
object ChallengeResult {
  
  @scala.inline
  def apply(challengeName: ChallengeName, challengeResult: Boolean): ChallengeResult = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], challengeResult = challengeResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeResult]
  }
  
  @scala.inline
  implicit class ChallengeResultOps[Self <: ChallengeResult] (val x: Self) extends AnyVal {
    
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
    def setChallengeName(value: ChallengeName): Self = this.set("challengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeResult(value: Boolean): Self = this.set("challengeResult", value.asInstanceOf[js.Any])
  }
}
