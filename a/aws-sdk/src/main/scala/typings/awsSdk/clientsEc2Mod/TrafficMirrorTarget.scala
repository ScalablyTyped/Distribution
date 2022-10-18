package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficMirrorTarget extends StObject {
  
  /**
    * Information about the Traffic Mirror target.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Gateway Load Balancer endpoint.
    */
  var GatewayLoadBalancerEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The network interface ID that is attached to the target.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Network Load Balancer.
    */
  var NetworkLoadBalancerArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the account that owns the Traffic Mirror target.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The tags assigned to the Traffic Mirror target.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the Traffic Mirror target.
    */
  var TrafficMirrorTargetId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of Traffic Mirror target.
    */
  var Type: js.UndefOr[TrafficMirrorTargetType] = js.undefined
}
object TrafficMirrorTarget {
  
  inline def apply(): TrafficMirrorTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorTarget]
  }
  
  extension [Self <: TrafficMirrorTarget](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGatewayLoadBalancerEndpointId(value: String): Self = StObject.set(x, "GatewayLoadBalancerEndpointId", value.asInstanceOf[js.Any])
    
    inline def setGatewayLoadBalancerEndpointIdUndefined: Self = StObject.set(x, "GatewayLoadBalancerEndpointId", js.undefined)
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setNetworkLoadBalancerArn(value: String): Self = StObject.set(x, "NetworkLoadBalancerArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkLoadBalancerArnUndefined: Self = StObject.set(x, "NetworkLoadBalancerArn", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrafficMirrorTargetId(value: String): Self = StObject.set(x, "TrafficMirrorTargetId", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorTargetIdUndefined: Self = StObject.set(x, "TrafficMirrorTargetId", js.undefined)
    
    inline def setType(value: TrafficMirrorTargetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
