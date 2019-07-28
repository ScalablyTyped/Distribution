package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyInstanceGroupsInput extends js.Object {
  /**
    * The ID of the cluster to which the instance group belongs.
    */
  var ClusterId: js.UndefOr[typings.awsDashSdk.clientsEmrMod.ClusterId] = js.undefined
  /**
    * Instance groups to change.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupModifyConfigList] = js.undefined
}

object ModifyInstanceGroupsInput {
  @scala.inline
  def apply(ClusterId: ClusterId = null, InstanceGroups: InstanceGroupModifyConfigList = null): ModifyInstanceGroupsInput = {
    val __obj = js.Dynamic.literal()
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId)
    if (InstanceGroups != null) __obj.updateDynamic("InstanceGroups")(InstanceGroups)
    __obj.asInstanceOf[ModifyInstanceGroupsInput]
  }
}

