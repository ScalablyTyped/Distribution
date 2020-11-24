package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    updateTime: UpdateTime
  ): BackendEnvironment = {
    val __obj = js.Dynamic.literal(backendEnvironmentArn = backendEnvironmentArn.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendEnvironment]
  }
  
  @scala.inline
  implicit class BackendEnvironmentOps[Self <: BackendEnvironment] (val x: Self) extends AnyVal {
    
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
    def setBackendEnvironmentArn(value: BackendEnvironmentArn): Self = this.set("backendEnvironmentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTime(value: CreateTime): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("environmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTime(value: UpdateTime): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
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
