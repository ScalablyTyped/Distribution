package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEnvironmentRequest extends js.Object {
  /**
    * The ID of the environment to delete.
    */
  var environmentId: EnvironmentId = js.native
}

object DeleteEnvironmentRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId): DeleteEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEnvironmentRequest]
  }
}

