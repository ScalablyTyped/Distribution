package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackendEnvironmentResult extends js.Object {
  /**
    *  Backend environment structure for an Amplify App. 
    */
  var backendEnvironment: BackendEnvironment = js.native
}

object DeleteBackendEnvironmentResult {
  @scala.inline
  def apply(backendEnvironment: BackendEnvironment): DeleteBackendEnvironmentResult = {
    val __obj = js.Dynamic.literal(backendEnvironment = backendEnvironment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBackendEnvironmentResult]
  }
}

