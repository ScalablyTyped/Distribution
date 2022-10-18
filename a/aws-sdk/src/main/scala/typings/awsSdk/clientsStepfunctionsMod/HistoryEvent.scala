package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryEvent extends StObject {
  
  var activityFailedEventDetails: js.UndefOr[ActivityFailedEventDetails] = js.undefined
  
  /**
    * Contains details about an activity schedule event that failed during an execution.
    */
  var activityScheduleFailedEventDetails: js.UndefOr[ActivityScheduleFailedEventDetails] = js.undefined
  
  var activityScheduledEventDetails: js.UndefOr[ActivityScheduledEventDetails] = js.undefined
  
  var activityStartedEventDetails: js.UndefOr[ActivityStartedEventDetails] = js.undefined
  
  var activitySucceededEventDetails: js.UndefOr[ActivitySucceededEventDetails] = js.undefined
  
  var activityTimedOutEventDetails: js.UndefOr[ActivityTimedOutEventDetails] = js.undefined
  
  var executionAbortedEventDetails: js.UndefOr[ExecutionAbortedEventDetails] = js.undefined
  
  var executionFailedEventDetails: js.UndefOr[ExecutionFailedEventDetails] = js.undefined
  
  var executionStartedEventDetails: js.UndefOr[ExecutionStartedEventDetails] = js.undefined
  
  var executionSucceededEventDetails: js.UndefOr[ExecutionSucceededEventDetails] = js.undefined
  
  var executionTimedOutEventDetails: js.UndefOr[ExecutionTimedOutEventDetails] = js.undefined
  
  /**
    * The id of the event. Events are numbered sequentially, starting at one.
    */
  var id: EventId
  
  var lambdaFunctionFailedEventDetails: js.UndefOr[LambdaFunctionFailedEventDetails] = js.undefined
  
  var lambdaFunctionScheduleFailedEventDetails: js.UndefOr[LambdaFunctionScheduleFailedEventDetails] = js.undefined
  
  var lambdaFunctionScheduledEventDetails: js.UndefOr[LambdaFunctionScheduledEventDetails] = js.undefined
  
  /**
    * Contains details about a lambda function that failed to start during an execution.
    */
  var lambdaFunctionStartFailedEventDetails: js.UndefOr[LambdaFunctionStartFailedEventDetails] = js.undefined
  
  /**
    * Contains details about a lambda function that terminated successfully during an execution.
    */
  var lambdaFunctionSucceededEventDetails: js.UndefOr[LambdaFunctionSucceededEventDetails] = js.undefined
  
  var lambdaFunctionTimedOutEventDetails: js.UndefOr[LambdaFunctionTimedOutEventDetails] = js.undefined
  
  /**
    * Contains details about an iteration of a Map state that was aborted.
    */
  var mapIterationAbortedEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined
  
  /**
    * Contains details about an iteration of a Map state that failed.
    */
  var mapIterationFailedEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined
  
  /**
    * Contains details about an iteration of a Map state that was started.
    */
  var mapIterationStartedEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined
  
  /**
    * Contains details about an iteration of a Map state that succeeded.
    */
  var mapIterationSucceededEventDetails: js.UndefOr[MapIterationEventDetails] = js.undefined
  
  /**
    * Contains details about Map state that was started.
    */
  var mapStateStartedEventDetails: js.UndefOr[MapStateStartedEventDetails] = js.undefined
  
  /**
    * The id of the previous event.
    */
  var previousEventId: js.UndefOr[EventId] = js.undefined
  
  var stateEnteredEventDetails: js.UndefOr[StateEnteredEventDetails] = js.undefined
  
  var stateExitedEventDetails: js.UndefOr[StateExitedEventDetails] = js.undefined
  
  /**
    * Contains details about the failure of a task.
    */
  var taskFailedEventDetails: js.UndefOr[TaskFailedEventDetails] = js.undefined
  
  /**
    * Contains details about a task that was scheduled.
    */
  var taskScheduledEventDetails: js.UndefOr[TaskScheduledEventDetails] = js.undefined
  
  /**
    * Contains details about a task that failed to start.
    */
  var taskStartFailedEventDetails: js.UndefOr[TaskStartFailedEventDetails] = js.undefined
  
  /**
    * Contains details about a task that was started.
    */
  var taskStartedEventDetails: js.UndefOr[TaskStartedEventDetails] = js.undefined
  
  /**
    * Contains details about a task that where the submit failed.
    */
  var taskSubmitFailedEventDetails: js.UndefOr[TaskSubmitFailedEventDetails] = js.undefined
  
  /**
    * Contains details about a submitted task.
    */
  var taskSubmittedEventDetails: js.UndefOr[TaskSubmittedEventDetails] = js.undefined
  
  /**
    * Contains details about a task that succeeded.
    */
  var taskSucceededEventDetails: js.UndefOr[TaskSucceededEventDetails] = js.undefined
  
  /**
    * Contains details about a task that timed out.
    */
  var taskTimedOutEventDetails: js.UndefOr[TaskTimedOutEventDetails] = js.undefined
  
  /**
    * The date and time the event occurred.
    */
  var timestamp: js.Date
  
  /**
    * The type of the event.
    */
  var `type`: HistoryEventType
}
object HistoryEvent {
  
