package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentJobRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: ClientRequestToken
  
  /**
    * The deployment application configuration.
    */
  var deploymentApplicationConfigs: DeploymentApplicationConfigs
  
  /**
    * The requested deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the fleet to deploy.
    */
  var fleet: Arn
  
  /**
    * A map that contains tag keys and tag values that are attached to the deployment job.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateDeploymentJobRequest {
  
  inline def apply(
    clientRequestToken: ClientRequestToken,
    deploymentApplicationConfigs: DeploymentApplicationConfigs,
    fleet: Arn
  ): CreateDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], deploymentApplicationConfigs = deploymentApplicationConfigs.asInstanceOf[js.Any], fleet = fleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentJobRequest]
  }
  
  extension [Self <: CreateDeploymentJobRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setDeploymentApplicationConfigs(value: DeploymentApplicationConfigs): Self = StObject.set(x, "deploymentApplicationConfigs", value.asInstanceOf[js.Any])
    
    inline def setDeploymentApplicationConfigsVarargs(value: DeploymentApplicationConfig*): Self = StObject.set(x, "deploymentApplicationConfigs", js.Array(value*))
    
    inline def setDeploymentConfig(value: DeploymentConfig): Self = StObject.set(x, "deploymentConfig", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigUndefined: Self = StObject.set(x, "deploymentConfig", js.undefined)
    
    inline def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
