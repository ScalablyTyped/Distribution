package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstanceFleetsInput extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: typings.awsDashSdk.clientsEmrMod.ClusterId
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEmrMod.Marker] = js.undefined
}

object ListInstanceFleetsInput {
  @scala.inline
  def apply(ClusterId: ClusterId, Marker: Marker = null): ListInstanceFleetsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListInstanceFleetsInput]
  }
}

