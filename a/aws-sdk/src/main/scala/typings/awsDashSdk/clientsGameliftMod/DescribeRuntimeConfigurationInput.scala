package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRuntimeConfigurationInput extends js.Object {
  /**
    * Unique identifier for a fleet to get the run-time configuration for.
    */
  var FleetId: typings.awsDashSdk.clientsGameliftMod.FleetId
}

object DescribeRuntimeConfigurationInput {
  @scala.inline
  def apply(FleetId: FleetId): DescribeRuntimeConfigurationInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId)
  
    __obj.asInstanceOf[DescribeRuntimeConfigurationInput]
  }
}

