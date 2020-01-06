package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceResizePolicy extends js.Object {
  /**
    * Decommissioning timeout override for the specific list of instances to be terminated.
    */
  var InstanceTerminationTimeout: js.UndefOr[Integer] = js.native
  /**
    * Specific list of instances to be protected when shrinking an instance group.
    */
  var InstancesToProtect: js.UndefOr[EC2InstanceIdsList] = js.native
  /**
    * Specific list of instances to be terminated when shrinking an instance group.
    */
  var InstancesToTerminate: js.UndefOr[EC2InstanceIdsList] = js.native
}

object InstanceResizePolicy {
  @scala.inline
  def apply(
    InstanceTerminationTimeout: Int | Double = null,
    InstancesToProtect: EC2InstanceIdsList = null,
    InstancesToTerminate: EC2InstanceIdsList = null
  ): InstanceResizePolicy = {
    val __obj = js.Dynamic.literal()
    if (InstanceTerminationTimeout != null) __obj.updateDynamic("InstanceTerminationTimeout")(InstanceTerminationTimeout.asInstanceOf[js.Any])
    if (InstancesToProtect != null) __obj.updateDynamic("InstancesToProtect")(InstancesToProtect.asInstanceOf[js.Any])
    if (InstancesToTerminate != null) __obj.updateDynamic("InstancesToTerminate")(InstancesToTerminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceResizePolicy]
  }
}

