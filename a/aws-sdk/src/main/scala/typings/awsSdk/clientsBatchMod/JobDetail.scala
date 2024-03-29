package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDetail extends StObject {
  
  /**
    * The array properties of the job, if it's an array job.
    */
  var arrayProperties: js.UndefOr[ArrayPropertiesDetail] = js.undefined
  
  /**
    * A list of job attempts that are associated with this job.
    */
  var attempts: js.UndefOr[AttemptDetails] = js.undefined
  
  /**
    * An object that represents the details for the container that's associated with the job.
    */
  var container: js.UndefOr[ContainerDetail] = js.undefined
  
  /**
    * The Unix timestamp (in milliseconds) for when the job was created. For non-array jobs and parent array jobs, this is when the job entered the SUBMITTED state. This is specifically at the time SubmitJob was called. For array child jobs, this is when the child job was spawned by its parent and entered the PENDING state.
    */
  var createdAt: js.UndefOr[Long] = js.undefined
  
  /**
    * A list of job IDs that this job depends on.
    */
  var dependsOn: js.UndefOr[JobDependencyList] = js.undefined
  
  /**
    * A list of job attempts that are associated with this job.
    */
  var eksAttempts: js.UndefOr[EksAttemptDetails] = js.undefined
  
  /**
    * An object with various properties that are specific to Amazon EKS based jobs. Only one of container, eksProperties, or nodeDetails is specified.
    */
  var eksProperties: js.UndefOr[EksPropertiesDetail] = js.undefined
  
  /**
    * Indicates whether the job is canceled.
    */
  var isCancelled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the job is terminated.
    */
  var isTerminated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var jobArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the job definition that this job uses.
    */
  var jobDefinition: String
  
  /**
    * The job ID.
    */
  var jobId: String
  
  /**
    * The job name.
    */
  var jobName: String
  
  /**
    * The Amazon Resource Name (ARN) of the job queue that the job is associated with.
    */
  var jobQueue: String
  
  /**
    * An object that represents the details of a node that's associated with a multi-node parallel job.
    */
  var nodeDetails: js.UndefOr[NodeDetails] = js.undefined
  
  /**
    * An object that represents the node properties of a multi-node parallel job.  This isn't applicable to jobs that are running on Fargate resources. 
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.undefined
  
  /**
    * Additional parameters that are passed to the job that replace parameter substitution placeholders or override any corresponding parameter defaults from the job definition.
    */
  var parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * The platform capabilities required by the job definition. If no value is specified, it defaults to EC2. Jobs run on Fargate resources specify FARGATE.
    */
  var platformCapabilities: js.UndefOr[PlatformCapabilityList] = js.undefined
  
  /**
    * Specifies whether to propagate the tags from the job or job definition to the corresponding Amazon ECS task. If no value is specified, the tags aren't propagated. Tags can only be propagated to the tasks when the tasks are created. For tags with the same name, job tags are given priority over job definitions tags. If the total number of combined tags from the job and job definition is over 50, the job is moved to the FAILED state.
    */
  var propagateTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The retry strategy to use for this job if an attempt fails.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
  
  /**
    * The scheduling policy of the job definition. This only affects jobs in job queues with a fair share policy. Jobs with a higher scheduling priority are scheduled before jobs with a lower scheduling priority.
    */
  var schedulingPriority: js.UndefOr[Integer] = js.undefined
  
  /**
    * The share identifier for the job.
    */
  var shareIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp (in milliseconds) for when the job was started. More specifically, it's when the job transitioned from the STARTING state to the RUNNING state. This parameter isn't provided for child jobs of array jobs or multi-node parallel jobs.
    */
  var startedAt: Long
  
  /**
    * The current status for the job.  If your jobs don't progress to STARTING, see Jobs stuck in RUNNABLE status in the troubleshooting section of the Batch User Guide. 
    */
  var status: JobStatus
  
  /**
    * A short, human-readable string to provide more details for the current status of the job.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp (in milliseconds) for when the job was stopped. More specifically, it's when the job transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED.
    */
  var stoppedAt: js.UndefOr[Long] = js.undefined
  
  /**
    * The tags that are applied to the job.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.undefined
  
  /**
    * The timeout configuration for the job.
    */
  var timeout: js.UndefOr[JobTimeout] = js.undefined
}
object JobDetail {
  
