package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFleetPortSettingsInput extends js.Object {
  /**
    * Unique identifier for a fleet to retrieve port settings for.
    */
  var FleetId: typings.awsDashSdk.clientsGameliftMod.FleetId
}

object DescribeFleetPortSettingsInput {
  @scala.inline
  def apply(FleetId: FleetId): DescribeFleetPortSettingsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId)
  
    __obj.asInstanceOf[DescribeFleetPortSettingsInput]
  }
}

