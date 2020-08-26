package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployment extends js.Object {
  /**
    * Specifies whether a deployment was automatically released.
    */
  var AutoDeployed: js.UndefOr[boolean] = js.native
  /**
    * The date and time when the Deployment resource was created.
    */
  var CreatedDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * The identifier for the deployment.
    */
  var DeploymentId: js.UndefOr[Id] = js.native
  /**
    * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
    */
  var DeploymentStatus: js.UndefOr[typings.awsSdk.apigatewayv2Mod.DeploymentStatus] = js.native
  /**
    * May contain additional feedback on the status of an API deployment.
    */
  var DeploymentStatusMessage: js.UndefOr[string] = js.native
  /**
    * The description for the deployment.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
}

object Deployment {
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  @scala.inline
  implicit class DeploymentOps[Self <: Deployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoDeployed(value: boolean): Self = this.set("AutoDeployed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDeployed: Self = this.set("AutoDeployed", js.undefined)
    @scala.inline
    def setCreatedDate(value: timestampIso8601): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    @scala.inline
    def setDeploymentId(value: Id): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
    @scala.inline
    def setDeploymentStatus(value: DeploymentStatus): Self = this.set("DeploymentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentStatus: Self = this.set("DeploymentStatus", js.undefined)
    @scala.inline
    def setDeploymentStatusMessage(value: string): Self = this.set("DeploymentStatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentStatusMessage: Self = this.set("DeploymentStatusMessage", js.undefined)
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

