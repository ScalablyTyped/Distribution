package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClustersInput extends js.Object {
  /**
    * The cluster state filters to apply when listing clusters.
    */
  var ClusterStates: js.UndefOr[ClusterStateList] = js.undefined
  /**
    * The creation date and time beginning value filter for listing clusters.
    */
  var CreatedAfter: js.UndefOr[_Date] = js.undefined
  /**
    * The creation date and time end value filter for listing clusters.
    */
  var CreatedBefore: js.UndefOr[_Date] = js.undefined
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEmrMod.Marker] = js.undefined
}

object ListClustersInput {
  @scala.inline
  def apply(
    ClusterStates: ClusterStateList = null,
    CreatedAfter: _Date = null,
    CreatedBefore: _Date = null,
    Marker: Marker = null
  ): ListClustersInput = {
    val __obj = js.Dynamic.literal()
    if (ClusterStates != null) __obj.updateDynamic("ClusterStates")(ClusterStates)
    if (CreatedAfter != null) __obj.updateDynamic("CreatedAfter")(CreatedAfter)
    if (CreatedBefore != null) __obj.updateDynamic("CreatedBefore")(CreatedBefore)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListClustersInput]
  }
}

