package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstanceGroupsInput extends js.Object {
  /**
    * The identifier of the cluster for which to list the instance groups.
    */
  var ClusterId: awsDashSdkLib.clientsEmrMod.ClusterId
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[Marker] = js.undefined
}

object ListInstanceGroupsInput {
  @scala.inline
  def apply(ClusterId: ClusterId, Marker: Marker = null): ListInstanceGroupsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListInstanceGroupsInput]
  }
}

