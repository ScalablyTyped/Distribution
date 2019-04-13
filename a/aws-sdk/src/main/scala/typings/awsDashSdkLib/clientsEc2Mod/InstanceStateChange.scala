package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceStateChange extends js.Object {
  /**
    * The current state of the instance.
    */
  var CurrentState: js.UndefOr[InstanceState] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The previous state of the instance.
    */
  var PreviousState: js.UndefOr[InstanceState] = js.undefined
}

object InstanceStateChange {
  @scala.inline
  def apply(CurrentState: InstanceState = null, InstanceId: String = null, PreviousState: InstanceState = null): InstanceStateChange = {
    val __obj = js.Dynamic.literal()
    if (CurrentState != null) __obj.updateDynamic("CurrentState")(CurrentState)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (PreviousState != null) __obj.updateDynamic("PreviousState")(PreviousState)
    __obj.asInstanceOf[InstanceStateChange]
  }
}

