package typings.awsSdk.clientsBatchMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Batch extends Service {
  
  /**
    * Cancels a job in an Batch job queue. Jobs that are in the SUBMITTED or PENDING are canceled. A job inRUNNABLE remains in RUNNABLE until it reaches the head of the job queue. Then the job status is updated to FAILED. Jobs that progressed to the STARTING or RUNNING state aren't canceled. However, the API operation still succeeds, even if no job is canceled. These jobs must be terminated with the TerminateJob operation.
    */
  def cancelJob(): Request[CancelJobResponse, AWSError] = js.native
  def cancelJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelJobResponse, Unit]): Request[CancelJobResponse, AWSError] = js.native
  /**
    * Cancels a job in an Batch job queue. Jobs that are in the SUBMITTED or PENDING are canceled. A job inRUNNABLE remains in RUNNABLE until it reaches the head of the job queue. Then the job status is updated to FAILED. Jobs that progressed to the STARTING or RUNNING state aren't canceled. However, the API operation still succeeds, even if no job is canceled. These jobs must be terminated with the TerminateJob operation.
    */
  def cancelJob(params: CancelJobRequest): Request[CancelJobResponse, AWSError] = js.native
  def cancelJob(
    params: CancelJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelJobResponse, Unit]
  ): Request[CancelJobResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Batch: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an Batch compute environment. You can create MANAGED or UNMANAGED compute environments. MANAGED compute environments can use Amazon EC2 or Fargate resources. UNMANAGED compute environments can only use EC2 resources. In a managed compute environment, Batch manages the capacity and instance types of the compute resources within the environment. This is based on the compute resource specification that you define or the launch template that you specify when you create the compute environment. Either, you can choose to use EC2 On-Demand Instances and EC2 Spot Instances. Or, you can use Fargate and Fargate Spot capacity in your managed compute environment. You can optionally set a maximum price so that Spot Instances only launch when the Spot Instance price is less than a specified percentage of the On-Demand price.  Multi-node parallel jobs aren't supported on Spot Instances.  In an unmanaged compute environment, you can manage your own EC2 compute resources and have flexibility with how you configure your compute resources. For example, you can use custom AMIs. However, you must verify that each of your AMIs meet the Amazon ECS container instance AMI specification. For more information, see container instance AMIs in the Amazon Elastic Container Service Developer Guide. After you created your unmanaged compute environment, you can use the DescribeComputeEnvironments operation to find the Amazon ECS cluster that's associated with it. Then, launch your container instances into that Amazon ECS cluster. For more information, see Launching an Amazon ECS container instance in the Amazon Elastic Container Service Developer Guide.  To create a compute environment that uses EKS resources, the caller must have permissions to call eks:DescribeCluster.   Batch doesn't automatically upgrade the AMIs in a compute environment after it's created. For example, it also doesn't update the AMIs in your compute environment when a newer version of the Amazon ECS optimized AMI is available. You're responsible for the management of the guest operating system. This includes any updates and security patches. You're also responsible for any additional application software or utilities that you install on the compute resources. There are two ways to use a new AMI for your Batch jobs. The original method is to complete these steps:   Create a new compute environment with the new AMI.   Add the compute environment to an existing job queue.   Remove the earlier compute environment from your job queue.   Delete the earlier compute environment.   In April 2022, Batch added enhanced support for updating compute environments. For more information, see Updating compute environments. To use the enhanced updating of compute environments to update AMIs, follow these rules:   Either don't set the service role (serviceRole) parameter or set it to the AWSBatchServiceRole service-linked role.   Set the allocation strategy (allocationStrategy) parameter to BEST_FIT_PROGRESSIVE or SPOT_CAPACITY_OPTIMIZED.   Set the update to latest image version (updateToLatestImageVersion) parameter to true.   Don't specify an AMI ID in imageId, imageIdOverride (in  ec2Configuration ), or in the launch template (launchTemplate). In that case, Batch selects the latest Amazon ECS optimized AMI that's supported by Batch at the time the infrastructure update is initiated. Alternatively, you can specify the AMI ID in the imageId or imageIdOverride parameters, or the launch template identified by the LaunchTemplate properties. Changing any of these properties starts an infrastructure update. If the AMI ID is specified in the launch template, it can't be replaced by specifying an AMI ID in either the imageId or imageIdOverride parameters. It can only be replaced by specifying a different launch template, or if the launch template version is set to $Default or $Latest, by setting either a new default version for the launch template (if $Default) or by adding a new version to the launch template (if $Latest).   If these rules are followed, any update that starts an infrastructure update causes the AMI ID to be re-selected. If the version setting in the launch template (launchTemplate) is set to $Latest or $Default, the latest or default version of the launch template is evaluated up at the time of the infrastructure update, even if the launchTemplate wasn't updated. 
    */
  def createComputeEnvironment(): Request[CreateComputeEnvironmentResponse, AWSError] = js.native
  def createComputeEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ CreateComputeEnvironmentResponse, Unit]): Request[CreateComputeEnvironmentResponse, AWSError] = js.native
  /**
    * Creates an Batch compute environment. You can create MANAGED or UNMANAGED compute environments. MANAGED compute environments can use Amazon EC2 or Fargate resources. UNMANAGED compute environments can only use EC2 resources. In a managed compute environment, Batch manages the capacity and instance types of the compute resources within the environment. This is based on the compute resource specification that you define or the launch template that you specify when you create the compute environment. Either, you can choose to use EC2 On-Demand Instances and EC2 Spot Instances. Or, you can use Fargate and Fargate Spot capacity in your managed compute environment. You can optionally set a maximum price so that Spot Instances only launch when the Spot Instance price is less than a specified percentage of the On-Demand price.  Multi-node parallel jobs aren't supported on Spot Instances.  In an unmanaged compute environment, you can manage your own EC2 compute resources and have flexibility with how you configure your compute resources. For example, you can use custom AMIs. However, you must verify that each of your AMIs meet the Amazon ECS container instance AMI specification. For more information, see container instance AMIs in the Amazon Elastic Container Service Developer Guide. After you created your unmanaged compute environment, you can use the DescribeComputeEnvironments operation to find the Amazon ECS cluster that's associated with it. Then, launch your container instances into that Amazon ECS cluster. For more information, see Launching an Amazon ECS container instance in the Amazon Elastic Container Service Developer Guide.  To create a compute environment that uses EKS resources, the caller must have permissions to call eks:DescribeCluster.   Batch doesn't automatically upgrade the AMIs in a compute environment after it's created. For example, it also doesn't update the AMIs in your compute environment when a newer version of the Amazon ECS optimized AMI is available. You're responsible for the management of the guest operating system. This includes any updates and security patches. You're also responsible for any additional application software or utilities that you install on the compute resources. There are two ways to use a new AMI for your Batch jobs. The original method is to complete these steps:   Create a new compute environment with the new AMI.   Add the compute environment to an existing job queue.   Remove the earlier compute environment from your job queue.   Delete the earlier compute environment.   In April 2022, Batch added enhanced support for updating compute environments. For more information, see Updating compute environments. To use the enhanced updating of compute environments to update AMIs, follow these rules:   Either don't set the service role (serviceRole) parameter or set it to the AWSBatchServiceRole service-linked role.   Set the allocation strategy (allocationStrategy) parameter to BEST_FIT_PROGRESSIVE or SPOT_CAPACITY_OPTIMIZED.   Set the update to latest image version (updateToLatestImageVersion) parameter to true.   Don't specify an AMI ID in imageId, imageIdOverride (in  ec2Configuration ), or in the launch template (launchTemplate). In that case, Batch selects the latest Amazon ECS optimized AMI that's supported by Batch at the time the infrastructure update is initiated. Alternatively, you can specify the AMI ID in the imageId or imageIdOverride parameters, or the launch template identified by the LaunchTemplate properties. Changing any of these properties starts an infrastructure update. If the AMI ID is specified in the launch template, it can't be replaced by specifying an AMI ID in either the imageId or imageIdOverride parameters. It can only be replaced by specifying a different launch template, or if the launch template version is set to $Default or $Latest, by setting either a new default version for the launch template (if $Default) or by adding a new version to the launch template (if $Latest).   If these rules are followed, any update that starts an infrastructure update causes the AMI ID to be re-selected. If the version setting in the launch template (launchTemplate) is set to $Latest or $Default, the latest or default version of the launch template is evaluated up at the time of the infrastructure update, even if the launchTemplate wasn't updated. 
    */
  def createComputeEnvironment(params: CreateComputeEnvironmentRequest): Request[CreateComputeEnvironmentResponse, AWSError] = js.native
  def createComputeEnvironment(
    params: CreateComputeEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateComputeEnvironmentResponse, Unit]
  ): Request[CreateComputeEnvironmentResponse, AWSError] = js.native
  
  /**
    * Creates an Batch job queue. When you create a job queue, you associate one or more compute environments to the queue and assign an order of preference for the compute environments. You also set a priority to the job queue that determines the order that the Batch scheduler places jobs onto its associated compute environments. For example, if a compute environment is associated with more than one job queue, the job queue with a higher priority is given preference for scheduling jobs to that compute environment.
    */
  def createJobQueue(): Request[CreateJobQueueResponse, AWSError] = js.native
  def createJobQueue(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobQueueResponse, Unit]): Request[CreateJobQueueResponse, AWSError] = js.native
  /**
    * Creates an Batch job queue. When you create a job queue, you associate one or more compute environments to the queue and assign an order of preference for the compute environments. You also set a priority to the job queue that determines the order that the Batch scheduler places jobs onto its associated compute environments. For example, if a compute environment is associated with more than one job queue, the job queue with a higher priority is given preference for scheduling jobs to that compute environment.
    */
  def createJobQueue(params: CreateJobQueueRequest): Request[CreateJobQueueResponse, AWSError] = js.native
  def createJobQueue(
    params: CreateJobQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobQueueResponse, Unit]
  ): Request[CreateJobQueueResponse, AWSError] = js.native
  
  /**
    * Creates an Batch scheduling policy.
    */
  def createSchedulingPolicy(): Request[CreateSchedulingPolicyResponse, AWSError] = js.native
  def createSchedulingPolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreateSchedulingPolicyResponse, Unit]): Request[CreateSchedulingPolicyResponse, AWSError] = js.native
  /**
    * Creates an Batch scheduling policy.
    */
  def createSchedulingPolicy(params: CreateSchedulingPolicyRequest): Request[CreateSchedulingPolicyResponse, AWSError] = js.native
  def createSchedulingPolicy(
    params: CreateSchedulingPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSchedulingPolicyResponse, Unit]
  ): Request[CreateSchedulingPolicyResponse, AWSError] = js.native
  
  /**
    * Deletes an Batch compute environment. Before you can delete a compute environment, you must set its state to DISABLED with the UpdateComputeEnvironment API operation and disassociate it from any job queues with the UpdateJobQueue API operation. Compute environments that use Fargate resources must terminate all active jobs on that compute environment before deleting the compute environment. If this isn't done, the compute environment enters an invalid state.
    */
  def deleteComputeEnvironment(): Request[DeleteComputeEnvironmentResponse, AWSError] = js.native
  def deleteComputeEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteComputeEnvironmentResponse, Unit]): Request[DeleteComputeEnvironmentResponse, AWSError] = js.native
  /**
    * Deletes an Batch compute environment. Before you can delete a compute environment, you must set its state to DISABLED with the UpdateComputeEnvironment API operation and disassociate it from any job queues with the UpdateJobQueue API operation. Compute environments that use Fargate resources must terminate all active jobs on that compute environment before deleting the compute environment. If this isn't done, the compute environment enters an invalid state.
    */
  def deleteComputeEnvironment(params: DeleteComputeEnvironmentRequest): Request[DeleteComputeEnvironmentResponse, AWSError] = js.native
  def deleteComputeEnvironment(
    params: DeleteComputeEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteComputeEnvironmentResponse, Unit]
  ): Request[DeleteComputeEnvironmentResponse, AWSError] = js.native
  
  /**
    * Deletes the specified job queue. You must first disable submissions for a queue with the UpdateJobQueue operation. All jobs in the queue are eventually terminated when you delete a job queue. The jobs are terminated at a rate of about 16 jobs each second. It's not necessary to disassociate compute environments from a queue before submitting a DeleteJobQueue request.
    */
  def deleteJobQueue(): Request[DeleteJobQueueResponse, AWSError] = js.native
  def deleteJobQueue(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobQueueResponse, Unit]): Request[DeleteJobQueueResponse, AWSError] = js.native
  /**
    * Deletes the specified job queue. You must first disable submissions for a queue with the UpdateJobQueue operation. All jobs in the queue are eventually terminated when you delete a job queue. The jobs are terminated at a rate of about 16 jobs each second. It's not necessary to disassociate compute environments from a queue before submitting a DeleteJobQueue request.
    */
  def deleteJobQueue(params: DeleteJobQueueRequest): Request[DeleteJobQueueResponse, AWSError] = js.native
  def deleteJobQueue(
    params: DeleteJobQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobQueueResponse, Unit]
  ): Request[DeleteJobQueueResponse, AWSError] = js.native
  
  /**
    * Deletes the specified scheduling policy. You can't delete a scheduling policy that's used in any job queues.
    */
  def deleteSchedulingPolicy(): Request[DeleteSchedulingPolicyResponse, AWSError] = js.native
  def deleteSchedulingPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSchedulingPolicyResponse, Unit]): Request[DeleteSchedulingPolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified scheduling policy. You can't delete a scheduling policy that's used in any job queues.
    */
  def deleteSchedulingPolicy(params: DeleteSchedulingPolicyRequest): Request[DeleteSchedulingPolicyResponse, AWSError] = js.native
  def deleteSchedulingPolicy(
    params: DeleteSchedulingPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSchedulingPolicyResponse, Unit]
  ): Request[DeleteSchedulingPolicyResponse, AWSError] = js.native
  
  /**
    * Deregisters an Batch job definition. Job definitions are permanently deleted after 180 days.
    */
  def deregisterJobDefinition(): Request[DeregisterJobDefinitionResponse, AWSError] = js.native
  def deregisterJobDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterJobDefinitionResponse, Unit]): Request[DeregisterJobDefinitionResponse, AWSError] = js.native
  /**
    * Deregisters an Batch job definition. Job definitions are permanently deleted after 180 days.
    */
  def deregisterJobDefinition(params: DeregisterJobDefinitionRequest): Request[DeregisterJobDefinitionResponse, AWSError] = js.native
  def deregisterJobDefinition(
    params: DeregisterJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterJobDefinitionResponse, Unit]
  ): Request[DeregisterJobDefinitionResponse, AWSError] = js.native
  
  /**
    * Describes one or more of your compute environments. If you're using an unmanaged compute environment, you can use the DescribeComputeEnvironment operation to determine the ecsClusterArn that you launch your Amazon ECS container instances into.
    */
  def describeComputeEnvironments(): Request[DescribeComputeEnvironmentsResponse, AWSError] = js.native
  def describeComputeEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ DescribeComputeEnvironmentsResponse, Unit]): Request[DescribeComputeEnvironmentsResponse, AWSError] = js.native
  /**
    * Describes one or more of your compute environments. If you're using an unmanaged compute environment, you can use the DescribeComputeEnvironment operation to determine the ecsClusterArn that you launch your Amazon ECS container instances into.
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
    * Describes a list of Batch jobs.
    */
  def describeJobs(): Request[DescribeJobsResponse, AWSError] = js.native
  def describeJobs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobsResponse, Unit]): Request[DescribeJobsResponse, AWSError] = js.native
  /**
    * Describes a list of Batch jobs.
    */
  def describeJobs(params: DescribeJobsRequest): Request[DescribeJobsResponse, AWSError] = js.native
  def describeJobs(
    params: DescribeJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobsResponse, Unit]
  ): Request[DescribeJobsResponse, AWSError] = js.native
  
  /**
    * Describes one or more of your scheduling policies.
    */
  def describeSchedulingPolicies(): Request[DescribeSchedulingPoliciesResponse, AWSError] = js.native
  def describeSchedulingPolicies(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSchedulingPoliciesResponse, Unit]): Request[DescribeSchedulingPoliciesResponse, AWSError] = js.native
  /**
    * Describes one or more of your scheduling policies.
    */
  def describeSchedulingPolicies(params: DescribeSchedulingPoliciesRequest): Request[DescribeSchedulingPoliciesResponse, AWSError] = js.native
  def describeSchedulingPolicies(
    params: DescribeSchedulingPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSchedulingPoliciesResponse, Unit]
  ): Request[DescribeSchedulingPoliciesResponse, AWSError] = js.native
  
  /**
    * Returns a list of Batch jobs. You must specify only one of the following items:   A job queue ID to return a list of jobs in that job queue   A multi-node parallel job ID to return a list of nodes for that job   An array job ID to return a list of the children for that job   You can filter the results by job status with the jobStatus parameter. If you don't specify a status, only RUNNING jobs are returned.
    */
  def listJobs(): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]): Request[ListJobsResponse, AWSError] = js.native
  /**
    * Returns a list of Batch jobs. You must specify only one of the following items:   A job queue ID to return a list of jobs in that job queue   A multi-node parallel job ID to return a list of nodes for that job   An array job ID to return a list of the children for that job   You can filter the results by job status with the jobStatus parameter. If you don't specify a status, only RUNNING jobs are returned.
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]
  ): Request[ListJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of Batch scheduling policies.
    */
  def listSchedulingPolicies(): Request[ListSchedulingPoliciesResponse, AWSError] = js.native
  def listSchedulingPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListSchedulingPoliciesResponse, Unit]): Request[ListSchedulingPoliciesResponse, AWSError] = js.native
  /**
    * Returns a list of Batch scheduling policies.
    */
  def listSchedulingPolicies(params: ListSchedulingPoliciesRequest): Request[ListSchedulingPoliciesResponse, AWSError] = js.native
  def listSchedulingPolicies(
    params: ListSchedulingPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSchedulingPoliciesResponse, Unit]
  ): Request[ListSchedulingPoliciesResponse, AWSError] = js.native
  
  /**
    * Lists the tags for an Batch resource. Batch resources that support tags are compute environments, jobs, job definitions, job queues, and scheduling policies. ARNs for child jobs of array and multi-node parallel (MNP) jobs aren't supported.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for an Batch resource. Batch resources that support tags are compute environments, jobs, job definitions, job queues, and scheduling policies. ARNs for child jobs of array and multi-node parallel (MNP) jobs aren't supported.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Registers an Batch job definition.
    */
  def registerJobDefinition(): Request[RegisterJobDefinitionResponse, AWSError] = js.native
  def registerJobDefinition(callback: js.Function2[/* err */ AWSError, /* data */ RegisterJobDefinitionResponse, Unit]): Request[RegisterJobDefinitionResponse, AWSError] = js.native
  /**
    * Registers an Batch job definition.
    */
  def registerJobDefinition(params: RegisterJobDefinitionRequest): Request[RegisterJobDefinitionResponse, AWSError] = js.native
  def registerJobDefinition(
    params: RegisterJobDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterJobDefinitionResponse, Unit]
  ): Request[RegisterJobDefinitionResponse, AWSError] = js.native
  
  /**
    * Submits an Batch job from a job definition. Parameters that are specified during SubmitJob override parameters defined in the job definition. vCPU and memory requirements that are specified in the resourceRequirements objects in the job definition are the exception. They can't be overridden this way using the memory and vcpus parameters. Rather, you must specify updates to job definition parameters in a resourceRequirements object that's included in the containerOverrides parameter.  Job queues with a scheduling policy are limited to 500 active fair share identifiers at a time.    Jobs that run on Fargate resources can't be guaranteed to run for more than 14 days. This is because, after 14 days, Fargate resources might become unavailable and job might be terminated. 
    */
  def submitJob(): Request[SubmitJobResponse, AWSError] = js.native
  def submitJob(callback: js.Function2[/* err */ AWSError, /* data */ SubmitJobResponse, Unit]): Request[SubmitJobResponse, AWSError] = js.native
  /**
    * Submits an Batch job from a job definition. Parameters that are specified during SubmitJob override parameters defined in the job definition. vCPU and memory requirements that are specified in the resourceRequirements objects in the job definition are the exception. They can't be overridden this way using the memory and vcpus parameters. Rather, you must specify updates to job definition parameters in a resourceRequirements object that's included in the containerOverrides parameter.  Job queues with a scheduling policy are limited to 500 active fair share identifiers at a time.    Jobs that run on Fargate resources can't be guaranteed to run for more than 14 days. This is because, after 14 days, Fargate resources might become unavailable and job might be terminated. 
    */
  def submitJob(params: SubmitJobRequest): Request[SubmitJobResponse, AWSError] = js.native
  def submitJob(
    params: SubmitJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SubmitJobResponse, Unit]
  ): Request[SubmitJobResponse, AWSError] = js.native
  
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource aren't specified in the request parameters, they aren't changed. When a resource is deleted, the tags that are associated with that resource are deleted as well. Batch resources that support tags are compute environments, jobs, job definitions, job queues, and scheduling policies. ARNs for child jobs of array and multi-node parallel (MNP) jobs aren't supported.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource aren't specified in the request parameters, they aren't changed. When a resource is deleted, the tags that are associated with that resource are deleted as well. Batch resources that support tags are compute environments, jobs, job definitions, job queues, and scheduling policies. ARNs for child jobs of array and multi-node parallel (MNP) jobs aren't supported.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
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
    * Deletes specified tags from an Batch resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Deletes specified tags from an Batch resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an Batch compute environment.
    */
  def updateComputeEnvironment(): Request[UpdateComputeEnvironmentResponse, AWSError] = js.native
  def updateComputeEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateComputeEnvironmentResponse, Unit]): Request[UpdateComputeEnvironmentResponse, AWSError] = js.native
  /**
    * Updates an Batch compute environment.
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
  
  /**
    * Updates a scheduling policy.
    */
  def updateSchedulingPolicy(): Request[UpdateSchedulingPolicyResponse, AWSError] = js.native
  def updateSchedulingPolicy(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSchedulingPolicyResponse, Unit]): Request[UpdateSchedulingPolicyResponse, AWSError] = js.native
  /**
    * Updates a scheduling policy.
    */
  def updateSchedulingPolicy(params: UpdateSchedulingPolicyRequest): Request[UpdateSchedulingPolicyResponse, AWSError] = js.native
  def updateSchedulingPolicy(
    params: UpdateSchedulingPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSchedulingPolicyResponse, Unit]
  ): Request[UpdateSchedulingPolicyResponse, AWSError] = js.native
}
