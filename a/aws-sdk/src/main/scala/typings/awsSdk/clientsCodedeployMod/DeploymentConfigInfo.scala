package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentConfigInfo extends StObject {
  
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
  
  /**
    * The time at which the deployment configuration was created.
    */
  var createTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The deployment configuration ID.
    */
  var deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined
  
  /**
    * The deployment configuration name.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined
  
  /**
    * Information about the number or percentage of minimum healthy instance.
    */
  var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined
  
  /**
    * The configuration that specifies how the deployment traffic is routed. Used for deployments with a Lambda or Amazon ECS compute platform only.
    */
  var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.undefined
}
object DeploymentConfigInfo {
  
  inline def apply(): DeploymentConfigInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentConfigInfo] (val x: Self) extends AnyVal {
    
    inline def setComputePlatform(value: ComputePlatform): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
    
    inline def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeploymentConfigId(value: DeploymentConfigId): Self = StObject.set(x, "deploymentConfigId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigIdUndefined: Self = StObject.set(x, "deploymentConfigId", js.undefined)
    
    inline def setDeploymentConfigName(value: DeploymentConfigName): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
    
    inline def setMinimumHealthyHosts(value: MinimumHealthyHosts): Self = StObject.set(x, "minimumHealthyHosts", value.asInstanceOf[js.Any])
    
    inline def setMinimumHealthyHostsUndefined: Self = StObject.set(x, "minimumHealthyHosts", js.undefined)
    
    inline def setTrafficRoutingConfig(value: TrafficRoutingConfig): Self = StObject.set(x, "trafficRoutingConfig", value.asInstanceOf[js.Any])
    
    inline def setTrafficRoutingConfigUndefined: Self = StObject.set(x, "trafficRoutingConfig", js.undefined)
  }
}
