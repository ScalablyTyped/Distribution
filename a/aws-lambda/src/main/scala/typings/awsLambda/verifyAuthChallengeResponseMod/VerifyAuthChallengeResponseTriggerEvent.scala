package typings.awsLambda.verifyAuthChallengeResponseMod

import typings.awsLambda.anon.AnswerCorrectBoolean
import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.PrivateChallengeParameters
import typings.awsLambda.awsLambdaStrings.VerifyAuthChallengeResponse_Authentication
import typings.awsLambda.commonMod.BaseTriggerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyAuthChallengeResponseTriggerEvent extends BaseTriggerEvent[VerifyAuthChallengeResponse_Authentication] {
  
  var request: PrivateChallengeParameters = js.native
  
  var response: AnswerCorrectBoolean = js.native
}
object VerifyAuthChallengeResponseTriggerEvent {
  
  @scala.inline
  def apply(
    callerContext: AwsSdkVersion,
    region: String,
    request: PrivateChallengeParameters,
    response: AnswerCorrectBoolean,
    triggerSource: VerifyAuthChallengeResponse_Authentication,
    userName: String,
    userPoolId: String,
    version: String
  ): VerifyAuthChallengeResponseTriggerEvent = {
    val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyAuthChallengeResponseTriggerEvent]
  }
  
  @scala.inline
  implicit class VerifyAuthChallengeResponseTriggerEventOps[Self <: VerifyAuthChallengeResponseTriggerEvent] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: PrivateChallengeParameters): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: AnswerCorrectBoolean): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
