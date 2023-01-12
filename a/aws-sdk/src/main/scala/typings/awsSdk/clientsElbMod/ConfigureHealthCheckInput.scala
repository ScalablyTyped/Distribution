package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureHealthCheckInput extends StObject {
  
  /**
    * The configuration information.
    */
  var HealthCheck: typings.awsSdk.clientsElbMod.HealthCheck
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}
object ConfigureHealthCheckInput {
  
  inline def apply(HealthCheck: HealthCheck, LoadBalancerName: AccessPointName): ConfigureHealthCheckInput = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureHealthCheckInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigureHealthCheckInput] (val x: Self) extends AnyVal {
    
    inline def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
