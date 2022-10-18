package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendEnvironment extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app. 
    */
  var backendEnvironmentArn: BackendEnvironmentArn
  
  /**
    *  The creation date and time for a backend environment that is part of an Amplify app. 
    */
  var createTime: js.Date
  
  /**
    *  The name of deployment artifacts. 
    */
  var deploymentArtifacts: js.UndefOr[DeploymentArtifacts] = js.undefined
  
  /**
    *  The name for a backend environment that is part of an Amplify app. 
    */
  var environmentName: EnvironmentName
  
  /**
    *  The AWS CloudFormation stack name of a backend environment. 
    */
  var stackName: js.UndefOr[StackName] = js.undefined
  
  /**
    *  The last updated date and time for a backend environment that is part of an Amplify app. 
    */
  var updateTime: js.Date
}
object BackendEnvironment {
  
  inline def apply(
    backendEnvironmentArn: BackendEnvironmentArn,
    createTime: js.Date,
    environmentName: EnvironmentName,
    updateTime: js.Date
  ): BackendEnvironment = {
    val __obj = js.Dynamic.literal(backendEnvironmentArn = backendEnvironmentArn.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendEnvironment]
  }
  
  extension [Self <: BackendEnvironment](x: Self) {
    
    inline def setBackendEnvironmentArn(value: BackendEnvironmentArn): Self = StObject.set(x, "backendEnvironmentArn", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setDeploymentArtifacts(value: DeploymentArtifacts): Self = StObject.set(x, "deploymentArtifacts", value.asInstanceOf[js.Any])
    
    inline def setDeploymentArtifactsUndefined: Self = StObject.set(x, "deploymentArtifacts", js.undefined)
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "stackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "stackName", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
