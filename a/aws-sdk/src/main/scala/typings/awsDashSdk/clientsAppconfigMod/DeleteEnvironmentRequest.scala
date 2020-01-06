package typings.awsDashSdk.clientsAppconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEnvironmentRequest extends js.Object {
  /**
    * The application ID that includes the environment you want to delete.
    */
  var ApplicationId: Id = js.native
  /**
    * The ID of the environment you want to delete.
    */
  var EnvironmentId: Id = js.native
}

object DeleteEnvironmentRequest {
  @scala.inline
  def apply(ApplicationId: Id, EnvironmentId: Id): DeleteEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEnvironmentRequest]
  }
}

