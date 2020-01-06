package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStepsOutput extends js.Object {
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEmrMod.Marker] = js.native
  /**
    * The filtered list of steps for the cluster.
    */
  var Steps: js.UndefOr[StepSummaryList] = js.native
}

object ListStepsOutput {
  @scala.inline
  def apply(Marker: Marker = null, Steps: StepSummaryList = null): ListStepsOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Steps != null) __obj.updateDynamic("Steps")(Steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStepsOutput]
  }
}

