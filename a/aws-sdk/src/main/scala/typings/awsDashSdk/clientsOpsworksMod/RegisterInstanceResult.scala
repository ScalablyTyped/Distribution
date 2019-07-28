package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterInstanceResult extends js.Object {
  /**
    * The registered instance's AWS OpsWorks Stacks ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}

object RegisterInstanceResult {
  @scala.inline
  def apply(InstanceId: String = null): RegisterInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[RegisterInstanceResult]
  }
}

