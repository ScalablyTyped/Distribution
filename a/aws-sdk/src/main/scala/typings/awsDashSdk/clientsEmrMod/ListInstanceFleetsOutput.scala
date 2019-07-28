package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstanceFleetsOutput extends js.Object {
  /**
    * The list of instance fleets for the cluster and given filters.
    */
  var InstanceFleets: js.UndefOr[InstanceFleetList] = js.undefined
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEmrMod.Marker] = js.undefined
}

object ListInstanceFleetsOutput {
  @scala.inline
  def apply(InstanceFleets: InstanceFleetList = null, Marker: Marker = null): ListInstanceFleetsOutput = {
    val __obj = js.Dynamic.literal()
    if (InstanceFleets != null) __obj.updateDynamic("InstanceFleets")(InstanceFleets)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListInstanceFleetsOutput]
  }
}

