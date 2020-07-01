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
}

