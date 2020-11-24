package typings.awsLambda.defineAuthChallengeMod

import typings.awsLambda.anon.AwsSdkVersion
import typings.awsLambda.anon.FailAuthentication
import typings.awsLambda.anon.Session
import typings.awsLambda.awsLambdaStrings.DefineAuthChallenge_Authentication
import typings.awsLambda.commonMod.BaseTriggerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefineAuthChallengeTriggerEvent extends BaseTriggerEvent[DefineAuthChallenge_Authentication] {
  
  var request: Session = js.native
  
  var response: FailAuthentication = js.native
}
object DefineAuthChallengeTriggerEvent {
  
  @scala.inline
  def apply(
    callerContext: AwsSdkVersion,
    region: String,
    request: Session,
    response: FailAuthentication,
    triggerSource: DefineAuthChallenge_Authentication,
    userName: String,
    userPoolId: String,
    version: String
  ): DefineAuthChallengeTriggerEvent = {
    val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAuthChallengeTriggerEvent]
  }
  
  @scala.inline
  implicit class DefineAuthChallengeTriggerEventOps[Self <: DefineAuthChallengeTriggerEvent] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: Session): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: FailAuthentication): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
