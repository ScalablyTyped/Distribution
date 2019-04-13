package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStepsInput extends js.Object {
  /**
    * The identifier of the cluster for which to list the steps.
    */
  var ClusterId: awsDashSdkLib.clientsEmrMod.ClusterId
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[Marker] = js.undefined
  /**
    * The filter to limit the step list based on the identifier of the steps.
    */
  var StepIds: js.UndefOr[XmlStringList] = js.undefined
  /**
    * The filter to limit the step list based on certain states.
    */
  var StepStates: js.UndefOr[StepStateList] = js.undefined
}

object ListStepsInput {
  @scala.inline
  def apply(
    ClusterId: ClusterId,
    Marker: Marker = null,
    StepIds: XmlStringList = null,
    StepStates: StepStateList = null
  ): ListStepsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (StepIds != null) __obj.updateDynamic("StepIds")(StepIds)
    if (StepStates != null) __obj.updateDynamic("StepStates")(StepStates)
    __obj.asInstanceOf[ListStepsInput]
  }
}

