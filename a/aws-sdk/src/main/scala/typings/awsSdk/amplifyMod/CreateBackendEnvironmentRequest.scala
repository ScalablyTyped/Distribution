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
  def apply(
    appId: AppId,
    environmentName: EnvironmentName,
    deploymentArtifacts: DeploymentArtifacts = null,
    stackName: StackName = null
  ): CreateBackendEnvironmentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    if (deploymentArtifacts != null) __obj.updateDynamic("deploymentArtifacts")(deploymentArtifacts.asInstanceOf[js.Any])
    if (stackName != null) __obj.updateDynamic("stackName")(stackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendEnvironmentRequest]
  }
}

