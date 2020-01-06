package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decision extends js.Object {
  /**
    * Provides the details of the CancelTimer decision. It isn't set for other decision types.
    */
  var cancelTimerDecisionAttributes: js.UndefOr[CancelTimerDecisionAttributes] = js.native
  /**
    * Provides the details of the CancelWorkflowExecution decision. It isn't set for other decision types.
    */
  var cancelWorkflowExecutionDecisionAttributes: js.UndefOr[CancelWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the CompleteWorkflowExecution decision. It isn't set for other decision types.
    */
  var completeWorkflowExecutionDecisionAttributes: js.UndefOr[CompleteWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the ContinueAsNewWorkflowExecution decision. It isn't set for other decision types.
    */
  var continueAsNewWorkflowExecutionDecisionAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Specifies the type of the decision.
    */
  var decisionType: DecisionType = js.native
  /**
    * Provides the details of the FailWorkflowExecution decision. It isn't set for other decision types.
    */
  var failWorkflowExecutionDecisionAttributes: js.UndefOr[FailWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the RecordMarker decision. It isn't set for other decision types.
    */
  var recordMarkerDecisionAttributes: js.UndefOr[RecordMarkerDecisionAttributes] = js.native
  /**
    * Provides the details of the RequestCancelActivityTask decision. It isn't set for other decision types.
    */
  var requestCancelActivityTaskDecisionAttributes: js.UndefOr[RequestCancelActivityTaskDecisionAttributes] = js.native
  /**
    * Provides the details of the RequestCancelExternalWorkflowExecution decision. It isn't set for other decision types.
    */
  var requestCancelExternalWorkflowExecutionDecisionAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the ScheduleActivityTask decision. It isn't set for other decision types.
    */
  var scheduleActivityTaskDecisionAttributes: js.UndefOr[ScheduleActivityTaskDecisionAttributes] = js.native
  /**
    * Provides the details of the ScheduleLambdaFunction decision. It isn't set for other decision types.
    */
  var scheduleLambdaFunctionDecisionAttributes: js.UndefOr[ScheduleLambdaFunctionDecisionAttributes] = js.native
  /**
    * Provides the details of the SignalExternalWorkflowExecution decision. It isn't set for other decision types.
    */
  var signalExternalWorkflowExecutionDecisionAttributes: js.UndefOr[SignalExternalWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the StartChildWorkflowExecution decision. It isn't set for other decision types.
    */
  var startChildWorkflowExecutionDecisionAttributes: js.UndefOr[StartChildWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the StartTimer decision. It isn't set for other decision types.
    */
  var startTimerDecisionAttributes: js.UndefOr[StartTimerDecisionAttributes] = js.native
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
    if (cancelTimerDecisionAttributes != null) __obj.updateDynamic("cancelTimerDecisionAttributes")(cancelTimerDecisionAttributes.asInstanceOf[js.Any])
    if (cancelWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("cancelWorkflowExecutionDecisionAttributes")(cancelWorkflowExecutionDecisionAttributes.asInstanceOf[js.Any])
    if (completeWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("completeWorkflowExecutionDecisionAttributes")(completeWorkflowExecutionDecisionAttributes.asInstanceOf[js.Any])
    if (continueAsNewWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("continueAsNewWorkflowExecutionDecisionAttributes")(continueAsNewWorkflowExecutionDecisionAttributes.asInstanceOf[js.Any])
    if (failWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("failWorkflowExecutionDecisionAttributes")(failWorkflowExecutionDecisionAttributes.asInstanceOf[js.Any])
    if (recordMarkerDecisionAttributes != null) __obj.updateDynamic("recordMarkerDecisionAttributes")(recordMarkerDecisionAttributes.asInstanceOf[js.Any])
    if (requestCancelActivityTaskDecisionAttributes != null) __obj.updateDynamic("requestCancelActivityTaskDecisionAttributes")(requestCancelActivityTaskDecisionAttributes.asInstanceOf[js.Any])
    if (requestCancelExternalWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("requestCancelExternalWorkflowExecutionDecisionAttributes")(requestCancelExternalWorkflowExecutionDecisionAttributes.asInstanceOf[js.Any])
    if (scheduleActivityTaskDecisionAttributes != null) __obj.updateDynamic("scheduleActivityTaskDecisionAttributes")(scheduleActivityTaskDecisionAttributes.asInstanceOf[js.Any])
    if (scheduleLambdaFunctionDecisionAttributes != null) __obj.updateDynamic("scheduleLambdaFunctionDecisionAttributes")(scheduleLambdaFunctionDecisionAttributes.asInstanceOf[js.Any])
    if (signalExternalWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("signalExternalWorkflowExecutionDecisionAttributes")(signalExternalWorkflowExecutionDecisionAttributes.asInstanceOf[js.Any])
    if (startChildWorkflowExecutionDecisionAttributes != null) __obj.updateDynamic("startChildWorkflowExecutionDecisionAttributes")(startChildWorkflowExecutionDecisionAttributes.asInstanceOf[js.Any])
    if (startTimerDecisionAttributes != null) __obj.updateDynamic("startTimerDecisionAttributes")(startTimerDecisionAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decision]
  }
}

