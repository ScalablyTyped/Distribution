package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decision extends js.Object {
  /**
    * Provides the details of the CancelTimer decision. It isn't set for other decision types.
    */
  var cancelTimerDecisionAttributes: js.UndefOr[CancelTimerDecisionAttributes] = js.undefined
  /**
    * Provides the details of the CancelWorkflowExecution decision. It isn't set for other decision types.
    */
  var cancelWorkflowExecutionDecisionAttributes: js.UndefOr[CancelWorkflowExecutionDecisionAttributes] = js.undefined
  /**
    * Provides the details of the CompleteWorkflowExecution decision. It isn't set for other decision types.
    */
  var completeWorkflowExecutionDecisionAttributes: js.UndefOr[CompleteWorkflowExecutionDecisionAttributes] = js.undefined
  /**
    * Provides the details of the ContinueAsNewWorkflowExecution decision. It isn't set for other decision types.
    */
  var continueAsNewWorkflowExecutionDecisionAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionDecisionAttributes] = js.undefined
  /**
    * Specifies the type of the decision.
    */
  var decisionType: DecisionType
  /**
    * Provides the details of the FailWorkflowExecution decision. It isn't set for other decision types.
    */
  var failWorkflowExecutionDecisionAttributes: js.UndefOr[FailWorkflowExecutionDecisionAttributes] = js.undefined
  /**
    * Provides the details of the RecordMarker decision. It isn't set for other decision types.
    */
  var recordMarkerDecisionAttributes: js.UndefOr[RecordMarkerDecisionAttributes] = js.undefined
  /**
    * Provides the details of the RequestCancelActivityTask decision. It isn't set for other decision types.
    */
  var requestCancelActivityTaskDecisionAttributes: js.UndefOr[RequestCancelActivityTaskDecisionAttributes] = js.undefined
  /**
    * Provides the details of the RequestCancelExternalWorkflowExecution decision. It isn't set for other decision types.
    */
  var requestCancelExternalWorkflowExecutionDecisionAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionDecisionAttributes] = js.undefined
  /**
    * Provides the details of the ScheduleActivityTask decision. It isn't set for other decision types.
    */
  var scheduleActivityTaskDecisionAttributes: js.UndefOr[ScheduleActivityTaskDecisionAttributes] = js.undefined
  /**
    * Provides the details of the ScheduleLambdaFunction decision. It isn't set for other decision types.
    */
  var scheduleLambdaFunctionDecisionAttributes: js.UndefOr[ScheduleLambdaFunctionDecisionAttributes] = js.undefined
  /**
    * Provides the details of the SignalExternalWorkflowExecution decision. It isn't set for other decision types.
    */
  var signalExternalWorkflowExecutionDecisionAttributes: js.UndefOr[SignalExternalWorkflowExecutionDecisionAttributes] = js.undefined
  /**
    * Provides the details of the StartChildWorkflowExecution decision. It isn't set for other decision types.
    */
  var startChildWorkflowExecutionDecisionAttributes: js.UndefOr[StartChildWorkflowExecutionDecisionAttributes] = js.undefined
  /**
    * Provides the details of the StartTimer decision. It isn't set for other decision types.
    */
  var startTimerDecisionAttributes: js.UndefOr[StartTimerDecisionAttributes] = js.undefined
}

object Decision {
  @scala.inline
  def apply(
    decisionType: DecisionType,
    cancelTimerDecisionAttributes: CancelTimerDecisionAttributes = null,
    cancelWorkflowExecutionDecisionAttributes: CancelWorkflowExecutionDecisionAttributes = null,
    completeWorkflowExecutionDecisionAttributes: CompleteWorkflowExecutionDecisionAttributes = null,
    continueAsNewWorkflowExecutionDecisionAttributes: ContinueAsNewWorkflowExecutionDecisionAttributes = null,
    failWorkflowExecutionDecisionAttributes: FailWorkflowExecutionDecisionAttributes = null,
    recordMarkerDecisionAttributes: RecordMarkerDecisionAttributes = null,
    requestCancelActivityTaskDecisionAttributes: RequestCancelActivityTaskDecisionAttributes = null,
    requestCancelExternalWorkflowExecutionDecisionAttributes: RequestCancelExternalWorkflowExecutionDecisionAttributes = null,
    scheduleActivityTaskDecisionAttributes: ScheduleActivityTaskDecisionAttributes = null,
    scheduleLambdaFunctionDecisionAttributes: ScheduleLambdaFunctionDecisionAttributes = null,
    signalExternalWorkflowExecutionDecisionAttributes: SignalExternalWorkflowExecutionDecisionAttributes = null,
    startChildWorkflowExecutionDecisionAttributes: StartChildWorkflowExecutionDecisionAttributes = null,
    startTimerDecisionAttributes: StartTimerDecisionAttributes = null
  ): Decision = {
    val __obj = js.Dynamic.literal(decisionType = decisionType.asInstanceOf[js.Any])
    if (cancelTimerDecisionAttributes != null) __obj.updateDynamic("cancelTimerDecisionAttributes")(cancelTimerDecisionAttributes)
    if (cancelWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("cancelWorkflowExecutionDecisionAttributes")(cancelWorkflowExecutionDecisionAttributes)
    if (completeWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("completeWorkflowExecutionDecisionAttributes")(completeWorkflowExecutionDecisionAttributes)
    if (continueAsNewWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("continueAsNewWorkflowExecutionDecisionAttributes")(continueAsNewWorkflowExecutionDecisionAttributes)
    if (failWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("failWorkflowExecutionDecisionAttributes")(failWorkflowExecutionDecisionAttributes)
    if (recordMarkerDecisionAttributes != null) __obj.updateDynamic("recordMarkerDecisionAttributes")(recordMarkerDecisionAttributes)
    if (requestCancelActivityTaskDecisionAttributes != null) __obj.updateDynamic("requestCancelActivityTaskDecisionAttributes")(requestCancelActivityTaskDecisionAttributes)
    if (requestCancelExternalWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("requestCancelExternalWorkflowExecutionDecisionAttributes")(requestCancelExternalWorkflowExecutionDecisionAttributes)
    if (scheduleActivityTaskDecisionAttributes != null) __obj.updateDynamic("scheduleActivityTaskDecisionAttributes")(scheduleActivityTaskDecisionAttributes)
    if (scheduleLambdaFunctionDecisionAttributes != null) __obj.updateDynamic("scheduleLambdaFunctionDecisionAttributes")(scheduleLambdaFunctionDecisionAttributes)
    if (signalExternalWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("signalExternalWorkflowExecutionDecisionAttributes")(signalExternalWorkflowExecutionDecisionAttributes)
    if (startChildWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("startChildWorkflowExecutionDecisionAttributes")(startChildWorkflowExecutionDecisionAttributes)
    if (startTimerDecisionAttributes != null) __obj.updateDynamic("startTimerDecisionAttributes")(startTimerDecisionAttributes)
    __obj.asInstanceOf[Decision]
  }
}

