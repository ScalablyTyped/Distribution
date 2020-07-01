package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackendEnvironmentResult extends js.Object {
  /**
    *  Describes the backend environment for an Amplify app. 
    */
  var backendEnvironment: BackendEnvironment = js.native
}

object CreateBackendEnvironmentResult {
  @scala.inline
  def apply(backendEnvironment: BackendEnvironment): CreateBackendEnvironmentResult = {
    val __obj = js.Dynamic.literal(backendEnvironment = backendEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendEnvironmentResult]
  }
}

