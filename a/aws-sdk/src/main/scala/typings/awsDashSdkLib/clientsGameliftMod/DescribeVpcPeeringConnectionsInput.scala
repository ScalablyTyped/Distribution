package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcPeeringConnectionsInput extends js.Object {
  /**
    * Unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[FleetId] = js.undefined
}

object DescribeVpcPeeringConnectionsInput {
  @scala.inline
  def apply(FleetId: FleetId = null): DescribeVpcPeeringConnectionsInput = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsInput]
  }
}

