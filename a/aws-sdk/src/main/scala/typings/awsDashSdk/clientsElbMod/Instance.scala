package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsElbMod.InstanceId] = js.native
}

object Instance {
  @scala.inline
  def apply(InstanceId: InstanceId = null): Instance = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

