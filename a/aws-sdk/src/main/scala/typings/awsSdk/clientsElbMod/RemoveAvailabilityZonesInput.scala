package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAvailabilityZonesInput extends StObject {
  
  /**
    * The Availability Zones.
    */
  var AvailabilityZones: typings.awsSdk.clientsElbMod.AvailabilityZones
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}
object RemoveAvailabilityZonesInput {
  
  inline def apply(AvailabilityZones: AvailabilityZones, LoadBalancerName: AccessPointName): RemoveAvailabilityZonesInput = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAvailabilityZonesInput]
  }
  
  extension [Self <: RemoveAvailabilityZonesInput](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
