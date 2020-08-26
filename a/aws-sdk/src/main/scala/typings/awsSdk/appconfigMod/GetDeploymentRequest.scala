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
  @scala.inline
  implicit class GetDeploymentRequestOps[Self <: GetDeploymentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationId(value: Id): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentNumber(value: Integer): Self = this.set("DeploymentNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentId(value: Id): Self = this.set("EnvironmentId", value.asInstanceOf[js.Any])
  }
  
}

