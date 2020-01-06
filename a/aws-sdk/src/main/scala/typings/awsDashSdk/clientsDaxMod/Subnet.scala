package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subnet extends js.Object {
  /**
    * The Availability Zone (AZ) for the subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The system-assigned identifier for the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.native
}

object Subnet {
  @scala.inline
  def apply(SubnetAvailabilityZone: String = null, SubnetIdentifier: String = null): Subnet = {
    val __obj = js.Dynamic.literal()
    if (SubnetAvailabilityZone != null) __obj.updateDynamic("SubnetAvailabilityZone")(SubnetAvailabilityZone.asInstanceOf[js.Any])
    if (SubnetIdentifier != null) __obj.updateDynamic("SubnetIdentifier")(SubnetIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subnet]
  }
}

