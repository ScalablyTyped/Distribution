package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerCrossZoneLoadBalancing extends StObject {
  
  /**
    * Indicates whether cross-zone load balancing is enabled for the load balancer.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object AwsElbLoadBalancerCrossZoneLoadBalancing {
  
  inline def apply(): AwsElbLoadBalancerCrossZoneLoadBalancing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerCrossZoneLoadBalancing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsElbLoadBalancerCrossZoneLoadBalancing] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
