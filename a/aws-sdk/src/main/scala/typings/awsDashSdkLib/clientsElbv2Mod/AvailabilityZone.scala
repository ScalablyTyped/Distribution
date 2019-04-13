package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailabilityZone extends js.Object {
  /**
    * [Network Load Balancers] The static IP address.
    */
  var LoadBalancerAddresses: js.UndefOr[LoadBalancerAddresses] = js.undefined
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[SubnetId] = js.undefined
  /**
    * The name of the Availability Zone.
    */
  var ZoneName: js.UndefOr[ZoneName] = js.undefined
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

