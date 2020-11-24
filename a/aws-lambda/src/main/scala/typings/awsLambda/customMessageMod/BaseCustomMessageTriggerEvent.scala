package typings.awsLambda.customMessageMod

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.ClientMetadata
import typings.awsLambda.anon.EmailMessage
import typings.awsLambda.commonMod.BaseTriggerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseCustomMessageTriggerEvent[T /* <: String */] extends BaseTriggerEvent[T] {
  
  var request: ClientMetadata = js.native
  
  var response: EmailMessage = js.native
}
object BaseCustomMessageTriggerEvent {
  
  @scala.inline
  def apply[T /* <: String */](
    callerContext: AwsSdkVersion,
    region: String,
    request: ClientMetadata,
    response: EmailMessage,
    triggerSource: T,
    userName: String,
    userPoolId: String,
    version: String
  ): BaseCustomMessageTriggerEvent[T] = {
    val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCustomMessageTriggerEvent[T]]
  }
  
  @scala.inline
  implicit class BaseCustomMessageTriggerEventOps[Self <: BaseCustomMessageTriggerEvent[_], T /* <: String */] (val x: Self with BaseCustomMessageTriggerEvent[T]) extends AnyVal {
    
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
    def setRequest(value: ClientMetadata): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: EmailMessage): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
