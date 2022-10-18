package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendEnvironmentRequest extends StObject {
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The name of deployment artifacts. 
    */
  var deploymentArtifacts: js.UndefOr[DeploymentArtifacts] = js.undefined
  
  /**
    *  The name for the backend environment. 
    */
  var environmentName: EnvironmentName
  
  /**
    *  The AWS CloudFormation stack name of a backend environment. 
    */
  var stackName: js.UndefOr[StackName] = js.undefined
}
object CreateBackendEnvironmentRequest {
  
  inline def apply(appId: AppId, environmentName: EnvironmentName): CreateBackendEnvironmentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendEnvironmentRequest]
  }
  
  extension [Self <: CreateBackendEnvironmentRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentArtifacts(value: DeploymentArtifacts): Self = StObject.set(x, "deploymentArtifacts", value.asInstanceOf[js.Any])
    
    inline def setDeploymentArtifactsUndefined: Self = StObject.set(x, "deploymentArtifacts", js.undefined)
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "stackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "stackName", js.undefined)
  }
}
