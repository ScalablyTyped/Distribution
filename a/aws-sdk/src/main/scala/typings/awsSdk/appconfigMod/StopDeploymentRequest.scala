package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDeploymentRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * The sequence number of the deployment.
    */
  var DeploymentNumber: Integer = js.native
  /**
    * The environment ID.
    */
  var EnvironmentId: Id = js.native
}

object StopDeploymentRequest {
  @scala.inline
  def apply(ApplicationId: Id, DeploymentNumber: Integer, EnvironmentId: Id): StopDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], DeploymentNumber = DeploymentNumber.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDeploymentRequest]
  }
}

