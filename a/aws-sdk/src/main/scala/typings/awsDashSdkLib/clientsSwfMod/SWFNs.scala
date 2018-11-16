package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/swf", "SWF")
@js.native
object SWFNs extends js.Object {
  
  trait ActivityTask extends js.Object {
    /**
         * The unique ID of the task.
         */
    var activityId: ActivityId
    /**
         * The type of this activity task.
         */
    var activityType: ActivityType
    /**
         * The inputs provided when the activity task was scheduled. The form of the input is user defined and should be meaningful to the activity implementation.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the ActivityTaskStarted event recorded in the history.
         */
    var startedEventId: EventId
    /**
         * The opaque string used as a handle on the task. This token is used by workers to communicate progress and response information back to the system about the task.
         */
    var taskToken: TaskToken
    /**
         * The workflow execution that started this activity task.
         */
    var workflowExecution: WorkflowExecution
  }
  
  
  trait ActivityTaskCancelRequestedEventAttributes extends js.Object {
    /**
         * The unique ID of the task.
         */
    var activityId: ActivityId
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RequestCancelActivityTask decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
  }
  
  
  trait ActivityTaskCanceledEventAttributes extends js.Object {
    /**
         * Details of the cancellation.
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         * If set, contains the ID of the last ActivityTaskCancelRequested event recorded for this activity task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var latestCancelRequestedEventId: js.UndefOr[EventId] = js.undefined
    /**
         * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var scheduledEventId: EventId
    /**
         * The ID of the ActivityTaskStarted event recorded when this activity task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
  }
  
  
  trait ActivityTaskCompletedEventAttributes extends js.Object {
    /**
         * The results of the activity task.
         */
    var result: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var scheduledEventId: EventId
    /**
         * The ID of the ActivityTaskStarted event recorded when this activity task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
  }
  
  
  trait ActivityTaskFailedEventAttributes extends js.Object {
    /**
         * The details of the failure.
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         * The reason provided for the failure.
         */
    var reason: js.UndefOr[FailureReason] = js.undefined
    /**
         * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var scheduledEventId: EventId
    /**
         * The ID of the ActivityTaskStarted event recorded when this activity task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
  }
  
  
  trait ActivityTaskScheduledEventAttributes extends js.Object {
    /**
         * The unique ID of the activity task.
         */
    var activityId: ActivityId
    /**
         * The type of the activity task.
         */
    var activityType: ActivityType
    /**
         * Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to the activity.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision that resulted in the scheduling of this activity task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The maximum time before which the worker processing this task must report progress by calling RecordActivityTaskHeartbeat. If the timeout is exceeded, the activity task is automatically timed out. If the worker subsequently attempts to record a heartbeat or return a result, it is ignored.
         */
    var heartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The input provided to the activity task.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The maximum amount of time for this activity task.
         */
    var scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The maximum amount of time the activity task can wait to be assigned to a worker.
         */
    var scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The maximum amount of time a worker may take to process the activity task.
         */
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The task list in which the activity task has been scheduled.
         */
    var taskList: TaskList
    /**
         *  The priority to assign to the scheduled activity task. If set, this overrides any default priority value that was assigned when the activity type was registered. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
         */
    var taskPriority: js.UndefOr[TaskPriority] = js.undefined
  }
  
  
  trait ActivityTaskStartedEventAttributes extends js.Object {
    /**
         * Identity of the worker that was assigned this task. This aids diagnostics when problems arise. The form of this identity is user defined.
         */
    var identity: js.UndefOr[Identity] = js.undefined
    /**
         * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var scheduledEventId: EventId
  }
  
  
  trait ActivityTaskStatus extends js.Object {
    /**
         * Set to true if cancellation of the task is requested.
         */
    var cancelRequested: Canceled
  }
  
  
  trait ActivityTaskTimedOutEventAttributes extends js.Object {
    /**
         * Contains the content of the details parameter for the last call made by the activity to RecordActivityTaskHeartbeat.
         */
    var details: js.UndefOr[LimitedData] = js.undefined
    /**
         * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var scheduledEventId: EventId
    /**
         * The ID of the ActivityTaskStarted event recorded when this activity task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
    /**
         * The type of the timeout that caused this event.
         */
    var timeoutType: ActivityTaskTimeoutType
  }
  
  
  trait ActivityType extends js.Object {
    /**
         * The name of this activity.  The combination of activity type name and version must be unique within a domain. 
         */
    var name: Name
    /**
         * The version of this activity.  The combination of activity type name and version must be unique with in a domain. 
         */
    var version: Version
  }
  
  
  trait ActivityTypeConfiguration extends js.Object {
    /**
         *  The default maximum time, in seconds, before which a worker processing a task must report progress by calling RecordActivityTaskHeartbeat. You can specify this value only when registering an activity type. The registered default value can be overridden when you schedule a task through the ScheduleActivityTask Decision. If the activity worker subsequently attempts to record a heartbeat or returns a result, the activity worker receives an UnknownResource fault. In this case, Amazon SWF no longer considers the activity task to be valid; the activity worker should clean up the activity task. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         *  The default task list specified for this activity type at registration. This default is used if a task list isn't provided when a task is scheduled through the ScheduleActivityTask Decision. You can override the default registered task list when scheduling a task through the ScheduleActivityTask Decision.
         */
    var defaultTaskList: js.UndefOr[TaskList] = js.undefined
    /**
         *  The default task priority for tasks of this activity type, specified at registration. If not set, then 0 is used as the default priority. This default can be overridden when scheduling an activity task. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
         */
    var defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined
    /**
         *  The default maximum duration, specified when registering the activity type, for tasks of this activity type. You can override this default when scheduling a task through the ScheduleActivityTask Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         *  The default maximum duration, specified when registering the activity type, that a task of an activity type can wait before being assigned to a worker. You can override this default when scheduling a task through the ScheduleActivityTask Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         *  The default maximum duration for tasks of an activity type specified when registering the activity type. You can override this default when scheduling a task through the ScheduleActivityTask Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  }
  
  
  trait ActivityTypeDetail extends js.Object {
    /**
         * The configuration settings registered with the activity type.
         */
    var configuration: ActivityTypeConfiguration
    /**
         * General information about the activity type. The status of activity type (returned in the ActivityTypeInfo structure) can be one of the following.    REGISTERED – The type is registered and available. Workers supporting this type should be running.     DEPRECATED – The type was deprecated using DeprecateActivityType, but is still in use. You should keep workers supporting this type running. You cannot create new tasks of this type.   
         */
    var typeInfo: ActivityTypeInfo
  }
  
  
  trait ActivityTypeInfo extends js.Object {
    /**
         * The ActivityType type structure representing the activity type.
         */
    var activityType: ActivityType
    /**
         * The date and time this activity type was created through RegisterActivityType.
         */
    var creationDate: Timestamp
    /**
         * If DEPRECATED, the date and time DeprecateActivityType was called.
         */
    var deprecationDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The description of the activity type provided in RegisterActivityType.
         */
    var description: js.UndefOr[Description] = js.undefined
    /**
         * The current status of the activity type.
         */
    var status: RegistrationStatus
  }
  
  
  trait ActivityTypeInfos extends js.Object {
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * List of activity type information.
         */
    var typeInfos: ActivityTypeInfoList
  }
  
  
  trait CancelTimerDecisionAttributes extends js.Object {
    /**
         *  The unique ID of the timer to cancel.
         */
    var timerId: TimerId
  }
  
  
  trait CancelTimerFailedEventAttributes extends js.Object {
    /**
         * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: CancelTimerFailedCause
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the CancelTimer decision to cancel this timer. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The timerId provided in the CancelTimer decision that failed.
         */
    var timerId: TimerId
  }
  
  
  trait CancelWorkflowExecutionDecisionAttributes extends js.Object {
    /**
         *  Details of the cancellation.
         */
    var details: js.UndefOr[Data] = js.undefined
  }
  
  
  trait CancelWorkflowExecutionFailedEventAttributes extends js.Object {
    /**
         * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: CancelWorkflowExecutionFailedCause
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the CancelWorkflowExecution decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
  }
  
  
  trait ChildWorkflowExecutionCanceledEventAttributes extends js.Object {
    /**
         * Details of the cancellation (if provided).
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var initiatedEventId: EventId
    /**
         * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
    /**
         * The child workflow execution that was canceled.
         */
    var workflowExecution: WorkflowExecution
    /**
         * The type of the child workflow execution.
         */
    var workflowType: WorkflowType
  }
  
  
  trait ChildWorkflowExecutionCompletedEventAttributes extends js.Object {
    /**
         * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var initiatedEventId: EventId
    /**
         * The result of the child workflow execution.
         */
    var result: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
    /**
         * The child workflow execution that was completed.
         */
    var workflowExecution: WorkflowExecution
    /**
         * The type of the child workflow execution.
         */
    var workflowType: WorkflowType
  }
  
  
  trait ChildWorkflowExecutionFailedEventAttributes extends js.Object {
    /**
         * The details of the failure (if provided).
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var initiatedEventId: EventId
    /**
         * The reason for the failure (if provided).
         */
    var reason: js.UndefOr[FailureReason] = js.undefined
    /**
         * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
    /**
         * The child workflow execution that failed.
         */
    var workflowExecution: WorkflowExecution
    /**
         * The type of the child workflow execution.
         */
    var workflowType: WorkflowType
  }
  
  
  trait ChildWorkflowExecutionStartedEventAttributes extends js.Object {
    /**
         * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var initiatedEventId: EventId
    /**
         * The child workflow execution that was started.
         */
    var workflowExecution: WorkflowExecution
    /**
         * The type of the child workflow execution.
         */
    var workflowType: WorkflowType
  }
  
  
  trait ChildWorkflowExecutionTerminatedEventAttributes extends js.Object {
    /**
         * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var initiatedEventId: EventId
    /**
         * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
    /**
         * The child workflow execution that was terminated.
         */
    var workflowExecution: WorkflowExecution
    /**
         * The type of the child workflow execution.
         */
    var workflowType: WorkflowType
  }
  
  
  trait ChildWorkflowExecutionTimedOutEventAttributes extends js.Object {
    /**
         * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var initiatedEventId: EventId
    /**
         * The ID of the ChildWorkflowExecutionStarted event recorded when this child workflow execution was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
    /**
         * The type of the timeout that caused the child workflow execution to time out.
         */
    var timeoutType: WorkflowExecutionTimeoutType
    /**
         * The child workflow execution that timed out.
         */
    var workflowExecution: WorkflowExecution
    /**
         * The type of the child workflow execution.
         */
    var workflowType: WorkflowType
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CloseStatusFilter extends js.Object {
    /**
         *  The close status that must match the close status of an execution for it to meet the criteria of this filter.
         */
    var status: CloseStatus
  }
  
  
  trait CompleteWorkflowExecutionDecisionAttributes extends js.Object {
    /**
         * The result of the workflow execution. The form of the result is implementation defined.
         */
    var result: js.UndefOr[Data] = js.undefined
  }
  
  
  trait CompleteWorkflowExecutionFailedEventAttributes extends js.Object {
    /**
         * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: CompleteWorkflowExecutionFailedCause
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the CompleteWorkflowExecution decision to complete this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
  }
  
  
  trait ContinueAsNewWorkflowExecutionDecisionAttributes extends js.Object {
    /**
         * If set, specifies the policy to use for the child workflow executions of the new execution if it is terminated by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. This policy overrides the default child policy specified when registering the workflow type using RegisterWorkflowType. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.    A child policy for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default child policy was specified at registration time then a fault is returned. 
         */
    var childPolicy: js.UndefOr[ChildPolicy] = js.undefined
    /**
         * If set, specifies the total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout specified when registering the workflow type. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  An execution start-to-close timeout for this workflow execution must be specified either as a default for the workflow type or through this field. If neither this field is set nor a default execution start-to-close timeout was specified at registration time then a fault is returned. 
         */
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The input provided to the new workflow execution.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The IAM role to attach to the new (continued) execution.
         */
    var lambdaRole: js.UndefOr[Arn] = js.undefined
    /**
         * The list of tags to associate with the new workflow execution. A maximum of 5 tags can be specified. You can list workflow executions with a specific tag by calling ListOpenWorkflowExecutions or ListClosedWorkflowExecutions and specifying a TagFilter.
         */
    var tagList: js.UndefOr[TagList] = js.undefined
    /**
         * The task list to use for the decisions of the new (continued) workflow execution.
         */
    var taskList: js.UndefOr[TaskList] = js.undefined
    /**
         *  The task priority that, if set, specifies the priority for the decision tasks for this workflow execution. This overrides the defaultTaskPriority specified when registering the workflow type. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
         */
    var taskPriority: js.UndefOr[TaskPriority] = js.undefined
    /**
         * Specifies the maximum duration of decision tasks for the new workflow execution. This parameter overrides the defaultTaskStartToCloseTimout specified when registering the workflow type using RegisterWorkflowType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A task start-to-close timeout for the new workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default task start-to-close timeout was specified at registration time then a fault is returned. 
         */
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The version of the workflow to start.
         */
    var workflowTypeVersion: js.UndefOr[Version] = js.undefined
  }
  
  
  trait ContinueAsNewWorkflowExecutionFailedEventAttributes extends js.Object {
    /**
         * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: ContinueAsNewWorkflowExecutionFailedCause
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the ContinueAsNewWorkflowExecution decision that started this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
  }
  
  
  trait CountClosedWorkflowExecutionsInput extends js.Object {
    /**
         * If specified, only workflow executions that match this close status are counted. This filter has an affect only if executionStatus is specified as CLOSED.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.undefined
    /**
         * If specified, only workflow executions that meet the close time criteria of the filter are counted.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
         */
    var closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined
    /**
         * The name of the domain containing the workflow executions to count.
         */
    var domain: DomainName
    /**
         * If specified, only workflow executions matching the WorkflowId in the filter are counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined
    /**
         * If specified, only workflow executions that meet the start time criteria of the filter are counted.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
         */
    var startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined
    /**
         * If specified, only executions that have a tag that matches the filter are counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var tagFilter: js.UndefOr[TagFilter] = js.undefined
    /**
         * If specified, indicates the type of the workflow executions to be counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
  }
  
  
  trait CountOpenWorkflowExecutionsInput extends js.Object {
    /**
         * The name of the domain containing the workflow executions to count.
         */
    var domain: DomainName
    /**
         * If specified, only workflow executions matching the WorkflowId in the filter are counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined
    /**
         * Specifies the start time criteria that workflow executions must meet in order to be counted.
         */
    var startTimeFilter: ExecutionTimeFilter
    /**
         * If specified, only executions that have a tag that matches the filter are counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var tagFilter: js.UndefOr[TagFilter] = js.undefined
    /**
         * Specifies the type of the workflow executions to be counted.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
  }
  
  
  trait CountPendingActivityTasksInput extends js.Object {
    /**
         * The name of the domain that contains the task list.
         */
    var domain: DomainName
    /**
         * The name of the task list.
         */
    var taskList: TaskList
  }
  
  
  trait CountPendingDecisionTasksInput extends js.Object {
    /**
         * The name of the domain that contains the task list.
         */
    var domain: DomainName
    /**
         * The name of the task list.
         */
    var taskList: TaskList
  }
  
  
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
  
  
  trait DecisionTask extends js.Object {
    /**
         * A paginated list of history events of the workflow execution. The decider uses this during the processing of the decision task.
         */
    var events: HistoryEventList
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The ID of the DecisionTaskStarted event of the previous decision task of this workflow execution that was processed by the decider. This can be used to determine the events in the history new since the last decision task received by the decider.
         */
    var previousStartedEventId: js.UndefOr[EventId] = js.undefined
    /**
         * The ID of the DecisionTaskStarted event recorded in the history.
         */
    var startedEventId: EventId
    /**
         * The opaque string used as a handle on the task. This token is used by workers to communicate progress and response information back to the system about the task.
         */
    var taskToken: TaskToken
    /**
         * The workflow execution for which this decision task was created.
         */
    var workflowExecution: WorkflowExecution
    /**
         * The type of the workflow execution for which this decision task was created.
         */
    var workflowType: WorkflowType
  }
  
  
  trait DecisionTaskCompletedEventAttributes extends js.Object {
    /**
         * User defined context for the workflow execution.
         */
    var executionContext: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the DecisionTaskScheduled event that was recorded when this decision task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var scheduledEventId: EventId
    /**
         * The ID of the DecisionTaskStarted event recorded when this decision task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
  }
  
  
  trait DecisionTaskScheduledEventAttributes extends js.Object {
    /**
         * The maximum duration for this decision task. The task is considered timed out if it doesn't completed within this duration. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The name of the task list in which the decision task was scheduled.
         */
    var taskList: TaskList
    /**
         *  A task priority that, if set, specifies the priority for this decision task. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
         */
    var taskPriority: js.UndefOr[TaskPriority] = js.undefined
  }
  
  
  trait DecisionTaskStartedEventAttributes extends js.Object {
    /**
         * Identity of the decider making the request. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
         */
    var identity: js.UndefOr[Identity] = js.undefined
    /**
         * The ID of the DecisionTaskScheduled event that was recorded when this decision task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var scheduledEventId: EventId
  }
  
  
  trait DecisionTaskTimedOutEventAttributes extends js.Object {
    /**
         * The ID of the DecisionTaskScheduled event that was recorded when this decision task was scheduled. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var scheduledEventId: EventId
    /**
         * The ID of the DecisionTaskStarted event recorded when this decision task was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
    /**
         * The type of timeout that expired before the decision task could be completed.
         */
    var timeoutType: DecisionTaskTimeoutType
  }
  
  
  trait DeprecateActivityTypeInput extends js.Object {
    /**
         * The activity type to deprecate.
         */
    var activityType: ActivityType
    /**
         * The name of the domain in which the activity type is registered.
         */
    var domain: DomainName
  }
  
  
  trait DeprecateDomainInput extends js.Object {
    /**
         * The name of the domain to deprecate.
         */
    var name: DomainName
  }
  
  
  trait DeprecateWorkflowTypeInput extends js.Object {
    /**
         * The name of the domain in which the workflow type is registered.
         */
    var domain: DomainName
    /**
         * The workflow type to deprecate.
         */
    var workflowType: WorkflowType
  }
  
  
  trait DescribeActivityTypeInput extends js.Object {
    /**
         * The activity type to get information about. Activity types are identified by the name and version that were supplied when the activity was registered.
         */
    var activityType: ActivityType
    /**
         * The name of the domain in which the activity type is registered.
         */
    var domain: DomainName
  }
  
  
  trait DescribeDomainInput extends js.Object {
    /**
         * The name of the domain to describe.
         */
    var name: DomainName
  }
  
  
  trait DescribeWorkflowExecutionInput extends js.Object {
    /**
         * The name of the domain containing the workflow execution.
         */
    var domain: DomainName
    /**
         * The workflow execution to describe.
         */
    var execution: WorkflowExecution
  }
  
  
  trait DescribeWorkflowTypeInput extends js.Object {
    /**
         * The name of the domain in which this workflow type is registered.
         */
    var domain: DomainName
    /**
         * The workflow type to describe.
         */
    var workflowType: WorkflowType
  }
  
  
  trait DomainConfiguration extends js.Object {
    /**
         * The retention period for workflow executions in this domain.
         */
    var workflowExecutionRetentionPeriodInDays: DurationInDays
  }
  
  
  trait DomainDetail extends js.Object {
    /**
         * The domain configuration. Currently, this includes only the domain's retention period.
         */
    var configuration: DomainConfiguration
    /**
         * The basic information about a domain, such as its name, status, and description.
         */
    var domainInfo: DomainInfo
  }
  
  
  trait DomainInfo extends js.Object {
    /**
         * The description of the domain provided through RegisterDomain.
         */
    var description: js.UndefOr[Description] = js.undefined
    /**
         * The name of the domain. This name is unique within the account.
         */
    var name: DomainName
    /**
         * The status of the domain:    REGISTERED – The domain is properly registered and available. You can use this domain for registering types and creating new workflow executions.     DEPRECATED – The domain was deprecated using DeprecateDomain, but is still in use. You should not create new workflow executions in this domain.   
         */
    var status: RegistrationStatus
  }
  
  
  trait DomainInfos extends js.Object {
    /**
         * A list of DomainInfo structures.
         */
    var domainInfos: DomainInfoList
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait ExecutionTimeFilter extends js.Object {
    /**
         * Specifies the latest start or close date and time to return.
         */
    var latestDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * Specifies the oldest start or close date and time to return.
         */
    var oldestDate: Timestamp
  }
  
  
  trait ExternalWorkflowExecutionCancelRequestedEventAttributes extends js.Object {
    /**
         * The ID of the RequestCancelExternalWorkflowExecutionInitiated event corresponding to the RequestCancelExternalWorkflowExecution decision to cancel this external workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var initiatedEventId: EventId
    /**
         * The external workflow execution to which the cancellation request was delivered.
         */
    var workflowExecution: WorkflowExecution
  }
  
  
  trait ExternalWorkflowExecutionSignaledEventAttributes extends js.Object {
    /**
         * The ID of the SignalExternalWorkflowExecutionInitiated event corresponding to the SignalExternalWorkflowExecution decision to request this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var initiatedEventId: EventId
    /**
         * The external workflow execution that the signal was delivered to.
         */
    var workflowExecution: WorkflowExecution
  }
  
  
  trait FailWorkflowExecutionDecisionAttributes extends js.Object {
    /**
         *  Details of the failure.
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         * A descriptive reason for the failure that may help in diagnostics.
         */
    var reason: js.UndefOr[FailureReason] = js.undefined
  }
  
  
  trait FailWorkflowExecutionFailedEventAttributes extends js.Object {
    /**
         * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: FailWorkflowExecutionFailedCause
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the FailWorkflowExecution decision to fail this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
  }
  
  
  trait GetWorkflowExecutionHistoryInput extends js.Object {
    /**
         * The name of the domain containing the workflow execution.
         */
    var domain: DomainName
    /**
         * Specifies the workflow execution for which to return the history.
         */
    var execution: WorkflowExecution
    /**
         * The maximum number of results that are returned per call. nextPageToken can be used to obtain futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a page size smaller than the maximum. This is an upper limit only; the actual number of results returned per call may be fewer than the specified maximum.
         */
    var maximumPageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * When set to true, returns the events in reverse order. By default the results are returned in ascending order of the eventTimeStamp of the events.
         */
    var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
  }
  
  
  trait History extends js.Object {
    /**
         * The list of history events.
         */
    var events: HistoryEventList
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait HistoryEvent extends js.Object {
    /**
         * If the event is of type ActivityTaskcancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var activityTaskCancelRequestedEventAttributes: js.UndefOr[ActivityTaskCancelRequestedEventAttributes] = js.undefined
    /**
         * If the event is of type ActivityTaskCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var activityTaskCanceledEventAttributes: js.UndefOr[ActivityTaskCanceledEventAttributes] = js.undefined
    /**
         * If the event is of type ActivityTaskCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var activityTaskCompletedEventAttributes: js.UndefOr[ActivityTaskCompletedEventAttributes] = js.undefined
    /**
         * If the event is of type ActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var activityTaskFailedEventAttributes: js.UndefOr[ActivityTaskFailedEventAttributes] = js.undefined
    /**
         * If the event is of type ActivityTaskScheduled then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var activityTaskScheduledEventAttributes: js.UndefOr[ActivityTaskScheduledEventAttributes] = js.undefined
    /**
         * If the event is of type ActivityTaskStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var activityTaskStartedEventAttributes: js.UndefOr[ActivityTaskStartedEventAttributes] = js.undefined
    /**
         * If the event is of type ActivityTaskTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var activityTaskTimedOutEventAttributes: js.UndefOr[ActivityTaskTimedOutEventAttributes] = js.undefined
    /**
         * If the event is of type CancelTimerFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var cancelTimerFailedEventAttributes: js.UndefOr[CancelTimerFailedEventAttributes] = js.undefined
    /**
         * If the event is of type CancelWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var cancelWorkflowExecutionFailedEventAttributes: js.UndefOr[CancelWorkflowExecutionFailedEventAttributes] = js.undefined
    /**
         * If the event is of type ChildWorkflowExecutionCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var childWorkflowExecutionCanceledEventAttributes: js.UndefOr[ChildWorkflowExecutionCanceledEventAttributes] = js.undefined
    /**
         * If the event is of type ChildWorkflowExecutionCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var childWorkflowExecutionCompletedEventAttributes: js.UndefOr[ChildWorkflowExecutionCompletedEventAttributes] = js.undefined
    /**
         * If the event is of type ChildWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var childWorkflowExecutionFailedEventAttributes: js.UndefOr[ChildWorkflowExecutionFailedEventAttributes] = js.undefined
    /**
         * If the event is of type ChildWorkflowExecutionStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var childWorkflowExecutionStartedEventAttributes: js.UndefOr[ChildWorkflowExecutionStartedEventAttributes] = js.undefined
    /**
         * If the event is of type ChildWorkflowExecutionTerminated then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var childWorkflowExecutionTerminatedEventAttributes: js.UndefOr[ChildWorkflowExecutionTerminatedEventAttributes] = js.undefined
    /**
         * If the event is of type ChildWorkflowExecutionTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var childWorkflowExecutionTimedOutEventAttributes: js.UndefOr[ChildWorkflowExecutionTimedOutEventAttributes] = js.undefined
    /**
         * If the event is of type CompleteWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var completeWorkflowExecutionFailedEventAttributes: js.UndefOr[CompleteWorkflowExecutionFailedEventAttributes] = js.undefined
    /**
         * If the event is of type ContinueAsNewWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var continueAsNewWorkflowExecutionFailedEventAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionFailedEventAttributes] = js.undefined
    /**
         * If the event is of type DecisionTaskCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var decisionTaskCompletedEventAttributes: js.UndefOr[DecisionTaskCompletedEventAttributes] = js.undefined
    /**
         * If the event is of type DecisionTaskScheduled then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var decisionTaskScheduledEventAttributes: js.UndefOr[DecisionTaskScheduledEventAttributes] = js.undefined
    /**
         * If the event is of type DecisionTaskStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var decisionTaskStartedEventAttributes: js.UndefOr[DecisionTaskStartedEventAttributes] = js.undefined
    /**
         * If the event is of type DecisionTaskTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var decisionTaskTimedOutEventAttributes: js.UndefOr[DecisionTaskTimedOutEventAttributes] = js.undefined
    /**
         * The system generated ID of the event. This ID uniquely identifies the event with in the workflow execution history.
         */
    var eventId: EventId
    /**
         * The date and time when the event occurred.
         */
    var eventTimestamp: Timestamp
    /**
         * The type of the history event.
         */
    var eventType: EventType
    /**
         * If the event is of type ExternalWorkflowExecutionCancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types. 
         */
    var externalWorkflowExecutionCancelRequestedEventAttributes: js.UndefOr[ExternalWorkflowExecutionCancelRequestedEventAttributes] = js.undefined
    /**
         * If the event is of type ExternalWorkflowExecutionSignaled then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var externalWorkflowExecutionSignaledEventAttributes: js.UndefOr[ExternalWorkflowExecutionSignaledEventAttributes] = js.undefined
    /**
         * If the event is of type FailWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var failWorkflowExecutionFailedEventAttributes: js.UndefOr[FailWorkflowExecutionFailedEventAttributes] = js.undefined
    /**
         * Provides the details of the LambdaFunctionCompleted event. It isn't set for other event types.
         */
    var lambdaFunctionCompletedEventAttributes: js.UndefOr[LambdaFunctionCompletedEventAttributes] = js.undefined
    /**
         * Provides the details of the LambdaFunctionFailed event. It isn't set for other event types.
         */
    var lambdaFunctionFailedEventAttributes: js.UndefOr[LambdaFunctionFailedEventAttributes] = js.undefined
    /**
         * Provides the details of the LambdaFunctionScheduled event. It isn't set for other event types.
         */
    var lambdaFunctionScheduledEventAttributes: js.UndefOr[LambdaFunctionScheduledEventAttributes] = js.undefined
    /**
         * Provides the details of the LambdaFunctionStarted event. It isn't set for other event types.
         */
    var lambdaFunctionStartedEventAttributes: js.UndefOr[LambdaFunctionStartedEventAttributes] = js.undefined
    /**
         * Provides the details of the LambdaFunctionTimedOut event. It isn't set for other event types.
         */
    var lambdaFunctionTimedOutEventAttributes: js.UndefOr[LambdaFunctionTimedOutEventAttributes] = js.undefined
    /**
         * If the event is of type MarkerRecorded then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var markerRecordedEventAttributes: js.UndefOr[MarkerRecordedEventAttributes] = js.undefined
    /**
         * If the event is of type DecisionTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var recordMarkerFailedEventAttributes: js.UndefOr[RecordMarkerFailedEventAttributes] = js.undefined
    /**
         * If the event is of type RequestCancelActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var requestCancelActivityTaskFailedEventAttributes: js.UndefOr[RequestCancelActivityTaskFailedEventAttributes] = js.undefined
    /**
         * If the event is of type RequestCancelExternalWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var requestCancelExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionFailedEventAttributes] = js.undefined
    /**
         * If the event is of type RequestCancelExternalWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var requestCancelExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes] = js.undefined
    /**
         * If the event is of type ScheduleActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var scheduleActivityTaskFailedEventAttributes: js.UndefOr[ScheduleActivityTaskFailedEventAttributes] = js.undefined
    /**
         * Provides the details of the ScheduleLambdaFunctionFailed event. It isn't set for other event types.
         */
    var scheduleLambdaFunctionFailedEventAttributes: js.UndefOr[ScheduleLambdaFunctionFailedEventAttributes] = js.undefined
    /**
         * If the event is of type SignalExternalWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var signalExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionFailedEventAttributes] = js.undefined
    /**
         * If the event is of type SignalExternalWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var signalExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionInitiatedEventAttributes] = js.undefined
    /**
         * If the event is of type StartChildWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var startChildWorkflowExecutionFailedEventAttributes: js.UndefOr[StartChildWorkflowExecutionFailedEventAttributes] = js.undefined
    /**
         * If the event is of type StartChildWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var startChildWorkflowExecutionInitiatedEventAttributes: js.UndefOr[StartChildWorkflowExecutionInitiatedEventAttributes] = js.undefined
    /**
         * Provides the details of the StartLambdaFunctionFailed event. It isn't set for other event types.
         */
    var startLambdaFunctionFailedEventAttributes: js.UndefOr[StartLambdaFunctionFailedEventAttributes] = js.undefined
    /**
         * If the event is of type StartTimerFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var startTimerFailedEventAttributes: js.UndefOr[StartTimerFailedEventAttributes] = js.undefined
    /**
         * If the event is of type TimerCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var timerCanceledEventAttributes: js.UndefOr[TimerCanceledEventAttributes] = js.undefined
    /**
         * If the event is of type TimerFired then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var timerFiredEventAttributes: js.UndefOr[TimerFiredEventAttributes] = js.undefined
    /**
         * If the event is of type TimerStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var timerStartedEventAttributes: js.UndefOr[TimerStartedEventAttributes] = js.undefined
    /**
         * If the event is of type WorkflowExecutionCancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var workflowExecutionCancelRequestedEventAttributes: js.UndefOr[WorkflowExecutionCancelRequestedEventAttributes] = js.undefined
    /**
         * If the event is of type WorkflowExecutionCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var workflowExecutionCanceledEventAttributes: js.UndefOr[WorkflowExecutionCanceledEventAttributes] = js.undefined
    /**
         * If the event is of type WorkflowExecutionCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var workflowExecutionCompletedEventAttributes: js.UndefOr[WorkflowExecutionCompletedEventAttributes] = js.undefined
    /**
         * If the event is of type WorkflowExecutionContinuedAsNew then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var workflowExecutionContinuedAsNewEventAttributes: js.UndefOr[WorkflowExecutionContinuedAsNewEventAttributes] = js.undefined
    /**
         * If the event is of type WorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var workflowExecutionFailedEventAttributes: js.UndefOr[WorkflowExecutionFailedEventAttributes] = js.undefined
    /**
         * If the event is of type WorkflowExecutionSignaled then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var workflowExecutionSignaledEventAttributes: js.UndefOr[WorkflowExecutionSignaledEventAttributes] = js.undefined
    /**
         * If the event is of type WorkflowExecutionStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var workflowExecutionStartedEventAttributes: js.UndefOr[WorkflowExecutionStartedEventAttributes] = js.undefined
    /**
         * If the event is of type WorkflowExecutionTerminated then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var workflowExecutionTerminatedEventAttributes: js.UndefOr[WorkflowExecutionTerminatedEventAttributes] = js.undefined
    /**
         * If the event is of type WorkflowExecutionTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
         */
    var workflowExecutionTimedOutEventAttributes: js.UndefOr[WorkflowExecutionTimedOutEventAttributes] = js.undefined
  }
  
  
  trait LambdaFunctionCompletedEventAttributes extends js.Object {
    /**
         * The results of the Lambda task.
         */
    var result: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the LambdaFunctionScheduled event that was recorded when this Lambda task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
         */
    var scheduledEventId: EventId
    /**
         * The ID of the LambdaFunctionStarted event recorded when this activity task started. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
         */
    var startedEventId: EventId
  }
  
  
  trait LambdaFunctionFailedEventAttributes extends js.Object {
    /**
         * The details of the failure.
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         * The reason provided for the failure.
         */
    var reason: js.UndefOr[FailureReason] = js.undefined
    /**
         * The ID of the LambdaFunctionScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
         */
    var scheduledEventId: EventId
    /**
         * The ID of the LambdaFunctionStarted event recorded when this activity task started. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
         */
    var startedEventId: EventId
  }
  
  
  trait LambdaFunctionScheduledEventAttributes extends js.Object {
    /**
         * Data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the Lambda task.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the LambdaFunctionCompleted event corresponding to the decision that resulted in scheduling this activity task. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The unique ID of the Lambda task.
         */
    var id: FunctionId
    /**
         * The input provided to the Lambda task.
         */
    var input: js.UndefOr[FunctionInput] = js.undefined
    /**
         * The name of the Lambda function.
         */
    var name: FunctionName
    /**
         * The maximum amount of time a worker can take to process the Lambda task.
         */
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  }
  
  
  trait LambdaFunctionStartedEventAttributes extends js.Object {
    /**
         * The ID of the LambdaFunctionScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
         */
    var scheduledEventId: EventId
  }
  
  
  trait LambdaFunctionTimedOutEventAttributes extends js.Object {
    /**
         * The ID of the LambdaFunctionScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
         */
    var scheduledEventId: EventId
    /**
         * The ID of the ActivityTaskStarted event that was recorded when this activity task started. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
         */
    var startedEventId: EventId
    /**
         * The type of the timeout that caused this event.
         */
    var timeoutType: js.UndefOr[LambdaFunctionTimeoutType] = js.undefined
  }
  
  
  trait ListActivityTypesInput extends js.Object {
    /**
         * The name of the domain in which the activity types have been registered.
         */
    var domain: DomainName
    /**
         * The maximum number of results that are returned per call. nextPageToken can be used to obtain futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a page size smaller than the maximum. This is an upper limit only; the actual number of results returned per call may be fewer than the specified maximum.
         */
    var maximumPageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * If specified, only lists the activity types that have this name.
         */
    var name: js.UndefOr[Name] = js.undefined
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Specifies the registration status of the activity types to list.
         */
    var registrationStatus: RegistrationStatus
    /**
         * When set to true, returns the results in reverse order. By default, the results are returned in ascending alphabetical order by name of the activity types.
         */
    var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
  }
  
  
  trait ListClosedWorkflowExecutionsInput extends js.Object {
    /**
         * If specified, only workflow executions that match this close status are listed. For example, if TERMINATED is specified, then only TERMINATED workflow executions are listed.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.undefined
    /**
         * If specified, the workflow executions are included in the returned results based on whether their close times are within the range specified by this filter. Also, if this parameter is specified, the returned results are ordered by their close times.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
         */
    var closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined
    /**
         * The name of the domain that contains the workflow executions to list.
         */
    var domain: DomainName
    /**
         * If specified, only workflow executions matching the workflow ID specified in the filter are returned.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined
    /**
         * The maximum number of results that are returned per call. nextPageToken can be used to obtain futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a page size smaller than the maximum. This is an upper limit only; the actual number of results returned per call may be fewer than the specified maximum.
         */
    var maximumPageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * When set to true, returns the results in reverse order. By default the results are returned in descending order of the start or the close time of the executions.
         */
    var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
    /**
         * If specified, the workflow executions are included in the returned results based on whether their start times are within the range specified by this filter. Also, if this parameter is specified, the returned results are ordered by their start times.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
         */
    var startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined
    /**
         * If specified, only executions that have the matching tag are listed.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var tagFilter: js.UndefOr[TagFilter] = js.undefined
    /**
         * If specified, only executions of the type specified in the filter are returned.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
  }
  
  
  trait ListDomainsInput extends js.Object {
    /**
         * The maximum number of results that are returned per call. nextPageToken can be used to obtain futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a page size smaller than the maximum. This is an upper limit only; the actual number of results returned per call may be fewer than the specified maximum.
         */
    var maximumPageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Specifies the registration status of the domains to list.
         */
    var registrationStatus: RegistrationStatus
    /**
         * When set to true, returns the results in reverse order. By default, the results are returned in ascending alphabetical order by name of the domains.
         */
    var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
  }
  
  
  trait ListOpenWorkflowExecutionsInput extends js.Object {
    /**
         * The name of the domain that contains the workflow executions to list.
         */
    var domain: DomainName
    /**
         * If specified, only workflow executions matching the workflow ID specified in the filter are returned.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined
    /**
         * The maximum number of results that are returned per call. nextPageToken can be used to obtain futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a page size smaller than the maximum. This is an upper limit only; the actual number of results returned per call may be fewer than the specified maximum.
         */
    var maximumPageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * When set to true, returns the results in reverse order. By default the results are returned in descending order of the start time of the executions.
         */
    var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
    /**
         * Workflow executions are included in the returned results based on whether their start times are within the range specified by this filter.
         */
    var startTimeFilter: ExecutionTimeFilter
    /**
         * If specified, only executions that have the matching tag are listed.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var tagFilter: js.UndefOr[TagFilter] = js.undefined
    /**
         * If specified, only executions of the type specified in the filter are returned.   executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
         */
    var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
  }
  
  
  trait ListWorkflowTypesInput extends js.Object {
    /**
         * The name of the domain in which the workflow types have been registered.
         */
    var domain: DomainName
    /**
         * The maximum number of results that are returned per call. nextPageToken can be used to obtain futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a page size smaller than the maximum. This is an upper limit only; the actual number of results returned per call may be fewer than the specified maximum.
         */
    var maximumPageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * If specified, lists the workflow type with this name.
         */
    var name: js.UndefOr[Name] = js.undefined
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * Specifies the registration status of the workflow types to list.
         */
    var registrationStatus: RegistrationStatus
    /**
         * When set to true, returns the results in reverse order. By default the results are returned in ascending alphabetical order of the name of the workflow types.
         */
    var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
  }
  
  
  trait MarkerRecordedEventAttributes extends js.Object {
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RecordMarker decision that requested this marker. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The details of the marker.
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         * The name of the marker.
         */
    var markerName: MarkerName
  }
  
  
  trait PendingTaskCount extends js.Object {
    /**
         * The number of tasks in the task list.
         */
    var count: Count
    /**
         * If set to true, indicates that the actual count was more than the maximum supported by this API and the count returned is the truncated value.
         */
    var truncated: js.UndefOr[Truncated] = js.undefined
  }
  
  
  trait PollForActivityTaskInput extends js.Object {
    /**
         * The name of the domain that contains the task lists being polled.
         */
    var domain: DomainName
    /**
         * Identity of the worker making the request, recorded in the ActivityTaskStarted event in the workflow history. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
         */
    var identity: js.UndefOr[Identity] = js.undefined
    /**
         * Specifies the task list to poll for activity tasks. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var taskList: TaskList
  }
  
  
  trait PollForDecisionTaskInput extends js.Object {
    /**
         * The name of the domain containing the task lists to poll.
         */
    var domain: DomainName
    /**
         * Identity of the decider making the request, which is recorded in the DecisionTaskStarted event in the workflow history. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
         */
    var identity: js.UndefOr[Identity] = js.undefined
    /**
         * The maximum number of results that are returned per call. nextPageToken can be used to obtain futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a page size smaller than the maximum. This is an upper limit only; the actual number of results returned per call may be fewer than the specified maximum.
         */
    var maximumPageSize: js.UndefOr[PageSize] = js.undefined
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.  The nextPageToken returned by this action cannot be used with GetWorkflowExecutionHistory to get the next page. You must call PollForDecisionTask again (with the nextPageToken) to retrieve the next page of history records. Calling PollForDecisionTask with a nextPageToken doesn't return a new decision task. 
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * When set to true, returns the events in reverse order. By default the results are returned in ascending order of the eventTimestamp of the events.
         */
    var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
    /**
         * Specifies the task list to poll for decision tasks. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var taskList: TaskList
  }
  
  
  trait RecordActivityTaskHeartbeatInput extends js.Object {
    /**
         * If specified, contains details about the progress of the task.
         */
    var details: js.UndefOr[LimitedData] = js.undefined
    /**
         * The taskToken of the ActivityTask.   taskToken is generated by the service and should be treated as an opaque value. If the task is passed to another process, its taskToken must also be passed. This enables it to provide its progress and respond with results.  
         */
    var taskToken: TaskToken
  }
  
  
  trait RecordMarkerDecisionAttributes extends js.Object {
    /**
         *  The details of the marker.
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         *  The name of the marker.
         */
    var markerName: MarkerName
  }
  
  
  trait RecordMarkerFailedEventAttributes extends js.Object {
    /**
         * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: RecordMarkerFailedCause
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RecordMarkerFailed decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The marker's name.
         */
    var markerName: MarkerName
  }
  
  
  trait RegisterActivityTypeInput extends js.Object {
    /**
         * If set, specifies the default maximum time before which a worker processing a task of this type must report progress by calling RecordActivityTaskHeartbeat. If the timeout is exceeded, the activity task is automatically timed out. This default can be overridden when scheduling an activity task using the ScheduleActivityTask Decision. If the activity worker subsequently attempts to record a heartbeat or returns a result, the activity worker receives an UnknownResource fault. In this case, Amazon SWF no longer considers the activity task to be valid; the activity worker should clean up the activity task. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var defaultTaskHeartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * If set, specifies the default task list to use for scheduling tasks of this activity type. This default task list is used if a task list isn't provided when a task is scheduled through the ScheduleActivityTask Decision.
         */
    var defaultTaskList: js.UndefOr[TaskList] = js.undefined
    /**
         * The default task priority to assign to the activity type. If not assigned, then 0 is used. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the in the Amazon SWF Developer Guide..
         */
    var defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined
    /**
         * If set, specifies the default maximum duration for a task of this activity type. This default can be overridden when scheduling an activity task using the ScheduleActivityTask Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var defaultTaskScheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * If set, specifies the default maximum duration that a task of this activity type can wait before being assigned to a worker. This default can be overridden when scheduling an activity task using the ScheduleActivityTask Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var defaultTaskScheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * If set, specifies the default maximum duration that a worker can take to process tasks of this activity type. This default can be overridden when scheduling an activity task using the ScheduleActivityTask Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * A textual description of the activity type.
         */
    var description: js.UndefOr[Description] = js.undefined
    /**
         * The name of the domain in which this activity is to be registered.
         */
    var domain: DomainName
    /**
         * The name of the activity type within the domain. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var name: Name
    /**
         * The version of the activity type.  The activity type consists of the name and version, the combination of which must be unique within the domain.  The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var version: Version
  }
  
  
  trait RegisterDomainInput extends js.Object {
    /**
         * A text description of the domain.
         */
    var description: js.UndefOr[Description] = js.undefined
    /**
         * Name of the domain to register. The name must be unique in the region that the domain is registered in. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var name: DomainName
    /**
         * The duration (in days) that records and histories of workflow executions on the domain should be kept by the service. After the retention period, the workflow execution isn't available in the results of visibility calls. If you pass the value NONE or 0 (zero), then the workflow execution history isn't retained. As soon as the workflow execution completes, the execution record and its history are deleted. The maximum workflow execution retention period is 90 days. For more information about Amazon SWF service limits, see: Amazon SWF Service Limits in the Amazon SWF Developer Guide.
         */
    var workflowExecutionRetentionPeriodInDays: DurationInDays
  }
  
  
  trait RegisterWorkflowTypeInput extends js.Object {
    /**
         * If set, specifies the default policy to use for the child workflow executions when a workflow execution of this type is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution Decision. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
         */
    var defaultChildPolicy: js.UndefOr[ChildPolicy] = js.undefined
    /**
         * If set, specifies the default maximum duration for executions of this workflow type. You can override this default when starting an execution through the StartWorkflowExecution Action or StartChildWorkflowExecution Decision. The duration is specified in seconds; an integer greater than or equal to 0. Unlike some of the other timeout parameters in Amazon SWF, you cannot specify a value of "NONE" for defaultExecutionStartToCloseTimeout; there is a one-year max limit on the time that a workflow execution can run. Exceeding this limit always causes the workflow execution to time out.
         */
    var defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The default IAM role attached to this workflow type.  Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM role when you start this workflow type, the default Lambda role is attached to the execution. For more information, see http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html in the Amazon SWF Developer Guide. 
         */
    var defaultLambdaRole: js.UndefOr[Arn] = js.undefined
    /**
         * If set, specifies the default task list to use for scheduling decision tasks for executions of this workflow type. This default is used only if a task list isn't provided when starting the execution through the StartWorkflowExecution Action or StartChildWorkflowExecution Decision.
         */
    var defaultTaskList: js.UndefOr[TaskList] = js.undefined
    /**
         * The default task priority to assign to the workflow type. If not assigned, then 0 is used. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
         */
    var defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined
    /**
         * If set, specifies the default maximum duration of decision tasks for this workflow type. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * Textual description of the workflow type.
         */
    var description: js.UndefOr[Description] = js.undefined
    /**
         * The name of the domain in which to register the workflow type.
         */
    var domain: DomainName
    /**
         * The name of the workflow type. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var name: Name
    /**
         * The version of the workflow type.  The workflow type consists of the name and version, the combination of which must be unique within the domain. To get a list of all currently registered workflow types, use the ListWorkflowTypes action.  The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var version: Version
  }
  
  
  trait RequestCancelActivityTaskDecisionAttributes extends js.Object {
    /**
         * The activityId of the activity task to be canceled.
         */
    var activityId: ActivityId
  }
  
  
  trait RequestCancelActivityTaskFailedEventAttributes extends js.Object {
    /**
         * The activityId provided in the RequestCancelActivityTask decision that failed.
         */
    var activityId: ActivityId
    /**
         * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: RequestCancelActivityTaskFailedCause
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RequestCancelActivityTask decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
  }
  
  
  trait RequestCancelExternalWorkflowExecutionDecisionAttributes extends js.Object {
    /**
         * The data attached to the event that can be used by the decider in subsequent workflow tasks.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * The runId of the external workflow execution to cancel.
         */
    var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    /**
         *  The workflowId of the external workflow execution to cancel.
         */
    var workflowId: WorkflowId
  }
  
  
  trait RequestCancelExternalWorkflowExecutionFailedEventAttributes extends js.Object {
    /**
         * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: RequestCancelExternalWorkflowExecutionFailedCause
    /**
         * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the workflow execution.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RequestCancelExternalWorkflowExecution decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The ID of the RequestCancelExternalWorkflowExecutionInitiated event corresponding to the RequestCancelExternalWorkflowExecution decision to cancel this external workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var initiatedEventId: EventId
    /**
         * The runId of the external workflow execution.
         */
    var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    /**
         * The workflowId of the external workflow to which the cancel request was to be delivered.
         */
    var workflowId: WorkflowId
  }
  
  
  trait RequestCancelExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
    /**
         * Data attached to the event that can be used by the decider in subsequent workflow tasks.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RequestCancelExternalWorkflowExecution decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The runId of the external workflow execution to be canceled.
         */
    var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    /**
         * The workflowId of the external workflow execution to be canceled.
         */
    var workflowId: WorkflowId
  }
  
  
  trait RequestCancelWorkflowExecutionInput extends js.Object {
    /**
         * The name of the domain containing the workflow execution to cancel.
         */
    var domain: DomainName
    /**
         * The runId of the workflow execution to cancel.
         */
    var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    /**
         * The workflowId of the workflow execution to cancel.
         */
    var workflowId: WorkflowId
  }
  
  
  trait RespondActivityTaskCanceledInput extends js.Object {
    /**
         *  Information about the cancellation.
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         * The taskToken of the ActivityTask.   taskToken is generated by the service and should be treated as an opaque value. If the task is passed to another process, its taskToken must also be passed. This enables it to provide its progress and respond with results. 
         */
    var taskToken: TaskToken
  }
  
  
  trait RespondActivityTaskCompletedInput extends js.Object {
    /**
         * The result of the activity task. It is a free form string that is implementation specific.
         */
    var result: js.UndefOr[Data] = js.undefined
    /**
         * The taskToken of the ActivityTask.   taskToken is generated by the service and should be treated as an opaque value. If the task is passed to another process, its taskToken must also be passed. This enables it to provide its progress and respond with results. 
         */
    var taskToken: TaskToken
  }
  
  
  trait RespondActivityTaskFailedInput extends js.Object {
    /**
         *  Detailed information about the failure.
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         * Description of the error that may assist in diagnostics.
         */
    var reason: js.UndefOr[FailureReason] = js.undefined
    /**
         * The taskToken of the ActivityTask.   taskToken is generated by the service and should be treated as an opaque value. If the task is passed to another process, its taskToken must also be passed. This enables it to provide its progress and respond with results. 
         */
    var taskToken: TaskToken
  }
  
  
  trait RespondDecisionTaskCompletedInput extends js.Object {
    /**
         * The list of decisions (possibly empty) made by the decider while processing this decision task. See the docs for the Decision structure for details.
         */
    var decisions: js.UndefOr[DecisionList] = js.undefined
    /**
         * User defined context to add to workflow execution.
         */
    var executionContext: js.UndefOr[Data] = js.undefined
    /**
         * The taskToken from the DecisionTask.   taskToken is generated by the service and should be treated as an opaque value. If the task is passed to another process, its taskToken must also be passed. This enables it to provide its progress and respond with results. 
         */
    var taskToken: TaskToken
  }
  
  
  trait Run extends js.Object {
    /**
         * The runId of a workflow execution. This ID is generated by the service and can be used to uniquely identify the workflow execution within a domain.
         */
    var runId: js.UndefOr[WorkflowRunId] = js.undefined
  }
  
  
  trait ScheduleActivityTaskDecisionAttributes extends js.Object {
    /**
         *  The activityId of the activity task. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var activityId: ActivityId
    /**
         *  The type of the activity task to schedule.
         */
    var activityType: ActivityType
    /**
         * Data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to the activity.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * If set, specifies the maximum time before which a worker processing a task of this type must report progress by calling RecordActivityTaskHeartbeat. If the timeout is exceeded, the activity task is automatically timed out. If the worker subsequently attempts to record a heartbeat or returns a result, it is ignored. This overrides the default heartbeat timeout specified when registering the activity type using RegisterActivityType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var heartbeatTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The input provided to the activity task.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The maximum duration for this activity task. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A schedule-to-close timeout for this activity task must be specified either as a default for the activity type or through this field. If neither this field is set nor a default schedule-to-close timeout was specified at registration time then a fault is returned. 
         */
    var scheduleToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         *  If set, specifies the maximum duration the activity task can wait to be assigned to a worker. This overrides the default schedule-to-start timeout specified when registering the activity type using RegisterActivityType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A schedule-to-start timeout for this activity task must be specified either as a default for the activity type or through this field. If neither this field is set nor a default schedule-to-start timeout was specified at registration time then a fault is returned. 
         */
    var scheduleToStartTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * If set, specifies the maximum duration a worker may take to process this activity task. This overrides the default start-to-close timeout specified when registering the activity type using RegisterActivityType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A start-to-close timeout for this activity task must be specified either as a default for the activity type or through this field. If neither this field is set nor a default start-to-close timeout was specified at registration time then a fault is returned. 
         */
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * If set, specifies the name of the task list in which to schedule the activity task. If not specified, the defaultTaskList registered with the activity type is used.  A task list for this activity task must be specified either as a default for the activity type or through this field. If neither this field is set nor a default task list was specified at registration time then a fault is returned.  The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var taskList: js.UndefOr[TaskList] = js.undefined
    /**
         *  If set, specifies the priority with which the activity task is to be assigned to a worker. This overrides the defaultTaskPriority specified when registering the activity type using RegisterActivityType. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
         */
    var taskPriority: js.UndefOr[TaskPriority] = js.undefined
  }
  
  
  trait ScheduleActivityTaskFailedEventAttributes extends js.Object {
    /**
         * The activityId provided in the ScheduleActivityTask decision that failed.
         */
    var activityId: ActivityId
    /**
         * The activity type provided in the ScheduleActivityTask decision that failed.
         */
    var activityType: ActivityType
    /**
         * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: ScheduleActivityTaskFailedCause
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision that resulted in the scheduling of this activity task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
  }
  
  
  trait ScheduleLambdaFunctionDecisionAttributes extends js.Object {
    /**
         * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the Lambda task.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * A string that identifies the Lambda function execution in the event history.
         */
    var id: FunctionId
    /**
         * The optional input data to be supplied to the Lambda function.
         */
    var input: js.UndefOr[FunctionInput] = js.undefined
    /**
         * The name, or ARN, of the Lambda function to schedule.
         */
    var name: FunctionName
    /**
         * The timeout value, in seconds, after which the Lambda function is considered to be failed once it has started. This can be any integer from 1-300 (1s-5m). If no value is supplied, than a default value of 300s is assumed.
         */
    var startToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  }
  
  
  trait ScheduleLambdaFunctionFailedEventAttributes extends js.Object {
    /**
         * The cause of the failure. To help diagnose issues, use this information to trace back the chain of events leading up to this event.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: ScheduleLambdaFunctionFailedCause
    /**
         * The ID of the LambdaFunctionCompleted event corresponding to the decision that resulted in scheduling this Lambda task. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The ID provided in the ScheduleLambdaFunction decision that failed. 
         */
    var id: FunctionId
    /**
         * The name of the Lambda function.
         */
    var name: FunctionName
  }
  
  
  trait SignalExternalWorkflowExecutionDecisionAttributes extends js.Object {
    /**
         * The data attached to the event that can be used by the decider in subsequent decision tasks.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         *  The input data to be provided with the signal. The target workflow execution uses the signal name and input data to process the signal.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The runId of the workflow execution to be signaled.
         */
    var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    /**
         *  The name of the signal.The target workflow execution uses the signal name and input to process the signal.
         */
    var signalName: SignalName
    /**
         *  The workflowId of the workflow execution to be signaled.
         */
    var workflowId: WorkflowId
  }
  
  
  trait SignalExternalWorkflowExecutionFailedEventAttributes extends js.Object {
    /**
         * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: SignalExternalWorkflowExecutionFailedCause
    /**
         * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the workflow execution.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the SignalExternalWorkflowExecution decision for this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The ID of the SignalExternalWorkflowExecutionInitiated event corresponding to the SignalExternalWorkflowExecution decision to request this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var initiatedEventId: EventId
    /**
         * The runId of the external workflow execution that the signal was being delivered to.
         */
    var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    /**
         * The workflowId of the external workflow execution that the signal was being delivered to.
         */
    var workflowId: WorkflowId
  }
  
  
  trait SignalExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
    /**
         * Data attached to the event that can be used by the decider in subsequent decision tasks.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the SignalExternalWorkflowExecution decision for this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The input provided to the signal.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The runId of the external workflow execution to send the signal to.
         */
    var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    /**
         * The name of the signal.
         */
    var signalName: SignalName
    /**
         * The workflowId of the external workflow execution.
         */
    var workflowId: WorkflowId
  }
  
  
  trait SignalWorkflowExecutionInput extends js.Object {
    /**
         * The name of the domain containing the workflow execution to signal.
         */
    var domain: DomainName
    /**
         * Data to attach to the WorkflowExecutionSignaled event in the target workflow execution's history.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The runId of the workflow execution to signal.
         */
    var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    /**
         * The name of the signal. This name must be meaningful to the target workflow.
         */
    var signalName: SignalName
    /**
         * The workflowId of the workflow execution to signal.
         */
    var workflowId: WorkflowId
  }
  
  
  trait StartChildWorkflowExecutionDecisionAttributes extends js.Object {
    /**
         *  If set, specifies the policy to use for the child workflow executions if the workflow execution being started is terminated by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. This policy overrides the default child policy specified when registering the workflow type using RegisterWorkflowType. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.    A child policy for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default child policy was specified at registration time then a fault is returned. 
         */
    var childPolicy: js.UndefOr[ChildPolicy] = js.undefined
    /**
         * The data attached to the event that can be used by the decider in subsequent workflow tasks. This data isn't sent to the child workflow execution.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout specified when registering the workflow type. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  An execution start-to-close timeout for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default execution start-to-close timeout was specified at registration time then a fault is returned. 
         */
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The input to be provided to the workflow execution.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The IAM role attached to the child workflow execution.
         */
    var lambdaRole: js.UndefOr[Arn] = js.undefined
    /**
         * The list of tags to associate with the child workflow execution. A maximum of 5 tags can be specified. You can list workflow executions with a specific tag by calling ListOpenWorkflowExecutions or ListClosedWorkflowExecutions and specifying a TagFilter.
         */
    var tagList: js.UndefOr[TagList] = js.undefined
    /**
         * The name of the task list to be used for decision tasks of the child workflow execution.  A task list for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default task list was specified at registration time then a fault is returned.  The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var taskList: js.UndefOr[TaskList] = js.undefined
    /**
         *  A task priority that, if set, specifies the priority for a decision task of this workflow execution. This overrides the defaultTaskPriority specified when registering the workflow type. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
         */
    var taskPriority: js.UndefOr[TaskPriority] = js.undefined
    /**
         * Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the defaultTaskStartToCloseTimout specified when registering the workflow type using RegisterWorkflowType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A task start-to-close timeout for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default task start-to-close timeout was specified at registration time then a fault is returned. 
         */
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         *  The workflowId of the workflow execution. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var workflowId: WorkflowId
    /**
         *  The type of the workflow execution to be started.
         */
    var workflowType: WorkflowType
  }
  
  
  trait StartChildWorkflowExecutionFailedEventAttributes extends js.Object {
    /**
         * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  When cause is set to OPERATION_NOT_PERMITTED, the decision fails because it lacks sufficient permissions. For details and example IAM policies, see  Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: StartChildWorkflowExecutionFailedCause
    /**
         * The data attached to the event that the decider can use in subsequent workflow tasks. This data isn't sent to the child workflow execution.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the StartChildWorkflowExecution Decision to request this child workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * When the cause is WORKFLOW_ALREADY_RUNNING, initiatedEventId is the ID of the StartChildWorkflowExecutionInitiated event that corresponds to the StartChildWorkflowExecution Decision to start the workflow execution. You can use this information to diagnose problems by tracing back the chain of events leading up to this event. When the cause isn't WORKFLOW_ALREADY_RUNNING, initiatedEventId is set to 0 because the StartChildWorkflowExecutionInitiated event doesn't exist.
         */
    var initiatedEventId: EventId
    /**
         * The workflowId of the child workflow execution.
         */
    var workflowId: WorkflowId
    /**
         * The workflow type provided in the StartChildWorkflowExecution Decision that failed.
         */
    var workflowType: WorkflowType
  }
  
  
  trait StartChildWorkflowExecutionInitiatedEventAttributes extends js.Object {
    /**
         * The policy to use for the child workflow executions if this execution gets terminated by explicitly calling the TerminateWorkflowExecution action or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
         */
    var childPolicy: ChildPolicy
    /**
         * Data attached to the event that can be used by the decider in subsequent decision tasks. This data isn't sent to the activity.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the StartChildWorkflowExecution Decision to request this child workflow execution. This information can be useful for diagnosing problems by tracing back the cause of events.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The maximum duration for the child workflow execution. If the workflow execution isn't closed within this duration, it is timed out and force-terminated. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The inputs provided to the child workflow execution.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The IAM role to attach to the child workflow execution.
         */
    var lambdaRole: js.UndefOr[Arn] = js.undefined
    /**
         * The list of tags to associated with the child workflow execution.
         */
    var tagList: js.UndefOr[TagList] = js.undefined
    /**
         * The name of the task list used for the decision tasks of the child workflow execution.
         */
    var taskList: TaskList
    /**
         *  The priority assigned for the decision tasks for this workflow execution. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
         */
    var taskPriority: js.UndefOr[TaskPriority] = js.undefined
    /**
         * The maximum duration allowed for the decision tasks for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The workflowId of the child workflow execution.
         */
    var workflowId: WorkflowId
    /**
         * The type of the child workflow execution.
         */
    var workflowType: WorkflowType
  }
  
  
  trait StartLambdaFunctionFailedEventAttributes extends js.Object {
    /**
         * The cause of the failure. To help diagnose issues, use this information to trace back the chain of events leading up to this event.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because the IAM role attached to the execution lacked sufficient permissions. For details and example IAM policies, see Lambda Tasks in the Amazon SWF Developer Guide. 
         */
    var cause: js.UndefOr[StartLambdaFunctionFailedCause] = js.undefined
    /**
         * A description that can help diagnose the cause of the fault.
         */
    var message: js.UndefOr[CauseMessage] = js.undefined
    /**
         * The ID of the ActivityTaskScheduled event that was recorded when this activity task was scheduled. To help diagnose issues, use this information to trace back the chain of events leading up to this event.
         */
    var scheduledEventId: js.UndefOr[EventId] = js.undefined
  }
  
  
  trait StartTimerDecisionAttributes extends js.Object {
    /**
         * The data attached to the event that can be used by the decider in subsequent workflow tasks.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         *  The duration to wait before firing the timer. The duration is specified in seconds, an integer greater than or equal to 0.
         */
    var startToFireTimeout: DurationInSeconds
    /**
         *  The unique ID of the timer. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var timerId: TimerId
  }
  
  
  trait StartTimerFailedEventAttributes extends js.Object {
    /**
         * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.  If cause is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide. 
         */
    var cause: StartTimerFailedCause
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the StartTimer decision for this activity task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The timerId provided in the StartTimer decision that failed.
         */
    var timerId: TimerId
  }
  
  
  trait StartWorkflowExecutionInput extends js.Object {
    /**
         * If set, specifies the policy to use for the child workflow executions of this workflow execution if it is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. This policy overrides the default child policy specified when registering the workflow type using RegisterWorkflowType. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.    A child policy for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default child policy was specified at registration time then a fault is returned. 
         */
    var childPolicy: js.UndefOr[ChildPolicy] = js.undefined
    /**
         * The name of the domain in which the workflow execution is created.
         */
    var domain: DomainName
    /**
         * The total duration for this workflow execution. This overrides the defaultExecutionStartToCloseTimeout specified when registering the workflow type. The duration is specified in seconds; an integer greater than or equal to 0. Exceeding this limit causes the workflow execution to time out. Unlike some of the other timeout parameters in Amazon SWF, you cannot specify a value of "NONE" for this timeout; there is a one-year max limit on the time that a workflow execution can run.  An execution start-to-close timeout must be specified either through this parameter or as a default when the workflow type is registered. If neither this parameter nor a default execution start-to-close timeout is specified, a fault is returned. 
         */
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The input for the workflow execution. This is a free form string which should be meaningful to the workflow you are starting. This input is made available to the new workflow execution in the WorkflowExecutionStarted history event.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The IAM role to attach to this workflow execution.  Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't attach an IAM role, any attempt to schedule a Lambda task fails. This results in a ScheduleLambdaFunctionFailed history event. For more information, see http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html in the Amazon SWF Developer Guide. 
         */
    var lambdaRole: js.UndefOr[Arn] = js.undefined
    /**
         * The list of tags to associate with the workflow execution. You can specify a maximum of 5 tags. You can list workflow executions with a specific tag by calling ListOpenWorkflowExecutions or ListClosedWorkflowExecutions and specifying a TagFilter.
         */
    var tagList: js.UndefOr[TagList] = js.undefined
    /**
         * The task list to use for the decision tasks generated for this workflow execution. This overrides the defaultTaskList specified when registering the workflow type.  A task list for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default task list was specified at registration time then a fault is returned.  The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var taskList: js.UndefOr[TaskList] = js.undefined
    /**
         * The task priority to use for this workflow execution. This overrides any default priority that was assigned when the workflow type was registered. If not set, then the default task priority for the workflow type is used. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
         */
    var taskPriority: js.UndefOr[TaskPriority] = js.undefined
    /**
         * Specifies the maximum duration of decision tasks for this workflow execution. This parameter overrides the defaultTaskStartToCloseTimout specified when registering the workflow type using RegisterWorkflowType. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.  A task start-to-close timeout for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default task start-to-close timeout was specified at registration time then a fault is returned. 
         */
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The user defined identifier associated with the workflow execution. You can use this to associate a custom identifier with the workflow execution. You may specify the same identifier if a workflow execution is logically a restart of a previous execution. You cannot have two open workflow executions with the same workflowId at the same time. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
         */
    var workflowId: WorkflowId
    /**
         * The type of the workflow to start.
         */
    var workflowType: WorkflowType
  }
  
  
  trait TagFilter extends js.Object {
    /**
         *  Specifies the tag that must be associated with the execution for it to meet the filter criteria.
         */
    var tag: Tag
  }
  
  
  trait TaskList extends js.Object {
    /**
         * The name of the task list.
         */
    var name: Name
  }
  
  
  trait TerminateWorkflowExecutionInput extends js.Object {
    /**
         * If set, specifies the policy to use for the child workflow executions of the workflow execution being terminated. This policy overrides the child policy specified for the workflow execution at registration time or when starting the execution. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.    A child policy for this workflow execution must be specified either as a default for the workflow type or through this parameter. If neither this parameter is set nor a default child policy was specified at registration time then a fault is returned. 
         */
    var childPolicy: js.UndefOr[ChildPolicy] = js.undefined
    /**
         *  Details for terminating the workflow execution.
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         * The domain of the workflow execution to terminate.
         */
    var domain: DomainName
    /**
         *  A descriptive reason for terminating the workflow execution.
         */
    var reason: js.UndefOr[TerminateReason] = js.undefined
    /**
         * The runId of the workflow execution to terminate.
         */
    var runId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    /**
         * The workflowId of the workflow execution to terminate.
         */
    var workflowId: WorkflowId
  }
  
  
  trait TimerCanceledEventAttributes extends js.Object {
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the CancelTimer decision to cancel this timer. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The ID of the TimerStarted event that was recorded when this timer was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
    /**
         * The unique ID of the timer that was canceled.
         */
    var timerId: TimerId
  }
  
  
  trait TimerFiredEventAttributes extends js.Object {
    /**
         * The ID of the TimerStarted event that was recorded when this timer was started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var startedEventId: EventId
    /**
         * The unique ID of the timer that fired.
         */
    var timerId: TimerId
  }
  
  
  trait TimerStartedEventAttributes extends js.Object {
    /**
         * Data attached to the event that can be used by the decider in subsequent workflow tasks.
         */
    var control: js.UndefOr[Data] = js.undefined
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the StartTimer decision for this activity task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The duration of time after which the timer fires. The duration is specified in seconds, an integer greater than or equal to 0.
         */
    var startToFireTimeout: DurationInSeconds
    /**
         * The unique ID of the timer that was started.
         */
    var timerId: TimerId
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Returns the number of closed workflow executions within the given domain that meet the specified filtering criteria.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countClosedWorkflowExecutions(): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of closed workflow executions within the given domain that meet the specified filtering criteria.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countClosedWorkflowExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowExecutionCount, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of closed workflow executions within the given domain that meet the specified filtering criteria.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countClosedWorkflowExecutions(params: CountClosedWorkflowExecutionsInput): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of closed workflow executions within the given domain that meet the specified filtering criteria.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countClosedWorkflowExecutions(
      params: CountClosedWorkflowExecutionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowExecutionCount, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of open workflow executions within the given domain that meet the specified filtering criteria.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countOpenWorkflowExecutions(): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of open workflow executions within the given domain that meet the specified filtering criteria.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countOpenWorkflowExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowExecutionCount, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of open workflow executions within the given domain that meet the specified filtering criteria.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countOpenWorkflowExecutions(params: CountOpenWorkflowExecutionsInput): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of open workflow executions within the given domain that meet the specified filtering criteria.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countOpenWorkflowExecutions(
      params: CountOpenWorkflowExecutionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowExecutionCount, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the estimated number of activity tasks in the specified task list. The count returned is an approximation and isn't guaranteed to be exact. If you specify a task list that no activity task was ever scheduled in then 0 is returned.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countPendingActivityTasks(): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the estimated number of activity tasks in the specified task list. The count returned is an approximation and isn't guaranteed to be exact. If you specify a task list that no activity task was ever scheduled in then 0 is returned.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countPendingActivityTasks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PendingTaskCount, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the estimated number of activity tasks in the specified task list. The count returned is an approximation and isn't guaranteed to be exact. If you specify a task list that no activity task was ever scheduled in then 0 is returned.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countPendingActivityTasks(params: CountPendingActivityTasksInput): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the estimated number of activity tasks in the specified task list. The count returned is an approximation and isn't guaranteed to be exact. If you specify a task list that no activity task was ever scheduled in then 0 is returned.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countPendingActivityTasks(
      params: CountPendingActivityTasksInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PendingTaskCount, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the estimated number of decision tasks in the specified task list. The count returned is an approximation and isn't guaranteed to be exact. If you specify a task list that no decision task was ever scheduled in then 0 is returned.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countPendingDecisionTasks(): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the estimated number of decision tasks in the specified task list. The count returned is an approximation and isn't guaranteed to be exact. If you specify a task list that no decision task was ever scheduled in then 0 is returned.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countPendingDecisionTasks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PendingTaskCount, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the estimated number of decision tasks in the specified task list. The count returned is an approximation and isn't guaranteed to be exact. If you specify a task list that no decision task was ever scheduled in then 0 is returned.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countPendingDecisionTasks(params: CountPendingDecisionTasksInput): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the estimated number of decision tasks in the specified task list. The count returned is an approximation and isn't guaranteed to be exact. If you specify a task list that no decision task was ever scheduled in then 0 is returned.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def countPendingDecisionTasks(
      params: CountPendingDecisionTasksInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PendingTaskCount, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecates the specified activity type. After an activity type has been deprecated, you cannot create new tasks of that activity type. Tasks of this type that were scheduled before the type was deprecated continue to run.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def deprecateActivityType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecates the specified activity type. After an activity type has been deprecated, you cannot create new tasks of that activity type. Tasks of this type that were scheduled before the type was deprecated continue to run.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def deprecateActivityType(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecates the specified activity type. After an activity type has been deprecated, you cannot create new tasks of that activity type. Tasks of this type that were scheduled before the type was deprecated continue to run.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def deprecateActivityType(params: DeprecateActivityTypeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecates the specified activity type. After an activity type has been deprecated, you cannot create new tasks of that activity type. Tasks of this type that were scheduled before the type was deprecated continue to run.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def deprecateActivityType(
      params: DeprecateActivityTypeInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecates the specified domain. After a domain has been deprecated it cannot be used to create new workflow executions or register new types. However, you can still use visibility actions on this domain. Deprecating a domain also deprecates all activity and workflow types registered in the domain. Executions that were started before the domain was deprecated continues to run.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def deprecateDomain(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecates the specified domain. After a domain has been deprecated it cannot be used to create new workflow executions or register new types. However, you can still use visibility actions on this domain. Deprecating a domain also deprecates all activity and workflow types registered in the domain. Executions that were started before the domain was deprecated continues to run.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def deprecateDomain(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecates the specified domain. After a domain has been deprecated it cannot be used to create new workflow executions or register new types. However, you can still use visibility actions on this domain. Deprecating a domain also deprecates all activity and workflow types registered in the domain. Executions that were started before the domain was deprecated continues to run.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def deprecateDomain(params: DeprecateDomainInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecates the specified domain. After a domain has been deprecated it cannot be used to create new workflow executions or register new types. However, you can still use visibility actions on this domain. Deprecating a domain also deprecates all activity and workflow types registered in the domain. Executions that were started before the domain was deprecated continues to run.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def deprecateDomain(
      params: DeprecateDomainInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecates the specified workflow type. After a workflow type has been deprecated, you cannot create new executions of that type. Executions that were started before the type was deprecated continues to run. A deprecated workflow type may still be used when calling visibility actions.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def deprecateWorkflowType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecates the specified workflow type. After a workflow type has been deprecated, you cannot create new executions of that type. Executions that were started before the type was deprecated continues to run. A deprecated workflow type may still be used when calling visibility actions.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def deprecateWorkflowType(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecates the specified workflow type. After a workflow type has been deprecated, you cannot create new executions of that type. Executions that were started before the type was deprecated continues to run. A deprecated workflow type may still be used when calling visibility actions.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def deprecateWorkflowType(params: DeprecateWorkflowTypeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deprecates the specified workflow type. After a workflow type has been deprecated, you cannot create new executions of that type. Executions that were started before the type was deprecated continues to run. A deprecated workflow type may still be used when calling visibility actions.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def deprecateWorkflowType(
      params: DeprecateWorkflowTypeInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified activity type. This includes configuration settings provided when the type was registered and other general information about the type.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeActivityType(): awsDashSdkLib.libRequestMod.Request[ActivityTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified activity type. This includes configuration settings provided when the type was registered and other general information about the type.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeActivityType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ActivityTypeDetail, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ActivityTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified activity type. This includes configuration settings provided when the type was registered and other general information about the type.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeActivityType(params: DescribeActivityTypeInput): awsDashSdkLib.libRequestMod.Request[ActivityTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified activity type. This includes configuration settings provided when the type was registered and other general information about the type.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeActivityType(
      params: DescribeActivityTypeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ActivityTypeDetail, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ActivityTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified domain, including description and status.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeDomain(): awsDashSdkLib.libRequestMod.Request[DomainDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified domain, including description and status.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeDomain(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainDetail, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DomainDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified domain, including description and status.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeDomain(params: DescribeDomainInput): awsDashSdkLib.libRequestMod.Request[DomainDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified domain, including description and status.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeDomain(
      params: DescribeDomainInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainDetail, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DomainDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified workflow execution including its type and some statistics.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeWorkflowExecution(): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified workflow execution including its type and some statistics.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeWorkflowExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowExecutionDetail, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified workflow execution including its type and some statistics.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeWorkflowExecution(params: DescribeWorkflowExecutionInput): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified workflow execution including its type and some statistics.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeWorkflowExecution(
      params: DescribeWorkflowExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowExecutionDetail, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified workflow type. This includes configuration settings specified when the type was registered and other information such as creation date, current status, etc.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeWorkflowType(): awsDashSdkLib.libRequestMod.Request[WorkflowTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified workflow type. This includes configuration settings specified when the type was registered and other information such as creation date, current status, etc.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeWorkflowType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowTypeDetail, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified workflow type. This includes configuration settings specified when the type was registered and other information such as creation date, current status, etc.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeWorkflowType(params: DescribeWorkflowTypeInput): awsDashSdkLib.libRequestMod.Request[WorkflowTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified workflow type. This includes configuration settings specified when the type was registered and other information such as creation date, current status, etc.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def describeWorkflowType(
      params: DescribeWorkflowTypeInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowTypeDetail, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the history of the specified workflow execution. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def getWorkflowExecutionHistory(): awsDashSdkLib.libRequestMod.Request[History, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the history of the specified workflow execution. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def getWorkflowExecutionHistory(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ History, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[History, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the history of the specified workflow execution. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def getWorkflowExecutionHistory(params: GetWorkflowExecutionHistoryInput): awsDashSdkLib.libRequestMod.Request[History, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the history of the specified workflow execution. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def getWorkflowExecutionHistory(
      params: GetWorkflowExecutionHistoryInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ History, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[History, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about all activities registered in the specified domain that match the specified name and registration status. The result includes information like creation date, current status of the activity, etc. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listActivityTypes(): awsDashSdkLib.libRequestMod.Request[ActivityTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about all activities registered in the specified domain that match the specified name and registration status. The result includes information like creation date, current status of the activity, etc. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listActivityTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ActivityTypeInfos, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ActivityTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about all activities registered in the specified domain that match the specified name and registration status. The result includes information like creation date, current status of the activity, etc. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listActivityTypes(params: ListActivityTypesInput): awsDashSdkLib.libRequestMod.Request[ActivityTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about all activities registered in the specified domain that match the specified name and registration status. The result includes information like creation date, current status of the activity, etc. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listActivityTypes(
      params: ListActivityTypesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ActivityTypeInfos, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ActivityTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of closed workflow executions in the specified domain that meet the filtering criteria. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listClosedWorkflowExecutions(): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of closed workflow executions in the specified domain that meet the filtering criteria. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listClosedWorkflowExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowExecutionInfos, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of closed workflow executions in the specified domain that meet the filtering criteria. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listClosedWorkflowExecutions(params: ListClosedWorkflowExecutionsInput): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of closed workflow executions in the specified domain that meet the filtering criteria. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listClosedWorkflowExecutions(
      params: ListClosedWorkflowExecutionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowExecutionInfos, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the list of domains registered in the account. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains. The element must be set to arn:aws:swf::AccountID:domain/ *, where AccountID is the account ID, with no dashes.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listDomains(): awsDashSdkLib.libRequestMod.Request[DomainInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the list of domains registered in the account. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains. The element must be set to arn:aws:swf::AccountID:domain/ *, where AccountID is the account ID, with no dashes.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listDomains(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainInfos, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DomainInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the list of domains registered in the account. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains. The element must be set to arn:aws:swf::AccountID:domain/ *, where AccountID is the account ID, with no dashes.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listDomains(params: ListDomainsInput): awsDashSdkLib.libRequestMod.Request[DomainInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the list of domains registered in the account. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains. The element must be set to arn:aws:swf::AccountID:domain/ *, where AccountID is the account ID, with no dashes.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listDomains(
      params: ListDomainsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainInfos, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DomainInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of open workflow executions in the specified domain that meet the filtering criteria. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listOpenWorkflowExecutions(): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of open workflow executions in the specified domain that meet the filtering criteria. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listOpenWorkflowExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowExecutionInfos, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of open workflow executions in the specified domain that meet the filtering criteria. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listOpenWorkflowExecutions(params: ListOpenWorkflowExecutionsInput): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of open workflow executions in the specified domain that meet the filtering criteria. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listOpenWorkflowExecutions(
      params: ListOpenWorkflowExecutionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowExecutionInfos, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about workflow types in the specified domain. The results may be split into multiple pages that can be retrieved by making the call repeatedly.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listWorkflowTypes(): awsDashSdkLib.libRequestMod.Request[WorkflowTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about workflow types in the specified domain. The results may be split into multiple pages that can be retrieved by making the call repeatedly.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listWorkflowTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowTypeInfos, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about workflow types in the specified domain. The results may be split into multiple pages that can be retrieved by making the call repeatedly.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listWorkflowTypes(params: ListWorkflowTypesInput): awsDashSdkLib.libRequestMod.Request[WorkflowTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about workflow types in the specified domain. The results may be split into multiple pages that can be retrieved by making the call repeatedly.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def listWorkflowTypes(
      params: ListWorkflowTypesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ WorkflowTypeInfos, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[WorkflowTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to get an ActivityTask from the specified activity taskList. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available. The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns an empty result. An empty result, in this context, means that an ActivityTask is returned, but that the value of taskToken is an empty string. If a task is returned, the worker should use its type to identify and process it correctly.  Workers should set their client side socket timeout to at least 70 seconds (10 seconds higher than the maximum time service may hold the poll request).   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def pollForActivityTask(): awsDashSdkLib.libRequestMod.Request[ActivityTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to get an ActivityTask from the specified activity taskList. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available. The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns an empty result. An empty result, in this context, means that an ActivityTask is returned, but that the value of taskToken is an empty string. If a task is returned, the worker should use its type to identify and process it correctly.  Workers should set their client side socket timeout to at least 70 seconds (10 seconds higher than the maximum time service may hold the poll request).   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def pollForActivityTask(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ActivityTask, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ActivityTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to get an ActivityTask from the specified activity taskList. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available. The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns an empty result. An empty result, in this context, means that an ActivityTask is returned, but that the value of taskToken is an empty string. If a task is returned, the worker should use its type to identify and process it correctly.  Workers should set their client side socket timeout to at least 70 seconds (10 seconds higher than the maximum time service may hold the poll request).   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def pollForActivityTask(params: PollForActivityTaskInput): awsDashSdkLib.libRequestMod.Request[ActivityTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to get an ActivityTask from the specified activity taskList. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available. The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns an empty result. An empty result, in this context, means that an ActivityTask is returned, but that the value of taskToken is an empty string. If a task is returned, the worker should use its type to identify and process it correctly.  Workers should set their client side socket timeout to at least 70 seconds (10 seconds higher than the maximum time service may hold the poll request).   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def pollForActivityTask(
      params: PollForActivityTaskInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ActivityTask, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ActivityTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by deciders to get a DecisionTask from the specified decision taskList. A decision task may be returned for any open workflow execution that is using the specified task list. The task includes a paginated view of the history of the workflow execution. The decider should use the workflow type and the history to determine how to properly handle the task. This action initiates a long poll, where the service holds the HTTP connection open and responds as soon a task becomes available. If no decision task is available in the specified task list before the timeout of 60 seconds expires, an empty result is returned. An empty result, in this context, means that a DecisionTask is returned, but that the value of taskToken is an empty string.  Deciders should set their client side socket timeout to at least 70 seconds (10 seconds higher than the timeout).   Because the number of workflow history events for a single workflow execution might be very large, the result returned might be split up across a number of pages. To retrieve subsequent pages, make additional calls to PollForDecisionTask using the nextPageToken returned by the initial call. Note that you do not call GetWorkflowExecutionHistory with this nextPageToken. Instead, call PollForDecisionTask again.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def pollForDecisionTask(): awsDashSdkLib.libRequestMod.Request[DecisionTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by deciders to get a DecisionTask from the specified decision taskList. A decision task may be returned for any open workflow execution that is using the specified task list. The task includes a paginated view of the history of the workflow execution. The decider should use the workflow type and the history to determine how to properly handle the task. This action initiates a long poll, where the service holds the HTTP connection open and responds as soon a task becomes available. If no decision task is available in the specified task list before the timeout of 60 seconds expires, an empty result is returned. An empty result, in this context, means that a DecisionTask is returned, but that the value of taskToken is an empty string.  Deciders should set their client side socket timeout to at least 70 seconds (10 seconds higher than the timeout).   Because the number of workflow history events for a single workflow execution might be very large, the result returned might be split up across a number of pages. To retrieve subsequent pages, make additional calls to PollForDecisionTask using the nextPageToken returned by the initial call. Note that you do not call GetWorkflowExecutionHistory with this nextPageToken. Instead, call PollForDecisionTask again.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def pollForDecisionTask(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DecisionTask, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DecisionTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by deciders to get a DecisionTask from the specified decision taskList. A decision task may be returned for any open workflow execution that is using the specified task list. The task includes a paginated view of the history of the workflow execution. The decider should use the workflow type and the history to determine how to properly handle the task. This action initiates a long poll, where the service holds the HTTP connection open and responds as soon a task becomes available. If no decision task is available in the specified task list before the timeout of 60 seconds expires, an empty result is returned. An empty result, in this context, means that a DecisionTask is returned, but that the value of taskToken is an empty string.  Deciders should set their client side socket timeout to at least 70 seconds (10 seconds higher than the timeout).   Because the number of workflow history events for a single workflow execution might be very large, the result returned might be split up across a number of pages. To retrieve subsequent pages, make additional calls to PollForDecisionTask using the nextPageToken returned by the initial call. Note that you do not call GetWorkflowExecutionHistory with this nextPageToken. Instead, call PollForDecisionTask again.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def pollForDecisionTask(params: PollForDecisionTaskInput): awsDashSdkLib.libRequestMod.Request[DecisionTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by deciders to get a DecisionTask from the specified decision taskList. A decision task may be returned for any open workflow execution that is using the specified task list. The task includes a paginated view of the history of the workflow execution. The decider should use the workflow type and the history to determine how to properly handle the task. This action initiates a long poll, where the service holds the HTTP connection open and responds as soon a task becomes available. If no decision task is available in the specified task list before the timeout of 60 seconds expires, an empty result is returned. An empty result, in this context, means that a DecisionTask is returned, but that the value of taskToken is an empty string.  Deciders should set their client side socket timeout to at least 70 seconds (10 seconds higher than the timeout).   Because the number of workflow history events for a single workflow execution might be very large, the result returned might be split up across a number of pages. To retrieve subsequent pages, make additional calls to PollForDecisionTask using the nextPageToken returned by the initial call. Note that you do not call GetWorkflowExecutionHistory with this nextPageToken. Instead, call PollForDecisionTask again.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def pollForDecisionTask(
      params: PollForDecisionTaskInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DecisionTask, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DecisionTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by activity workers to report to the service that the ActivityTask represented by the specified taskToken is still making progress. The worker can also specify details of the progress, for example percent complete, using the details parameter. This action can also be used by the worker as a mechanism to check if cancellation is being requested for the activity task. If a cancellation is being attempted for the specified task, then the boolean cancelRequested flag returned by the service is set to true. This action resets the taskHeartbeatTimeout clock. The taskHeartbeatTimeout is specified in RegisterActivityType. This action doesn't in itself create an event in the workflow execution history. However, if the task times out, the workflow execution history contains a ActivityTaskTimedOut event that contains the information from the last heartbeat generated by the activity worker.  The taskStartToCloseTimeout of an activity type is the maximum duration of an activity task, regardless of the number of RecordActivityTaskHeartbeat requests received. The taskStartToCloseTimeout is also specified in RegisterActivityType.   This operation is only useful for long-lived activities to report liveliness of the task and to determine if a cancellation is being attempted.   If the cancelRequested flag returns true, a cancellation is being attempted. If the worker can cancel the activity, it should respond with RespondActivityTaskCanceled. Otherwise, it should ignore the cancellation request.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def recordActivityTaskHeartbeat(): awsDashSdkLib.libRequestMod.Request[ActivityTaskStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by activity workers to report to the service that the ActivityTask represented by the specified taskToken is still making progress. The worker can also specify details of the progress, for example percent complete, using the details parameter. This action can also be used by the worker as a mechanism to check if cancellation is being requested for the activity task. If a cancellation is being attempted for the specified task, then the boolean cancelRequested flag returned by the service is set to true. This action resets the taskHeartbeatTimeout clock. The taskHeartbeatTimeout is specified in RegisterActivityType. This action doesn't in itself create an event in the workflow execution history. However, if the task times out, the workflow execution history contains a ActivityTaskTimedOut event that contains the information from the last heartbeat generated by the activity worker.  The taskStartToCloseTimeout of an activity type is the maximum duration of an activity task, regardless of the number of RecordActivityTaskHeartbeat requests received. The taskStartToCloseTimeout is also specified in RegisterActivityType.   This operation is only useful for long-lived activities to report liveliness of the task and to determine if a cancellation is being attempted.   If the cancelRequested flag returns true, a cancellation is being attempted. If the worker can cancel the activity, it should respond with RespondActivityTaskCanceled. Otherwise, it should ignore the cancellation request.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def recordActivityTaskHeartbeat(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ActivityTaskStatus, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ActivityTaskStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by activity workers to report to the service that the ActivityTask represented by the specified taskToken is still making progress. The worker can also specify details of the progress, for example percent complete, using the details parameter. This action can also be used by the worker as a mechanism to check if cancellation is being requested for the activity task. If a cancellation is being attempted for the specified task, then the boolean cancelRequested flag returned by the service is set to true. This action resets the taskHeartbeatTimeout clock. The taskHeartbeatTimeout is specified in RegisterActivityType. This action doesn't in itself create an event in the workflow execution history. However, if the task times out, the workflow execution history contains a ActivityTaskTimedOut event that contains the information from the last heartbeat generated by the activity worker.  The taskStartToCloseTimeout of an activity type is the maximum duration of an activity task, regardless of the number of RecordActivityTaskHeartbeat requests received. The taskStartToCloseTimeout is also specified in RegisterActivityType.   This operation is only useful for long-lived activities to report liveliness of the task and to determine if a cancellation is being attempted.   If the cancelRequested flag returns true, a cancellation is being attempted. If the worker can cancel the activity, it should respond with RespondActivityTaskCanceled. Otherwise, it should ignore the cancellation request.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def recordActivityTaskHeartbeat(params: RecordActivityTaskHeartbeatInput): awsDashSdkLib.libRequestMod.Request[ActivityTaskStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by activity workers to report to the service that the ActivityTask represented by the specified taskToken is still making progress. The worker can also specify details of the progress, for example percent complete, using the details parameter. This action can also be used by the worker as a mechanism to check if cancellation is being requested for the activity task. If a cancellation is being attempted for the specified task, then the boolean cancelRequested flag returned by the service is set to true. This action resets the taskHeartbeatTimeout clock. The taskHeartbeatTimeout is specified in RegisterActivityType. This action doesn't in itself create an event in the workflow execution history. However, if the task times out, the workflow execution history contains a ActivityTaskTimedOut event that contains the information from the last heartbeat generated by the activity worker.  The taskStartToCloseTimeout of an activity type is the maximum duration of an activity task, regardless of the number of RecordActivityTaskHeartbeat requests received. The taskStartToCloseTimeout is also specified in RegisterActivityType.   This operation is only useful for long-lived activities to report liveliness of the task and to determine if a cancellation is being attempted.   If the cancelRequested flag returns true, a cancellation is being attempted. If the worker can cancel the activity, it should respond with RespondActivityTaskCanceled. Otherwise, it should ignore the cancellation request.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def recordActivityTaskHeartbeat(
      params: RecordActivityTaskHeartbeatInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ActivityTaskStatus, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ActivityTaskStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers a new activity type along with its configuration settings in the specified domain.  A TypeAlreadyExists fault is returned if the type already exists in the domain. You cannot change any configuration settings of the type after its registration, and it must be registered as a new version.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.    name: String constraint. The key is swf:name.    version: String constraint. The key is swf:version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def registerActivityType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers a new activity type along with its configuration settings in the specified domain.  A TypeAlreadyExists fault is returned if the type already exists in the domain. You cannot change any configuration settings of the type after its registration, and it must be registered as a new version.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.    name: String constraint. The key is swf:name.    version: String constraint. The key is swf:version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def registerActivityType(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers a new activity type along with its configuration settings in the specified domain.  A TypeAlreadyExists fault is returned if the type already exists in the domain. You cannot change any configuration settings of the type after its registration, and it must be registered as a new version.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.    name: String constraint. The key is swf:name.    version: String constraint. The key is swf:version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def registerActivityType(params: RegisterActivityTypeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers a new activity type along with its configuration settings in the specified domain.  A TypeAlreadyExists fault is returned if the type already exists in the domain. You cannot change any configuration settings of the type after its registration, and it must be registered as a new version.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.    name: String constraint. The key is swf:name.    version: String constraint. The key is swf:version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def registerActivityType(
      params: RegisterActivityTypeInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers a new domain.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   You cannot use an IAM policy to control domain access for this action. The name of the domain being registered is available as the resource of this action.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def registerDomain(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers a new domain.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   You cannot use an IAM policy to control domain access for this action. The name of the domain being registered is available as the resource of this action.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def registerDomain(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers a new domain.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   You cannot use an IAM policy to control domain access for this action. The name of the domain being registered is available as the resource of this action.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def registerDomain(params: RegisterDomainInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers a new domain.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   You cannot use an IAM policy to control domain access for this action. The name of the domain being registered is available as the resource of this action.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def registerDomain(
      params: RegisterDomainInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers a new workflow type and its configuration settings in the specified domain. The retention period for the workflow history is set by the RegisterDomain action.  If the type already exists, then a TypeAlreadyExists fault is returned. You cannot change the configuration settings of a workflow type once it is registered and it must be registered as a new version.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.    name: String constraint. The key is swf:name.    version: String constraint. The key is swf:version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def registerWorkflowType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers a new workflow type and its configuration settings in the specified domain. The retention period for the workflow history is set by the RegisterDomain action.  If the type already exists, then a TypeAlreadyExists fault is returned. You cannot change the configuration settings of a workflow type once it is registered and it must be registered as a new version.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.    name: String constraint. The key is swf:name.    version: String constraint. The key is swf:version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def registerWorkflowType(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers a new workflow type and its configuration settings in the specified domain. The retention period for the workflow history is set by the RegisterDomain action.  If the type already exists, then a TypeAlreadyExists fault is returned. You cannot change the configuration settings of a workflow type once it is registered and it must be registered as a new version.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.    name: String constraint. The key is swf:name.    version: String constraint. The key is swf:version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def registerWorkflowType(params: RegisterWorkflowTypeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers a new workflow type and its configuration settings in the specified domain. The retention period for the workflow history is set by the RegisterDomain action.  If the type already exists, then a TypeAlreadyExists fault is returned. You cannot change the configuration settings of a workflow type once it is registered and it must be registered as a new version.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.    name: String constraint. The key is swf:name.    version: String constraint. The key is swf:version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def registerWorkflowType(
      params: RegisterWorkflowTypeInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a WorkflowExecutionCancelRequested event in the currently running workflow execution identified by the given domain, workflowId, and runId. This logically requests the cancellation of the workflow execution as a whole. It is up to the decider to take appropriate actions when it receives an execution history with this event.  If the runId isn't specified, the WorkflowExecutionCancelRequested event is recorded in the history of the current open workflow execution with the specified workflowId in the domain.   Because this action allows the workflow to properly clean up and gracefully close, it should be used instead of TerminateWorkflowExecution when possible.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def requestCancelWorkflowExecution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a WorkflowExecutionCancelRequested event in the currently running workflow execution identified by the given domain, workflowId, and runId. This logically requests the cancellation of the workflow execution as a whole. It is up to the decider to take appropriate actions when it receives an execution history with this event.  If the runId isn't specified, the WorkflowExecutionCancelRequested event is recorded in the history of the current open workflow execution with the specified workflowId in the domain.   Because this action allows the workflow to properly clean up and gracefully close, it should be used instead of TerminateWorkflowExecution when possible.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def requestCancelWorkflowExecution(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a WorkflowExecutionCancelRequested event in the currently running workflow execution identified by the given domain, workflowId, and runId. This logically requests the cancellation of the workflow execution as a whole. It is up to the decider to take appropriate actions when it receives an execution history with this event.  If the runId isn't specified, the WorkflowExecutionCancelRequested event is recorded in the history of the current open workflow execution with the specified workflowId in the domain.   Because this action allows the workflow to properly clean up and gracefully close, it should be used instead of TerminateWorkflowExecution when possible.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def requestCancelWorkflowExecution(params: RequestCancelWorkflowExecutionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a WorkflowExecutionCancelRequested event in the currently running workflow execution identified by the given domain, workflowId, and runId. This logically requests the cancellation of the workflow execution as a whole. It is up to the decider to take appropriate actions when it receives an execution history with this event.  If the runId isn't specified, the WorkflowExecutionCancelRequested event is recorded in the history of the current open workflow execution with the specified workflowId in the domain.   Because this action allows the workflow to properly clean up and gracefully close, it should be used instead of TerminateWorkflowExecution when possible.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def requestCancelWorkflowExecution(
      params: RequestCancelWorkflowExecutionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to tell the service that the ActivityTask identified by the taskToken was successfully canceled. Additional details can be provided using the details argument. These details (if provided) appear in the ActivityTaskCanceled event added to the workflow history.  Only use this operation if the canceled flag of a RecordActivityTaskHeartbeat request returns true and if the activity can be safely undone or abandoned.  A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondActivityTaskCanceled(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to tell the service that the ActivityTask identified by the taskToken was successfully canceled. Additional details can be provided using the details argument. These details (if provided) appear in the ActivityTaskCanceled event added to the workflow history.  Only use this operation if the canceled flag of a RecordActivityTaskHeartbeat request returns true and if the activity can be safely undone or abandoned.  A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondActivityTaskCanceled(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to tell the service that the ActivityTask identified by the taskToken was successfully canceled. Additional details can be provided using the details argument. These details (if provided) appear in the ActivityTaskCanceled event added to the workflow history.  Only use this operation if the canceled flag of a RecordActivityTaskHeartbeat request returns true and if the activity can be safely undone or abandoned.  A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondActivityTaskCanceled(params: RespondActivityTaskCanceledInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to tell the service that the ActivityTask identified by the taskToken was successfully canceled. Additional details can be provided using the details argument. These details (if provided) appear in the ActivityTaskCanceled event added to the workflow history.  Only use this operation if the canceled flag of a RecordActivityTaskHeartbeat request returns true and if the activity can be safely undone or abandoned.  A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondActivityTaskCanceled(
      params: RespondActivityTaskCanceledInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to tell the service that the ActivityTask identified by the taskToken completed successfully with a result (if provided). The result appears in the ActivityTaskCompleted event in the workflow history.  If the requested task doesn't complete successfully, use RespondActivityTaskFailed instead. If the worker finds that the task is canceled through the canceled flag returned by RecordActivityTaskHeartbeat, it should cancel the task, clean up and then call RespondActivityTaskCanceled.  A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondActivityTaskCompleted(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to tell the service that the ActivityTask identified by the taskToken completed successfully with a result (if provided). The result appears in the ActivityTaskCompleted event in the workflow history.  If the requested task doesn't complete successfully, use RespondActivityTaskFailed instead. If the worker finds that the task is canceled through the canceled flag returned by RecordActivityTaskHeartbeat, it should cancel the task, clean up and then call RespondActivityTaskCanceled.  A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondActivityTaskCompleted(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to tell the service that the ActivityTask identified by the taskToken completed successfully with a result (if provided). The result appears in the ActivityTaskCompleted event in the workflow history.  If the requested task doesn't complete successfully, use RespondActivityTaskFailed instead. If the worker finds that the task is canceled through the canceled flag returned by RecordActivityTaskHeartbeat, it should cancel the task, clean up and then call RespondActivityTaskCanceled.  A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondActivityTaskCompleted(params: RespondActivityTaskCompletedInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to tell the service that the ActivityTask identified by the taskToken completed successfully with a result (if provided). The result appears in the ActivityTaskCompleted event in the workflow history.  If the requested task doesn't complete successfully, use RespondActivityTaskFailed instead. If the worker finds that the task is canceled through the canceled flag returned by RecordActivityTaskHeartbeat, it should cancel the task, clean up and then call RespondActivityTaskCanceled.  A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondActivityTaskCompleted(
      params: RespondActivityTaskCompletedInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to tell the service that the ActivityTask identified by the taskToken has failed with reason (if specified). The reason and details appear in the ActivityTaskFailed event added to the workflow history. A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondActivityTaskFailed(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to tell the service that the ActivityTask identified by the taskToken has failed with reason (if specified). The reason and details appear in the ActivityTaskFailed event added to the workflow history. A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondActivityTaskFailed(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to tell the service that the ActivityTask identified by the taskToken has failed with reason (if specified). The reason and details appear in the ActivityTaskFailed event added to the workflow history. A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondActivityTaskFailed(params: RespondActivityTaskFailedInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to tell the service that the ActivityTask identified by the taskToken has failed with reason (if specified). The reason and details appear in the ActivityTaskFailed event added to the workflow history. A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondActivityTaskFailed(
      params: RespondActivityTaskFailedInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by deciders to tell the service that the DecisionTask identified by the taskToken has successfully completed. The decisions argument specifies the list of decisions made while processing the task. A DecisionTaskCompleted event is added to the workflow history. The executionContext specified is attached to the event in the workflow execution history.  Access Control  If an IAM policy grants permission to use RespondDecisionTaskCompleted, it can express permissions for the list of decisions in the decisions parameter. Each of the decisions has one or more parameters, much like a regular API call. To allow for policies to be as readable as possible, you can express permissions on decisions as if they were actual API calls, including applying conditions to some parameters. For more information, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondDecisionTaskCompleted(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by deciders to tell the service that the DecisionTask identified by the taskToken has successfully completed. The decisions argument specifies the list of decisions made while processing the task. A DecisionTaskCompleted event is added to the workflow history. The executionContext specified is attached to the event in the workflow execution history.  Access Control  If an IAM policy grants permission to use RespondDecisionTaskCompleted, it can express permissions for the list of decisions in the decisions parameter. Each of the decisions has one or more parameters, much like a regular API call. To allow for policies to be as readable as possible, you can express permissions on decisions as if they were actual API calls, including applying conditions to some parameters. For more information, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondDecisionTaskCompleted(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by deciders to tell the service that the DecisionTask identified by the taskToken has successfully completed. The decisions argument specifies the list of decisions made while processing the task. A DecisionTaskCompleted event is added to the workflow history. The executionContext specified is attached to the event in the workflow execution history.  Access Control  If an IAM policy grants permission to use RespondDecisionTaskCompleted, it can express permissions for the list of decisions in the decisions parameter. Each of the decisions has one or more parameters, much like a regular API call. To allow for policies to be as readable as possible, you can express permissions on decisions as if they were actual API calls, including applying conditions to some parameters. For more information, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondDecisionTaskCompleted(params: RespondDecisionTaskCompletedInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by deciders to tell the service that the DecisionTask identified by the taskToken has successfully completed. The decisions argument specifies the list of decisions made while processing the task. A DecisionTaskCompleted event is added to the workflow history. The executionContext specified is attached to the event in the workflow execution history.  Access Control  If an IAM policy grants permission to use RespondDecisionTaskCompleted, it can express permissions for the list of decisions in the decisions parameter. Each of the decisions has one or more parameters, much like a regular API call. To allow for policies to be as readable as possible, you can express permissions on decisions as if they were actual API calls, including applying conditions to some parameters. For more information, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def respondDecisionTaskCompleted(
      params: RespondDecisionTaskCompletedInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a WorkflowExecutionSignaled event in the workflow execution history and creates a decision task for the workflow execution identified by the given domain, workflowId and runId. The event is recorded with the specified user defined signalName and input (if provided).  If a runId isn't specified, then the WorkflowExecutionSignaled event is recorded in the history of the current open workflow with the matching workflowId in the domain.   If the specified workflow execution isn't open, this method fails with UnknownResource.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def signalWorkflowExecution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a WorkflowExecutionSignaled event in the workflow execution history and creates a decision task for the workflow execution identified by the given domain, workflowId and runId. The event is recorded with the specified user defined signalName and input (if provided).  If a runId isn't specified, then the WorkflowExecutionSignaled event is recorded in the history of the current open workflow with the matching workflowId in the domain.   If the specified workflow execution isn't open, this method fails with UnknownResource.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def signalWorkflowExecution(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a WorkflowExecutionSignaled event in the workflow execution history and creates a decision task for the workflow execution identified by the given domain, workflowId and runId. The event is recorded with the specified user defined signalName and input (if provided).  If a runId isn't specified, then the WorkflowExecutionSignaled event is recorded in the history of the current open workflow with the matching workflowId in the domain.   If the specified workflow execution isn't open, this method fails with UnknownResource.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def signalWorkflowExecution(params: SignalWorkflowExecutionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a WorkflowExecutionSignaled event in the workflow execution history and creates a decision task for the workflow execution identified by the given domain, workflowId and runId. The event is recorded with the specified user defined signalName and input (if provided).  If a runId isn't specified, then the WorkflowExecutionSignaled event is recorded in the history of the current open workflow with the matching workflowId in the domain.   If the specified workflow execution isn't open, this method fails with UnknownResource.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def signalWorkflowExecution(
      params: SignalWorkflowExecutionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an execution of the workflow type in the specified domain using the provided workflowId and input data. This action returns the newly started workflow execution.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagList.member.0: The key is swf:tagList.member.0.    tagList.member.1: The key is swf:tagList.member.1.    tagList.member.2: The key is swf:tagList.member.2.    tagList.member.3: The key is swf:tagList.member.3.    tagList.member.4: The key is swf:tagList.member.4.    taskList: String constraint. The key is swf:taskList.name.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def startWorkflowExecution(): awsDashSdkLib.libRequestMod.Request[Run, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an execution of the workflow type in the specified domain using the provided workflowId and input data. This action returns the newly started workflow execution.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagList.member.0: The key is swf:tagList.member.0.    tagList.member.1: The key is swf:tagList.member.1.    tagList.member.2: The key is swf:tagList.member.2.    tagList.member.3: The key is swf:tagList.member.3.    tagList.member.4: The key is swf:tagList.member.4.    taskList: String constraint. The key is swf:taskList.name.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def startWorkflowExecution(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Run, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Run, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an execution of the workflow type in the specified domain using the provided workflowId and input data. This action returns the newly started workflow execution.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagList.member.0: The key is swf:tagList.member.0.    tagList.member.1: The key is swf:tagList.member.1.    tagList.member.2: The key is swf:tagList.member.2.    tagList.member.3: The key is swf:tagList.member.3.    tagList.member.4: The key is swf:tagList.member.4.    taskList: String constraint. The key is swf:taskList.name.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def startWorkflowExecution(params: StartWorkflowExecutionInput): awsDashSdkLib.libRequestMod.Request[Run, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts an execution of the workflow type in the specified domain using the provided workflowId and input data. This action returns the newly started workflow execution.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagList.member.0: The key is swf:tagList.member.0.    tagList.member.1: The key is swf:tagList.member.1.    tagList.member.2: The key is swf:tagList.member.2.    tagList.member.3: The key is swf:tagList.member.3.    tagList.member.4: The key is swf:tagList.member.4.    taskList: String constraint. The key is swf:taskList.name.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def startWorkflowExecution(
      params: StartWorkflowExecutionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Run, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[Run, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a WorkflowExecutionTerminated event and forces closure of the workflow execution identified by the given domain, runId, and workflowId. The child policy, registered with the workflow type or specified when starting this execution, is applied to any open child workflow executions of this workflow execution.  If the identified workflow execution was in progress, it is terminated immediately.   If a runId isn't specified, then the WorkflowExecutionTerminated event is recorded in the history of the current open workflow with the matching workflowId in the domain.   You should consider using RequestCancelWorkflowExecution action instead because it allows the workflow to gracefully close while TerminateWorkflowExecution doesn't.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def terminateWorkflowExecution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a WorkflowExecutionTerminated event and forces closure of the workflow execution identified by the given domain, runId, and workflowId. The child policy, registered with the workflow type or specified when starting this execution, is applied to any open child workflow executions of this workflow execution.  If the identified workflow execution was in progress, it is terminated immediately.   If a runId isn't specified, then the WorkflowExecutionTerminated event is recorded in the history of the current open workflow with the matching workflowId in the domain.   You should consider using RequestCancelWorkflowExecution action instead because it allows the workflow to gracefully close while TerminateWorkflowExecution doesn't.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def terminateWorkflowExecution(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a WorkflowExecutionTerminated event and forces closure of the workflow execution identified by the given domain, runId, and workflowId. The child policy, registered with the workflow type or specified when starting this execution, is applied to any open child workflow executions of this workflow execution.  If the identified workflow execution was in progress, it is terminated immediately.   If a runId isn't specified, then the WorkflowExecutionTerminated event is recorded in the history of the current open workflow with the matching workflowId in the domain.   You should consider using RequestCancelWorkflowExecution action instead because it allows the workflow to gracefully close while TerminateWorkflowExecution doesn't.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def terminateWorkflowExecution(params: TerminateWorkflowExecutionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Records a WorkflowExecutionTerminated event and forces closure of the workflow execution identified by the given domain, runId, and workflowId. The child policy, registered with the workflow type or specified when starting this execution, is applied to any open child workflow executions of this workflow execution.  If the identified workflow execution was in progress, it is terminated immediately.   If a runId isn't specified, then the WorkflowExecutionTerminated event is recorded in the history of the current open workflow with the matching workflowId in the domain.   You should consider using RequestCancelWorkflowExecution action instead because it allows the workflow to gracefully close while TerminateWorkflowExecution doesn't.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
       */
    def terminateWorkflowExecution(
      params: TerminateWorkflowExecutionInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait WorkflowExecution extends js.Object {
    /**
         * A system-generated unique identifier for the workflow execution.
         */
    var runId: WorkflowRunId
    /**
         * The user defined identifier associated with the workflow execution.
         */
    var workflowId: WorkflowId
  }
  
  
  trait WorkflowExecutionCancelRequestedEventAttributes extends js.Object {
    /**
         * If set, indicates that the request to cancel the workflow execution was automatically generated, and specifies the cause. This happens if the parent workflow execution times out or is terminated, and the child policy is set to cancel child executions.
         */
    var cause: js.UndefOr[WorkflowExecutionCancelRequestedCause] = js.undefined
    /**
         * The ID of the RequestCancelExternalWorkflowExecutionInitiated event corresponding to the RequestCancelExternalWorkflowExecution decision to cancel this workflow execution.The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var externalInitiatedEventId: js.UndefOr[EventId] = js.undefined
    /**
         * The external workflow execution for which the cancellation was requested.
         */
    var externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined
  }
  
  
  trait WorkflowExecutionCanceledEventAttributes extends js.Object {
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the CancelWorkflowExecution decision for this cancellation request. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The details of the cancellation.
         */
    var details: js.UndefOr[Data] = js.undefined
  }
  
  
  trait WorkflowExecutionCompletedEventAttributes extends js.Object {
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the CompleteWorkflowExecution decision to complete this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The result produced by the workflow execution upon successful completion.
         */
    var result: js.UndefOr[Data] = js.undefined
  }
  
  
  trait WorkflowExecutionConfiguration extends js.Object {
    /**
         * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
         */
    var childPolicy: ChildPolicy
    /**
         * The total duration for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var executionStartToCloseTimeout: DurationInSeconds
    /**
         * The IAM role attached to the child workflow execution.
         */
    var lambdaRole: js.UndefOr[Arn] = js.undefined
    /**
         * The task list used for the decision tasks generated for this workflow execution.
         */
    var taskList: TaskList
    /**
         * The priority assigned to decision tasks for this workflow execution. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
         */
    var taskPriority: js.UndefOr[TaskPriority] = js.undefined
    /**
         * The maximum duration allowed for decision tasks for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var taskStartToCloseTimeout: DurationInSeconds
  }
  
  
  trait WorkflowExecutionContinuedAsNewEventAttributes extends js.Object {
    /**
         * The policy to use for the child workflow executions of the new execution if it is terminated by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
         */
    var childPolicy: ChildPolicy
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the ContinueAsNewWorkflowExecution decision that started this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The total duration allowed for the new workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The input provided to the new workflow execution.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The IAM role to attach to the new (continued) workflow execution.
         */
    var lambdaRole: js.UndefOr[Arn] = js.undefined
    /**
         * The runId of the new workflow execution.
         */
    var newExecutionRunId: WorkflowRunId
    /**
         * The list of tags associated with the new workflow execution.
         */
    var tagList: js.UndefOr[TagList] = js.undefined
    /**
         * The task list to use for the decisions of the new (continued) workflow execution.
         */
    var taskList: TaskList
    /**
         * The priority of the task to use for the decisions of the new (continued) workflow execution.
         */
    var taskPriority: js.UndefOr[TaskPriority] = js.undefined
    /**
         * The maximum duration of decision tasks for the new workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The workflow type of this execution.
         */
    var workflowType: WorkflowType
  }
  
  
  trait WorkflowExecutionCount extends js.Object {
    /**
         * The number of workflow executions.
         */
    var count: Count
    /**
         * If set to true, indicates that the actual count was more than the maximum supported by this API and the count returned is the truncated value.
         */
    var truncated: js.UndefOr[Truncated] = js.undefined
  }
  
  
  trait WorkflowExecutionDetail extends js.Object {
    /**
         * The configuration settings for this workflow execution including timeout values, tasklist etc.
         */
    var executionConfiguration: WorkflowExecutionConfiguration
    /**
         * Information about the workflow execution.
         */
    var executionInfo: WorkflowExecutionInfo
    /**
         * The time when the last activity task was scheduled for this workflow execution. You can use this information to determine if the workflow has not made progress for an unusually long period of time and might require a corrective action.
         */
    var latestActivityTaskTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
         * The latest executionContext provided by the decider for this workflow execution. A decider can provide an executionContext (a free-form string) when closing a decision task using RespondDecisionTaskCompleted.
         */
    var latestExecutionContext: js.UndefOr[Data] = js.undefined
    /**
         * The number of tasks for this workflow execution. This includes open and closed tasks of all types.
         */
    var openCounts: WorkflowExecutionOpenCounts
  }
  
  
  trait WorkflowExecutionFailedEventAttributes extends js.Object {
    /**
         * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the FailWorkflowExecution decision to fail this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var decisionTaskCompletedEventId: EventId
    /**
         * The details of the failure.
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         * The descriptive reason provided for the failure.
         */
    var reason: js.UndefOr[FailureReason] = js.undefined
  }
  
  
  trait WorkflowExecutionFilter extends js.Object {
    /**
         * The workflowId to pass of match the criteria of this filter.
         */
    var workflowId: WorkflowId
  }
  
  
  trait WorkflowExecutionInfo extends js.Object {
    /**
         * Set to true if a cancellation is requested for this workflow execution.
         */
    var cancelRequested: js.UndefOr[Canceled] = js.undefined
    /**
         * If the execution status is closed then this specifies how the execution was closed:    COMPLETED – the execution was successfully completed.    CANCELED – the execution was canceled.Cancellation allows the implementation to gracefully clean up before the execution is closed.    TERMINATED – the execution was force terminated.    FAILED – the execution failed to complete.    TIMED_OUT – the execution did not complete in the alloted time and was automatically timed out.    CONTINUED_AS_NEW – the execution is logically continued. This means the current execution was completed and a new execution was started to carry on the workflow.  
         */
    var closeStatus: js.UndefOr[CloseStatus] = js.undefined
    /**
         * The time when the workflow execution was closed. Set only if the execution status is CLOSED.
         */
    var closeTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
         * The workflow execution this information is about.
         */
    var execution: WorkflowExecution
    /**
         * The current status of the execution.
         */
    var executionStatus: ExecutionStatus
    /**
         * If this workflow execution is a child of another execution then contains the workflow execution that started this execution.
         */
    var parent: js.UndefOr[WorkflowExecution] = js.undefined
    /**
         * The time when the execution was started.
         */
    var startTimestamp: Timestamp
    /**
         * The list of tags associated with the workflow execution. Tags can be used to identify and list workflow executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
         */
    var tagList: js.UndefOr[TagList] = js.undefined
    /**
         * The type of the workflow execution.
         */
    var workflowType: WorkflowType
  }
  
  
  trait WorkflowExecutionInfos extends js.Object {
    /**
         * The list of workflow information structures.
         */
    var executionInfos: WorkflowExecutionInfoList
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait WorkflowExecutionOpenCounts extends js.Object {
    /**
         * The count of activity tasks whose status is OPEN.
         */
    var openActivityTasks: Count
    /**
         * The count of child workflow executions whose status is OPEN.
         */
    var openChildWorkflowExecutions: Count
    /**
         * The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision task.
         */
    var openDecisionTasks: OpenDecisionTasksCount
    /**
         * The count of Lambda tasks whose status is OPEN.
         */
    var openLambdaFunctions: js.UndefOr[Count] = js.undefined
    /**
         * The count of timers started by this workflow execution that have not fired yet.
         */
    var openTimers: Count
  }
  
  
  trait WorkflowExecutionSignaledEventAttributes extends js.Object {
    /**
         * The ID of the SignalExternalWorkflowExecutionInitiated event corresponding to the SignalExternalWorkflow decision to signal this workflow execution.The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event. This field is set only if the signal was initiated by another workflow execution.
         */
    var externalInitiatedEventId: js.UndefOr[EventId] = js.undefined
    /**
         * The workflow execution that sent the signal. This is set only of the signal was sent by another workflow execution.
         */
    var externalWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined
    /**
         * The inputs provided with the signal. The decider can use the signal name and inputs to determine how to process the signal.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The name of the signal received. The decider can use the signal name and inputs to determine how to the process the signal.
         */
    var signalName: SignalName
  }
  
  
  trait WorkflowExecutionStartedEventAttributes extends js.Object {
    /**
         * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
         */
    var childPolicy: ChildPolicy
    /**
         * If this workflow execution was started due to a ContinueAsNewWorkflowExecution decision, then it contains the runId of the previous workflow execution that was closed and continued as this execution.
         */
    var continuedExecutionRunId: js.UndefOr[WorkflowRunIdOptional] = js.undefined
    /**
         * The maximum duration for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The input provided to the workflow execution.
         */
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The IAM role attached to the workflow execution.
         */
    var lambdaRole: js.UndefOr[Arn] = js.undefined
    /**
         * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this workflow execution. The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
         */
    var parentInitiatedEventId: js.UndefOr[EventId] = js.undefined
    /**
         * The source workflow execution that started this workflow execution. The member isn't set if the workflow execution was not started by a workflow.
         */
    var parentWorkflowExecution: js.UndefOr[WorkflowExecution] = js.undefined
    /**
         * The list of tags associated with this workflow execution. An execution can have up to 5 tags.
         */
    var tagList: js.UndefOr[TagList] = js.undefined
    /**
         * The name of the task list for scheduling the decision tasks for this workflow execution.
         */
    var taskList: TaskList
    /**
         * The priority of the decision tasks in the workflow execution.
         */
    var taskPriority: js.UndefOr[TaskPriority] = js.undefined
    /**
         * The maximum duration of decision tasks for this workflow type. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The workflow type of this execution.
         */
    var workflowType: WorkflowType
  }
  
  
  trait WorkflowExecutionTerminatedEventAttributes extends js.Object {
    /**
         * If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This happens if the parent workflow execution times out or is terminated and the child policy is set to terminate child executions.
         */
    var cause: js.UndefOr[WorkflowExecutionTerminatedCause] = js.undefined
    /**
         * The policy used for the child workflow executions of this workflow execution. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
         */
    var childPolicy: ChildPolicy
    /**
         * The details provided for the termination.
         */
    var details: js.UndefOr[Data] = js.undefined
    /**
         * The reason provided for the termination.
         */
    var reason: js.UndefOr[TerminateReason] = js.undefined
  }
  
  
  trait WorkflowExecutionTimedOutEventAttributes extends js.Object {
    /**
         * The policy used for the child workflow executions of this workflow execution. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
         */
    var childPolicy: ChildPolicy
    /**
         * The type of timeout that caused this event.
         */
    var timeoutType: WorkflowExecutionTimeoutType
  }
  
  
  trait WorkflowType extends js.Object {
    /**
         *  The name of the workflow type.  The combination of workflow type name and version must be unique with in a domain. 
         */
    var name: Name
    /**
         *  The version of the workflow type.  The combination of workflow type name and version must be unique with in a domain. 
         */
    var version: Version
  }
  
  
  trait WorkflowTypeConfiguration extends js.Object {
    /**
         *  The default policy to use for the child workflow executions when a workflow execution of this type is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution Decision. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
         */
    var defaultChildPolicy: js.UndefOr[ChildPolicy] = js.undefined
    /**
         *  The default maximum duration, specified when registering the workflow type, for executions of this workflow type. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
    /**
         * The default IAM role attached to this workflow type.  Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM role when starting this workflow type, the default Lambda role is attached to the execution. For more information, see http://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html in the Amazon SWF Developer Guide. 
         */
    var defaultLambdaRole: js.UndefOr[Arn] = js.undefined
    /**
         *  The default task list, specified when registering the workflow type, for decisions tasks scheduled for workflow executions of this type. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution Decision.
         */
    var defaultTaskList: js.UndefOr[TaskList] = js.undefined
    /**
         *  The default task priority, specified when registering the workflow type, for all decision tasks of this workflow type. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution decision. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
         */
    var defaultTaskPriority: js.UndefOr[TaskPriority] = js.undefined
    /**
         *  The default maximum duration, specified when registering the workflow type, that a decision task for executions of this workflow type might take before returning completion or failure. If the task doesn'tdo close in the specified time then the task is automatically timed out and rescheduled. If the decider eventually reports a completion or failure, it is ignored. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
         */
    var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.undefined
  }
  
  
  trait WorkflowTypeDetail extends js.Object {
    /**
         * Configuration settings of the workflow type registered through RegisterWorkflowType 
         */
    var configuration: WorkflowTypeConfiguration
    /**
         * General information about the workflow type. The status of the workflow type (returned in the WorkflowTypeInfo structure) can be one of the following.    REGISTERED – The type is registered and available. Workers supporting this type should be running.    DEPRECATED – The type was deprecated using DeprecateWorkflowType, but is still in use. You should keep workers supporting this type running. You cannot create new workflow executions of this type.  
         */
    var typeInfo: WorkflowTypeInfo
  }
  
  
  trait WorkflowTypeFilter extends js.Object {
    /**
         *  Name of the workflow type.
         */
    var name: Name
    /**
         * Version of the workflow type.
         */
    var version: js.UndefOr[VersionOptional] = js.undefined
  }
  
  
  trait WorkflowTypeInfo extends js.Object {
    /**
         * The date when this type was registered.
         */
    var creationDate: Timestamp
    /**
         * If the type is in deprecated state, then it is set to the date when the type was deprecated.
         */
    var deprecationDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The description of the type registered through RegisterWorkflowType.
         */
    var description: js.UndefOr[Description] = js.undefined
    /**
         * The current status of the workflow type.
         */
    var status: RegistrationStatus
    /**
         * The workflow type this information is about.
         */
    var workflowType: WorkflowType
  }
  
  
  trait WorkflowTypeInfos extends js.Object {
    /**
         * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
         */
    var nextPageToken: js.UndefOr[PageToken] = js.undefined
    /**
         * The list of workflow type information.
         */
    var typeInfos: WorkflowTypeInfoList
  }
  
  val TypesNs: this.type = js.native
  type ActivityId = java.lang.String
  type ActivityTaskTimeoutType = awsDashSdkLib.awsDashSdkLibStrings.START_TO_CLOSE | awsDashSdkLib.awsDashSdkLibStrings.SCHEDULE_TO_START | awsDashSdkLib.awsDashSdkLibStrings.SCHEDULE_TO_CLOSE | awsDashSdkLib.awsDashSdkLibStrings.HEARTBEAT | java.lang.String
  type ActivityTypeInfoList = js.Array[ActivityTypeInfo]
  type Arn = java.lang.String
  type CancelTimerFailedCause = awsDashSdkLib.awsDashSdkLibStrings.TIMER_ID_UNKNOWN | awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  type CancelWorkflowExecutionFailedCause = awsDashSdkLib.awsDashSdkLibStrings.UNHANDLED_DECISION | awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  type Canceled = scala.Boolean
  type CauseMessage = java.lang.String
  type ChildPolicy = awsDashSdkLib.awsDashSdkLibStrings.TERMINATE | awsDashSdkLib.awsDashSdkLibStrings.REQUEST_CANCEL | awsDashSdkLib.awsDashSdkLibStrings.ABANDON | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloseStatus = awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.CANCELED | awsDashSdkLib.awsDashSdkLibStrings.TERMINATED | awsDashSdkLib.awsDashSdkLibStrings.CONTINUED_AS_NEW | awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT | java.lang.String
  type CompleteWorkflowExecutionFailedCause = awsDashSdkLib.awsDashSdkLibStrings.UNHANDLED_DECISION | awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  type ContinueAsNewWorkflowExecutionFailedCause = awsDashSdkLib.awsDashSdkLibStrings.UNHANDLED_DECISION | awsDashSdkLib.awsDashSdkLibStrings.WORKFLOW_TYPE_DEPRECATED | awsDashSdkLib.awsDashSdkLibStrings.WORKFLOW_TYPE_DOES_NOT_EXIST | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_TASK_LIST_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_CHILD_POLICY_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  type Count = scala.Double
  type Data = java.lang.String
  type DecisionList = js.Array[Decision]
  type DecisionTaskTimeoutType = awsDashSdkLib.awsDashSdkLibStrings.START_TO_CLOSE | java.lang.String
  type DecisionType = awsDashSdkLib.awsDashSdkLibStrings.ScheduleActivityTask | awsDashSdkLib.awsDashSdkLibStrings.RequestCancelActivityTask | awsDashSdkLib.awsDashSdkLibStrings.CompleteWorkflowExecution | awsDashSdkLib.awsDashSdkLibStrings.FailWorkflowExecution | awsDashSdkLib.awsDashSdkLibStrings.CancelWorkflowExecution | awsDashSdkLib.awsDashSdkLibStrings.ContinueAsNewWorkflowExecution | awsDashSdkLib.awsDashSdkLibStrings.RecordMarker | awsDashSdkLib.awsDashSdkLibStrings.StartTimer | awsDashSdkLib.awsDashSdkLibStrings.CancelTimer | awsDashSdkLib.awsDashSdkLibStrings.SignalExternalWorkflowExecution | awsDashSdkLib.awsDashSdkLibStrings.RequestCancelExternalWorkflowExecution | awsDashSdkLib.awsDashSdkLibStrings.StartChildWorkflowExecution | awsDashSdkLib.awsDashSdkLibStrings.ScheduleLambdaFunction | java.lang.String
  type Description = java.lang.String
  type DomainInfoList = js.Array[DomainInfo]
  type DomainName = java.lang.String
  type DurationInDays = java.lang.String
  type DurationInSeconds = java.lang.String
  type DurationInSecondsOptional = java.lang.String
  type EventId = scala.Double
  type EventType = /* LimitUnionLength: was union type with length 55 */js.Any
  type ExecutionStatus = awsDashSdkLib.awsDashSdkLibStrings.OPEN | awsDashSdkLib.awsDashSdkLibStrings.CLOSED | java.lang.String
  type FailWorkflowExecutionFailedCause = awsDashSdkLib.awsDashSdkLibStrings.UNHANDLED_DECISION | awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  type FailureReason = java.lang.String
  type FunctionId = java.lang.String
  type FunctionInput = java.lang.String
  type FunctionName = java.lang.String
  type HistoryEventList = js.Array[HistoryEvent]
  type Identity = java.lang.String
  type LambdaFunctionTimeoutType = awsDashSdkLib.awsDashSdkLibStrings.START_TO_CLOSE | java.lang.String
  type LimitedData = java.lang.String
  type MarkerName = java.lang.String
  type Name = java.lang.String
  type OpenDecisionTasksCount = scala.Double
  type PageSize = scala.Double
  type PageToken = java.lang.String
  type RecordMarkerFailedCause = awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  type RegistrationStatus = awsDashSdkLib.awsDashSdkLibStrings.REGISTERED | awsDashSdkLib.awsDashSdkLibStrings.DEPRECATED | java.lang.String
  type RequestCancelActivityTaskFailedCause = awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_ID_UNKNOWN | awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  type RequestCancelExternalWorkflowExecutionFailedCause = awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION | awsDashSdkLib.awsDashSdkLibStrings.REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  type ReverseOrder = scala.Boolean
  type ScheduleActivityTaskFailedCause = awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_TYPE_DEPRECATED | awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_TYPE_DOES_NOT_EXIST | awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_ID_ALREADY_IN_USE | awsDashSdkLib.awsDashSdkLibStrings.OPEN_ACTIVITIES_LIMIT_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.ACTIVITY_CREATION_RATE_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_TASK_LIST_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  type ScheduleLambdaFunctionFailedCause = awsDashSdkLib.awsDashSdkLibStrings.ID_ALREADY_IN_USE | awsDashSdkLib.awsDashSdkLibStrings.OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION | java.lang.String
  type SignalExternalWorkflowExecutionFailedCause = awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION | awsDashSdkLib.awsDashSdkLibStrings.SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  type SignalName = java.lang.String
  type StartChildWorkflowExecutionFailedCause = awsDashSdkLib.awsDashSdkLibStrings.WORKFLOW_TYPE_DOES_NOT_EXIST | awsDashSdkLib.awsDashSdkLibStrings.WORKFLOW_TYPE_DEPRECATED | awsDashSdkLib.awsDashSdkLibStrings.OPEN_CHILDREN_LIMIT_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.OPEN_WORKFLOWS_LIMIT_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.CHILD_CREATION_RATE_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.WORKFLOW_ALREADY_RUNNING | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_TASK_LIST_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.DEFAULT_CHILD_POLICY_UNDEFINED | awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  type StartLambdaFunctionFailedCause = awsDashSdkLib.awsDashSdkLibStrings.ASSUME_ROLE_FAILED | java.lang.String
  type StartTimerFailedCause = awsDashSdkLib.awsDashSdkLibStrings.TIMER_ID_ALREADY_IN_USE | awsDashSdkLib.awsDashSdkLibStrings.OPEN_TIMERS_LIMIT_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.TIMER_CREATION_RATE_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.OPERATION_NOT_PERMITTED | java.lang.String
  type Tag = java.lang.String
  type TagList = js.Array[Tag]
  type TaskPriority = java.lang.String
  type TaskToken = java.lang.String
  type TerminateReason = java.lang.String
  type TimerId = java.lang.String
  type Timestamp = stdLib.Date
  type Truncated = scala.Boolean
  type Version = java.lang.String
  type VersionOptional = java.lang.String
  type WorkflowExecutionCancelRequestedCause = awsDashSdkLib.awsDashSdkLibStrings.CHILD_POLICY_APPLIED | java.lang.String
  type WorkflowExecutionInfoList = js.Array[WorkflowExecutionInfo]
  type WorkflowExecutionTerminatedCause = awsDashSdkLib.awsDashSdkLibStrings.CHILD_POLICY_APPLIED | awsDashSdkLib.awsDashSdkLibStrings.EVENT_LIMIT_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.OPERATOR_INITIATED | java.lang.String
  type WorkflowExecutionTimeoutType = awsDashSdkLib.awsDashSdkLibStrings.START_TO_CLOSE | java.lang.String
  type WorkflowId = java.lang.String
  type WorkflowRunId = java.lang.String
  type WorkflowRunIdOptional = java.lang.String
  type WorkflowTypeInfoList = js.Array[WorkflowTypeInfo]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2012-01-25` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

