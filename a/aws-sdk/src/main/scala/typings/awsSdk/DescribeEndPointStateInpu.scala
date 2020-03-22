package typings.awsSdk

import typings.awsSdk.elbMod.AccessPointName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/elb.DescribeEndPointStateInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeEndPointStateInpu extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The IDs of the instances.
    */
  var Instances: js.UndefOr[typings.awsSdk.elbMod.Instances] = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}

