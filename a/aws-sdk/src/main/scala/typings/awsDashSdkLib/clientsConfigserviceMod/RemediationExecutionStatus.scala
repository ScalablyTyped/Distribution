package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemediationExecutionStatus extends js.Object {
  /**
    * Start time when the remediation was executed.
    */
  var InvocationTime: js.UndefOr[_Date] = js.undefined
  /**
    * The time when the remediation execution was last updated.
    */
  var LastUpdatedTime: js.UndefOr[_Date] = js.undefined
  var ResourceKey: js.UndefOr[ResourceKey] = js.undefined
  /**
    * ENUM of the values.
    */
  var State: js.UndefOr[RemediationExecutionState] = js.undefined
  /**
    * Details of every step.
    */
  var StepDetails: js.UndefOr[RemediationExecutionSteps] = js.undefined
}

object RemediationExecutionStatus {
  @scala.inline
  def apply(
    InvocationTime: _Date = null,
    LastUpdatedTime: _Date = null,
    ResourceKey: ResourceKey = null,
    State: RemediationExecutionState = null,
    StepDetails: RemediationExecutionSteps = null
  ): RemediationExecutionStatus = {
    val __obj = js.Dynamic.literal()
    if (InvocationTime != null) __obj.updateDynamic("InvocationTime")(InvocationTime)
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime)
    if (ResourceKey != null) __obj.updateDynamic("ResourceKey")(ResourceKey)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StepDetails != null) __obj.updateDynamic("StepDetails")(StepDetails)
    __obj.asInstanceOf[RemediationExecutionStatus]
  }
}

