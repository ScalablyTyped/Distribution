package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopInstanceRequest extends js.Object {
  /**
    * When set to True, forces a Lightsail instance that is stuck in a stopping state to stop.  Only use the force parameter if your instance is stuck in the stopping state. In any other state, your instance should stop normally without adding this parameter to your API request. 
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * The name of the instance (a virtual private server) to stop.
    */
  var instanceName: ResourceName = js.native
}

object StopInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName, force: js.UndefOr[Boolean] = js.undefined): StopInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopInstanceRequest]
  }
}

