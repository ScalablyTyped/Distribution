package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndPointStateInput extends StObject {
  
  /**
    * The IDs of the instances.
    */
  var Instances: js.UndefOr[typings.awsSdk.clientsElbMod.Instances] = js.undefined
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}
object DescribeEndPointStateInput {
  
  inline def apply(LoadBalancerName: AccessPointName): DescribeEndPointStateInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndPointStateInput]
  }
  
  extension [Self <: DescribeEndPointStateInput](x: Self) {
    
    inline def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
