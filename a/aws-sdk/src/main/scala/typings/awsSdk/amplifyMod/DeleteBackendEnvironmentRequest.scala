package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackendEnvironmentRequest extends js.Object {
  /**
    *  The unique ID of an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The name of a backend environment of an Amplify app. 
    */
  var environmentName: EnvironmentName = js.native
}

object DeleteBackendEnvironmentRequest {
  @scala.inline
  def apply(appId: AppId, environmentName: EnvironmentName): DeleteBackendEnvironmentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackendEnvironmentRequest]
  }
}

