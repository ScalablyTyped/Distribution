package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceStateResult extends js.Object {
  /**
    * The state of the instance.
    */
  var state: js.UndefOr[InstanceState] = js.undefined
}

object GetInstanceStateResult {
  @scala.inline
  def apply(state: InstanceState = null): GetInstanceStateResult = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[GetInstanceStateResult]
  }
}

