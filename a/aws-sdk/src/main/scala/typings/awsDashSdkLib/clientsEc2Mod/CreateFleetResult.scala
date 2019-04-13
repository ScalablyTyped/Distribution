package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFleetResult extends js.Object {
  /**
    * Information about the instances that could not be launched by the fleet. Valid only when Type is set to instant.
    */
  var Errors: js.UndefOr[CreateFleetErrorsSet] = js.undefined
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[FleetIdentifier] = js.undefined
  /**
    * Information about the instances that were launched by the fleet. Valid only when Type is set to instant.
    */
  var Instances: js.UndefOr[CreateFleetInstancesSet] = js.undefined
}

object CreateFleetResult {
  @scala.inline
  def apply(
    Errors: CreateFleetErrorsSet = null,
    FleetId: FleetIdentifier = null,
    Instances: CreateFleetInstancesSet = null
  ): CreateFleetResult = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors)
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    __obj.asInstanceOf[CreateFleetResult]
  }
}

