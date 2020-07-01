package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackendEnvironmentResult extends js.Object {
  /**
    *  Describes the backend environment for an Amplify app. 
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

