package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subnet extends js.Object {
  /**
    * The Availability Zone associated with the subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
  /**
    * The unique identifier for the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.undefined
}

object Subnet {
  @scala.inline
  def apply(SubnetAvailabilityZone: AvailabilityZone = null, SubnetIdentifier: String = null): Subnet = {
    val __obj = js.Dynamic.literal()
    if (SubnetAvailabilityZone != null) __obj.updateDynamic("SubnetAvailabilityZone")(SubnetAvailabilityZone)
    if (SubnetIdentifier != null) __obj.updateDynamic("SubnetIdentifier")(SubnetIdentifier)
    __obj.asInstanceOf[Subnet]
  }
}

