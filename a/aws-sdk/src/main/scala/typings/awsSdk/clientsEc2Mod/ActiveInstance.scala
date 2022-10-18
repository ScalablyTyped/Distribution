package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveInstance extends StObject {
  
  /**
    * The health status of the instance. If the status of either the instance status check or the system status check is impaired, the health status of the instance is unhealthy. Otherwise, the health status is healthy.
    */
  var InstanceHealth: js.UndefOr[InstanceHealthStatus] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.undefined
}
object ActiveInstance {
  
  inline def apply(): ActiveInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveInstance]
  }
  
  extension [Self <: ActiveInstance](x: Self) {
    
    inline def setInstanceHealth(value: InstanceHealthStatus): Self = StObject.set(x, "InstanceHealth", value.asInstanceOf[js.Any])
    
    inline def setInstanceHealthUndefined: Self = StObject.set(x, "InstanceHealth", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setSpotInstanceRequestId(value: String): Self = StObject.set(x, "SpotInstanceRequestId", value.asInstanceOf[js.Any])
    
    inline def setSpotInstanceRequestIdUndefined: Self = StObject.set(x, "SpotInstanceRequestId", js.undefined)
  }
}
