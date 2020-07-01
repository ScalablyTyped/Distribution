package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendEnvironment extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app. 
    */
  var backendEnvironmentArn: BackendEnvironmentArn = js.native
  /**
    *  The creation date and time for a backend environment that is part of an Amplify app. 
    */
  var createTime: CreateTime = js.native
  /**
    *  The name of deployment artifacts. 
    */
  var deploymentArtifacts: js.UndefOr[DeploymentArtifacts] = js.native
  /**
    *  The name for a backend environment that is part of an Amplify app. 
    */
  var environmentName: EnvironmentName = js.native
  /**
    *  The AWS CloudFormation stack name of a backend environment. 
    */
  var stackName: js.UndefOr[StackName] = js.native
  /**
    *  The last updated date and time for a backend environment that is part of an Amplify app. 
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

