package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentJob extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the deployment job was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The deployment application configuration.
    */
  var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined
  
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
  
  /**
    * The deployment job failure code.
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined
  
  /**
    * A short description of the reason why the deployment job failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the deployment job.
    */
  var status: js.UndefOr[DeploymentStatus] = js.undefined
}
object DeploymentJob {
  
  inline def apply(): DeploymentJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentJob]
  }
  
  extension [Self <: DeploymentJob](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDeploymentApplicationConfigs(value: DeploymentApplicationConfigs): Self = StObject.set(x, "deploymentApplicationConfigs", value.asInstanceOf[js.Any])
    
    inline def setDeploymentApplicationConfigsUndefined: Self = StObject.set(x, "deploymentApplicationConfigs", js.undefined)
    
    inline def setDeploymentApplicationConfigsVarargs(value: DeploymentApplicationConfig*): Self = StObject.set(x, "deploymentApplicationConfigs", js.Array(value*))
    
    inline def setDeploymentConfig(value: DeploymentConfig): Self = StObject.set(x, "deploymentConfig", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigUndefined: Self = StObject.set(x, "deploymentConfig", js.undefined)
    
    inline def setFailureCode(value: DeploymentJobErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureReason(value: GenericString): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    inline def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
    
    inline def setStatus(value: DeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
