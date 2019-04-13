package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelStepsInfo extends js.Object {
  /**
    * The reason for the failure if the CancelSteps request fails.
    */
  var Reason: js.UndefOr[String] = js.undefined
  /**
    * The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
    */
  var Status: js.UndefOr[CancelStepsRequestStatus] = js.undefined
  /**
    * The encrypted StepId of a step.
    */
  var StepId: js.UndefOr[StepId] = js.undefined
}

object CancelStepsInfo {
  @scala.inline
  def apply(Reason: String = null, Status: CancelStepsRequestStatus = null, StepId: StepId = null): CancelStepsInfo = {
    val __obj = js.Dynamic.literal()
    if (Reason != null) __obj.updateDynamic("Reason")(Reason)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StepId != null) __obj.updateDynamic("StepId")(StepId)
    __obj.asInstanceOf[CancelStepsInfo]
  }
}

