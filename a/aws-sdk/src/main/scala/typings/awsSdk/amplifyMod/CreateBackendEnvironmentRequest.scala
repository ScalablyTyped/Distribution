package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackendEnvironmentRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The name of deployment artifacts. 
    */
  var deploymentArtifacts: js.UndefOr[DeploymentArtifacts] = js.native
  /**
    *  The name for the backend environment. 
    */
  var environmentName: EnvironmentName = js.native
  /**
    *  The AWS CloudFormation stack name of a backend environment. 
    */
  var stackName: js.UndefOr[StackName] = js.native
}

object CreateBackendEnvironmentRequest {
  @scala.inline
  def apply(appId: AppId, environmentName: EnvironmentName): CreateBackendEnvironmentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendEnvironmentRequest]
  }
  @scala.inline
  implicit class CreateBackendEnvironmentRequestOps[Self <: CreateBackendEnvironmentRequest] (val x: Self) extends AnyVal {
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
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("environmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentArtifacts(value: DeploymentArtifacts): Self = this.set("deploymentArtifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentArtifacts: Self = this.set("deploymentArtifacts", js.undefined)
    @scala.inline
    def setStackName(value: StackName): Self = this.set("stackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackName: Self = this.set("stackName", js.undefined)
  }
  
}

