package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBootstrapActionsInput extends js.Object {
  /**
    * The cluster identifier for the bootstrap actions to list.
    */
  var ClusterId: typings.awsDashSdk.clientsEmrMod.ClusterId
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEmrMod.Marker] = js.undefined
}

object ListBootstrapActionsInput {
  @scala.inline
  def apply(ClusterId: ClusterId, Marker: Marker = null): ListBootstrapActionsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListBootstrapActionsInput]
  }
}

