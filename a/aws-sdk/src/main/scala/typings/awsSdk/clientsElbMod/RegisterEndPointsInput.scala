package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterEndPointsInput extends StObject {
  
  /**
    * The IDs of the instances.
    */
  var Instances: typings.awsSdk.clientsElbMod.Instances
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}
object RegisterEndPointsInput {
  
  inline def apply(Instances: Instances, LoadBalancerName: AccessPointName): RegisterEndPointsInput = {
    val __obj = js.Dynamic.literal(Instances = Instances.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterEndPointsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterEndPointsInput] (val x: Self) extends AnyVal {
    
    inline def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
