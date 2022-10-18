package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccessPointInput extends StObject {
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}
object DeleteAccessPointInput {
  
  inline def apply(LoadBalancerName: AccessPointName): DeleteAccessPointInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessPointInput]
  }
  
  extension [Self <: DeleteAccessPointInput](x: Self) {
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
