package typings.awsSdk.anon

import typings.awsSdk.clientsElbMod.AccessPointName
import typings.awsSdk.clientsElbMod.Instance
import typings.awsSdk.clientsElbMod.Instances
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/elb.DescribeEndPointStateInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeEndPointStateInpu extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The IDs of the instances.
    */
  var Instances: js.UndefOr[typings.awsSdk.clientsElbMod.Instances] = js.undefined
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}
object DescribeEndPointStateInpu {
  
  inline def apply(LoadBalancerName: AccessPointName): DescribeEndPointStateInpu = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndPointStateInpu]
  }
  
  extension [Self <: DescribeEndPointStateInpu](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
