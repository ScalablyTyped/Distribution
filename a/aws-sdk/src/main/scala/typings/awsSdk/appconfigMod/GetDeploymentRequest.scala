package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentRequest extends js.Object {
  /**
    * The ID of the application that includes the deployment you want to get. 
    */
  var ApplicationId: Id = js.native
  /**
    * The sequence number of the deployment.
    */
  var DeploymentNumber: Integer = js.native
  /**
    * The ID of the environment that includes the deployment you want to get. 
    */
  var EnvironmentId: Id = js.native
}

object GetDeploymentRequest {
  @scala.inline
  def apply(ApplicationId: Id, DeploymentNumber: Integer, EnvironmentId: Id): GetDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], DeploymentNumber = DeploymentNumber.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDeploymentRequest]
  }
}

