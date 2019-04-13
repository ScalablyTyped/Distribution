package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRuntimeConfigurationInput extends js.Object {
  /**
    * Unique identifier for a fleet to update run-time configuration for.
    */
  var FleetId: awsDashSdkLib.clientsGameliftMod.FleetId
  /**
    * Instructions for launching server processes on each instance in the fleet. The run-time configuration for a fleet has a collection of server process configurations, one for each type of server process to run on an instance. A server process configuration specifies the location of the server executable, launch parameters, and the number of concurrent processes with that configuration to maintain on each instance.
    */
  var RuntimeConfiguration: awsDashSdkLib.clientsGameliftMod.RuntimeConfiguration
}

object UpdateRuntimeConfigurationInput {
  @scala.inline
  def apply(FleetId: FleetId, RuntimeConfiguration: RuntimeConfiguration): UpdateRuntimeConfigurationInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId, RuntimeConfiguration = RuntimeConfiguration)
  
    __obj.asInstanceOf[UpdateRuntimeConfigurationInput]
  }
}

