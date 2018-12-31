package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Batch
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Batch: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsBatchMod.BatchNs.ClientConfiguration = js.native
  /**
    * Cancels a job in an AWS Batch job queue. Jobs that are in the SUBMITTED, PENDING, or RUNNABLE state are cancelled. Jobs that have progressed to STARTING or RUNNING are not cancelled (but the API operation still succeeds, even if no job is cancelled); these jobs must be terminated with the TerminateJob operation.
    */
  def cancelJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.CancelJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels a job in an AWS Batch job queue. Jobs that are in the SUBMITTED, PENDING, or RUNNABLE state are cancelled. Jobs that have progressed to STARTING or RUNNING are not cancelled (but the API operation still succeeds, even if no job is cancelled); these jobs must be terminated with the TerminateJob operation.
    */
  def cancelJob(params: awsDashSdkLib.clientsBatchMod.BatchNs.CancelJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelJob(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.CancelJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.CancelJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.CancelJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AWS Batch compute environment. You can create MANAGED or UNMANAGED compute environments. In a managed compute environment, AWS Batch manages the capacity and instance types of the compute resources within the environment. This is based on the compute resource specification that you define or the launch template that you specify when you create the compute environment. You can choose to use Amazon EC2 On-Demand Instances or Spot Instances in your managed compute environment. You can optionally set a maximum price so that Spot Instances only launch when the Spot Instance price is below a specified percentage of the On-Demand price.  Multi-node parallel jobs are not supported on Spot Instances.  In an unmanaged compute environment, you can manage your own compute resources. This provides more compute resource configuration options, such as using a custom AMI, but you must ensure that your AMI meets the Amazon ECS container instance AMI specification. For more information, see Container Instance AMIs in the Amazon Elastic Container Service Developer Guide. After you have created your unmanaged compute environment, you can use the DescribeComputeEnvironments operation to find the Amazon ECS cluster that is associated with it. Then, manually launch your container instances into that Amazon ECS cluster. For more information, see Launching an Amazon ECS Container Instance in the Amazon Elastic Container Service Developer Guide.  AWS Batch does not upgrade the AMIs in a compute environment after it is created (for example, when a newer version of the Amazon ECS-optimized AMI is available). You are responsible for the management of the guest operating system (including updates and security patches) and any additional application software or utilities that you install on the compute resources. To use a new AMI for your AWS Batch jobs:   Create a new compute environment with the new AMI.   Add the compute environment to an existing job queue.   Remove the old compute environment from your job queue.   Delete the old compute environment.   
    */
  def createComputeEnvironment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.CreateComputeEnvironmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createComputeEnvironment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.CreateComputeEnvironmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.CreateComputeEnvironmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AWS Batch compute environment. You can create MANAGED or UNMANAGED compute environments. In a managed compute environment, AWS Batch manages the capacity and instance types of the compute resources within the environment. This is based on the compute resource specification that you define or the launch template that you specify when you create the compute environment. You can choose to use Amazon EC2 On-Demand Instances or Spot Instances in your managed compute environment. You can optionally set a maximum price so that Spot Instances only launch when the Spot Instance price is below a specified percentage of the On-Demand price.  Multi-node parallel jobs are not supported on Spot Instances.  In an unmanaged compute environment, you can manage your own compute resources. This provides more compute resource configuration options, such as using a custom AMI, but you must ensure that your AMI meets the Amazon ECS container instance AMI specification. For more information, see Container Instance AMIs in the Amazon Elastic Container Service Developer Guide. After you have created your unmanaged compute environment, you can use the DescribeComputeEnvironments operation to find the Amazon ECS cluster that is associated with it. Then, manually launch your container instances into that Amazon ECS cluster. For more information, see Launching an Amazon ECS Container Instance in the Amazon Elastic Container Service Developer Guide.  AWS Batch does not upgrade the AMIs in a compute environment after it is created (for example, when a newer version of the Amazon ECS-optimized AMI is available). You are responsible for the management of the guest operating system (including updates and security patches) and any additional application software or utilities that you install on the compute resources. To use a new AMI for your AWS Batch jobs:   Create a new compute environment with the new AMI.   Add the compute environment to an existing job queue.   Remove the old compute environment from your job queue.   Delete the old compute environment.   
    */
  def createComputeEnvironment(params: awsDashSdkLib.clientsBatchMod.BatchNs.CreateComputeEnvironmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.CreateComputeEnvironmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createComputeEnvironment(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.CreateComputeEnvironmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.CreateComputeEnvironmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.CreateComputeEnvironmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AWS Batch job queue. When you create a job queue, you associate one or more compute environments to the queue and assign an order of preference for the compute environments. You also set a priority to the job queue that determines the order in which the AWS Batch scheduler places jobs onto its associated compute environments. For example, if a compute environment is associated with more than one job queue, the job queue with a higher priority is given preference for scheduling jobs to that compute environment.
    */
  def createJobQueue(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.CreateJobQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createJobQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.CreateJobQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.CreateJobQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an AWS Batch job queue. When you create a job queue, you associate one or more compute environments to the queue and assign an order of preference for the compute environments. You also set a priority to the job queue that determines the order in which the AWS Batch scheduler places jobs onto its associated compute environments. For example, if a compute environment is associated with more than one job queue, the job queue with a higher priority is given preference for scheduling jobs to that compute environment.
    */
  def createJobQueue(params: awsDashSdkLib.clientsBatchMod.BatchNs.CreateJobQueueRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.CreateJobQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createJobQueue(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.CreateJobQueueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.CreateJobQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.CreateJobQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an AWS Batch compute environment. Before you can delete a compute environment, you must set its state to DISABLED with the UpdateComputeEnvironment API operation and disassociate it from any job queues with the UpdateJobQueue API operation.
    */
  def deleteComputeEnvironment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DeleteComputeEnvironmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteComputeEnvironment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DeleteComputeEnvironmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DeleteComputeEnvironmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an AWS Batch compute environment. Before you can delete a compute environment, you must set its state to DISABLED with the UpdateComputeEnvironment API operation and disassociate it from any job queues with the UpdateJobQueue API operation.
    */
  def deleteComputeEnvironment(params: awsDashSdkLib.clientsBatchMod.BatchNs.DeleteComputeEnvironmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DeleteComputeEnvironmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteComputeEnvironment(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.DeleteComputeEnvironmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DeleteComputeEnvironmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DeleteComputeEnvironmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified job queue. You must first disable submissions for a queue with the UpdateJobQueue operation. All jobs in the queue are terminated when you delete a job queue. It is not necessary to disassociate compute environments from a queue before submitting a DeleteJobQueue request. 
    */
  def deleteJobQueue(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DeleteJobQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteJobQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DeleteJobQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DeleteJobQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified job queue. You must first disable submissions for a queue with the UpdateJobQueue operation. All jobs in the queue are terminated when you delete a job queue. It is not necessary to disassociate compute environments from a queue before submitting a DeleteJobQueue request. 
    */
  def deleteJobQueue(params: awsDashSdkLib.clientsBatchMod.BatchNs.DeleteJobQueueRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DeleteJobQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteJobQueue(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.DeleteJobQueueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DeleteJobQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DeleteJobQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deregisters an AWS Batch job definition.
    */
  def deregisterJobDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DeregisterJobDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterJobDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DeregisterJobDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DeregisterJobDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deregisters an AWS Batch job definition.
    */
  def deregisterJobDefinition(params: awsDashSdkLib.clientsBatchMod.BatchNs.DeregisterJobDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DeregisterJobDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterJobDefinition(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.DeregisterJobDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DeregisterJobDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DeregisterJobDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your compute environments. If you are using an unmanaged compute environment, you can use the DescribeComputeEnvironment operation to determine the ecsClusterArn that you should launch your Amazon ECS container instances into.
    */
  def describeComputeEnvironments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeComputeEnvironmentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeComputeEnvironments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DescribeComputeEnvironmentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeComputeEnvironmentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your compute environments. If you are using an unmanaged compute environment, you can use the DescribeComputeEnvironment operation to determine the ecsClusterArn that you should launch your Amazon ECS container instances into.
    */
  def describeComputeEnvironments(params: awsDashSdkLib.clientsBatchMod.BatchNs.DescribeComputeEnvironmentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeComputeEnvironmentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeComputeEnvironments(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.DescribeComputeEnvironmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DescribeComputeEnvironmentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeComputeEnvironmentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a list of job definitions. You can specify a status (such as ACTIVE) to only return job definitions that match that status.
    */
  def describeJobDefinitions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeJobDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a list of job definitions. You can specify a status (such as ACTIVE) to only return job definitions that match that status.
    */
  def describeJobDefinitions(params: awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeJobDefinitions(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your job queues.
    */
  def describeJobQueues(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobQueuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeJobQueues(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobQueuesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobQueuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your job queues.
    */
  def describeJobQueues(params: awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobQueuesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobQueuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeJobQueues(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobQueuesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobQueuesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobQueuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a list of AWS Batch jobs.
    */
  def describeJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a list of AWS Batch jobs.
    */
  def describeJobs(params: awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeJobs(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.DescribeJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of AWS Batch jobs. You must specify only one of the following:   a job queue ID to return a list of jobs in that job queue   a multi-node parallel job ID to return a list of that job's nodes   an array job ID to return a list of that job's children   You can filter the results by job status with the jobStatus parameter. If you do not specify a status, only RUNNING jobs are returned.
    */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of AWS Batch jobs. You must specify only one of the following:   a job queue ID to return a list of jobs in that job queue   a multi-node parallel job ID to return a list of that job's nodes   an array job ID to return a list of that job's children   You can filter the results by job status with the jobStatus parameter. If you do not specify a status, only RUNNING jobs are returned.
    */
  def listJobs(params: awsDashSdkLib.clientsBatchMod.BatchNs.ListJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobs(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.ListJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers an AWS Batch job definition. 
    */
  def registerJobDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.RegisterJobDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerJobDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.RegisterJobDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.RegisterJobDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers an AWS Batch job definition. 
    */
  def registerJobDefinition(params: awsDashSdkLib.clientsBatchMod.BatchNs.RegisterJobDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.RegisterJobDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerJobDefinition(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.RegisterJobDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.RegisterJobDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.RegisterJobDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Submits an AWS Batch job from a job definition. Parameters specified during SubmitJob override parameters defined in the job definition. 
    */
  def submitJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.SubmitJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def submitJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.SubmitJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.SubmitJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Submits an AWS Batch job from a job definition. Parameters specified during SubmitJob override parameters defined in the job definition. 
    */
  def submitJob(params: awsDashSdkLib.clientsBatchMod.BatchNs.SubmitJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.SubmitJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def submitJob(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.SubmitJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.SubmitJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.SubmitJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Terminates a job in a job queue. Jobs that are in the STARTING or RUNNING state are terminated, which causes them to transition to FAILED. Jobs that have not progressed to the STARTING state are cancelled.
    */
  def terminateJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.TerminateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def terminateJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.TerminateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.TerminateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Terminates a job in a job queue. Jobs that are in the STARTING or RUNNING state are terminated, which causes them to transition to FAILED. Jobs that have not progressed to the STARTING state are cancelled.
    */
  def terminateJob(params: awsDashSdkLib.clientsBatchMod.BatchNs.TerminateJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.TerminateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def terminateJob(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.TerminateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.TerminateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.TerminateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an AWS Batch compute environment.
    */
  def updateComputeEnvironment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.UpdateComputeEnvironmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateComputeEnvironment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.UpdateComputeEnvironmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.UpdateComputeEnvironmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an AWS Batch compute environment.
    */
  def updateComputeEnvironment(params: awsDashSdkLib.clientsBatchMod.BatchNs.UpdateComputeEnvironmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.UpdateComputeEnvironmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateComputeEnvironment(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.UpdateComputeEnvironmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.UpdateComputeEnvironmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.UpdateComputeEnvironmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a job queue.
    */
  def updateJobQueue(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.UpdateJobQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateJobQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.UpdateJobQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.UpdateJobQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a job queue.
    */
  def updateJobQueue(params: awsDashSdkLib.clientsBatchMod.BatchNs.UpdateJobQueueRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.UpdateJobQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateJobQueue(
    params: awsDashSdkLib.clientsBatchMod.BatchNs.UpdateJobQueueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsBatchMod.BatchNs.UpdateJobQueueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsBatchMod.BatchNs.UpdateJobQueueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

