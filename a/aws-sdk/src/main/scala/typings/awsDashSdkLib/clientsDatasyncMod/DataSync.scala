package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSync
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DataSync: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Cancels execution of a task.  When you cancel a task execution, the transfer of some files are abruptly interrupted. The contents of files that are transferred to the destination might be incomplete or inconsistent with the source files. However, if you start a new task execution on the same task and you allow the task execution to complete, file content on the destination is complete and consistent. This applies to other unexpected failures that interrupt a task execution. In all of these cases, AWS DataSync successfully complete the transfer when you start the next task execution. 
    */
  def cancelTaskExecution(): awsDashSdkLib.libRequestMod.Request[CancelTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelTaskExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelTaskExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels execution of a task.  When you cancel a task execution, the transfer of some files are abruptly interrupted. The contents of files that are transferred to the destination might be incomplete or inconsistent with the source files. However, if you start a new task execution on the same task and you allow the task execution to complete, file content on the destination is complete and consistent. This applies to other unexpected failures that interrupt a task execution. In all of these cases, AWS DataSync successfully complete the transfer when you start the next task execution. 
    */
  def cancelTaskExecution(params: CancelTaskExecutionRequest): awsDashSdkLib.libRequestMod.Request[CancelTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelTaskExecution(
    params: CancelTaskExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelTaskExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Activates an AWS DataSync agent that you have deployed on your host. The activation process associates your agent with your account. In the activation process, you specify information such as the AWS Region that you want to activate the agent in. You activate the agent in the AWS Region where your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this AWS Region.  You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents must be AVAILABLE for the task to run. For more information, see Activating a Sync Agent in the AWS DataSync User Guide.  Agents are automatically updated by AWS on a regular basis, using a mechanism that ensures minimal interruption to your tasks. 
    */
  def createAgent(): awsDashSdkLib.libRequestMod.Request[CreateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAgent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAgentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Activates an AWS DataSync agent that you have deployed on your host. The activation process associates your agent with your account. In the activation process, you specify information such as the AWS Region that you want to activate the agent in. You activate the agent in the AWS Region where your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this AWS Region.  You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents must be AVAILABLE for the task to run. For more information, see Activating a Sync Agent in the AWS DataSync User Guide.  Agents are automatically updated by AWS on a regular basis, using a mechanism that ensures minimal interruption to your tasks. 
    */
  def createAgent(params: CreateAgentRequest): awsDashSdkLib.libRequestMod.Request[CreateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAgent(
    params: CreateAgentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAgentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon EFS file system.
    */
  def createLocationEfs(): awsDashSdkLib.libRequestMod.Request[CreateLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLocationEfs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLocationEfsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon EFS file system.
    */
  def createLocationEfs(params: CreateLocationEfsRequest): awsDashSdkLib.libRequestMod.Request[CreateLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLocationEfs(
    params: CreateLocationEfsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLocationEfsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an endpoint for a Network File System (NFS) file system.
    */
  def createLocationNfs(): awsDashSdkLib.libRequestMod.Request[CreateLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLocationNfs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLocationNfsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an endpoint for a Network File System (NFS) file system.
    */
  def createLocationNfs(params: CreateLocationNfsRequest): awsDashSdkLib.libRequestMod.Request[CreateLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLocationNfs(
    params: CreateLocationNfsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLocationNfsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon S3 bucket. For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role that has the required permissions. You can set up the required permissions by creating an IAM policy that grants the required permissions and attaching the policy to the role. An example of such a policy is shown in the examples section. For more information, see Configuring Amazon S3 Location Settings in the AWS DataSync User Guide.
    */
  def createLocationS3(): awsDashSdkLib.libRequestMod.Request[CreateLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLocationS3(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLocationS3Response, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon S3 bucket. For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role that has the required permissions. You can set up the required permissions by creating an IAM policy that grants the required permissions and attaching the policy to the role. An example of such a policy is shown in the examples section. For more information, see Configuring Amazon S3 Location Settings in the AWS DataSync User Guide.
    */
  def createLocationS3(params: CreateLocationS3Request): awsDashSdkLib.libRequestMod.Request[CreateLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLocationS3(
    params: CreateLocationS3Request,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLocationS3Response, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a task. A task is a set of two locations (source and destination) and a set of default OverrideOptions that you use to control the behavior of a task. If you don't specify default values for Options when you create a task, AWS DataSync populates them with safe service defaults. When you initially create a task, it enters the INITIALIZING status and then the CREATING status. In CREATING status, AWS DataSync attempts to mount the source Network File System (NFS) location. The task transitions to the AVAILABLE status without waiting for the destination location to mount. Instead, AWS DataSync mounts a destination before every task execution and then unmounts it after every task execution.  If an agent that is associated with a source (NFS) location goes offline, the task transitions to the UNAVAILABLE status. If the status of the task remains in the CREATING status for more than a few minutes, it means that your agent might be having trouble mounting the source NFS file system. Check the task's ErrorCode and ErrorDetail. Mount issues are often caused by either a misconfigured firewall or a mistyped NFS server host name.
    */
  def createTask(): awsDashSdkLib.libRequestMod.Request[CreateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a task. A task is a set of two locations (source and destination) and a set of default OverrideOptions that you use to control the behavior of a task. If you don't specify default values for Options when you create a task, AWS DataSync populates them with safe service defaults. When you initially create a task, it enters the INITIALIZING status and then the CREATING status. In CREATING status, AWS DataSync attempts to mount the source Network File System (NFS) location. The task transitions to the AVAILABLE status without waiting for the destination location to mount. Instead, AWS DataSync mounts a destination before every task execution and then unmounts it after every task execution.  If an agent that is associated with a source (NFS) location goes offline, the task transitions to the UNAVAILABLE status. If the status of the task remains in the CREATING status for more than a few minutes, it means that your agent might be having trouble mounting the source NFS file system. Check the task's ErrorCode and ErrorDetail. Mount issues are often caused by either a misconfigured firewall or a mistyped NFS server host name.
    */
  def createTask(params: CreateTaskRequest): awsDashSdkLib.libRequestMod.Request[CreateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTask(
    params: CreateTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent virtual machine (VM) from your on-premises environment.  After you delete an agent, you can't reactivate it and you longer pay software charges for it. 
    */
  def deleteAgent(): awsDashSdkLib.libRequestMod.Request[DeleteAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAgent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAgentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent virtual machine (VM) from your on-premises environment.  After you delete an agent, you can't reactivate it and you longer pay software charges for it. 
    */
  def deleteAgent(params: DeleteAgentRequest): awsDashSdkLib.libRequestMod.Request[DeleteAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAgent(
    params: DeleteAgentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAgentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the configuration of a location used by AWS DataSync. 
    */
  def deleteLocation(): awsDashSdkLib.libRequestMod.Request[DeleteLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLocation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLocationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the configuration of a location used by AWS DataSync. 
    */
  def deleteLocation(params: DeleteLocationRequest): awsDashSdkLib.libRequestMod.Request[DeleteLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLocation(
    params: DeleteLocationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLocationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a task.
    */
  def deleteTask(): awsDashSdkLib.libRequestMod.Request[DeleteTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a task.
    */
  def deleteTask(params: DeleteTaskRequest): awsDashSdkLib.libRequestMod.Request[DeleteTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTask(
    params: DeleteTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your request. 
    */
  def describeAgent(): awsDashSdkLib.libRequestMod.Request[DescribeAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAgent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAgentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your request. 
    */
  def describeAgent(params: DescribeAgentRequest): awsDashSdkLib.libRequestMod.Request[DescribeAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAgent(
    params: DescribeAgentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAgentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata, such as the path information about an Amazon EFS location.
    */
  def describeLocationEfs(): awsDashSdkLib.libRequestMod.Request[DescribeLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLocationEfs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLocationEfsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata, such as the path information about an Amazon EFS location.
    */
  def describeLocationEfs(params: DescribeLocationEfsRequest): awsDashSdkLib.libRequestMod.Request[DescribeLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLocationEfs(
    params: DescribeLocationEfsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLocationEfsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata, such as the path information, about a NFS location.
    */
  def describeLocationNfs(): awsDashSdkLib.libRequestMod.Request[DescribeLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLocationNfs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLocationNfsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata, such as the path information, about a NFS location.
    */
  def describeLocationNfs(params: DescribeLocationNfsRequest): awsDashSdkLib.libRequestMod.Request[DescribeLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLocationNfs(
    params: DescribeLocationNfsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLocationNfsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
    */
  def describeLocationS3(): awsDashSdkLib.libRequestMod.Request[DescribeLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLocationS3(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLocationS3Response, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
    */
  def describeLocationS3(params: DescribeLocationS3Request): awsDashSdkLib.libRequestMod.Request[DescribeLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLocationS3(
    params: DescribeLocationS3Request,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLocationS3Response, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata about a task.
    */
  def describeTask(): awsDashSdkLib.libRequestMod.Request[DescribeTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata about a task.
    */
  def describeTask(params: DescribeTaskRequest): awsDashSdkLib.libRequestMod.Request[DescribeTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTask(
    params: DescribeTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed metadata about a task that is being executed.
    */
  def describeTaskExecution(): awsDashSdkLib.libRequestMod.Request[DescribeTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTaskExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTaskExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed metadata about a task that is being executed.
    */
  def describeTaskExecution(params: DescribeTaskExecutionRequest): awsDashSdkLib.libRequestMod.Request[DescribeTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTaskExecution(
    params: DescribeTaskExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTaskExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of agents owned by an AWS account in the AWS Region specified in the request. The returned list is ordered by agent Amazon Resource Name (ARN). By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you to optionally reduce the number of agents returned in a response. If you have more agents than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a marker that you can specify in your next request to fetch the next page of agents.
    */
  def listAgents(): awsDashSdkLib.libRequestMod.Request[ListAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAgents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAgentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of agents owned by an AWS account in the AWS Region specified in the request. The returned list is ordered by agent Amazon Resource Name (ARN). By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you to optionally reduce the number of agents returned in a response. If you have more agents than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a marker that you can specify in your next request to fetch the next page of agents.
    */
  def listAgents(params: ListAgentsRequest): awsDashSdkLib.libRequestMod.Request[ListAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAgents(
    params: ListAgentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAgentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a lists of source and destination locations. If you have more locations than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a token that you can specify in your next request to fetch the next page of locations.
    */
  def listLocations(): awsDashSdkLib.libRequestMod.Request[ListLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLocations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLocationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a lists of source and destination locations. If you have more locations than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a token that you can specify in your next request to fetch the next page of locations.
    */
  def listLocations(params: ListLocationsRequest): awsDashSdkLib.libRequestMod.Request[ListLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLocations(
    params: ListLocationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLocationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all the tags associated with a specified resources. 
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all the tags associated with a specified resources. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of executed tasks.
    */
  def listTaskExecutions(): awsDashSdkLib.libRequestMod.Request[ListTaskExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTaskExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTaskExecutionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTaskExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of executed tasks.
    */
  def listTaskExecutions(params: ListTaskExecutionsRequest): awsDashSdkLib.libRequestMod.Request[ListTaskExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTaskExecutions(
    params: ListTaskExecutionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTaskExecutionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTaskExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all the tasks.
    */
  def listTasks(): awsDashSdkLib.libRequestMod.Request[ListTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all the tasks.
    */
  def listTasks(params: ListTasksRequest): awsDashSdkLib.libRequestMod.Request[ListTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTasks(
    params: ListTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a specific invocation of a task. A TaskExecution value represents an individual run of a task. Each task can have at most one TaskExecution at a time.  TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING | VERIFYING | SUCCESS/FAILURE.  For detailed information, see Task Execution in Components and Terminology in the AWS DataSync User Guide.
    */
  def startTaskExecution(): awsDashSdkLib.libRequestMod.Request[StartTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startTaskExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartTaskExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a specific invocation of a task. A TaskExecution value represents an individual run of a task. Each task can have at most one TaskExecution at a time.  TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING | VERIFYING | SUCCESS/FAILURE.  For detailed information, see Task Execution in Components and Terminology in the AWS DataSync User Guide.
    */
  def startTaskExecution(params: StartTaskExecutionRequest): awsDashSdkLib.libRequestMod.Request[StartTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startTaskExecution(
    params: StartTaskExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartTaskExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a key-value pair to an AWS resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies a key-value pair to an AWS resource.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a tag from an AWS resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a tag from an AWS resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the name of an agent.
    */
  def updateAgent(): awsDashSdkLib.libRequestMod.Request[UpdateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAgent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAgentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the name of an agent.
    */
  def updateAgent(params: UpdateAgentRequest): awsDashSdkLib.libRequestMod.Request[UpdateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAgent(
    params: UpdateAgentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAgentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the metadata associated with a task.
    */
  def updateTask(): awsDashSdkLib.libRequestMod.Request[UpdateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the metadata associated with a task.
    */
  def updateTask(params: UpdateTaskRequest): awsDashSdkLib.libRequestMod.Request[UpdateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTask(
    params: UpdateTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

