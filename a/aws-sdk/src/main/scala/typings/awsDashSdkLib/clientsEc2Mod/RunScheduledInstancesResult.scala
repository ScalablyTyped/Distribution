package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunScheduledInstancesResult extends js.Object {
  /**
    * The IDs of the newly launched instances.
    */
  var InstanceIdSet: js.UndefOr[InstanceIdSet] = js.undefined
}

object RunScheduledInstancesResult {
  @scala.inline
  def apply(InstanceIdSet: InstanceIdSet = null): RunScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceIdSet != null) __obj.updateDynamic("InstanceIdSet")(InstanceIdSet)
    __obj.asInstanceOf[RunScheduledInstancesResult]
  }
}

