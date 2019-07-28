package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddInstanceGroupsOutput extends js.Object {
  /**
    * Instance group IDs of the newly created instance groups.
    */
  var InstanceGroupIds: js.UndefOr[InstanceGroupIdsList] = js.undefined
  /**
    * The job flow ID in which the instance groups are added.
    */
  var JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined
}

object AddInstanceGroupsOutput {
  @scala.inline
  def apply(InstanceGroupIds: InstanceGroupIdsList = null, JobFlowId: XmlStringMaxLen256 = null): AddInstanceGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (InstanceGroupIds != null) __obj.updateDynamic("InstanceGroupIds")(InstanceGroupIds)
    if (JobFlowId != null) __obj.updateDynamic("JobFlowId")(JobFlowId)
    __obj.asInstanceOf[AddInstanceGroupsOutput]
  }
}