  inline def apply(id: EventId, timestamp: js.Date, `type`: HistoryEventType): HistoryEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryEvent]
  }
  
  extension [Self <: HistoryEvent](x: Self) {
    
    inline def setActivityFailedEventDetails(value: ActivityFailedEventDetails): Self = StObject.set(x, "activityFailedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setActivityFailedEventDetailsUndefined: Self = StObject.set(x, "activityFailedEventDetails", js.undefined)
    
    inline def setActivityScheduleFailedEventDetails(value: ActivityScheduleFailedEventDetails): Self = StObject.set(x, "activityScheduleFailedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setActivityScheduleFailedEventDetailsUndefined: Self = StObject.set(x, "activityScheduleFailedEventDetails", js.undefined)
    
    inline def setActivityScheduledEventDetails(value: ActivityScheduledEventDetails): Self = StObject.set(x, "activityScheduledEventDetails", value.asInstanceOf[js.Any])
    
    inline def setActivityScheduledEventDetailsUndefined: Self = StObject.set(x, "activityScheduledEventDetails", js.undefined)
    
    inline def setActivityStartedEventDetails(value: ActivityStartedEventDetails): Self = StObject.set(x, "activityStartedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setActivityStartedEventDetailsUndefined: Self = StObject.set(x, "activityStartedEventDetails", js.undefined)
    
    inline def setActivitySucceededEventDetails(value: ActivitySucceededEventDetails): Self = StObject.set(x, "activitySucceededEventDetails", value.asInstanceOf[js.Any])
    
    inline def setActivitySucceededEventDetailsUndefined: Self = StObject.set(x, "activitySucceededEventDetails", js.undefined)
    
    inline def setActivityTimedOutEventDetails(value: ActivityTimedOutEventDetails): Self = StObject.set(x, "activityTimedOutEventDetails", value.asInstanceOf[js.Any])
    
    inline def setActivityTimedOutEventDetailsUndefined: Self = StObject.set(x, "activityTimedOutEventDetails", js.undefined)
    
    inline def setExecutionAbortedEventDetails(value: ExecutionAbortedEventDetails): Self = StObject.set(x, "executionAbortedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setExecutionAbortedEventDetailsUndefined: Self = StObject.set(x, "executionAbortedEventDetails", js.undefined)
    
    inline def setExecutionFailedEventDetails(value: ExecutionFailedEventDetails): Self = StObject.set(x, "executionFailedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setExecutionFailedEventDetailsUndefined: Self = StObject.set(x, "executionFailedEventDetails", js.undefined)
    
    inline def setExecutionStartedEventDetails(value: ExecutionStartedEventDetails): Self = StObject.set(x, "executionStartedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setExecutionStartedEventDetailsUndefined: Self = StObject.set(x, "executionStartedEventDetails", js.undefined)
    
    inline def setExecutionSucceededEventDetails(value: ExecutionSucceededEventDetails): Self = StObject.set(x, "executionSucceededEventDetails", value.asInstanceOf[js.Any])
    
    inline def setExecutionSucceededEventDetailsUndefined: Self = StObject.set(x, "executionSucceededEventDetails", js.undefined)
    
    inline def setExecutionTimedOutEventDetails(value: ExecutionTimedOutEventDetails): Self = StObject.set(x, "executionTimedOutEventDetails", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimedOutEventDetailsUndefined: Self = StObject.set(x, "executionTimedOutEventDetails", js.undefined)
    
    inline def setId(value: EventId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionFailedEventDetails(value: LambdaFunctionFailedEventDetails): Self = StObject.set(x, "lambdaFunctionFailedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionFailedEventDetailsUndefined: Self = StObject.set(x, "lambdaFunctionFailedEventDetails", js.undefined)
    
    inline def setLambdaFunctionScheduleFailedEventDetails(value: LambdaFunctionScheduleFailedEventDetails): Self = StObject.set(x, "lambdaFunctionScheduleFailedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionScheduleFailedEventDetailsUndefined: Self = StObject.set(x, "lambdaFunctionScheduleFailedEventDetails", js.undefined)
    
    inline def setLambdaFunctionScheduledEventDetails(value: LambdaFunctionScheduledEventDetails): Self = StObject.set(x, "lambdaFunctionScheduledEventDetails", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionScheduledEventDetailsUndefined: Self = StObject.set(x, "lambdaFunctionScheduledEventDetails", js.undefined)
    
    inline def setLambdaFunctionStartFailedEventDetails(value: LambdaFunctionStartFailedEventDetails): Self = StObject.set(x, "lambdaFunctionStartFailedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionStartFailedEventDetailsUndefined: Self = StObject.set(x, "lambdaFunctionStartFailedEventDetails", js.undefined)
    
    inline def setLambdaFunctionSucceededEventDetails(value: LambdaFunctionSucceededEventDetails): Self = StObject.set(x, "lambdaFunctionSucceededEventDetails", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionSucceededEventDetailsUndefined: Self = StObject.set(x, "lambdaFunctionSucceededEventDetails", js.undefined)
    
    inline def setLambdaFunctionTimedOutEventDetails(value: LambdaFunctionTimedOutEventDetails): Self = StObject.set(x, "lambdaFunctionTimedOutEventDetails", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionTimedOutEventDetailsUndefined: Self = StObject.set(x, "lambdaFunctionTimedOutEventDetails", js.undefined)
    
    inline def setMapIterationAbortedEventDetails(value: MapIterationEventDetails): Self = StObject.set(x, "mapIterationAbortedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setMapIterationAbortedEventDetailsUndefined: Self = StObject.set(x, "mapIterationAbortedEventDetails", js.undefined)
    
    inline def setMapIterationFailedEventDetails(value: MapIterationEventDetails): Self = StObject.set(x, "mapIterationFailedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setMapIterationFailedEventDetailsUndefined: Self = StObject.set(x, "mapIterationFailedEventDetails", js.undefined)
    
    inline def setMapIterationStartedEventDetails(value: MapIterationEventDetails): Self = StObject.set(x, "mapIterationStartedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setMapIterationStartedEventDetailsUndefined: Self = StObject.set(x, "mapIterationStartedEventDetails", js.undefined)
    
    inline def setMapIterationSucceededEventDetails(value: MapIterationEventDetails): Self = StObject.set(x, "mapIterationSucceededEventDetails", value.asInstanceOf[js.Any])
    
    inline def setMapIterationSucceededEventDetailsUndefined: Self = StObject.set(x, "mapIterationSucceededEventDetails", js.undefined)
    
    inline def setMapStateStartedEventDetails(value: MapStateStartedEventDetails): Self = StObject.set(x, "mapStateStartedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setMapStateStartedEventDetailsUndefined: Self = StObject.set(x, "mapStateStartedEventDetails", js.undefined)
    
    inline def setPreviousEventId(value: EventId): Self = StObject.set(x, "previousEventId", value.asInstanceOf[js.Any])
    
    inline def setPreviousEventIdUndefined: Self = StObject.set(x, "previousEventId", js.undefined)
    
    inline def setStateEnteredEventDetails(value: StateEnteredEventDetails): Self = StObject.set(x, "stateEnteredEventDetails", value.asInstanceOf[js.Any])
    
    inline def setStateEnteredEventDetailsUndefined: Self = StObject.set(x, "stateEnteredEventDetails", js.undefined)
    
    inline def setStateExitedEventDetails(value: StateExitedEventDetails): Self = StObject.set(x, "stateExitedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setStateExitedEventDetailsUndefined: Self = StObject.set(x, "stateExitedEventDetails", js.undefined)
    
    inline def setTaskFailedEventDetails(value: TaskFailedEventDetails): Self = StObject.set(x, "taskFailedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setTaskFailedEventDetailsUndefined: Self = StObject.set(x, "taskFailedEventDetails", js.undefined)
    
    inline def setTaskScheduledEventDetails(value: TaskScheduledEventDetails): Self = StObject.set(x, "taskScheduledEventDetails", value.asInstanceOf[js.Any])
    
    inline def setTaskScheduledEventDetailsUndefined: Self = StObject.set(x, "taskScheduledEventDetails", js.undefined)
    
    inline def setTaskStartFailedEventDetails(value: TaskStartFailedEventDetails): Self = StObject.set(x, "taskStartFailedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setTaskStartFailedEventDetailsUndefined: Self = StObject.set(x, "taskStartFailedEventDetails", js.undefined)
    
    inline def setTaskStartedEventDetails(value: TaskStartedEventDetails): Self = StObject.set(x, "taskStartedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setTaskStartedEventDetailsUndefined: Self = StObject.set(x, "taskStartedEventDetails", js.undefined)
    
    inline def setTaskSubmitFailedEventDetails(value: TaskSubmitFailedEventDetails): Self = StObject.set(x, "taskSubmitFailedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setTaskSubmitFailedEventDetailsUndefined: Self = StObject.set(x, "taskSubmitFailedEventDetails", js.undefined)
    
    inline def setTaskSubmittedEventDetails(value: TaskSubmittedEventDetails): Self = StObject.set(x, "taskSubmittedEventDetails", value.asInstanceOf[js.Any])
    
    inline def setTaskSubmittedEventDetailsUndefined: Self = StObject.set(x, "taskSubmittedEventDetails", js.undefined)
    
    inline def setTaskSucceededEventDetails(value: TaskSucceededEventDetails): Self = StObject.set(x, "taskSucceededEventDetails", value.asInstanceOf[js.Any])
    
    inline def setTaskSucceededEventDetailsUndefined: Self = StObject.set(x, "taskSucceededEventDetails", js.undefined)
    
    inline def setTaskTimedOutEventDetails(value: TaskTimedOutEventDetails): Self = StObject.set(x, "taskTimedOutEventDetails", value.asInstanceOf[js.Any])
    
    inline def setTaskTimedOutEventDetailsUndefined: Self = StObject.set(x, "taskTimedOutEventDetails", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: HistoryEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
