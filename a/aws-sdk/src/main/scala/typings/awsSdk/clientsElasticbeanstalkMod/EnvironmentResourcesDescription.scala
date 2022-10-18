package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentResourcesDescription extends StObject {
  
  /**
    * Describes the LoadBalancer.
    */
  var LoadBalancer: js.UndefOr[LoadBalancerDescription] = js.undefined
}
object EnvironmentResourcesDescription {
  
  inline def apply(): EnvironmentResourcesDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResourcesDescription]
  }
  
  extension [Self <: EnvironmentResourcesDescription](x: Self) {
    
    inline def setLoadBalancer(value: LoadBalancerDescription): Self = StObject.set(x, "LoadBalancer", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerUndefined: Self = StObject.set(x, "LoadBalancer", js.undefined)
  }
}
