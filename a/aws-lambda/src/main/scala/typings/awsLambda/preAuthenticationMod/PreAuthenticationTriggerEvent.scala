package typings.awsLambda.preAuthenticationMod

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.UserNotFound
import typings.awsLambda.awsLambdaStrings.PreAuthentication_Authentication
import typings.awsLambda.commonMod.BaseTriggerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreAuthenticationTriggerEvent extends BaseTriggerEvent[PreAuthentication_Authentication] {
  
  var request: UserNotFound = js.native
}
object PreAuthenticationTriggerEvent {
  
  @scala.inline
  def apply(
    callerContext: AwsSdkVersion,
    region: String,
    request: UserNotFound,
    triggerSource: PreAuthentication_Authentication,
    userName: String,
    userPoolId: String,
    version: String
  ): PreAuthenticationTriggerEvent = {
    val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAuthenticationTriggerEvent]
  }
  
  @scala.inline
  implicit class PreAuthenticationTriggerEventOps[Self <: PreAuthenticationTriggerEvent] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: UserNotFound): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
