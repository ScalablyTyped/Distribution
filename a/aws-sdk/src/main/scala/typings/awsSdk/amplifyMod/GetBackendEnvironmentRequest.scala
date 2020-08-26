package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackendEnvironmentRequest extends js.Object {
  /**
    *  The unique id for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The name for the backend environment. 
    */
  var environmentName: EnvironmentName = js.native
}

object GetBackendEnvironmentRequest {
  @scala.inline
  def apply(appId: AppId, environmentName: EnvironmentName): GetBackendEnvironmentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackendEnvironmentRequest]
  }
  @scala.inline
  implicit class GetBackendEnvironmentRequestOps[Self <: GetBackendEnvironmentRequest] (val x: Self) extends AnyVal {
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
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("environmentName", value.asInstanceOf[js.Any])
  }
  
}

