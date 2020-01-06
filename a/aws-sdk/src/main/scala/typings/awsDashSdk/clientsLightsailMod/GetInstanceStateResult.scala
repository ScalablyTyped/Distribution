package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceStateResult extends js.Object {
  /**
    * The state of the instance.
    */
  var state: js.UndefOr[InstanceState] = js.native
}

object GetInstanceStateResult {
  @scala.inline
  def apply(state: InstanceState = null): GetInstanceStateResult = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceStateResult]
  }
}

