package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstanceGroupsInput extends js.Object {
  /**
    * The identifier of the cluster for which to list the instance groups.
    */
  var ClusterId: typings.awsDashSdk.clientsEmrMod.ClusterId = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEmrMod.Marker] = js.native
}

object ListInstanceGroupsInput {
  @scala.inline
  def apply(ClusterId: ClusterId, Marker: Marker = null): ListInstanceGroupsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceGroupsInput]
  }
}

