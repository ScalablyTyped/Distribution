package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstancesOutput extends js.Object {
  /**
    * The list of instances for the cluster and given filters.
    */
  var Instances: js.UndefOr[InstanceList] = js.undefined
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEmrMod.Marker] = js.undefined
}

object ListInstancesOutput {
  @scala.inline
  def apply(Instances: InstanceList = null, Marker: Marker = null): ListInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListInstancesOutput]
  }
}

