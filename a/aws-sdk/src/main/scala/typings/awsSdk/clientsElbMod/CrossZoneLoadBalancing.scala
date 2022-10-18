package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossZoneLoadBalancing extends StObject {
  
  /**
    * Specifies whether cross-zone load balancing is enabled for the load balancer.
    */
  var Enabled: CrossZoneLoadBalancingEnabled
}
object CrossZoneLoadBalancing {
  
  inline def apply(Enabled: CrossZoneLoadBalancingEnabled): CrossZoneLoadBalancing = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossZoneLoadBalancing]
  }
  
  extension [Self <: CrossZoneLoadBalancing](x: Self) {
    
    inline def setEnabled(value: CrossZoneLoadBalancingEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
