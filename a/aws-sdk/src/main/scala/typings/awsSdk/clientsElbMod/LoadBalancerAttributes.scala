package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerAttributes extends StObject {
  
  /**
    * If enabled, the load balancer captures detailed information of all requests and delivers the information to the Amazon S3 bucket that you specify. For more information, see Enable Access Logs in the Classic Load Balancers Guide.
    */
  var AccessLog: js.UndefOr[typings.awsSdk.clientsElbMod.AccessLog] = js.undefined
  
  /**
    * Any additional attributes.
    */
  var AdditionalAttributes: js.UndefOr[typings.awsSdk.clientsElbMod.AdditionalAttributes] = js.undefined
  
  /**
    * If enabled, the load balancer allows existing requests to complete before the load balancer shifts traffic away from a deregistered or unhealthy instance. For more information, see Configure Connection Draining in the Classic Load Balancers Guide.
    */
  var ConnectionDraining: js.UndefOr[typings.awsSdk.clientsElbMod.ConnectionDraining] = js.undefined
  
  /**
    * If enabled, the load balancer allows the connections to remain idle (no data is sent over the connection) for the specified duration. By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both front-end and back-end connections of your load balancer. For more information, see Configure Idle Connection Timeout in the Classic Load Balancers Guide.
    */
  var ConnectionSettings: js.UndefOr[typings.awsSdk.clientsElbMod.ConnectionSettings] = js.undefined
  
  /**
    * If enabled, the load balancer routes the request traffic evenly across all instances regardless of the Availability Zones. For more information, see Configure Cross-Zone Load Balancing in the Classic Load Balancers Guide.
    */
  var CrossZoneLoadBalancing: js.UndefOr[typings.awsSdk.clientsElbMod.CrossZoneLoadBalancing] = js.undefined
}
object LoadBalancerAttributes {
  
  inline def apply(): LoadBalancerAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadBalancerAttributes] (val x: Self) extends AnyVal {
    
    inline def setAccessLog(value: AccessLog): Self = StObject.set(x, "AccessLog", value.asInstanceOf[js.Any])
    
    inline def setAccessLogUndefined: Self = StObject.set(x, "AccessLog", js.undefined)
    
    inline def setAdditionalAttributes(value: AdditionalAttributes): Self = StObject.set(x, "AdditionalAttributes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAttributesUndefined: Self = StObject.set(x, "AdditionalAttributes", js.undefined)
    
    inline def setAdditionalAttributesVarargs(value: AdditionalAttribute*): Self = StObject.set(x, "AdditionalAttributes", js.Array(value*))
    
    inline def setConnectionDraining(value: ConnectionDraining): Self = StObject.set(x, "ConnectionDraining", value.asInstanceOf[js.Any])
    
    inline def setConnectionDrainingUndefined: Self = StObject.set(x, "ConnectionDraining", js.undefined)
    
    inline def setConnectionSettings(value: ConnectionSettings): Self = StObject.set(x, "ConnectionSettings", value.asInstanceOf[js.Any])
    
    inline def setConnectionSettingsUndefined: Self = StObject.set(x, "ConnectionSettings", js.undefined)
    
    inline def setCrossZoneLoadBalancing(value: CrossZoneLoadBalancing): Self = StObject.set(x, "CrossZoneLoadBalancing", value.asInstanceOf[js.Any])
    
    inline def setCrossZoneLoadBalancingUndefined: Self = StObject.set(x, "CrossZoneLoadBalancing", js.undefined)
  }
}