  inline def apply(
    jobDefinition: String,
    jobId: String,
    jobName: String,
    jobQueue: String,
    startedAt: Long,
    status: JobStatus
  ): JobDetail = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobQueue = jobQueue.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobDetail] (val x: Self) extends AnyVal {
    
    inline def setArrayProperties(value: ArrayPropertiesDetail): Self = StObject.set(x, "arrayProperties", value.asInstanceOf[js.Any])
    
    inline def setArrayPropertiesUndefined: Self = StObject.set(x, "arrayProperties", js.undefined)
    
    inline def setAttempts(value: AttemptDetails): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    inline def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
    
    inline def setAttemptsVarargs(value: AttemptDetail*): Self = StObject.set(x, "attempts", js.Array(value*))
    
    inline def setContainer(value: ContainerDetail): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCreatedAt(value: Long): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDependsOn(value: JobDependencyList): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: JobDependency*): Self = StObject.set(x, "dependsOn", js.Array(value*))
    
    inline def setEksAttempts(value: EksAttemptDetails): Self = StObject.set(x, "eksAttempts", value.asInstanceOf[js.Any])
    
    inline def setEksAttemptsUndefined: Self = StObject.set(x, "eksAttempts", js.undefined)
    
    inline def setEksAttemptsVarargs(value: EksAttemptDetail*): Self = StObject.set(x, "eksAttempts", js.Array(value*))
    
    inline def setEksProperties(value: EksPropertiesDetail): Self = StObject.set(x, "eksProperties", value.asInstanceOf[js.Any])
    
    inline def setEksPropertiesUndefined: Self = StObject.set(x, "eksProperties", js.undefined)
    
    inline def setIsCancelled(value: Boolean): Self = StObject.set(x, "isCancelled", value.asInstanceOf[js.Any])
    
    inline def setIsCancelledUndefined: Self = StObject.set(x, "isCancelled", js.undefined)
    
    inline def setIsTerminated(value: Boolean): Self = StObject.set(x, "isTerminated", value.asInstanceOf[js.Any])
    
    inline def setIsTerminatedUndefined: Self = StObject.set(x, "isTerminated", js.undefined)
    
    inline def setJobArn(value: String): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    inline def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    inline def setJobDefinition(value: String): Self = StObject.set(x, "jobDefinition", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobQueue(value: String): Self = StObject.set(x, "jobQueue", value.asInstanceOf[js.Any])
    
    inline def setNodeDetails(value: NodeDetails): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
    
    inline def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
    
    inline def setNodeProperties(value: NodeProperties): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    inline def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
    
    inline def setParameters(value: ParametersMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPlatformCapabilities(value: PlatformCapabilityList): Self = StObject.set(x, "platformCapabilities", value.asInstanceOf[js.Any])
    
    inline def setPlatformCapabilitiesUndefined: Self = StObject.set(x, "platformCapabilities", js.undefined)
    
    inline def setPlatformCapabilitiesVarargs(value: PlatformCapability*): Self = StObject.set(x, "platformCapabilities", js.Array(value*))
    
    inline def setPropagateTags(value: Boolean): Self = StObject.set(x, "propagateTags", value.asInstanceOf[js.Any])
    
    inline def setPropagateTagsUndefined: Self = StObject.set(x, "propagateTags", js.undefined)
    
    inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
    
    inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
    
    inline def setSchedulingPriority(value: Integer): Self = StObject.set(x, "schedulingPriority", value.asInstanceOf[js.Any])
    
    inline def setSchedulingPriorityUndefined: Self = StObject.set(x, "schedulingPriority", js.undefined)
    
    inline def setShareIdentifier(value: String): Self = StObject.set(x, "shareIdentifier", value.asInstanceOf[js.Any])
    
    inline def setShareIdentifierUndefined: Self = StObject.set(x, "shareIdentifier", js.undefined)
    
    inline def setStartedAt(value: Long): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStoppedAt(value: Long): Self = StObject.set(x, "stoppedAt", value.asInstanceOf[js.Any])
    
    inline def setStoppedAtUndefined: Self = StObject.set(x, "stoppedAt", js.undefined)
    
    inline def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTimeout(value: JobTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
