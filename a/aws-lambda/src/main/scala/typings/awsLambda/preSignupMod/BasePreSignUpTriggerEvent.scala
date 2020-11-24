package typings.awsLambda.preSignupMod

import typings.awsLambda.anon.AutoConfirmUser
import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.ValidationData
import typings.awsLambda.commonMod.BaseTriggerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePreSignUpTriggerEvent[T /* <: String */] extends BaseTriggerEvent[T] {
  
  var request: ValidationData = js.native
  
  var response: AutoConfirmUser = js.native
}
object BasePreSignUpTriggerEvent {
  
  @scala.inline
  def apply[T /* <: String */](
    callerContext: AwsSdkVersion,
    region: String,
    request: ValidationData,
    response: AutoConfirmUser,
    triggerSource: T,
    userName: String,
    userPoolId: String,
    version: String
  ): BasePreSignUpTriggerEvent[T] = {
    val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePreSignUpTriggerEvent[T]]
  }
  
  @scala.inline
  implicit class BasePreSignUpTriggerEventOps[Self <: BasePreSignUpTriggerEvent[_], T /* <: String */] (val x: Self with BasePreSignUpTriggerEvent[T]) extends AnyVal {
    
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
    def setRequest(value: ValidationData): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: AutoConfirmUser): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
