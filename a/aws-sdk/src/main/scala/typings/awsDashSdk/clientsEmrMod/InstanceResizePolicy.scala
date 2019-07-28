package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceResizePolicy extends js.Object {
  /**
    * Decommissioning timeout override for the specific list of instances to be terminated.
    */
  var InstanceTerminationTimeout: js.UndefOr[Integer] = js.undefined
  /**
    * Specific list of instances to be protected when shrinking an instance group.
    */
  var InstancesToProtect: js.UndefOr[EC2InstanceIdsList] = js.undefined
  /**
    * Specific list of instances to be terminated when shrinking an instance group.
    */
  var InstancesToTerminate: js.UndefOr[EC2InstanceIdsList] = js.undefined
}

object InstanceResizePolicy {
  @scala.inline
  def apply(
    InstanceTerminationTimeout: js.UndefOr[Integer] = js.undefined,
    InstancesToProtect: EC2InstanceIdsList = null,
    InstancesToTerminate: EC2InstanceIdsList = null
  ): InstanceResizePolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(InstanceTerminationTimeout)) __obj.updateDynamic("InstanceTerminationTimeout")(InstanceTerminationTimeout)
    if (InstancesToProtect != null) __obj.updateDynamic("InstancesToProtect")(InstancesToProtect)
    if (InstancesToTerminate != null) __obj.updateDynamic("InstancesToTerminate")(InstancesToTerminate)
    __obj.asInstanceOf[InstanceResizePolicy]
  }
}

