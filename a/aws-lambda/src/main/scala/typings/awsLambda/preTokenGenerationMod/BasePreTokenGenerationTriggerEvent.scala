package typings.awsLambda.preTokenGenerationMod

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.ClaimsOverrideDetails
import typings.awsLambda.anon.GroupConfiguration
import typings.awsLambda.commonMod.BaseTriggerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePreTokenGenerationTriggerEvent[T /* <: String */] extends BaseTriggerEvent[T] {
  
  var request: GroupConfiguration = js.native
  
  var response: ClaimsOverrideDetails = js.native
}
object BasePreTokenGenerationTriggerEvent {
  
  @scala.inline
  def apply[T /* <: String */](
    callerContext: AwsSdkVersion,
    region: String,
    request: GroupConfiguration,
    response: ClaimsOverrideDetails,
    triggerSource: T,
    userName: String,
    userPoolId: String,
    version: String
  ): BasePreTokenGenerationTriggerEvent[T] = {
    val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePreTokenGenerationTriggerEvent[T]]
  }
  
  @scala.inline
  implicit class BasePreTokenGenerationTriggerEventOps[Self <: BasePreTokenGenerationTriggerEvent[_], T /* <: String */] (val x: Self with BasePreTokenGenerationTriggerEvent[T]) extends AnyVal {
    
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
    def setRequest(value: GroupConfiguration): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: ClaimsOverrideDetails): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
