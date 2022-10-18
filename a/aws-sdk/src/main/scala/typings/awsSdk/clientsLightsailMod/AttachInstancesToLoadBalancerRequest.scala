package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachInstancesToLoadBalancerRequest extends StObject {
  
  /**
    * An array of strings representing the instance name(s) you want to attach to your load balancer. An instance must be running before you can attach it to your load balancer. There are no additional limits on the number of instances you can attach to your load balancer, aside from the limit of Lightsail instances you can create in your account (20).
    */
  var instanceNames: ResourceNameList
  
  /**
    * The name of the load balancer.
    */
  var loadBalancerName: ResourceName
}
object AttachInstancesToLoadBalancerRequest {
  
  inline def apply(instanceNames: ResourceNameList, loadBalancerName: ResourceName): AttachInstancesToLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachInstancesToLoadBalancerRequest]
  }
  
  extension [Self <: AttachInstancesToLoadBalancerRequest](x: Self) {
    
    inline def setInstanceNames(value: ResourceNameList): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    inline def setInstanceNamesVarargs(value: ResourceName*): Self = StObject.set(x, "instanceNames", js.Array(value*))
    
    inline def setLoadBalancerName(value: ResourceName): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
  }
}
