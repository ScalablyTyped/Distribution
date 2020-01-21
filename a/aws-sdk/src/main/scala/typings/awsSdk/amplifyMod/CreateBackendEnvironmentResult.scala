package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackendEnvironmentResult extends js.Object {
  /**
    *  Backend environment structure for an amplify App. 
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

