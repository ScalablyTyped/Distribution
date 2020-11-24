package typings.awsLambda.userMigrationMod

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.DesiredDeliveryMediums
import typings.awsLambda.anon.Password
import typings.awsLambda.commonMod.BaseTriggerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseUserMigrationTriggerEvent[T /* <: String */] extends BaseTriggerEvent[T] {
  
  var request: Password = js.native
  
  var response: DesiredDeliveryMediums = js.native
}
object BaseUserMigrationTriggerEvent {
  
  @scala.inline
  def apply[T /* <: String */](
    callerContext: AwsSdkVersion,
    region: String,
    request: Password,
    response: DesiredDeliveryMediums,
    triggerSource: T,
    userName: String,
    userPoolId: String,
    version: String
  ): BaseUserMigrationTriggerEvent[T] = {
    val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUserMigrationTriggerEvent[T]]
  }
  
  @scala.inline
  implicit class BaseUserMigrationTriggerEventOps[Self <: BaseUserMigrationTriggerEvent[_], T /* <: String */] (val x: Self with BaseUserMigrationTriggerEvent[T]) extends AnyVal {
    
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
    def setRequest(value: Password): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: DesiredDeliveryMediums): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
