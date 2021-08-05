package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDetail extends StObject {
  
  /**
    * The array properties of the job, if it is an array job.
    */
  var arrayProperties: js.UndefOr[ArrayPropertiesDetail] = js.undefined
  
  /**
    * A list of job attempts associated with this job.
    */
  var attempts: js.UndefOr[AttemptDetails] = js.undefined
  
  /**
    * An object representing the details of the container that is associated with the job.
    */
  var container: js.UndefOr[ContainerDetail] = js.undefined
  
  /**
    * The Unix timestamp (in milliseconds) for when the job was created. For non-array jobs and parent array jobs, this is when the job entered the SUBMITTED state (at the time SubmitJob was called). For array child jobs, this is when the child job was spawned by its parent and entered the PENDING state.
    */
  var createdAt: js.UndefOr[Long] = js.undefined
  
  /**
    * A list of job IDs on which this job depends.
    */
  var dependsOn: js.UndefOr[JobDependencyList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var jobArn: js.UndefOr[String] = js.undefined
  
  /**
    * The job definition that is used by this job.
    */
  var jobDefinition: String
  
  /**
    * The ID for the job.
    */
  var jobId: String
  
  /**
    * The name of the job.
    */
  var jobName: String
  
  /**
    * The Amazon Resource Name (ARN) of the job queue with which the job is associated.
    */
  var jobQueue: String
  
  /**
    * An object representing the details of a node that is associated with a multi-node parallel job.
    */
  var nodeDetails: js.UndefOr[NodeDetails] = js.undefined
  
  /**
    * An object representing the node properties of a multi-node parallel job.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.undefined
  
  /**
    * Additional parameters passed to the job that replace parameter substitution placeholders or override any corresponding parameter defaults from the job definition.
    */
  var parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * The retry strategy to use for this job if an attempt fails.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
  
  /**
    * The Unix timestamp (in milliseconds) for when the job was started (when the job transitioned from the STARTING state to the RUNNING state). This parameter is not provided for child jobs of array jobs or multi-node parallel jobs.
    */
  var startedAt: Long
  
  /**
    * The current status for the job.  If your jobs do not progress to STARTING, see Jobs Stuck in RUNNABLE Status in the troubleshooting section of the AWS Batch User Guide. 
    */
  var status: JobStatus
  
  /**
    * A short, human-readable string to provide additional details about the current status of the job.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp (in milliseconds) for when the job was stopped (when the job transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
    */
  var stoppedAt: js.UndefOr[Long] = js.undefined
  
  /**
    * The tags applied to the job.
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
  
  extension [Self <: JobDetail](x: Self) {
    
    inline def setArrayProperties(value: ArrayPropertiesDetail): Self = StObject.set(x, "arrayProperties", value.asInstanceOf[js.Any])
    
    inline def setArrayPropertiesUndefined: Self = StObject.set(x, "arrayProperties", js.undefined)
    
    inline def setAttempts(value: AttemptDetails): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    inline def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
    
    inline def setAttemptsVarargs(value: AttemptDetail*): Self = StObject.set(x, "attempts", js.Array(value :_*))
    
    inline def setContainer(value: ContainerDetail): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCreatedAt(value: Long): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDependsOn(value: JobDependencyList): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: JobDependency*): Self = StObject.set(x, "dependsOn", js.Array(value :_*))
    
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
    
    inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "retryStrategy", value.asInstanceOf[js.Any])
    
    inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
    
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
