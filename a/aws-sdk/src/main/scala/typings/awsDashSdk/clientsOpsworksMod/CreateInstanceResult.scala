package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceResult extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
}

object CreateInstanceResult {
  @scala.inline
  def apply(InstanceId: String = null): CreateInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceResult]
  }
}

