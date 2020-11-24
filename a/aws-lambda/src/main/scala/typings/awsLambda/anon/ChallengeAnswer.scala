package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChallengeAnswer extends js.Object {
  
  var challengeAnswer: js.UndefOr[String] = js.native
  
  var challengeName: js.UndefOr[String] = js.native
  
  var clientMetadata: js.UndefOr[StringDictionary[String]] = js.native
  
  var codeParameter: js.UndefOr[String] = js.native
  
  var linkParameter: js.UndefOr[String] = js.native
  
  var newDeviceUsed: js.UndefOr[Boolean] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var privateChallengeParameters: js.UndefOr[StringDictionary[String]] = js.native
  
  var session: js.UndefOr[js.Array[ChallengeResult]] = js.native
  
  var userAttributes: StringDictionary[String] = js.native
  
  var userNotFound: js.UndefOr[Boolean] = js.native
  
  var usernameParameter: js.UndefOr[String] = js.native
  
  var validationData: js.UndefOr[StringDictionary[String]] = js.native
}
object ChallengeAnswer {
  
  @scala.inline
  def apply(userAttributes: StringDictionary[String]): ChallengeAnswer = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeAnswer]
  }
  
  @scala.inline
  implicit class ChallengeAnswerOps[Self <: ChallengeAnswer] (val x: Self) extends AnyVal {
    
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
    def setUserAttributes(value: StringDictionary[String]): Self = this.set("userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeAnswer(value: String): Self = this.set("challengeAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengeAnswer: Self = this.set("challengeAnswer", js.undefined)
    
    @scala.inline
    def setChallengeName(value: String): Self = this.set("challengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengeName: Self = this.set("challengeName", js.undefined)
    
    @scala.inline
    def setClientMetadata(value: StringDictionary[String]): Self = this.set("clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientMetadata: Self = this.set("clientMetadata", js.undefined)
    
    @scala.inline
    def setCodeParameter(value: String): Self = this.set("codeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeParameter: Self = this.set("codeParameter", js.undefined)
    
    @scala.inline
    def setLinkParameter(value: String): Self = this.set("linkParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkParameter: Self = this.set("linkParameter", js.undefined)
    
    @scala.inline
    def setNewDeviceUsed(value: Boolean): Self = this.set("newDeviceUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewDeviceUsed: Self = this.set("newDeviceUsed", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPrivateChallengeParameters(value: StringDictionary[String]): Self = this.set("privateChallengeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateChallengeParameters: Self = this.set("privateChallengeParameters", js.undefined)
    
    @scala.inline
    def setSessionVarargs(value: ChallengeResult*): Self = this.set("session", js.Array(value :_*))
    
    @scala.inline
    def setSession(value: js.Array[ChallengeResult]): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setUserNotFound(value: Boolean): Self = this.set("userNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserNotFound: Self = this.set("userNotFound", js.undefined)
    
    @scala.inline
    def setUsernameParameter(value: String): Self = this.set("usernameParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameParameter: Self = this.set("usernameParameter", js.undefined)
    
    @scala.inline
    def setValidationData(value: StringDictionary[String]): Self = this.set("validationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationData: Self = this.set("validationData", js.undefined)
  }
}
