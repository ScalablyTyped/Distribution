package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFleetResponse extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: js.UndefOr[FleetArn] = js.undefined
}

object CreateFleetResponse {
  @scala.inline
  def apply(FleetArn: FleetArn = null): CreateFleetResponse = {
    val __obj = js.Dynamic.literal()
    if (FleetArn != null) __obj.updateDynamic("FleetArn")(FleetArn)
    __obj.asInstanceOf[CreateFleetResponse]
  }
}

