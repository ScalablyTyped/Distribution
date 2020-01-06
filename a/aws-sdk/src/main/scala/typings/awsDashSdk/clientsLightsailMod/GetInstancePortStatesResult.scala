package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancePortStatesResult extends js.Object {
  /**
    * Information about the port states resulting from your request.
    */
  var portStates: js.UndefOr[InstancePortStateList] = js.native
}

object GetInstancePortStatesResult {
  @scala.inline
  def apply(portStates: InstancePortStateList = null): GetInstancePortStatesResult = {
    val __obj = js.Dynamic.literal()
    if (portStates != null) __obj.updateDynamic("portStates")(portStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstancePortStatesResult]
  }
}

