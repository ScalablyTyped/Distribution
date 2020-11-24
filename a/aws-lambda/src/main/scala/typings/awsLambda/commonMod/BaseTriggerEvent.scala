package typings.awsLambda.commonMod

import typings.awsLambda.anon.AwsSdkVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseTriggerEvent[T /* <: String */] extends js.Object {
  
  var callerContext: AwsSdkVersion = js.native
  
  var region: String = js.native
  
  var triggerSource: T = js.native
  
  var userName: String = js.native
  
  var userPoolId: String = js.native
  
  var version: String = js.native
}
object BaseTriggerEvent {
  
  @scala.inline
  def apply[T /* <: String */](
    callerContext: AwsSdkVersion,
    region: String,
    triggerSource: T,
    userName: String,
    userPoolId: String,
    version: String
  ): BaseTriggerEvent[T] = {
    val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTriggerEvent[T]]
  }
  
  @scala.inline
  implicit class BaseTriggerEventOps[Self <: BaseTriggerEvent[_], T /* <: String */] (val x: Self with BaseTriggerEvent[T]) extends AnyVal {
    
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
    def setCallerContext(value: AwsSdkVersion): Self = this.set("callerContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerSource(value: T): Self = this.set("triggerSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: String): Self = this.set("userPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
