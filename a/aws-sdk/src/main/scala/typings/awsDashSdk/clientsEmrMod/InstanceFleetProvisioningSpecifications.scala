package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceFleetProvisioningSpecifications extends js.Object {
  /**
    * The launch specification for Spot instances in the fleet, which determines the defined duration and provisioning timeout behavior.
    */
  var SpotSpecification: SpotProvisioningSpecification
}

object InstanceFleetProvisioningSpecifications {
  @scala.inline
  def apply(SpotSpecification: SpotProvisioningSpecification): InstanceFleetProvisioningSpecifications = {
    val __obj = js.Dynamic.literal(SpotSpecification = SpotSpecification)
  
    __obj.asInstanceOf[InstanceFleetProvisioningSpecifications]
  }
}

