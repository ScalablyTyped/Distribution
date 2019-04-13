package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStepsOutput extends js.Object {
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[Marker] = js.undefined
  /**
    * The filtered list of steps for the cluster.
    */
  var Steps: js.UndefOr[StepSummaryList] = js.undefined
}

object ListStepsOutput {
  @scala.inline
  def apply(Marker: Marker = null, Steps: StepSummaryList = null): ListStepsOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Steps != null) __obj.updateDynamic("Steps")(Steps)
    __obj.asInstanceOf[ListStepsOutput]
  }
}

