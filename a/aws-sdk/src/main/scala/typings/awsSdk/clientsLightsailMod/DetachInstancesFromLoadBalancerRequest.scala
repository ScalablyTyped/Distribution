package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachInstancesFromLoadBalancerRequest extends StObject {
  
  /**
    * An array of strings containing the names of the instances you want to detach from the load balancer.
    */
  var instanceNames: ResourceNameList
  
  /**
    * The name of the Lightsail load balancer.
    */
  var loadBalancerName: ResourceName
}
object DetachInstancesFromLoadBalancerRequest {
  
  inline def apply(instanceNames: ResourceNameList, loadBalancerName: ResourceName): DetachInstancesFromLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachInstancesFromLoadBalancerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetachInstancesFromLoadBalancerRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceNames(value: ResourceNameList): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    inline def setInstanceNamesVarargs(value: ResourceName*): Self = StObject.set(x, "instanceNames", js.Array(value*))
    
    inline def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
  }
}
