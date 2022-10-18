package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limit extends StObject {
  
  /**
    * The maximum value of the limit.
    */
  var Max: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Max] = js.undefined
  
  /**
    * The name of the limit. The possible values are:   application-load-balancers   condition-values-per-alb-rule   condition-wildcards-per-alb-rule   gateway-load-balancers   gateway-load-balancers-per-vpc   geneve-target-groups   listeners-per-application-load-balancer   listeners-per-network-load-balancer   network-load-balancers   rules-per-application-load-balancer   target-groups   target-groups-per-action-on-application-load-balancer   target-groups-per-action-on-network-load-balancer   target-groups-per-application-load-balancer   targets-per-application-load-balancer   targets-per-availability-zone-per-gateway-load-balancer   targets-per-availability-zone-per-network-load-balancer   targets-per-network-load-balancer  
    */
  var Name: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Name] = js.undefined
}
object Limit {
  
  inline def apply(): Limit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Limit]
  }
  
  extension [Self <: Limit](x: Self) {
    
    inline def setMax(value: Max): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
