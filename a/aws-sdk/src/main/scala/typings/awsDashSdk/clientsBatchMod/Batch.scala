package typings.awsDashSdk.clientsBatchMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Batch extends Service {
  @JSName("config")
  var config_Batch: ConfigBase with ClientConfiguration = js.native
  /**
    * Cancels a job in an AWS Batch job queue. Jobs that are in the SUBMITTED, PENDING, or RUNNABLE state are cancelled. Jobs that have progressed to STARTING or RUNNING are not cancelled (but the API operation still succeeds, even if no job is cancelled); these jobs must be terminated with the TerminateJob operation.
    */
  def cancelJob(): Request[CancelJobResponse, AWSError] = js.native
  def cancelJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelJobResponse, Unit]): Request[CancelJobResponse, AWSError] = js.native
  /**
    * Cancels a job in an AWS Batch job queue. Jobs that are in the SUBMITTED, PENDING, or RUNNABLE state are cancelled. Jobs that have progressed to STARTING or RUNNING are not cancelled (but the API operation still succeeds, even if no job is cancelled); these jobs must be terminated with the TerminateJob operation.
    */
  def cancelJob(params: CancelJobRequest): Request[CancelJobResponse, AWSError] = js.native
  def cancelJob(
    params: CancelJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelJobResponse, Unit]
  ): Request[CancelJobResponse, AWSError] = js.native
  /**
    * Creates an AWS Batch compute environment. You can create MANAGED or UNMANAGED compute environments. In a managed compute environment, AWS Batch manages the capacity and instance types of the compute resources within the environment. This is based on the compute resource specification that you define or the launch template that you specify when you create the compute environment. You can choose to use Amazon EC2 On-Demand Instances or Spot Instances in your managed compute environment. You can optionally set a maximum price so that Spot Instances only launch when the Spot Instance price is below a specified percentage of the On-Demand price.  Multi-node parallel jobs are not supported on Spot Instances.  In an unmanaged compute environment, you can manage your own compute resources. This provides more compute resource configuration options, such as using a custom AMI, but you must ensure that your AMI meets the Amazon ECS container instance AMI specification. For more information, see Container Instance AMIs in the Amazon Elastic Container Service Developer Guide. After you have created your unmanaged compute environment, you can use the DescribeComputeEnvironments operation to find the Amazon ECS cluster that is associated with it. Then, manually launch your container instances into that Amazon ECS cluster. For more information, see Launching an Amazon ECS Container Instance in the Amazon Elastic Container Service Developer Guide.  AWS Batch does not upgrade the AMIs in a compute environment after it is created (for example, when a newer version of the Amazon ECS-optimized AMI is available). You are responsible for the management of the guest operating system (including updates and security patches) and any additional application software or utilities that you install on the compute resources. To use a new AMI for your AWS Batch jobs:   Create a new compute environment with the new AMI.   Add the compute environment to an existing job queue.   Remove the old compute environment from your job queue.   Delete the old compute environment.   
    */
  def createComputeEnvironment(): Request[CreateComputeEnvironmentResponse, AWSError] = js.native
  def createComputeEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ CreateComputeEnvironmentResponse, Unit]): Request[CreateComputeEnvironmentResponse, AWSError] = js.native
  /**
    * Creates an AWS Batch compute environment. You can create MANAGED or UNMANAGED compute environments. In a managed compute environment, AWS Batch manages the capacity and instance types of the compute resources within the environment. This is based on the compute resource specification that you define or the launch template that you specify when you create the compute environment. You can choose to use Amazon EC2 On-Demand Instances or Spot Instances in your managed compute environment. You can optionally set a maximum price so that Spot Instances only launch when the Spot Instance price is below a specified percentage of the On-Demand price.  Multi-node parallel jobs are not supported on Spot Instances.  In an unmanaged compute environment, you can manage your own compute resources. This provides more compute resource configuration options, such as using a custom AMI, but you must ensure that your AMI meets the Amazon ECS container instance AMI specification. For more information, see Container Instance AMIs in the Amazon Elastic Container Service Developer Guide. After you have created your unmanaged compute environment, you can use the DescribeComputeEnvironments operation to find the Amazon ECS cluster that is associated with it. Then, manually launch your container instances into that Amazon ECS cluster. For more information, see Launching an Amazon ECS Container Instance in the Amazon Elastic Container Service Developer Guide.  AWS Batch does not upgrade the AMIs in a compute environment after it is created (for example, when a newer version of the Amazon ECS-optimized AMI is available). You are responsible for the management of the guest operating system (including updates and security patches) and any additional application software or utilities that you install on the compute resources. To use a new AMI for your AWS Batch jobs:   Create a new compute environment with the new AMI.   Add the compute environment to an existing job queue.   Remove the old compute environment from your job queue.   Delete the old compute environment.   
    */
  def createComputeEnvironment(params: CreateComputeEnvironmentRequest): Request[CreateComputeEnvironmentResponse, AWSError] = js.native
  def createComputeEnvironment(
    params: CreateComputeEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateComputeEnvironmentResponse, Unit]
  ): Request[CreateComputeEnvironmentResponse, AWSError] = js.native
  /**
    * Creates an AWS Batch job queue. When you create a job queue, you associate one or more compute environments to the queue and assign an order of preference for the compute environments. You also set a priority to the job queue that determines the order in which the AWS Batch scheduler places jobs onto its associated compute environments. For example, if a compute environment is associated with more than one job queue, the job queue with a higher priority is given preference for scheduling jobs to that compute environment.
    */
  def createJobQueue(): Request[CreateJobQueueResponse, AWSError] = js.native
  def createJobQueue(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobQueueResponse, Unit]): Request[CreateJobQueueResponse, AWSError] = js.native
  /**
    * Creates an AWS Batch job queue. When you create a job queue, you associate one or more compute environments to the queue and assign an order of preference for the compute environments. You also set a priority to the job queue that determines the order in which the AWS Batch scheduler places jobs onto its associated compute environments. For example, if a compute environment is associated with more than one job queue, the job queue with a higher priority is given preference for scheduling jobs to that compute environment.
    */
  def createJobQueue(params: CreateJobQueueRequest): Request[CreateJobQueueResponse, AWSError] = js.native
  def createJobQueue(
    params: CreateJobQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobQueueResponse, Unit]
  ): Request[CreateJobQueueResponse, AWSError] = js.native
  /**
    * Deletes an AWS Batch compute environment. Before you can delete a compute environment, you must set its state to DISABLED with the UpdateComputeEnvironment API operation and disassociate it from any job queues with the UpdateJobQueue API operation.
    */
  def deleteComputeEnvironment(): Request[DeleteComputeEnvironmentResponse, AWSError] = js.native
  def deleteComputeEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteComputeEnvironmentResponse, Unit]): Request[DeleteComputeEnvironmentResponse, AWSError] = js.native
  /**
    * Deletes an AWS Batch compute environment. Before you can delete a compute environment, you must set its state to DISABLED with the UpdateComputeEnvironment API operation and disassociate it from any job queues with the UpdateJobQueue API operation.
    */
  def deleteComputeEnvironment(params: DeleteComputeEnvironmentRequest): Request[DeleteComputeEnvironmentResponse, AWSError] = js.native
  def deleteComputeEnvironment(
    params: DeleteComputeEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteComputeEnvironmentResponse, Unit]
  ): Request[DeleteComputeEnvironmentResponse, AWSError] = js.native
  /**
    * Deletes the specified job queue. You must first disable submissions for a queue with the UpdateJobQueue operation. All jobs in the queue are terminated when you delete a job queue. It is not necessary to disassociate compute environments from a queue before submitting a DeleteJobQueue request.
    */
  def deleteJobQueue(): Request[DeleteJobQueueResponse, AWSError] = js.native
  def deleteJobQueue(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobQueueResponse, Unit]): Request[DeleteJobQueueResponse, AWSError] = js.native
  /**
    * Deletes the specified job queue. You must first disable submissions for a queue with the UpdateJobQueue operation. All jobs in the queue are terminated when you delete a job queue. It is not necessary to disassociate compute environments from a queue before submitting a DeleteJobQueue request.
    */
  def deleteJobQueue(params: DeleteJobQueueRequest): Request[DeleteJobQueueResponse, AWSError] = js.native
  def deleteJobQueue(
    params: DeleteJobQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobQueueResponse, Unit]
  ): Request[DeleteJobQueueResponse, AWSError] = js.native
  /**
    * Deregisters an AWS Batch job definition.
    */
  def deregisterJobDefinition(): Request[DeregisterJobDefinitionResponse, AWSError] = js.native
  def deregisterJobDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterJobDefinitionResponse, Unit]): Request[DeregisterJobDefinitionResponse, AWSError] = js.native
  /**
    * Deregisters an AWS Batch job definition.
    */
  def deregisterJobDefinition(params: DeregisterJobDefinitionRequest): Request[DeregisterJobDefinitionResponse, AWSError] = js.native
  def deregisterJobDefinition(
    params: DeregisterJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterJobDefinitionResponse, Unit]
  ): Request[DeregisterJobDefinitionResponse, AWSError] = js.native
  /**
    * Describes one or more of your compute environments. If you are using an unmanaged compute environment, you can use the DescribeComputeEnvironment operation to determine the ecsClusterArn that you should launch your Amazon ECS container instances into.
    */
  def describeComputeEnvironments(): Request[DescribeComputeEnvironmentsResponse, AWSError] = js.native
  def describeComputeEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ DescribeComputeEnvironmentsResponse, Unit]): Request[DescribeComputeEnvironmentsResponse, AWSError] = js.native
  /**
    * Describes one or more of your compute environments. If you are using an unmanaged compute environment, you can use the DescribeComputeEnvironment operation to determine the ecsClusterArn that you should launch your Amazon ECS container instances into.
    */
  def describeComputeEnvironments(params: DescribeComputeEnvironmentsRequest): Request[DescribeComputeEnvironmentsResponse, AWSError] = js.native
  def describeComputeEnvironments(
    params: DescribeComputeEnvironmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeComputeEnvironmentsResponse, Unit]
  ): Request[DescribeComputeEnvironmentsResponse, AWSError] = js.native
  /**
    * Describes a list of job definitions. You can specify a status (such as ACTIVE) to only return job definitions that match that status.
    */
  def describeJobDefinitions(): Request[DescribeJobDefinitionsResponse, AWSError] = js.native
  def describeJobDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobDefinitionsResponse, Unit]): Request[DescribeJobDefinitionsResponse, AWSError] = js.native
  /**
    * Describes a list of job definitions. You can specify a status (such as ACTIVE) to only return job definitions that match that status.
    */
  def describeJobDefinitions(params: DescribeJobDefinitionsRequest): Request[DescribeJobDefinitionsResponse, AWSError] = js.native
  def describeJobDefinitions(
    params: DescribeJobDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobDefinitionsResponse, Unit]
  ): Request[DescribeJobDefinitionsResponse, AWSError] = js.native
  /**
    * Describes one or more of your job queues.
    */
  def describeJobQueues(): Request[DescribeJobQueuesResponse, AWSError] = js.native
  def describeJobQueues(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobQueuesResponse, Unit]): Request[DescribeJobQueuesResponse, AWSError] = js.native
  /**
    * Describes one or more of your job queues.
    */
  def describeJobQueues(params: DescribeJobQueuesRequest): Request[DescribeJobQueuesResponse, AWSError] = js.native
  def describeJobQueues(
    params: DescribeJobQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobQueuesResponse, Unit]
  ): Request[DescribeJobQueuesResponse, AWSError] = js.native
  /**
    * Describes a list of AWS Batch jobs.
    */
  def describeJobs(): Request[DescribeJobsResponse, AWSError] = js.native
  def describeJobs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobsResponse, Unit]): Request[DescribeJobsResponse, AWSError] = js.native
  /**
    * Describes a list of AWS Batch jobs.
    */
  def describeJobs(params: DescribeJobsRequest): Request[DescribeJobsResponse, AWSError] = js.native
  def describeJobs(
    params: DescribeJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobsResponse, Unit]
  ): Request[DescribeJobsResponse, AWSError] = js.native
  /**
    * Returns a list of AWS Batch jobs. You must specify only one of the following:   a job queue ID to return a list of jobs in that job queue   a multi-node parallel job ID to return a list of that job's nodes   an array job ID to return a list of that job's children   You can filter the results by job status with the jobStatus parameter. If you do not specify a status, only RUNNING jobs are returned.
    */
  def listJobs(): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]): Request[ListJobsResponse, AWSError] = js.native
  /**
    * Returns a list of AWS Batch jobs. You must specify only one of the following:   a job queue ID to return a list of jobs in that job queue   a multi-node parallel job ID to return a list of that job's nodes   an array job ID to return a list of that job's children   You can filter the results by job status with the jobStatus parameter. If you do not specify a status, only RUNNING jobs are returned.
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]
  ): Request[ListJobsResponse, AWSError] = js.native
  /**
    * Registers an AWS Batch job definition.
    */
  def registerJobDefinition(): Request[RegisterJobDefinitionResponse, AWSError] = js.native
  def registerJobDefinition(callback: js.Function2[/* err */ AWSError, /* data */ RegisterJobDefinitionResponse, Unit]): Request[RegisterJobDefinitionResponse, AWSError] = js.native
  /**
    * Registers an AWS Batch job definition.
    */
  def registerJobDefinition(params: RegisterJobDefinitionRequest): Request[RegisterJobDefinitionResponse, AWSError] = js.native
  def registerJobDefinition(
    params: RegisterJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterJobDefinitionResponse, Unit]
  ): Request[RegisterJobDefinitionResponse, AWSError] = js.native
  /**
    * Submits an AWS Batch job from a job definition. Parameters specified during SubmitJob override parameters defined in the job definition.
    */
  def submitJob(): Request[SubmitJobResponse, AWSError] = js.native
  def submitJob(callback: js.Function2[/* err */ AWSError, /* data */ SubmitJobResponse, Unit]): Request[SubmitJobResponse, AWSError] = js.native
  /**
    * Submits an AWS Batch job from a job definition. Parameters specified during SubmitJob override parameters defined in the job definition.
    */
  def submitJob(params: SubmitJobRequest): Request[SubmitJobResponse, AWSError] = js.native
  def submitJob(
    params: SubmitJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SubmitJobResponse, Unit]
  ): Request[SubmitJobResponse, AWSError] = js.native
  /**
    * Terminates a job in a job queue. Jobs that are in the STARTING or RUNNING state are terminated, which causes them to transition to FAILED. Jobs that have not progressed to the STARTING state are cancelled.
    */
  def terminateJob(): Request[TerminateJobResponse, AWSError] = js.native
  def terminateJob(callback: js.Function2[/* err */ AWSError, /* data */ TerminateJobResponse, Unit]): Request[TerminateJobResponse, AWSError] = js.native
  /**
    * Terminates a job in a job queue. Jobs that are in the STARTING or RUNNING state are terminated, which causes them to transition to FAILED. Jobs that have not progressed to the STARTING state are cancelled.
    */
  def terminateJob(params: TerminateJobRequest): Request[TerminateJobResponse, AWSError] = js.native
  def terminateJob(
    params: TerminateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateJobResponse, Unit]
  ): Request[TerminateJobResponse, AWSError] = js.native
  /**
    * Updates an AWS Batch compute environment.
    */
  def updateComputeEnvironment(): Request[UpdateComputeEnvironmentResponse, AWSError] = js.native
  def updateComputeEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateComputeEnvironmentResponse, Unit]): Request[UpdateComputeEnvironmentResponse, AWSError] = js.native
  /**
    * Updates an AWS Batch compute environment.
    */
  def updateComputeEnvironment(params: UpdateComputeEnvironmentRequest): Request[UpdateComputeEnvironmentResponse, AWSError] = js.native
  def updateComputeEnvironment(
    params: UpdateComputeEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateComputeEnvironmentResponse, Unit]
  ): Request[UpdateComputeEnvironmentResponse, AWSError] = js.native
  /**
    * Updates a job queue.
    */
  def updateJobQueue(): Request[UpdateJobQueueResponse, AWSError] = js.native
  def updateJobQueue(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobQueueResponse, Unit]): Request[UpdateJobQueueResponse, AWSError] = js.native
  /**
    * Updates a job queue.
    */
  def updateJobQueue(params: UpdateJobQueueRequest): Request[UpdateJobQueueResponse, AWSError] = js.native
  def updateJobQueue(
    params: UpdateJobQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobQueueResponse, Unit]
  ): Request[UpdateJobQueueResponse, AWSError] = js.native
}

