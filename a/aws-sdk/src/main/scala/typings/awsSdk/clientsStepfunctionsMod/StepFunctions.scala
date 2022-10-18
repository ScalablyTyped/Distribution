package typings.awsSdk.clientsStepfunctionsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepFunctions extends Service {
  
  @JSName("config")
  var config_StepFunctions: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an activity. An activity is a task that you write in any programming language and host on any machine that has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask API action and respond using SendTask* API actions. This function lets Step Functions know the existence of your activity and returns an identifier for use in a state machine and when polling from the activity.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes.    CreateActivity is an idempotent API. Subsequent requests won’t create a duplicate resource if it was already created. CreateActivity's idempotency check is based on the activity name. If a following request has different tags values, Step Functions will ignore these differences and treat it as an idempotent request of the previous. In this case, tags will not be updated, even if they are different. 
    */
  def createActivity(): Request[CreateActivityOutput, AWSError] = js.native
  def createActivity(callback: js.Function2[/* err */ AWSError, /* data */ CreateActivityOutput, Unit]): Request[CreateActivityOutput, AWSError] = js.native
  /**
    * Creates an activity. An activity is a task that you write in any programming language and host on any machine that has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask API action and respond using SendTask* API actions. This function lets Step Functions know the existence of your activity and returns an identifier for use in a state machine and when polling from the activity.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes.    CreateActivity is an idempotent API. Subsequent requests won’t create a duplicate resource if it was already created. CreateActivity's idempotency check is based on the activity name. If a following request has different tags values, Step Functions will ignore these differences and treat it as an idempotent request of the previous. In this case, tags will not be updated, even if they are different. 
    */
  def createActivity(params: CreateActivityInput): Request[CreateActivityOutput, AWSError] = js.native
  def createActivity(
    params: CreateActivityInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateActivityOutput, Unit]
  ): Request[CreateActivityOutput, AWSError] = js.native
  
  /**
    * Creates a state machine. A state machine consists of a collection of states that can do work (Task states), determine to which states to transition next (Choice states), stop an execution with an error (Fail states), and so on. State machines are specified using a JSON-based, structured language. For more information, see Amazon States Language in the AWS Step Functions User Guide.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes.    CreateStateMachine is an idempotent API. Subsequent requests won’t create a duplicate resource if it was already created. CreateStateMachine's idempotency check is based on the state machine name, definition, type, LoggingConfiguration and TracingConfiguration. If a following request has a different roleArn or tags, Step Functions will ignore these differences and treat it as an idempotent request of the previous. In this case, roleArn and tags will not be updated, even if they are different. 
    */
  def createStateMachine(): Request[CreateStateMachineOutput, AWSError] = js.native
  def createStateMachine(callback: js.Function2[/* err */ AWSError, /* data */ CreateStateMachineOutput, Unit]): Request[CreateStateMachineOutput, AWSError] = js.native
  /**
    * Creates a state machine. A state machine consists of a collection of states that can do work (Task states), determine to which states to transition next (Choice states), stop an execution with an error (Fail states), and so on. State machines are specified using a JSON-based, structured language. For more information, see Amazon States Language in the AWS Step Functions User Guide.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes.    CreateStateMachine is an idempotent API. Subsequent requests won’t create a duplicate resource if it was already created. CreateStateMachine's idempotency check is based on the state machine name, definition, type, LoggingConfiguration and TracingConfiguration. If a following request has a different roleArn or tags, Step Functions will ignore these differences and treat it as an idempotent request of the previous. In this case, roleArn and tags will not be updated, even if they are different. 
    */
  def createStateMachine(params: CreateStateMachineInput): Request[CreateStateMachineOutput, AWSError] = js.native
  def createStateMachine(
    params: CreateStateMachineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStateMachineOutput, Unit]
  ): Request[CreateStateMachineOutput, AWSError] = js.native
  
  /**
    * Deletes an activity.
    */
  def deleteActivity(): Request[DeleteActivityOutput, AWSError] = js.native
  def deleteActivity(callback: js.Function2[/* err */ AWSError, /* data */ DeleteActivityOutput, Unit]): Request[DeleteActivityOutput, AWSError] = js.native
  /**
    * Deletes an activity.
    */
  def deleteActivity(params: DeleteActivityInput): Request[DeleteActivityOutput, AWSError] = js.native
  def deleteActivity(
    params: DeleteActivityInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteActivityOutput, Unit]
  ): Request[DeleteActivityOutput, AWSError] = js.native
  
  /**
    * Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to DELETING and begins the deletion process.   For EXPRESSstate machines, the deletion will happen eventually (usually less than a minute). Running executions may emit logs after DeleteStateMachine API is called. 
    */
  def deleteStateMachine(): Request[DeleteStateMachineOutput, AWSError] = js.native
  def deleteStateMachine(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStateMachineOutput, Unit]): Request[DeleteStateMachineOutput, AWSError] = js.native
  /**
    * Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to DELETING and begins the deletion process.   For EXPRESSstate machines, the deletion will happen eventually (usually less than a minute). Running executions may emit logs after DeleteStateMachine API is called. 
    */
  def deleteStateMachine(params: DeleteStateMachineInput): Request[DeleteStateMachineOutput, AWSError] = js.native
  def deleteStateMachine(
    params: DeleteStateMachineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStateMachineOutput, Unit]
  ): Request[DeleteStateMachineOutput, AWSError] = js.native
  
  /**
    * Describes an activity.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
    */
  def describeActivity(): Request[DescribeActivityOutput, AWSError] = js.native
  def describeActivity(callback: js.Function2[/* err */ AWSError, /* data */ DescribeActivityOutput, Unit]): Request[DescribeActivityOutput, AWSError] = js.native
  /**
    * Describes an activity.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
    */
  def describeActivity(params: DescribeActivityInput): Request[DescribeActivityOutput, AWSError] = js.native
  def describeActivity(
    params: DescribeActivityInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeActivityOutput, Unit]
  ): Request[DescribeActivityOutput, AWSError] = js.native
  
  /**
    * Describes an execution.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes.  This API action is not supported by EXPRESS state machines.
    */
  def describeExecution(): Request[DescribeExecutionOutput, AWSError] = js.native
  def describeExecution(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExecutionOutput, Unit]): Request[DescribeExecutionOutput, AWSError] = js.native
  /**
    * Describes an execution.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes.  This API action is not supported by EXPRESS state machines.
    */
  def describeExecution(params: DescribeExecutionInput): Request[DescribeExecutionOutput, AWSError] = js.native
  def describeExecution(
    params: DescribeExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExecutionOutput, Unit]
  ): Request[DescribeExecutionOutput, AWSError] = js.native
  
  /**
    * Describes a state machine.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
    */
  def describeStateMachine(): Request[DescribeStateMachineOutput, AWSError] = js.native
  def describeStateMachine(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStateMachineOutput, Unit]): Request[DescribeStateMachineOutput, AWSError] = js.native
  /**
    * Describes a state machine.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
    */
  def describeStateMachine(params: DescribeStateMachineInput): Request[DescribeStateMachineOutput, AWSError] = js.native
  def describeStateMachine(
    params: DescribeStateMachineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStateMachineOutput, Unit]
  ): Request[DescribeStateMachineOutput, AWSError] = js.native
  
  /**
    * Describes the state machine associated with a specific execution.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes.  This API action is not supported by EXPRESS state machines.
    */
  def describeStateMachineForExecution(): Request[DescribeStateMachineForExecutionOutput, AWSError] = js.native
  def describeStateMachineForExecution(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStateMachineForExecutionOutput, Unit]
  ): Request[DescribeStateMachineForExecutionOutput, AWSError] = js.native
  /**
    * Describes the state machine associated with a specific execution.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes.  This API action is not supported by EXPRESS state machines.
    */
  def describeStateMachineForExecution(params: DescribeStateMachineForExecutionInput): Request[DescribeStateMachineForExecutionOutput, AWSError] = js.native
  def describeStateMachineForExecution(
    params: DescribeStateMachineForExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStateMachineForExecutionOutput, Unit]
  ): Request[DescribeStateMachineForExecutionOutput, AWSError] = js.native
  
  /**
    * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns a taskToken with a null string.  Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum time the service may hold the poll request). Polling with GetActivityTask can cause latency in some implementations. See Avoid Latency When Polling for Activity Tasks in the Step Functions Developer Guide. 
    */
  def getActivityTask(): Request[GetActivityTaskOutput, AWSError] = js.native
  def getActivityTask(callback: js.Function2[/* err */ AWSError, /* data */ GetActivityTaskOutput, Unit]): Request[GetActivityTaskOutput, AWSError] = js.native
  /**
    * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns a taskToken with a null string.  Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum time the service may hold the poll request). Polling with GetActivityTask can cause latency in some implementations. See Avoid Latency When Polling for Activity Tasks in the Step Functions Developer Guide. 
    */
  def getActivityTask(params: GetActivityTaskInput): Request[GetActivityTaskOutput, AWSError] = js.native
  def getActivityTask(
    params: GetActivityTaskInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetActivityTaskOutput, Unit]
  ): Request[GetActivityTaskOutput, AWSError] = js.native
  
  /**
    * Returns the history of the specified execution as a list of events. By default, the results are returned in ascending order of the timeStamp of the events. Use the reverseOrder parameter to get the latest events first. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error. This API action is not supported by EXPRESS state machines.
    */
  def getExecutionHistory(): Request[GetExecutionHistoryOutput, AWSError] = js.native
  def getExecutionHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetExecutionHistoryOutput, Unit]): Request[GetExecutionHistoryOutput, AWSError] = js.native
  /**
    * Returns the history of the specified execution as a list of events. By default, the results are returned in ascending order of the timeStamp of the events. Use the reverseOrder parameter to get the latest events first. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error. This API action is not supported by EXPRESS state machines.
    */
  def getExecutionHistory(params: GetExecutionHistoryInput): Request[GetExecutionHistoryOutput, AWSError] = js.native
  def getExecutionHistory(
    params: GetExecutionHistoryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExecutionHistoryOutput, Unit]
  ): Request[GetExecutionHistoryOutput, AWSError] = js.native
  
  /**
    * Lists the existing activities. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
    */
  def listActivities(): Request[ListActivitiesOutput, AWSError] = js.native
  def listActivities(callback: js.Function2[/* err */ AWSError, /* data */ ListActivitiesOutput, Unit]): Request[ListActivitiesOutput, AWSError] = js.native
  /**
    * Lists the existing activities. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
    */
  def listActivities(params: ListActivitiesInput): Request[ListActivitiesOutput, AWSError] = js.native
  def listActivities(
    params: ListActivitiesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListActivitiesOutput, Unit]
  ): Request[ListActivitiesOutput, AWSError] = js.native
  
  /**
    * Lists the executions of a state machine that meet the filtering criteria. Results are sorted by time, with the most recent execution first. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes.  This API action is not supported by EXPRESS state machines.
    */
  def listExecutions(): Request[ListExecutionsOutput, AWSError] = js.native
  def listExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListExecutionsOutput, Unit]): Request[ListExecutionsOutput, AWSError] = js.native
  /**
    * Lists the executions of a state machine that meet the filtering criteria. Results are sorted by time, with the most recent execution first. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes.  This API action is not supported by EXPRESS state machines.
    */
  def listExecutions(params: ListExecutionsInput): Request[ListExecutionsOutput, AWSError] = js.native
  def listExecutions(
    params: ListExecutionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExecutionsOutput, Unit]
  ): Request[ListExecutionsOutput, AWSError] = js.native
  
  /**
    * Lists the existing state machines. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
    */
  def listStateMachines(): Request[ListStateMachinesOutput, AWSError] = js.native
  def listStateMachines(callback: js.Function2[/* err */ AWSError, /* data */ ListStateMachinesOutput, Unit]): Request[ListStateMachinesOutput, AWSError] = js.native
  /**
    * Lists the existing state machines. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.  This operation is eventually consistent. The results are best effort and may not reflect very recent updates and changes. 
    */
  def listStateMachines(params: ListStateMachinesInput): Request[ListStateMachinesOutput, AWSError] = js.native
  def listStateMachines(
    params: ListStateMachinesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStateMachinesOutput, Unit]
  ): Request[ListStateMachinesOutput, AWSError] = js.native
  
  /**
    * List tags for a given resource. Tags may only contain Unicode letters, digits, white space, or these symbols: _ . : / = + - @.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * List tags for a given resource. Tags may only contain Unicode letters, digits, white space, or these symbols: _ . : / = + - @.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Used by activity workers and task states using the callback pattern to report that the task identified by the taskToken failed.
    */
  def sendTaskFailure(): Request[SendTaskFailureOutput, AWSError] = js.native
  def sendTaskFailure(callback: js.Function2[/* err */ AWSError, /* data */ SendTaskFailureOutput, Unit]): Request[SendTaskFailureOutput, AWSError] = js.native
  /**
    * Used by activity workers and task states using the callback pattern to report that the task identified by the taskToken failed.
    */
  def sendTaskFailure(params: SendTaskFailureInput): Request[SendTaskFailureOutput, AWSError] = js.native
  def sendTaskFailure(
    params: SendTaskFailureInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SendTaskFailureOutput, Unit]
  ): Request[SendTaskFailureOutput, AWSError] = js.native
  
  /**
    * Used by activity workers and task states using the callback pattern to report to Step Functions that the task represented by the specified taskToken is still making progress. This action resets the Heartbeat clock. The Heartbeat threshold is specified in the state machine's Amazon States Language definition (HeartbeatSeconds). This action does not in itself create an event in the execution history. However, if the task times out, the execution history contains an ActivityTimedOut entry for activities, or a TaskTimedOut entry for for tasks using the job run or callback pattern.  The Timeout of a task, defined in the state machine's Amazon States Language definition, is its maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received. Use HeartbeatSeconds to configure the timeout interval for heartbeats. 
    */
  def sendTaskHeartbeat(): Request[SendTaskHeartbeatOutput, AWSError] = js.native
  def sendTaskHeartbeat(callback: js.Function2[/* err */ AWSError, /* data */ SendTaskHeartbeatOutput, Unit]): Request[SendTaskHeartbeatOutput, AWSError] = js.native
  /**
    * Used by activity workers and task states using the callback pattern to report to Step Functions that the task represented by the specified taskToken is still making progress. This action resets the Heartbeat clock. The Heartbeat threshold is specified in the state machine's Amazon States Language definition (HeartbeatSeconds). This action does not in itself create an event in the execution history. However, if the task times out, the execution history contains an ActivityTimedOut entry for activities, or a TaskTimedOut entry for for tasks using the job run or callback pattern.  The Timeout of a task, defined in the state machine's Amazon States Language definition, is its maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received. Use HeartbeatSeconds to configure the timeout interval for heartbeats. 
    */
  def sendTaskHeartbeat(params: SendTaskHeartbeatInput): Request[SendTaskHeartbeatOutput, AWSError] = js.native
  def sendTaskHeartbeat(
    params: SendTaskHeartbeatInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SendTaskHeartbeatOutput, Unit]
  ): Request[SendTaskHeartbeatOutput, AWSError] = js.native
  
  /**
    * Used by activity workers and task states using the callback pattern to report that the task identified by the taskToken completed successfully.
    */
  def sendTaskSuccess(): Request[SendTaskSuccessOutput, AWSError] = js.native
  def sendTaskSuccess(callback: js.Function2[/* err */ AWSError, /* data */ SendTaskSuccessOutput, Unit]): Request[SendTaskSuccessOutput, AWSError] = js.native
  /**
    * Used by activity workers and task states using the callback pattern to report that the task identified by the taskToken completed successfully.
    */
  def sendTaskSuccess(params: SendTaskSuccessInput): Request[SendTaskSuccessOutput, AWSError] = js.native
  def sendTaskSuccess(
    params: SendTaskSuccessInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SendTaskSuccessOutput, Unit]
  ): Request[SendTaskSuccessOutput, AWSError] = js.native
  
  /**
    * Starts a state machine execution.   StartExecution is idempotent. If StartExecution is called with the same name and input as a running execution, the call will succeed and return the same response as the original request. If the execution is closed or if the input is different, it will return a 400 ExecutionAlreadyExists error. Names can be reused after 90 days.  
    */
  def startExecution(): Request[StartExecutionOutput, AWSError] = js.native
  def startExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartExecutionOutput, Unit]): Request[StartExecutionOutput, AWSError] = js.native
  /**
    * Starts a state machine execution.   StartExecution is idempotent. If StartExecution is called with the same name and input as a running execution, the call will succeed and return the same response as the original request. If the execution is closed or if the input is different, it will return a 400 ExecutionAlreadyExists error. Names can be reused after 90 days.  
    */
  def startExecution(params: StartExecutionInput): Request[StartExecutionOutput, AWSError] = js.native
  def startExecution(
    params: StartExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartExecutionOutput, Unit]
  ): Request[StartExecutionOutput, AWSError] = js.native
  
  /**
    * Starts a Synchronous Express state machine execution.
    */
  def startSyncExecution(): Request[StartSyncExecutionOutput, AWSError] = js.native
  def startSyncExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartSyncExecutionOutput, Unit]): Request[StartSyncExecutionOutput, AWSError] = js.native
  /**
    * Starts a Synchronous Express state machine execution.
    */
  def startSyncExecution(params: StartSyncExecutionInput): Request[StartSyncExecutionOutput, AWSError] = js.native
  def startSyncExecution(
    params: StartSyncExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSyncExecutionOutput, Unit]
  ): Request[StartSyncExecutionOutput, AWSError] = js.native
  
  /**
    * Stops an execution. This API action is not supported by EXPRESS state machines.
    */
  def stopExecution(): Request[StopExecutionOutput, AWSError] = js.native
  def stopExecution(callback: js.Function2[/* err */ AWSError, /* data */ StopExecutionOutput, Unit]): Request[StopExecutionOutput, AWSError] = js.native
  /**
    * Stops an execution. This API action is not supported by EXPRESS state machines.
    */
  def stopExecution(params: StopExecutionInput): Request[StopExecutionOutput, AWSError] = js.native
  def stopExecution(
    params: StopExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StopExecutionOutput, Unit]
  ): Request[StopExecutionOutput, AWSError] = js.native
  
  /**
    * Add a tag to a Step Functions resource. An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide, and Controlling Access Using IAM Tags. Tags may only contain Unicode letters, digits, white space, or these symbols: _ . : / = + - @.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Add a tag to a Step Functions resource. An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide, and Controlling Access Using IAM Tags. Tags may only contain Unicode letters, digits, white space, or these symbols: _ . : / = + - @.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Remove a tag from a Step Functions resource
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Remove a tag from a Step Functions resource
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Updates an existing state machine by modifying its definition, roleArn, or loggingConfiguration. Running executions will continue to use the previous definition and roleArn. You must include at least one of definition or roleArn or you will receive a MissingRequiredParameter error.  All StartExecution calls within a few seconds will use the updated definition and roleArn. Executions started immediately after calling UpdateStateMachine may use the previous state machine definition and roleArn.  
    */
  def updateStateMachine(): Request[UpdateStateMachineOutput, AWSError] = js.native
  def updateStateMachine(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStateMachineOutput, Unit]): Request[UpdateStateMachineOutput, AWSError] = js.native
  /**
    * Updates an existing state machine by modifying its definition, roleArn, or loggingConfiguration. Running executions will continue to use the previous definition and roleArn. You must include at least one of definition or roleArn or you will receive a MissingRequiredParameter error.  All StartExecution calls within a few seconds will use the updated definition and roleArn. Executions started immediately after calling UpdateStateMachine may use the previous state machine definition and roleArn.  
    */
  def updateStateMachine(params: UpdateStateMachineInput): Request[UpdateStateMachineOutput, AWSError] = js.native
  def updateStateMachine(
    params: UpdateStateMachineInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStateMachineOutput, Unit]
  ): Request[UpdateStateMachineOutput, AWSError] = js.native
}
