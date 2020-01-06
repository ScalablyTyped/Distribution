package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendEnvironment extends js.Object {
  /**
    *  Arn for a backend environment, part of an Amplify App. 
    */
  var backendEnvironmentArn: BackendEnvironmentArn = js.native
  /**
    *  Creation date and time for a backend environment, part of an Amplify App. 
    */
  var createTime: CreateTime = js.native
  /**
    *  Name of deployment artifacts. 
    */
  var deploymentArtifacts: js.UndefOr[DeploymentArtifacts] = js.native
  /**
    *  Name for a backend environment, part of an Amplify App. 
    */
  var environmentName: EnvironmentName = js.native
  /**
    *  CloudFormation stack name of backend environment. 
    */
  var stackName: js.UndefOr[StackName] = js.native
  /**
    *  Last updated date and time for a backend environment, part of an Amplify App. 
    */
  var updateTime: UpdateTime = js.native
}

object BackendEnvironment {
  @scala.inline
  def apply(
    backendEnvironmentArn: BackendEnvironmentArn,
    createTime: CreateTime,
    environmentName: EnvironmentName,
    updateTime: UpdateTime,
    deploymentArtifacts: DeploymentArtifacts = null,
    stackName: StackName = null
  ): BackendEnvironment = {
    val __obj = js.Dynamic.literal(backendEnvironmentArn = backendEnvironmentArn.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    if (deploymentArtifacts != null) __obj.updateDynamic("deploymentArtifacts")(deploymentArtifacts.asInstanceOf[js.Any])
    if (stackName != null) __obj.updateDynamic("stackName")(stackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendEnvironment]
  }
}

