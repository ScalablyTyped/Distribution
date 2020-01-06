package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackendEnvironmentResult extends js.Object {
  /**
    *  Backend environment structure for an an Amplify App. 
    */
  var backendEnvironment: BackendEnvironment = js.native
}

object GetBackendEnvironmentResult {
  @scala.inline
  def apply(backendEnvironment: BackendEnvironment): GetBackendEnvironmentResult = {
    val __obj = js.Dynamic.literal(backendEnvironment = backendEnvironment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBackendEnvironmentResult]
  }
}

