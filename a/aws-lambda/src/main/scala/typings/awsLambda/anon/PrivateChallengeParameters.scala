package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateChallengeParameters extends js.Object {
  
  var challengeAnswer: String = js.native
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var privateChallengeParameters: StringMap = js.native
  
  var userAttributes: StringMap = js.native
  
  var userNotFound: js.UndefOr[Boolean] = js.native
}
object PrivateChallengeParameters {
  
  @scala.inline
  def apply(challengeAnswer: String, privateChallengeParameters: StringMap, userAttributes: StringMap): PrivateChallengeParameters = {
    val __obj = js.Dynamic.literal(challengeAnswer = challengeAnswer.asInstanceOf[js.Any], privateChallengeParameters = privateChallengeParameters.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateChallengeParameters]
  }
  
  @scala.inline
  implicit class PrivateChallengeParametersOps[Self <: PrivateChallengeParameters] (val x: Self) extends AnyVal {
    
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
    def setChallengeAnswer(value: String): Self = this.set("challengeAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateChallengeParameters(value: StringMap): Self = this.set("privateChallengeParameters", value.asInstanceOf[js.Any])
    
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
