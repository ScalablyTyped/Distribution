package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstanceGroupsOutput extends js.Object {
  /**
    * The list of instance groups for the cluster and given filters.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupList] = js.undefined
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEmrMod.Marker] = js.undefined
}

object ListInstanceGroupsOutput {
  @scala.inline
  def apply(InstanceGroups: InstanceGroupList = null, Marker: Marker = null): ListInstanceGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (InstanceGroups != null) __obj.updateDynamic("InstanceGroups")(InstanceGroups)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListInstanceGroupsOutput]
  }
}

