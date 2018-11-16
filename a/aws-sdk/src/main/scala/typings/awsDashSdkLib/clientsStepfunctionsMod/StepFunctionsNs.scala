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
    var cause: js.UndefOr[Cause] = js.undefined
    /**
         * The error code of the failure.
         */
    var error: js.UndefOr[Error] = js.undefined
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
    var cause: js.UndefOr[Cause] = js.undefined
    /**
         * The error code of the failure.
         */
    var error: js.UndefOr[Error] = js.undefined
  }
  
  
  trait ActivityScheduledEventDetails extends js.Object {
    /**
         * The maximum allowed duration between two heartbeats for the activity task.
         */
    var heartbeatInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
    /**
         * The JSON data input to the activity task.
         */
    var input: js.UndefOr[Data] = js.undefined
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
    var output: js.UndefOr[Data] = js.undefined
  }
  
  
  trait ActivityTimedOutEventDetails extends js.Object {
    /**
         * A more detailed explanation of the cause of the timeout.
         */
    var cause: js.UndefOr[Cause] = js.undefined
    /**
         * The error code of the failure.
         */
    var error: js.UndefOr[Error] = js.undefined
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
         * The Amazon States Language definition of the state machine.
         */
    var definition: Definition
    /**
         * The name of the state machine. This name must be unique for your AWS account and region for 90 days. For more information, see  Limits Related to State Machine Executions in the AWS Step Functions Developer Guide. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
         */
    var name: Name
    /**
         * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
         */
    var roleArn: Arn
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
    var input: Data
    /**
         * The name of the execution. A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
         */
    var name: js.UndefOr[Name] = js.undefined
    /**
         * The JSON output data of the execution.  This field is set only if the execution succeeds. If the execution fails, this field is null. 
         */
    var output: js.UndefOr[Data] = js.undefined
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
         * The Amazon States Language definition of the state machine.
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
         * The Amazon States Language definition of the state machine.
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
    var cause: js.UndefOr[Cause] = js.undefined
    /**
         * The error code of the failure.
         */
    var error: js.UndefOr[Error] = js.undefined
  }
  
  
  trait ExecutionFailedEventDetails extends js.Object {
    /**
         * A more detailed explanation of the cause of the failure.
         */
    var cause: js.UndefOr[Cause] = js.undefined
    /**
         * The error code of the failure.
         */
    var error: js.UndefOr[Error] = js.undefined
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
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
         */
    var roleArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait ExecutionSucceededEventDetails extends js.Object {
    /**
         * The JSON data output by the execution.
         */
    var output: js.UndefOr[Data] = js.undefined
  }
  
  
  trait ExecutionTimedOutEventDetails extends js.Object {
    /**
         * A more detailed explanation of the cause of the timeout.
         */
    var cause: js.UndefOr[Cause] = js.undefined
    /**
         * The error code of the failure.
         */
    var error: js.UndefOr[Error] = js.undefined
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
    var input: js.UndefOr[Data] = js.undefined
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
         * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 100. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
         */
    var maxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged. The configured maxResults determines how many results can be returned in a single call.
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
         * If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged. The configured maxResults determines how many results can be returned in a single call.
         */
    var nextToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait HistoryEvent extends js.Object {
    var activityFailedEventDetails: js.UndefOr[ActivityFailedEventDetails] = js.undefined
    /**
         * Contains details about an activity schedule event which failed during an execution.
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
         * Contains details about a lambda function which failed to start during an execution.
         */
    var lambdaFunctionStartFailedEventDetails: js.UndefOr[LambdaFunctionStartFailedEventDetails] = js.undefined
    /**
         * Contains details about a lambda function which terminated successfully during an execution.
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
         * The date the event occurred.
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
    var cause: js.UndefOr[Cause] = js.undefined
    /**
         * The error code of the failure.
         */
    var error: js.UndefOr[Error] = js.undefined
  }
  
  
  trait LambdaFunctionScheduleFailedEventDetails extends js.Object {
    /**
         * A more detailed explanation of the cause of the failure.
         */
    var cause: js.UndefOr[Cause] = js.undefined
    /**
         * The error code of the failure.
         */
    var error: js.UndefOr[Error] = js.undefined
  }
  
  
  trait LambdaFunctionScheduledEventDetails extends js.Object {
    /**
         * The JSON data input to the lambda function.
         */
    var input: js.UndefOr[Data] = js.undefined
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
    var cause: js.UndefOr[Cause] = js.undefined
    /**
         * The error code of the failure.
         */
    var error: js.UndefOr[Error] = js.undefined
  }
  
  
  trait LambdaFunctionSucceededEventDetails extends js.Object {
    /**
         * The JSON data output by the lambda function.
         */
    var output: js.UndefOr[Data] = js.undefined
  }
  
  
  trait LambdaFunctionTimedOutEventDetails extends js.Object {
    /**
         * A more detailed explanation of the cause of the timeout.
         */
    var cause: js.UndefOr[Cause] = js.undefined
    /**
         * The error code of the failure.
         */
    var error: js.UndefOr[Error] = js.undefined
  }
  
  
  trait ListActivitiesInput extends js.Object {
    /**
         * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 100. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
         */
    var maxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged. The configured maxResults determines how many results can be returned in a single call.
         */
    var nextToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait ListActivitiesOutput extends js.Object {
    /**
         * The list of activities.
         */
    var activities: ActivityList
    /**
         * If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged. The configured maxResults determines how many results can be returned in a single call.
         */
    var nextToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait ListExecutionsInput extends js.Object {
    /**
         * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 100. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
         */
    var maxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged. The configured maxResults determines how many results can be returned in a single call.
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
         * If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged. The configured maxResults determines how many results can be returned in a single call.
         */
    var nextToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait ListStateMachinesInput extends js.Object {
    /**
         * The maximum number of results that are returned per call. You can use nextToken to obtain further pages of results. The default is 100 and the maximum allowed page size is 100. A value of 0 uses the default. This is only an upper limit. The actual number of results returned per call might be fewer than the specified maximum.
         */
    var maxResults: js.UndefOr[PageSize] = js.undefined
    /**
         * If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged. The configured maxResults determines how many results can be returned in a single call.
         */
    var nextToken: js.UndefOr[PageToken] = js.undefined
  }
  
  
  trait ListStateMachinesOutput extends js.Object {
    /**
         * If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged. The configured maxResults determines how many results can be returned in a single call.
         */
    var nextToken: js.UndefOr[PageToken] = js.undefined
    var stateMachines: StateMachineList
  }
  
  
  trait SendTaskFailureInput extends js.Object {
    /**
         * A more detailed explanation of the cause of the failure.
         */
    var cause: js.UndefOr[Cause] = js.undefined
    /**
         * An arbitrary error code that identifies the cause of the failure.
         */
    var error: js.UndefOr[Error] = js.undefined
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
    var output: Data
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
    var input: js.UndefOr[Data] = js.undefined
    /**
         * The name of the execution. This name must be unique for your AWS account and region for 90 days. For more information, see  Limits Related to State Machine Executions in the AWS Step Functions Developer Guide.  An execution can't use the name of another execution for 90 days. When you make multiple StartExecution calls with the same name, the new execution doesn't run and the following rules apply:   When the original execution is open and the execution input from the new call is different, the ExecutionAlreadyExists message is returned.   When the original execution is open and the execution input from the new call is identical, the Success message is returned.   When the original execution is closed, the ExecutionAlreadyExists message is returned regardless of input.    A name must not contain:   whitespace   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
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
    var input: js.UndefOr[Data] = js.undefined
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
    var output: js.UndefOr[Data] = js.undefined
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
         * A more detailed explanation of the cause of the termination.
         */
    var cause: js.UndefOr[Cause] = js.undefined
    /**
         * An arbitrary error code that identifies the cause of the termination.
         */
    var error: js.UndefOr[Error] = js.undefined
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
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates an activity. An activity is a task which you write in any programming language and host on any machine which has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask API action and respond using SendTask* API actions. This function lets Step Functions know the existence of your activity and returns an identifier for use in a state machine and when polling from the activity.
       */
    def createActivity(): awsDashSdkLib.libRequestMod.Request[CreateActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an activity. An activity is a task which you write in any programming language and host on any machine which has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask API action and respond using SendTask* API actions. This function lets Step Functions know the existence of your activity and returns an identifier for use in a state machine and when polling from the activity.
       */
    def createActivity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateActivityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an activity. An activity is a task which you write in any programming language and host on any machine which has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask API action and respond using SendTask* API actions. This function lets Step Functions know the existence of your activity and returns an identifier for use in a state machine and when polling from the activity.
       */
    def createActivity(params: CreateActivityInput): awsDashSdkLib.libRequestMod.Request[CreateActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an activity. An activity is a task which you write in any programming language and host on any machine which has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask API action and respond using SendTask* API actions. This function lets Step Functions know the existence of your activity and returns an identifier for use in a state machine and when polling from the activity.
       */
    def createActivity(
      params: CreateActivityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateActivityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a state machine. A state machine consists of a collection of states that can do work (Task states), determine to which states to transition next (Choice states), stop an execution with an error (Fail states), and so on. State machines are specified using a JSON-based, structured language.
       */
    def createStateMachine(): awsDashSdkLib.libRequestMod.Request[CreateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a state machine. A state machine consists of a collection of states that can do work (Task states), determine to which states to transition next (Choice states), stop an execution with an error (Fail states), and so on. State machines are specified using a JSON-based, structured language.
       */
    def createStateMachine(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a state machine. A state machine consists of a collection of states that can do work (Task states), determine to which states to transition next (Choice states), stop an execution with an error (Fail states), and so on. State machines are specified using a JSON-based, structured language.
       */
    def createStateMachine(params: CreateStateMachineInput): awsDashSdkLib.libRequestMod.Request[CreateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a state machine. A state machine consists of a collection of states that can do work (Task states), determine to which states to transition next (Choice states), stop an execution with an error (Fail states), and so on. State machines are specified using a JSON-based, structured language.
       */
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
    /**
       * Deletes an activity.
       */
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
    /**
       * Deletes an activity.
       */
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
    /**
       * Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to DELETING and begins the deletion process. Each state machine execution is deleted the next time it makes a state transition.  The state machine itself is deleted after all executions are completed or deleted. 
       */
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
    /**
       * Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to DELETING and begins the deletion process. Each state machine execution is deleted the next time it makes a state transition.  The state machine itself is deleted after all executions are completed or deleted. 
       */
    def deleteStateMachine(
      params: DeleteStateMachineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an activity.
       */
    def describeActivity(): awsDashSdkLib.libRequestMod.Request[DescribeActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an activity.
       */
    def describeActivity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeActivityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an activity.
       */
    def describeActivity(params: DescribeActivityInput): awsDashSdkLib.libRequestMod.Request[DescribeActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an activity.
       */
    def describeActivity(
      params: DescribeActivityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeActivityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeActivityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an execution.
       */
    def describeExecution(): awsDashSdkLib.libRequestMod.Request[DescribeExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an execution.
       */
    def describeExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an execution.
       */
    def describeExecution(params: DescribeExecutionInput): awsDashSdkLib.libRequestMod.Request[DescribeExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes an execution.
       */
    def describeExecution(
      params: DescribeExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a state machine.
       */
    def describeStateMachine(): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a state machine.
       */
    def describeStateMachine(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a state machine.
       */
    def describeStateMachine(params: DescribeStateMachineInput): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes a state machine.
       */
    def describeStateMachine(
      params: DescribeStateMachineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the state machine associated with a specific execution.
       */
    def describeStateMachineForExecution(): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineForExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the state machine associated with a specific execution.
       */
    def describeStateMachineForExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStateMachineForExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineForExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the state machine associated with a specific execution.
       */
    def describeStateMachineForExecution(params: DescribeStateMachineForExecutionInput): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineForExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the state machine associated with a specific execution.
       */
    def describeStateMachineForExecution(
      params: DescribeStateMachineForExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStateMachineForExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStateMachineForExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns a taskToken with a null string.  Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum time the service may hold the poll request). 
       */
    def getActivityTask(): awsDashSdkLib.libRequestMod.Request[GetActivityTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns a taskToken with a null string.  Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum time the service may hold the poll request). 
       */
    def getActivityTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetActivityTaskOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetActivityTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns a taskToken with a null string.  Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum time the service may hold the poll request). 
       */
    def getActivityTask(params: GetActivityTaskInput): awsDashSdkLib.libRequestMod.Request[GetActivityTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns a taskToken with a null string.  Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum time the service may hold the poll request). 
       */
    def getActivityTask(
      params: GetActivityTaskInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetActivityTaskOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetActivityTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the history of the specified execution as a list of events. By default, the results are returned in ascending order of the timeStamp of the events. Use the reverseOrder parameter to get the latest events first. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def getExecutionHistory(): awsDashSdkLib.libRequestMod.Request[GetExecutionHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the history of the specified execution as a list of events. By default, the results are returned in ascending order of the timeStamp of the events. Use the reverseOrder parameter to get the latest events first. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def getExecutionHistory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetExecutionHistoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetExecutionHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the history of the specified execution as a list of events. By default, the results are returned in ascending order of the timeStamp of the events. Use the reverseOrder parameter to get the latest events first. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def getExecutionHistory(params: GetExecutionHistoryInput): awsDashSdkLib.libRequestMod.Request[GetExecutionHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the history of the specified execution as a list of events. By default, the results are returned in ascending order of the timeStamp of the events. Use the reverseOrder parameter to get the latest events first. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def getExecutionHistory(
      params: GetExecutionHistoryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetExecutionHistoryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetExecutionHistoryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the existing activities. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def listActivities(): awsDashSdkLib.libRequestMod.Request[ListActivitiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the existing activities. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def listActivities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListActivitiesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListActivitiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the existing activities. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def listActivities(params: ListActivitiesInput): awsDashSdkLib.libRequestMod.Request[ListActivitiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the existing activities. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def listActivities(
      params: ListActivitiesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListActivitiesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListActivitiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the executions of a state machine that meet the filtering criteria. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def listExecutions(): awsDashSdkLib.libRequestMod.Request[ListExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the executions of a state machine that meet the filtering criteria. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def listExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListExecutionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the executions of a state machine that meet the filtering criteria. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def listExecutions(params: ListExecutionsInput): awsDashSdkLib.libRequestMod.Request[ListExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the executions of a state machine that meet the filtering criteria. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def listExecutions(
      params: ListExecutionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListExecutionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the existing state machines. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def listStateMachines(): awsDashSdkLib.libRequestMod.Request[ListStateMachinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the existing state machines. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def listStateMachines(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStateMachinesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStateMachinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the existing state machines. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def listStateMachines(params: ListStateMachinesInput): awsDashSdkLib.libRequestMod.Request[ListStateMachinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the existing state machines. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
       */
    def listStateMachines(
      params: ListStateMachinesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStateMachinesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStateMachinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to report that the task identified by the taskToken failed.
       */
    def sendTaskFailure(): awsDashSdkLib.libRequestMod.Request[SendTaskFailureOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by workers to report that the task identified by the taskToken failed.
       */
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
    /**
       * Used by workers to report that the task identified by the taskToken failed.
       */
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
    /**
       * Used by workers to report to the service that the task represented by the specified taskToken is still making progress. This action resets the Heartbeat clock. The Heartbeat threshold is specified in the state machine's Amazon States Language definition. This action does not in itself create an event in the execution history. However, if the task times out, the execution history contains an ActivityTimedOut event.  The Timeout of a task, defined in the state machine's Amazon States Language definition, is its maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received.   This operation is only useful for long-lived tasks to report the liveliness of the task. 
       */
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
    /**
       * Used by workers to report to the service that the task represented by the specified taskToken is still making progress. This action resets the Heartbeat clock. The Heartbeat threshold is specified in the state machine's Amazon States Language definition. This action does not in itself create an event in the execution history. However, if the task times out, the execution history contains an ActivityTimedOut event.  The Timeout of a task, defined in the state machine's Amazon States Language definition, is its maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received.   This operation is only useful for long-lived tasks to report the liveliness of the task. 
       */
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
    /**
       * Used by workers to report that the task identified by the taskToken completed successfully.
       */
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
    /**
       * Used by workers to report that the task identified by the taskToken completed successfully.
       */
    def sendTaskSuccess(
      params: SendTaskSuccessInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendTaskSuccessOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendTaskSuccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a state machine execution.
       */
    def startExecution(): awsDashSdkLib.libRequestMod.Request[StartExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a state machine execution.
       */
    def startExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a state machine execution.
       */
    def startExecution(params: StartExecutionInput): awsDashSdkLib.libRequestMod.Request[StartExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a state machine execution.
       */
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
    /**
       * Stops an execution.
       */
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
    /**
       * Stops an execution.
       */
    def stopExecution(
      params: StopExecutionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopExecutionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing state machine by modifying its definition and/or roleArn. Running executions will continue to use the previous definition and roleArn.  All StartExecution calls within a few seconds will use the updated definition and roleArn. Executions started immediately after calling UpdateStateMachine may use the previous state machine definition and roleArn. You must include at least one of definition or roleArn or you will receive a MissingRequiredParameter error. 
       */
    def updateStateMachine(): awsDashSdkLib.libRequestMod.Request[UpdateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing state machine by modifying its definition and/or roleArn. Running executions will continue to use the previous definition and roleArn.  All StartExecution calls within a few seconds will use the updated definition and roleArn. Executions started immediately after calling UpdateStateMachine may use the previous state machine definition and roleArn. You must include at least one of definition or roleArn or you will receive a MissingRequiredParameter error. 
       */
    def updateStateMachine(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing state machine by modifying its definition and/or roleArn. Running executions will continue to use the previous definition and roleArn.  All StartExecution calls within a few seconds will use the updated definition and roleArn. Executions started immediately after calling UpdateStateMachine may use the previous state machine definition and roleArn. You must include at least one of definition or roleArn or you will receive a MissingRequiredParameter error. 
       */
    def updateStateMachine(params: UpdateStateMachineInput): awsDashSdkLib.libRequestMod.Request[UpdateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates an existing state machine by modifying its definition and/or roleArn. Running executions will continue to use the previous definition and roleArn.  All StartExecution calls within a few seconds will use the updated definition and roleArn. Executions started immediately after calling UpdateStateMachine may use the previous state machine definition and roleArn. You must include at least one of definition or roleArn or you will receive a MissingRequiredParameter error. 
       */
    def updateStateMachine(
      params: UpdateStateMachineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStateMachineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStateMachineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateStateMachineInput extends js.Object {
    /**
         * The Amazon States Language definition of the state machine.
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
  type Cause = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Data = java.lang.String
  type Definition = java.lang.String
  type Error = java.lang.String
  type EventId = scala.Double
  type ExecutionList = js.Array[ExecutionListItem]
  type ExecutionStatus = awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT | awsDashSdkLib.awsDashSdkLibStrings.ABORTED | java.lang.String
  type HistoryEventList = js.Array[HistoryEvent]
  type HistoryEventType = awsDashSdkLib.awsDashSdkLibStrings.ActivityFailed | awsDashSdkLib.awsDashSdkLibStrings.ActivityScheduleFailed | awsDashSdkLib.awsDashSdkLibStrings.ActivityScheduled | awsDashSdkLib.awsDashSdkLibStrings.ActivityStarted | awsDashSdkLib.awsDashSdkLibStrings.ActivitySucceeded | awsDashSdkLib.awsDashSdkLibStrings.ActivityTimedOut | awsDashSdkLib.awsDashSdkLibStrings.ChoiceStateEntered | awsDashSdkLib.awsDashSdkLibStrings.ChoiceStateExited | awsDashSdkLib.awsDashSdkLibStrings.ExecutionFailed | awsDashSdkLib.awsDashSdkLibStrings.ExecutionStarted | awsDashSdkLib.awsDashSdkLibStrings.ExecutionSucceeded | awsDashSdkLib.awsDashSdkLibStrings.ExecutionAborted | awsDashSdkLib.awsDashSdkLibStrings.ExecutionTimedOut | awsDashSdkLib.awsDashSdkLibStrings.FailStateEntered | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionFailed | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionScheduleFailed | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionScheduled | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionStartFailed | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionStarted | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionSucceeded | awsDashSdkLib.awsDashSdkLibStrings.LambdaFunctionTimedOut | awsDashSdkLib.awsDashSdkLibStrings.SucceedStateEntered | awsDashSdkLib.awsDashSdkLibStrings.SucceedStateExited | awsDashSdkLib.awsDashSdkLibStrings.TaskStateAborted | awsDashSdkLib.awsDashSdkLibStrings.TaskStateEntered | awsDashSdkLib.awsDashSdkLibStrings.TaskStateExited | awsDashSdkLib.awsDashSdkLibStrings.PassStateEntered | awsDashSdkLib.awsDashSdkLibStrings.PassStateExited | awsDashSdkLib.awsDashSdkLibStrings.ParallelStateAborted | awsDashSdkLib.awsDashSdkLibStrings.ParallelStateEntered | awsDashSdkLib.awsDashSdkLibStrings.ParallelStateExited | awsDashSdkLib.awsDashSdkLibStrings.ParallelStateFailed | awsDashSdkLib.awsDashSdkLibStrings.ParallelStateStarted | awsDashSdkLib.awsDashSdkLibStrings.ParallelStateSucceeded | awsDashSdkLib.awsDashSdkLibStrings.WaitStateAborted | awsDashSdkLib.awsDashSdkLibStrings.WaitStateEntered | awsDashSdkLib.awsDashSdkLibStrings.WaitStateExited | java.lang.String
  type Identity = java.lang.String
  type Name = java.lang.String
  type PageSize = scala.Double
  type PageToken = java.lang.String
  type ReverseOrder = scala.Boolean
  type StateMachineList = js.Array[StateMachineListItem]
  type StateMachineStatus = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETING | java.lang.String
  type TaskToken = java.lang.String
  type TimeoutInSeconds = scala.Double
  type Timestamp = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-11-23` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

