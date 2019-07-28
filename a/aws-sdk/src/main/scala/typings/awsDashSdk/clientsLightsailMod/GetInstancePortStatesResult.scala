package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstancePortStatesResult extends js.Object {
  /**
    * Information about the port states resulting from your request.
    */
  var portStates: js.UndefOr[InstancePortStateList] = js.undefined
}

object GetInstancePortStatesResult {
  @scala.inline
  def apply(portStates: InstancePortStateList = null): GetInstancePortStatesResult = {
    val __obj = js.Dynamic.literal()
    if (portStates != null) __obj.updateDynamic("portStates")(portStates)
    __obj.asInstanceOf[GetInstancePortStatesResult]
  }
}

