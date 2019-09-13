package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailabilityZone extends js.Object {
  /**
    * [Network Load Balancers] If you need static IP addresses for your load balancer, you can specify one Elastic IP address per Availability Zone when you create the load balancer.
    */
  var LoadBalancerAddresses: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.LoadBalancerAddresses] = js.undefined
  /**
    * The ID of the subnet. You can specify one subnet per Availability Zone.
    */
  var SubnetId: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.SubnetId] = js.undefined
  /**
    * The name of the Availability Zone.
    */
  var ZoneName: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.ZoneName] = js.undefined
}

object AvailabilityZone {
  @scala.inline
  def apply(
    LoadBalancerAddresses: LoadBalancerAddresses = null,
    SubnetId: SubnetId = null,
    ZoneName: ZoneName = null
  ): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerAddresses != null) __obj.updateDynamic("LoadBalancerAddresses")(LoadBalancerAddresses)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (ZoneName != null) __obj.updateDynamic("ZoneName")(ZoneName)
    __obj.asInstanceOf[AvailabilityZone]
  }
}

