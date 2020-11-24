package typings.awsLambda.postAuthenticationMod

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.NewDeviceUsed
import typings.awsLambda.awsLambdaStrings.PostAuthentication_Authentication
import typings.awsLambda.commonMod.BaseTriggerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostAuthenticationTriggerEvent extends BaseTriggerEvent[PostAuthentication_Authentication] {
  
  var request: NewDeviceUsed = js.native
}
object PostAuthenticationTriggerEvent {
  
  @scala.inline
  def apply(
    callerContext: AwsSdkVersion,
    region: String,
    request: NewDeviceUsed,
    triggerSource: PostAuthentication_Authentication,
    userName: String,
    userPoolId: String,
    version: String
  ): PostAuthenticationTriggerEvent = {
    val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostAuthenticationTriggerEvent]
  }
  
  @scala.inline
  implicit class PostAuthenticationTriggerEventOps[Self <: PostAuthenticationTriggerEvent] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: NewDeviceUsed): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
