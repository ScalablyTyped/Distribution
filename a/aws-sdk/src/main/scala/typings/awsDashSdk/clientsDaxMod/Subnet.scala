package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subnet extends js.Object {
  /**
    * The Availability Zone (AZ) for subnet subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The system-assigned identifier for the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.undefined
}

object Subnet {
  @scala.inline
  def apply(SubnetAvailabilityZone: String = null, SubnetIdentifier: String = null): Subnet = {
    val __obj = js.Dynamic.literal()
    if (SubnetAvailabilityZone != null) __obj.updateDynamic("SubnetAvailabilityZone")(SubnetAvailabilityZone)
    if (SubnetIdentifier != null) __obj.updateDynamic("SubnetIdentifier")(SubnetIdentifier)
    __obj.asInstanceOf[Subnet]
  }
}

