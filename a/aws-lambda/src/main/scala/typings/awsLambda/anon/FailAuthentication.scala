package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailAuthentication extends js.Object {
  
  var challengeName: String = js.native
  
  var failAuthentication: Boolean = js.native
  
  var issueTokens: Boolean = js.native
}
object FailAuthentication {
  
  @scala.inline
  def apply(challengeName: String, failAuthentication: Boolean, issueTokens: Boolean): FailAuthentication = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], failAuthentication = failAuthentication.asInstanceOf[js.Any], issueTokens = issueTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailAuthentication]
  }
  
  @scala.inline
  implicit class FailAuthenticationOps[Self <: FailAuthentication] (val x: Self) extends AnyVal {
    
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
    def setChallengeName(value: String): Self = this.set("challengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailAuthentication(value: Boolean): Self = this.set("failAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueTokens(value: Boolean): Self = this.set("issueTokens", value.asInstanceOf[js.Any])
  }
}
