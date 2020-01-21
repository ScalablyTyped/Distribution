package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackendEnvironmentRequest extends js.Object {
  /**
    *  Unique Id of an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Name of a backend environment of an Amplify App. 
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

