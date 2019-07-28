package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddInstanceGroupsInput extends js.Object {
  /**
    * Instance groups to add.
    */
  var InstanceGroups: InstanceGroupConfigList
  /**
    * Job flow in which to add the instance groups.
    */
  var JobFlowId: XmlStringMaxLen256
}

object AddInstanceGroupsInput {
  @scala.inline
  def apply(InstanceGroups: InstanceGroupConfigList, JobFlowId: XmlStringMaxLen256): AddInstanceGroupsInput = {
    val __obj = js.Dynamic.literal(InstanceGroups = InstanceGroups, JobFlowId = JobFlowId)
  
    __obj.asInstanceOf[AddInstanceGroupsInput]
  }
}

