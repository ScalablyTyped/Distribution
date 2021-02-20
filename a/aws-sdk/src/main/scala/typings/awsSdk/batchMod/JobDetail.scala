package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobDetail extends StObject {
  
  /**
    * The array properties of the job, if it is an array job.
    */
  var arrayProperties: js.UndefOr[ArrayPropertiesDetail] = js.native
  
  /**
    * A list of job attempts associated with this job.
    */
  var attempts: js.UndefOr[AttemptDetails] = js.native
  
  /**
    * An object representing the details of the container that is associated with the job.
    */
  var container: js.UndefOr[ContainerDetail] = js.native
  
  /**
    * The Unix timestamp (in milliseconds) for when the job was created. For non-array jobs and parent array jobs, this is when the job entered the SUBMITTED state (at the time SubmitJob was called). For array child jobs, this is when the child job was spawned by its parent and entered the PENDING state.
    */
  var createdAt: js.UndefOr[Long] = js.native
  
  /**
    * A list of job IDs on which this job depends.
    */
  var dependsOn: js.UndefOr[JobDependencyList] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var jobArn: js.UndefOr[String] = js.native
  
  /**
    * The job definition that is used by this job.
    */
  var jobDefinition: String = js.native
  
  /**
    * The ID for the job.
    */
  var jobId: String = js.native
  
  /**
    * The name of the job.
    */
  var jobName: String = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the job queue with which the job is associated.
    */
  var jobQueue: String = js.native
  
  /**
    * An object representing the details of a node that is associated with a multi-node parallel job.
    */
  var nodeDetails: js.UndefOr[NodeDetails] = js.native
  
  /**
    * An object representing the node properties of a multi-node parallel job.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.native
  
  /**
    * Additional parameters passed to the job that replace parameter substitution placeholders or override any corresponding parameter defaults from the job definition.
    */
  var parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * The retry strategy to use for this job if an attempt fails.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.native
  
  /**
    * The Unix timestamp (in milliseconds) for when the job was started (when the job transitioned from the STARTING state to the RUNNING state). This parameter is not provided for child jobs of array jobs or multi-node parallel jobs.
    */
  var startedAt: Long = js.native
  
  /**
    * The current status for the job.  If your jobs do not progress to STARTING, see Jobs Stuck in RUNNABLE Status in the troubleshooting section of the AWS Batch User Guide. 
    */
  var status: JobStatus = js.native
  
  /**
    * A short, human-readable string to provide additional details about the current status of the job.
    */
  var statusReason: js.UndefOr[String] = js.native
  
  /**
    * The Unix timestamp (in milliseconds) for when the job was stopped (when the job transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
    */
  var stoppedAt: js.UndefOr[Long] = js.native
  
  /**
    * The tags applied to the job.
    */
  var tags: js.UndefOr[TagrisTagsMap] = js.native
  
  /**
    * The timeout configuration for the job.
    */
  var timeout: js.UndefOr[JobTimeout] = js.native
}
object JobDetail {
  
  @scala.inline
  def apply(
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
  implicit class JobDetailMutableBuilder[Self <: JobDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayProperties(value: ArrayPropertiesDetail): Self = StObject.set(x, "arrayProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayPropertiesUndefined: Self = StObject.set(x, "arrayProperties", js.undefined)
    
    @scala.inline
    def setAttempts(value: AttemptDetails): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
    
    @scala.inline
    def setAttemptsVarargs(value: AttemptDetail*): Self = StObject.set(x, "attempts", js.Array(value :_*))
    
    @scala.inline
    def setContainer(value: ContainerDetail): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Long): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDependsOn(value: JobDependencyList): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    @scala.inline
    def setDependsOnVarargs(value: JobDependency*): Self = StObject.set(x, "dependsOn", js.Array(value :_*))
    
    @scala.inline
    def setJobArn(value: String): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    @scala.inline
    def setJobDefinition(value: String): Self = StObject.set(x, "jobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobQueue(value: String): Self = StObject.set(x, "jobQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDetails(value: NodeDetails): Self = StObject.set(x, "nodeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDetailsUndefined: Self = StObject.set(x, "nodeDetails", js.undefined)
    
    @scala.inline
    def setNodeProperties(value: NodeProperties): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
    
    @scala.inline
    def setStartedAt(value: Long): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    @scala.inline
    def setStoppedAt(value: Long): Self = StObject.set(x, "stoppedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppedAtUndefined: Self = StObject.set(x, "stoppedAt", js.undefined)
    
    @scala.inline
    def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: JobTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
