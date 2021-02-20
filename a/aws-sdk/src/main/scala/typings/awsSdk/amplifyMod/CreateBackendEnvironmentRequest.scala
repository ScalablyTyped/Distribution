package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBackendEnvironmentRequest extends StObject {
  
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
  implicit class CreateBackendEnvironmentRequestMutableBuilder[Self <: CreateBackendEnvironmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
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
  }
}
