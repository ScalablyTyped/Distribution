package typings.awsLambda.anon

import typings.awsLambda.commonMod.CustomChallengeResult
import typings.awsLambda.commonMod.StringMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends js.Object {
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var session: js.Array[typings.awsLambda.commonMod.ChallengeResult | CustomChallengeResult] = js.native
  
  var userAttributes: StringMap = js.native
  
  var userNotFound: js.UndefOr[Boolean] = js.native
}
object Session {
  
  @scala.inline
  def apply(
    session: js.Array[typings.awsLambda.commonMod.ChallengeResult | CustomChallengeResult],
    userAttributes: StringMap
  ): Session = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    
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
    def setSessionVarargs(value: (typings.awsLambda.commonMod.ChallengeResult | CustomChallengeResult)*): Self = this.set("session", js.Array(value :_*))
    
    @scala.inline
    def setSession(value: js.Array[typings.awsLambda.commonMod.ChallengeResult | CustomChallengeResult]): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = this.set("clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientMetadata: Self = this.set("clientMetadata", js.undefined)
    
    @scala.inline
    def setUserNotFound(value: Boolean): Self = this.set("userNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserNotFound: Self = this.set("userNotFound", js.undefined)
  }
}
