package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddInstanceGroupsInput extends js.Object {
  /**
    * Instance groups to add.
    */
  var InstanceGroups: InstanceGroupConfigList = js.native
  /**
    * Job flow in which to add the instance groups.
    */
  var JobFlowId: XmlStringMaxLen256 = js.native
}

object AddInstanceGroupsInput {
  @scala.inline
  def apply(InstanceGroups: InstanceGroupConfigList, JobFlowId: XmlStringMaxLen256): AddInstanceGroupsInput = {
    val __obj = js.Dynamic.literal(InstanceGroups = InstanceGroups.asInstanceOf[js.Any], JobFlowId = JobFlowId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddInstanceGroupsInput]
  }
}

