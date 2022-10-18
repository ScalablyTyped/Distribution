package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentSummary extends StObject {
  
  /**
    * The unique identifier of the application.
    */
  var applicationId: Identifier
  
  /**
    * The version of the application.
    */
  var applicationVersion: Version
  
  /**
    * The timestamp when the deployment was created.
    */
  var creationTime: js.Date
  
  /**
    * The unique identifier of the deployment.
    */
  var deploymentId: Identifier
  
  /**
    * The unique identifier of the environment.
    */
  var environmentId: Identifier
  
  /**
    * The current status of the deployment.
    */
  var status: DeploymentLifecycle
  
  /**
    * The reason for the reported status.
    */
  var statusReason: js.UndefOr[String] = js.undefined
}
object DeploymentSummary {
  
  inline def apply(
    applicationId: Identifier,
    applicationVersion: Version,
    creationTime: js.Date,
    deploymentId: Identifier,
    environmentId: Identifier,
    status: DeploymentLifecycle
  ): DeploymentSummary = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], applicationVersion = applicationVersion.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentSummary]
  }
  
  extension [Self <: DeploymentSummary](x: Self) {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDeploymentId(value: Identifier): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DeploymentLifecycle): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
  }
}
