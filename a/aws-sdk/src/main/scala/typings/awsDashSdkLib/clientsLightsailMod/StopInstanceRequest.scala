package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopInstanceRequest extends js.Object {
  /**
    * When set to True, forces a Lightsail instance that is stuck in a stopping state to stop.  Only use the force parameter if your instance is stuck in the stopping state. In any other state, your instance should stop normally without adding this parameter to your API request. 
    */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the instance (a virtual private server) to stop.
    */
  var instanceName: ResourceName
}

object StopInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName, force: js.UndefOr[scala.Boolean] = js.undefined): StopInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[StopInstanceRequest]
  }
}

