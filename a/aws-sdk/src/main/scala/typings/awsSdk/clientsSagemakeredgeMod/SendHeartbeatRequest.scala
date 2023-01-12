package typings.awsSdk.clientsSagemakeredgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendHeartbeatRequest extends StObject {
  
  /**
    * For internal use. Returns a list of SageMaker Edge Manager agent operating metrics.
    */
  var AgentMetrics: js.UndefOr[EdgeMetrics] = js.undefined
  
  /**
    * Returns the version of the agent.
    */
  var AgentVersion: Version
  
  /**
    * Returns the result of a deployment on the device.
    */
  var DeploymentResult: js.UndefOr[typings.awsSdk.clientsSagemakeredgeMod.DeploymentResult] = js.undefined
  
  /**
    * The name of the fleet that the device belongs to.
    */
  var DeviceFleetName: typings.awsSdk.clientsSagemakeredgeMod.DeviceFleetName
  
  /**
    * The unique name of the device.
    */
  var DeviceName: typings.awsSdk.clientsSagemakeredgeMod.DeviceName
  
  /**
    * Returns a list of models deployed on the the device.
    */
  var Models: js.UndefOr[typings.awsSdk.clientsSagemakeredgeMod.Models] = js.undefined
}
object SendHeartbeatRequest {
  
  inline def apply(AgentVersion: Version, DeviceFleetName: DeviceFleetName, DeviceName: DeviceName): SendHeartbeatRequest = {
    val __obj = js.Dynamic.literal(AgentVersion = AgentVersion.asInstanceOf[js.Any], DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendHeartbeatRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendHeartbeatRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentMetrics(value: EdgeMetrics): Self = StObject.set(x, "AgentMetrics", value.asInstanceOf[js.Any])
    
    inline def setAgentMetricsUndefined: Self = StObject.set(x, "AgentMetrics", js.undefined)
    
    inline def setAgentMetricsVarargs(value: EdgeMetric*): Self = StObject.set(x, "AgentMetrics", js.Array(value*))
    
    inline def setAgentVersion(value: Version): Self = StObject.set(x, "AgentVersion", value.asInstanceOf[js.Any])
    
    inline def setDeploymentResult(value: DeploymentResult): Self = StObject.set(x, "DeploymentResult", value.asInstanceOf[js.Any])
    
    inline def setDeploymentResultUndefined: Self = StObject.set(x, "DeploymentResult", js.undefined)
    
    inline def setDeviceFleetName(value: DeviceFleetName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setModels(value: Models): Self = StObject.set(x, "Models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "Models", js.undefined)
    
    inline def setModelsVarargs(value: Model*): Self = StObject.set(x, "Models", js.Array(value*))
  }
}
