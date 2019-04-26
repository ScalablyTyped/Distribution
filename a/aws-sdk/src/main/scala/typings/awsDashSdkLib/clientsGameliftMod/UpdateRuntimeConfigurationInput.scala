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
    * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom game build executable or a Realtime Servers script. The run-time configuration lists the types of server processes to run on an instance and includes the following configuration settings: the server executable or launch script file, launch parameters, and the number of processes to run concurrently on each instance. A CreateFleet request must include a run-time configuration with at least one server process configuration.
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

