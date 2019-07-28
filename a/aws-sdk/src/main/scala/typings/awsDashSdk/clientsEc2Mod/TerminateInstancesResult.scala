package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateInstancesResult extends js.Object {
  /**
    * Information about the terminated instances.
    */
  var TerminatingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined
}

object TerminateInstancesResult {
  @scala.inline
  def apply(TerminatingInstances: InstanceStateChangeList = null): TerminateInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (TerminatingInstances != null) __obj.updateDynamic("TerminatingInstances")(TerminatingInstances)
    __obj.asInstanceOf[TerminateInstancesResult]
  }
}

