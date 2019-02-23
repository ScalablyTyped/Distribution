package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/stepfunctions", "StepFunctions")
@js.native
object StepFunctionsNs extends js.Object {
  trait ActivityFailedEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
  }
  
  trait ActivityListItem extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that identifies the activity.
      */
    var activityArn: Arn
    /**
      * The date the activity is created.
      */
    var creationDate: Timestamp
    /**
      * The name of the activity. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
      */
    var name: Name
  }
  
  trait ActivityScheduleFailedEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
  }
  
  trait ActivityScheduledEventDetails extends js.Object {
    /**
      * The maximum allowed duration between two heartbeats for the activity task.
      */
    var heartbeatInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
    /**
      * The JSON data input to the activity task.
      */
    var input: js.UndefOr[SensitiveData] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the scheduled activity.
      */
    var resource: Arn
    /**
      * The maximum allowed duration of the activity task.
      */
    var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
  }
  
  trait ActivityStartedEventDetails extends js.Object {
    /**
      * The name of the worker that the task is assigned to. These names are provided by the workers when calling GetActivityTask.
      */
    var workerName: js.UndefOr[Identity] = js.undefined
  }
  
  trait ActivitySucceededEventDetails extends js.Object {
    /**
      * The JSON data output by the activity task.
      */
    var output: js.UndefOr[SensitiveData] = js.undefined
  }
  
  trait ActivityTimedOutEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the timeout.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateActivityInput extends js.Object {
    /**
      * The name of the activity to create. This name must be unique for your AWS account and region for 90 days. For more information, see  Limits Related to State Machine Executions in the AWS Step Functions Developer Guide. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
      */
    var name: Name
    /**
      * The list of tags to add to a resource.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateActivityOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that identifies the created activity.
      */
    var activityArn: Arn
    /**
      * The date the activity is created.
      */
    var creationDate: Timestamp
  }
  
  trait CreateStateMachineInput extends js.Object {
    /**
      * The Amazon States Language definition of the state machine. See Amazon States Language.
      */
    var definition: Definition
    /**
      * The name of the state machine.  A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
      */
    var name: Name
    /**
      * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
      */
    var roleArn: Arn
    /**
      * Tags to be added when creating a state machine.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateStateMachineOutput extends js.Object {
    /**
      * The date the state machine is created.
      */
    var creationDate: Timestamp
    /**
      * The Amazon Resource Name (ARN) that identifies the created state machine.
      */
    var stateMachineArn: Arn
  }
  
  trait DeleteActivityInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the activity to delete.
      */
    var activityArn: Arn
  }
  
  trait DeleteActivityOutput extends js.Object
  
  trait DeleteStateMachineInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the state machine to delete.
      */
    var stateMachineArn: Arn
  }
  
  trait DeleteStateMachineOutput extends js.Object
  
  trait DescribeActivityInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the activity to describe.
      */
    var activityArn: Arn
  }
  
  trait DescribeActivityOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that identifies the activity.
      */
    var activityArn: Arn
    /**
      * The date the activity is created.
      */
    var creationDate: Timestamp
    /**
      * The name of the activity. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
      */
    var name: Name
  }
  
  trait DescribeExecutionInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the execution to describe.
      */
    var executionArn: Arn
  }
  
  trait DescribeExecutionOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that identifies the execution.
      */
    var executionArn: Arn
    /**
      * The string that contains the JSON input data of the execution.
      */
    var input: SensitiveData
    /**
      * The name of the execution. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The JSON output data of the execution.  This field is set only if the execution succeeds. If the execution fails, this field is null. 
      */
    var output: js.UndefOr[SensitiveData] = js.undefined
    /**
      * The date the execution is started.
      */
    var startDate: Timestamp
    /**
      * The Amazon Resource Name (ARN) of the executed stated machine.
      */
    var stateMachineArn: Arn
    /**
      * The current status of the execution.
      */
    var status: ExecutionStatus
    /**
      * If the execution has already ended, the date the execution stopped.
      */
    var stopDate: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait DescribeStateMachineForExecutionInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the execution you want state machine information for.
      */
    var executionArn: Arn
  }
  
  trait DescribeStateMachineForExecutionOutput extends js.Object {
    /**
      * The Amazon States Language definition of the state machine. See Amazon States Language.
      */
    var definition: Definition
    /**
      * The name of the state machine associated with the execution.
      */
    var name: Name
    /**
      * The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution. 
      */
    var roleArn: Arn
    /**
      * The Amazon Resource Name (ARN) of the state machine associated with the execution.
      */
    var stateMachineArn: Arn
    /**
      * The date and time the state machine associated with an execution was updated. For a newly created state machine, this is the creation date.
      */
    var updateDate: Timestamp
  }
  
  trait DescribeStateMachineInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the state machine to describe.
      */
    var stateMachineArn: Arn
  }
  
  trait DescribeStateMachineOutput extends js.Object {
    /**
      * The date the state machine is created.
      */
    var creationDate: Timestamp
    /**
      * The Amazon States Language definition of the state machine. See Amazon States Language.
      */
    var definition: Definition
    /**
      * The name of the state machine. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
      */
    var name: Name
    /**
      * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine. (The IAM role maintains security by granting Step Functions access to AWS resources.)
      */
    var roleArn: Arn
    /**
      * The Amazon Resource Name (ARN) that identifies the state machine.
      */
    var stateMachineArn: Arn
    /**
      * The current status of the state machine.
      */
    var status: js.UndefOr[StateMachineStatus] = js.undefined
  }
  
  trait ExecutionAbortedEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
  }
  
  trait ExecutionFailedEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
  }
  
  trait ExecutionListItem extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that identifies the execution.
      */
    var executionArn: Arn
    /**
      * The name of the execution. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
      */
    var name: Name
    /**
      * The date the execution started.
      */
    var startDate: Timestamp
    /**
      * The Amazon Resource Name (ARN) of the executed state machine.
      */
    var stateMachineArn: Arn
    /**
      * The current status of the execution.
      */
    var status: ExecutionStatus
    /**
      * If the execution already ended, the date the execution stopped.
      */
    var stopDate: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait ExecutionStartedEventDetails extends js.Object {
    /**
      * The JSON data input to the execution.
      */
    var input: js.UndefOr[SensitiveData] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
      */
    var roleArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait ExecutionSucceededEventDetails extends js.Object {
    /**
      * The JSON data output by the execution.
      */
    var output: js.UndefOr[SensitiveData] = js.undefined
  }
  
  trait ExecutionTimedOutEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the timeout.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
  }
  
  trait GetActivityTaskInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the activity to retrieve tasks from (assigned when you create the task using CreateActivity.)
      */
    var activityArn: Arn
    /**
      * You can provide an arbitrary name in order to identify the worker that the task is assigned to. This name is used when it is logged in the execution history.
      */
    var workerName: js.UndefOr[Name] = js.undefined
  }
  
  trait GetActivityTaskOutput extends js.Object {
    /**
      * The string that contains the JSON input data for the task.
      */
    var input: js.UndefOr[SensitiveDataJobInput] = js.undefined
    /**
      * A token that identifies the scheduled task. This token must be copied and included in subsequent calls to SendTaskHeartbeat, SendTaskSuccess or SendTaskFailure in order to report the progress or completion of the task.
      */
    var taskToken: js.UndefOr[TaskToken] = js.undefined
  }
  
  trait GetExecutionHistoryInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the execution.
      */
    var executionArn: Arn
    /**
      * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
      */
    var maxResults: js.UndefOr[PageSize] = js.undefined
    /**
      * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
      */
    var nextToken: js.UndefOr[PageToken] = js.undefined
    /**
      * Lists events in descending order of their timeStamp.
      */
    var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
  }
  
  trait GetExecutionHistoryOutput extends js.Object {
    /**
      * The list of events that occurred in the execution.
      */
    var events: HistoryEventList
    /**
      * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
      */
    var nextToken: js.UndefOr[PageToken] = js.undefined
  }
  
  trait HistoryEvent extends js.Object {
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
    var timestamp: Timestamp
    /**
      * The type of the event.
      */
    var `type`: HistoryEventType
  }
  
  trait LambdaFunctionFailedEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
  }
  
  trait LambdaFunctionScheduleFailedEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
  }
  
  trait LambdaFunctionScheduledEventDetails extends js.Object {
    /**
      * The JSON data input to the lambda function.
      */
    var input: js.UndefOr[SensitiveData] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the scheduled lambda function.
      */
    var resource: Arn
    /**
      * The maximum allowed duration of the lambda function.
      */
    var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
  }
  
  trait LambdaFunctionStartFailedEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
  }
  
  trait LambdaFunctionSucceededEventDetails extends js.Object {
    /**
      * The JSON data output by the lambda function.
      */
    var output: js.UndefOr[SensitiveData] = js.undefined
  }
  
  trait LambdaFunctionTimedOutEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the timeout.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
  }
  
  trait ListActivitiesInput extends js.Object {
    /**
      * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
      */
    var maxResults: js.UndefOr[PageSize] = js.undefined
    /**
      * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
      */
    var nextToken: js.UndefOr[PageToken] = js.undefined
  }
  
  trait ListActivitiesOutput extends js.Object {
    /**
      * The list of activities.
      */
    var activities: ActivityList
    /**
      * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
      */
    var nextToken: js.UndefOr[PageToken] = js.undefined
  }
  
  trait ListExecutionsInput extends js.Object {
    /**
      * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
      */
    var maxResults: js.UndefOr[PageSize] = js.undefined
    /**
      * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
      */
    var nextToken: js.UndefOr[PageToken] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the state machine whose executions is listed.
      */
    var stateMachineArn: Arn
    /**
      * If specified, only list the executions whose current execution status matches the given filter.
      */
    var statusFilter: js.UndefOr[ExecutionStatus] = js.undefined
  }
  
  trait ListExecutionsOutput extends js.Object {
    /**
      * The list of matching executions.
      */
    var executions: ExecutionList
    /**
      * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
      */
    var nextToken: js.UndefOr[PageToken] = js.undefined
  }
  
  trait ListStateMachinesInput extends js.Object {
    /**
      * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 1000. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
      */
    var maxResults: js.UndefOr[PageSize] = js.undefined
    /**
      * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
      */
    var nextToken: js.UndefOr[PageToken] = js.undefined
  }
  
  trait ListStateMachinesOutput extends js.Object {
    /**
      * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
      */
    var nextToken: js.UndefOr[PageToken] = js.undefined
    var stateMachines: StateMachineList
  }
  
  trait ListTagsForResourceInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the Step Functions state machine or activity.
      */
    var resourceArn: Arn
  }
  
  trait ListTagsForResourceOutput extends js.Object {
    /**
      * An array of tags associated with the resource.
      */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait SendTaskFailureInput extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
    /**
      * The token that represents this task. Task tokens are generated by the service when the tasks are assigned to a worker (see GetActivityTask::taskToken).
      */
    var taskToken: TaskToken
  }
  
  trait SendTaskFailureOutput extends js.Object
  
  trait SendTaskHeartbeatInput extends js.Object {
    /**
      * The token that represents this task. Task tokens are generated by the service when the tasks are assigned to a worker (see GetActivityTaskOutput$taskToken).
      */
    var taskToken: TaskToken
  }
  
  trait SendTaskHeartbeatOutput extends js.Object
  
  trait SendTaskSuccessInput extends js.Object {
    /**
      * The JSON output of the task.
      */
    var output: SensitiveData
    /**
      * The token that represents this task. Task tokens are generated by the service when the tasks are assigned to a worker (see GetActivityTaskOutput$taskToken).
      */
    var taskToken: TaskToken
  }
  
  trait SendTaskSuccessOutput extends js.Object
  
  trait StartExecutionInput extends js.Object {
    /**
      * The string that contains the JSON input data for the execution, for example:  "input": "{\"first_name\" : \"test\"}"   If you don't include any JSON input data, you still must include the two braces, for example: "input": "{}"  
      */
    var input: js.UndefOr[SensitiveData] = js.undefined
    /**
      * The name of the execution. This name must be unique for your AWS account, region, and state machine for 90 days. For more information, see  Limits Related to State Machine Executions in the AWS Step Functions Developer Guide. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the state machine to execute.
      */
    var stateMachineArn: Arn
  }
  
  trait StartExecutionOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) that identifies the execution.
      */
    var executionArn: Arn
    /**
      * The date the execution is started.
      */
    var startDate: Timestamp
  }
  
  trait StateEnteredEventDetails extends js.Object {
    /**
      * The string that contains the JSON input data for the state.
      */
    var input: js.UndefOr[SensitiveData] = js.undefined
    /**
      * The name of the state.
      */
    var name: Name
  }
  
  trait StateExitedEventDetails extends js.Object {
    /**
      * The name of the state. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
      */
    var name: Name
    /**
      * The JSON output data of the state.
      */
    var output: js.UndefOr[SensitiveData] = js.undefined
  }
  
  trait StateMachineListItem extends js.Object {
    /**
      * The date the state machine is created.
      */
    var creationDate: Timestamp
    /**
      * The name of the state machine. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
      */
    var name: Name
    /**
      * The Amazon Resource Name (ARN) that identifies the state machine.
      */
    var stateMachineArn: Arn
  }
  
  trait StopExecutionInput extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the execution to stop.
      */
    var executionArn: Arn
  }
  
  trait StopExecutionOutput extends js.Object {
    /**
      * The date the execution is stopped.
      */
    var stopDate: Timestamp
  }
  
  trait Tag extends js.Object {
    /**
      * The key of a tag.
      */
    var key: js.UndefOr[TagKey] = js.undefined
    /**
      * The value of a tag.
      */
    var value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TagResourceInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the Step Functions state machine or activity.
      */
    var resourceArn: Arn
    /**
      * The list of tags to add to a resource. Tags may only contain unicode letters, digits, whitespace, or these symbols: _ . : / = + - @.
      */
    var tags: TagList
  }
  
  trait TagResourceOutput extends js.Object
  
  trait TaskFailedEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
    /**
      * The service name of the resource in a task state.
      */
    var resource: Name
    /**
      * The action of the resource called by a task state.
      */
    var resourceType: Name
  }
  
  trait TaskScheduledEventDetails extends js.Object {
    /**
      * The JSON data passed to the resource referenced in a task state.
      */
    var parameters: ConnectorParameters
    /**
      * The region of the scheduled task
      */
    var region: Name
    /**
      * The service name of the resource in a task state.
      */
    var resource: Name
    /**
      * The action of the resource called by a task state.
      */
    var resourceType: Name
    /**
      * The maximum allowed duration of the task.
      */
    var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
  }
  
  trait TaskStartFailedEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
    /**
      * The service name of the resource in a task state.
      */
    var resource: Name
    /**
      * The action of the resource called by a task state.
      */
    var resourceType: Name
  }
  
  trait TaskStartedEventDetails extends js.Object {
    /**
      * The service name of the resource in a task state.
      */
    var resource: Name
    /**
      * The action of the resource called by a task state.
      */
    var resourceType: Name
  }
  
  trait TaskSubmitFailedEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
    /**
      * The service name of the resource in a task state.
      */
    var resource: Name
    /**
      * The action of the resource called by a task state.
      */
    var resourceType: Name
  }
  
  trait TaskSubmittedEventDetails extends js.Object {
    /**
      * The response from a resource when a task has started.
      */
    var output: js.UndefOr[SensitiveData] = js.undefined
    /**
      * The service name of the resource in a task state.
      */
    var resource: Name
    /**
      * The action of the resource called by a task state.
      */
    var resourceType: Name
  }
  
  trait TaskSucceededEventDetails extends js.Object {
    /**
      * The full JSON response from a resource when a task has succeeded. This response becomes the output of the related task.
      */
    var output: js.UndefOr[SensitiveData] = js.undefined
    /**
      * The service name of the resource in a task state.
      */
    var resource: Name
    /**
      * The action of the resource called by a task state.
      */
    var resourceType: Name
  }
  
  trait TaskTimedOutEventDetails extends js.Object {
    /**
      * A more detailed explanation of the cause of the failure.
      */
    var cause: js.UndefOr[SensitiveCause] = js.undefined
    /**
      * The error code of the failure.
      */
    var error: js.UndefOr[SensitiveError] = js.undefined
    /**
      * The service name of the resource in a task state.
      */
    var resource: Name
    /**
      * The action of the resource called by a task state.
      */
    var resourceType: Name
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates an activity. An activity is a task that you write in any programming language and host on any machine that has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask API action and respond using SendTask* API actions. This function lets Step Functions know the existence of your activity and returns an identifier for use in a state machine and when polling from the activity.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def createActivity(): awsDashSdkLib.libRequestMod.Request[CreateActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createActivity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateActivityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an activity. An activity is a task that you write in any programming language and host on any machine that has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask API action and respond using SendTask* API actions. This function lets Step Functions know the existence of your activity and returns an identifier for use in a state machine and when polling from the activity.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def createActivity(params: CreateActivityInput): awsDashSdkLib.libRequestMod.Request[CreateActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createActivity(
      params: CreateActivityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateActivityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a state machine. A state machine consists of a collection of states that can do work (Task states), determine to which states to transition next (Choice states), stop an execution with an error (Fail states), and so on. State machines are specified using a JSON-based, structured language.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def createStateMachine(): awsDashSdkLib.libRequestMod.Request[CreateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStateMachine(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a state machine. A state machine consists of a collection of states that can do work (Task states), determine to which states to transition next (Choice states), stop an execution with an error (Fail states), and so on. State machines are specified using a JSON-based, structured language.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def createStateMachine(params: CreateStateMachineInput): awsDashSdkLib.libRequestMod.Request[CreateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStateMachine(
      params: CreateStateMachineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an activity.
      */
    def deleteActivity(): awsDashSdkLib.libRequestMod.Request[DeleteActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteActivity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteActivityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an activity.
      */
    def deleteActivity(params: DeleteActivityInput): awsDashSdkLib.libRequestMod.Request[DeleteActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteActivity(
      params: DeleteActivityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteActivityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to DELETING and begins the deletion process. Each state machine execution is deleted the next time it makes a state transition.  The state machine itself is deleted after all executions are completed or deleted. 
      */
    def deleteStateMachine(): awsDashSdkLib.libRequestMod.Request[DeleteStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStateMachine(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to DELETING and begins the deletion process. Each state machine execution is deleted the next time it makes a state transition.  The state machine itself is deleted after all executions are completed or deleted. 
      */
    def deleteStateMachine(params: DeleteStateMachineInput): awsDashSdkLib.libRequestMod.Request[DeleteStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStateMachine(
      params: DeleteStateMachineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an activity.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def describeActivity(): awsDashSdkLib.libRequestMod.Request[DescribeActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeActivity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeActivityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an activity.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def describeActivity(params: DescribeActivityInput): awsDashSdkLib.libRequestMod.Request[DescribeActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeActivity(
      params: DescribeActivityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeActivityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an execution.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def describeExecution(): awsDashSdkLib.libRequestMod.Request[DescribeExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes an execution.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def describeExecution(params: DescribeExecutionInput): awsDashSdkLib.libRequestMod.Request[DescribeExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeExecution(
      params: DescribeExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a state machine.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def describeStateMachine(): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStateMachine(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a state machine.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def describeStateMachine(params: DescribeStateMachineInput): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStateMachine(
      params: DescribeStateMachineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the state machine associated with a specific execution.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def describeStateMachineForExecution(): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineForExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStateMachineForExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStateMachineForExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineForExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the state machine associated with a specific execution.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def describeStateMachineForExecution(params: DescribeStateMachineForExecutionInput): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineForExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStateMachineForExecution(
      params: DescribeStateMachineForExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStateMachineForExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineForExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns a taskToken with a null string.  Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum time the service may hold the poll request). Polling with GetActivityTask can cause latency in some implementations. See Avoid Latency When Polling for Activity Tasks in the Step Functions Developer Guide. 
      */
    def getActivityTask(): awsDashSdkLib.libRequestMod.Request[GetActivityTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getActivityTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetActivityTaskOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetActivityTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns a taskToken with a null string.  Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum time the service may hold the poll request). Polling with GetActivityTask can cause latency in some implementations. See Avoid Latency When Polling for Activity Tasks in the Step Functions Developer Guide. 
      */
    def getActivityTask(params: GetActivityTaskInput): awsDashSdkLib.libRequestMod.Request[GetActivityTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getActivityTask(
      params: GetActivityTaskInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetActivityTaskOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetActivityTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the history of the specified execution as a list of events. By default, the results are returned in ascending order of the timeStamp of the events. Use the reverseOrder parameter to get the latest events first. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
      */
    def getExecutionHistory(): awsDashSdkLib.libRequestMod.Request[GetExecutionHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getExecutionHistory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetExecutionHistoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetExecutionHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the history of the specified execution as a list of events. By default, the results are returned in ascending order of the timeStamp of the events. Use the reverseOrder parameter to get the latest events first. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
      */
    def getExecutionHistory(params: GetExecutionHistoryInput): awsDashSdkLib.libRequestMod.Request[GetExecutionHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getExecutionHistory(
      params: GetExecutionHistoryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetExecutionHistoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetExecutionHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the existing activities. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def listActivities(): awsDashSdkLib.libRequestMod.Request[ListActivitiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listActivities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListActivitiesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListActivitiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the existing activities. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def listActivities(params: ListActivitiesInput): awsDashSdkLib.libRequestMod.Request[ListActivitiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listActivities(
      params: ListActivitiesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListActivitiesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListActivitiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the executions of a state machine that meet the filtering criteria. Results are sorted by time, with the most recent execution first. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def listExecutions(): awsDashSdkLib.libRequestMod.Request[ListExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListExecutionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the executions of a state machine that meet the filtering criteria. Results are sorted by time, with the most recent execution first. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def listExecutions(params: ListExecutionsInput): awsDashSdkLib.libRequestMod.Request[ListExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listExecutions(
      params: ListExecutionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListExecutionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the existing state machines. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def listStateMachines(): awsDashSdkLib.libRequestMod.Request[ListStateMachinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStateMachines(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStateMachinesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStateMachinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the existing state machines. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
      */
    def listStateMachines(params: ListStateMachinesInput): awsDashSdkLib.libRequestMod.Request[ListStateMachinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStateMachines(
      params: ListStateMachinesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStateMachinesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStateMachinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List tags for a given resource.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List tags for a given resource.
      */
    def listTagsForResource(params: ListTagsForResourceInput): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used by workers to report that the task identified by the taskToken failed.
      */
    def sendTaskFailure(): awsDashSdkLib.libRequestMod.Request[SendTaskFailureOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendTaskFailure(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendTaskFailureOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendTaskFailureOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used by workers to report that the task identified by the taskToken failed.
      */
    def sendTaskFailure(params: SendTaskFailureInput): awsDashSdkLib.libRequestMod.Request[SendTaskFailureOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendTaskFailure(
      params: SendTaskFailureInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendTaskFailureOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendTaskFailureOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used by workers to report to the service that the task represented by the specified taskToken is still making progress. This action resets the Heartbeat clock. The Heartbeat threshold is specified in the state machine's Amazon States Language definition. This action does not in itself create an event in the execution history. However, if the task times out, the execution history contains an ActivityTimedOut event.  The Timeout of a task, defined in the state machine's Amazon States Language definition, is its maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received.   This operation is only useful for long-lived tasks to report the liveliness of the task. 
      */
    def sendTaskHeartbeat(): awsDashSdkLib.libRequestMod.Request[SendTaskHeartbeatOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendTaskHeartbeat(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendTaskHeartbeatOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendTaskHeartbeatOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used by workers to report to the service that the task represented by the specified taskToken is still making progress. This action resets the Heartbeat clock. The Heartbeat threshold is specified in the state machine's Amazon States Language definition. This action does not in itself create an event in the execution history. However, if the task times out, the execution history contains an ActivityTimedOut event.  The Timeout of a task, defined in the state machine's Amazon States Language definition, is its maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received.   This operation is only useful for long-lived tasks to report the liveliness of the task. 
      */
    def sendTaskHeartbeat(params: SendTaskHeartbeatInput): awsDashSdkLib.libRequestMod.Request[SendTaskHeartbeatOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendTaskHeartbeat(
      params: SendTaskHeartbeatInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendTaskHeartbeatOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendTaskHeartbeatOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used by workers to report that the task identified by the taskToken completed successfully.
      */
    def sendTaskSuccess(): awsDashSdkLib.libRequestMod.Request[SendTaskSuccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendTaskSuccess(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendTaskSuccessOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendTaskSuccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Used by workers to report that the task identified by the taskToken completed successfully.
      */
    def sendTaskSuccess(params: SendTaskSuccessInput): awsDashSdkLib.libRequestMod.Request[SendTaskSuccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendTaskSuccess(
      params: SendTaskSuccessInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendTaskSuccessOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendTaskSuccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a state machine execution.   StartExecution is idempotent. If StartExecution is called with the same name and input as a running execution, the call will succeed and return the same response as the original request. If the execution is closed or if the input is different, it will return a 400 ExecutionAlreadyExists error. Names can be reused after 90 days.  
      */
    def startExecution(): awsDashSdkLib.libRequestMod.Request[StartExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts a state machine execution.   StartExecution is idempotent. If StartExecution is called with the same name and input as a running execution, the call will succeed and return the same response as the original request. If the execution is closed or if the input is different, it will return a 400 ExecutionAlreadyExists error. Names can be reused after 90 days.  
      */
    def startExecution(params: StartExecutionInput): awsDashSdkLib.libRequestMod.Request[StartExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startExecution(
      params: StartExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops an execution.
      */
    def stopExecution(): awsDashSdkLib.libRequestMod.Request[StopExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops an execution.
      */
    def stopExecution(params: StopExecutionInput): awsDashSdkLib.libRequestMod.Request[StopExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopExecution(
      params: StopExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Add a tag to a Step Functions resource.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Add a tag to a Step Functions resource.
      */
    def tagResource(params: TagResourceInput): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove a tag from a Step Functions resource
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove a tag from a Step Functions resource
      */
    def untagResource(params: UntagResourceInput): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing state machine by modifying its definition and/or roleArn. Running executions will continue to use the previous definition and roleArn. You must include at least one of definition or roleArn or you will receive a MissingRequiredParameter error.  All StartExecution calls within a few seconds will use the updated definition and roleArn. Executions started immediately after calling UpdateStateMachine may use the previous state machine definition and roleArn.  
      */
    def updateStateMachine(): awsDashSdkLib.libRequestMod.Request[UpdateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStateMachine(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing state machine by modifying its definition and/or roleArn. Running executions will continue to use the previous definition and roleArn. You must include at least one of definition or roleArn or you will receive a MissingRequiredParameter error.  All StartExecution calls within a few seconds will use the updated definition and roleArn. Executions started immediately after calling UpdateStateMachine may use the previous state machine definition and roleArn.  
      */
    def updateStateMachine(params: UpdateStateMachineInput): awsDashSdkLib.libRequestMod.Request[UpdateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStateMachine(
      params: UpdateStateMachineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceInput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the Step Functions state machine or activity.
      */
    var resourceArn: Arn
    /**
      * The list of tags to remove from the resource.
      */
    var tagKeys: TagKeyList
  }
  
  trait UntagResourceOutput extends js.Object
  
  trait UpdateStateMachineInput extends js.Object {
    /**
      * The Amazon States Language definition of the state machine. See Amazon States Language.
      */
    var definition: js.UndefOr[Definition] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the IAM role of the state machine.
      */
    var roleArn: js.UndefOr[Arn] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the state machine.
      */
    var stateMachineArn: Arn
  }
  
  trait UpdateStateMachineOutput extends js.Object {
    /**
      * The date and time the state machine was updated.
      */
    var updateDate: Timestamp
  }
  
  val TypesNs: this.type = js.native
  type ActivityList = js.Array[ActivityListItem]
  type Arn = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConnectorParameters = java.lang.String
  type Definition = java.lang.String
  type EventId = scala.Double
  type ExecutionList = js.Array[ExecutionListItem]
  type ExecutionStatus = awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT | awsDashSdkLib.awsDashSdkLibStrings.ABORTED | java.lang.String
  type HistoryEventList = js.Array[HistoryEvent]
  type HistoryEventType = awsDashSdkLib.awsDashSdkLibStrings.ActivityFailed | awsDashSdkLib.awsDashSdkLibStrings.ActivityScheduleFailed | awsDashSdkLib.awsDashSdkLibStrings.ActivityScheduled | awsDashSdkLib.awsDashSdkLibStrings.ActivityStarted | awsDashSdkLib.awsDashSdkLibStrings.ActivitySucceeded | awsDashSdkLib.awsDashSdkLibStrings.ActivityTimedOut | awsDashSdkLib.awsDashSdkLibStrings.ChoiceStateEntered | awsDashSdkLib.awsDashSdkLibStrings.ChoiceStateExited | awsDashSdkLib.awsDashSdkLibStrings.TaskFailed | awsDashSdkLib.awsDashSdkLibStrings.TaskScheduled | awsDashSdkLib.awsDashSdkLibStrings.TaskStartFailed | awsDashSdkLib.awsDashSdkLibStrings.TaskStarted | awsDashSdkLib.awsDashSdkLibStrings.TaskSubmitFailed | awsDashSdkLib.awsDashSdkLibStrings.TaskSubmitted | awsDashSdkLib.awsDashSdkLibStrings.TaskSucceeded | awsDashSdkLib.awsDashSdkLibStrings.TaskTimedOut | awsDashSdkLib.awsDashSdkLibStrings.ExecutionFailed | awsDashSdkLib.awsDashSdkLibStrings.ExecutionStarted | awsDashSdkLib.awsDashSdkLibStrings.ExecutionSucceeded | awsDashSdkLib.awsDashSdkLibStrings.ExecutionAborted | awsDashSdkLib.awsDashSdkLibStrings.ExecutionTimedOut | awsDashSdkLib.awsDashSdkLibStrings.FailStateEntered | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionFailed | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionScheduleFailed | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionScheduled | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionStartFailed | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionStarted | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionSucceeded | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionTimedOut | awsDashSdkLib.awsDashSdkLibStrings.SucceedStateEntered | awsDashSdkLib.awsDashSdkLibStrings.SucceedStateExited | awsDashSdkLib.awsDashSdkLibStrings.TaskStateAborted | awsDashSdkLib.awsDashSdkLibStrings.TaskStateEntered | awsDashSdkLib.awsDashSdkLibStrings.TaskStateExited | awsDashSdkLib.awsDashSdkLibStrings.PassStateEntered | awsDashSdkLib.awsDashSdkLibStrings.PassStateExited | awsDashSdkLib.awsDashSdkLibStrings.ParallelStateAborted | awsDashSdkLib.awsDashSdkLibStrings.ParallelStateEntered | awsDashSdkLib.awsDashSdkLibStrings.ParallelStateExited | awsDashSdkLib.awsDashSdkLibStrings.ParallelStateFailed | awsDashSdkLib.awsDashSdkLibStrings.ParallelStateStarted | awsDashSdkLib.awsDashSdkLibStrings.ParallelStateSucceeded | awsDashSdkLib.awsDashSdkLibStrings.WaitStateAborted | awsDashSdkLib.awsDashSdkLibStrings.WaitStateEntered | awsDashSdkLib.awsDashSdkLibStrings.WaitStateExited | java.lang.String
  type Identity = java.lang.String
  type Name = java.lang.String
  type PageSize = scala.Double
  type PageToken = java.lang.String
  type ReverseOrder = scala.Boolean
  type SensitiveCause = java.lang.String
  type SensitiveData = java.lang.String
  type SensitiveDataJobInput = java.lang.String
  type SensitiveError = java.lang.String
  type StateMachineList = js.Array[StateMachineListItem]
  type StateMachineStatus = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETING | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TaskToken = java.lang.String
  type TimeoutInSeconds = scala.Double
  type Timestamp = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-11-23` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

