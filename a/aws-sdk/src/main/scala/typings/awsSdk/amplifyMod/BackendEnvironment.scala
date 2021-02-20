package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendEnvironment extends StObject {
  
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
  implicit class BackendEnvironmentMutableBuilder[Self <: BackendEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendEnvironmentArn(value: BackendEnvironmentArn): Self = StObject.set(x, "backendEnvironmentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTime(value: CreateTime): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentArtifacts(value: DeploymentArtifacts): Self = StObject.set(x, "deploymentArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentArtifactsUndefined: Self = StObject.set(x, "deploymentArtifacts", js.undefined)
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackName(value: StackName): Self = StObject.set(x, "stackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackNameUndefined: Self = StObject.set(x, "stackName", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: UpdateTime): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
