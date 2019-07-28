package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstanceResult extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}

object CreateInstanceResult {
  @scala.inline
  def apply(InstanceId: String = null): CreateInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[CreateInstanceResult]
  }
}

