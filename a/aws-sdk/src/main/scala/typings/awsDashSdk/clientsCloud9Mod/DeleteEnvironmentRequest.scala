package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEnvironmentRequest extends js.Object {
  /**
    * The ID of the environment to delete.
    */
  var environmentId: EnvironmentId
}

object DeleteEnvironmentRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId): DeleteEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId)
  
    __obj.asInstanceOf[DeleteEnvironmentRequest]
  }
}

