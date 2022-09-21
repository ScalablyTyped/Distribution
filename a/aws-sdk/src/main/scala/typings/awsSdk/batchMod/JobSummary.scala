package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSummary extends StObject {
  
  /**
    * The array properties of the job, if it is an array job.
    */
  var arrayProperties: js.UndefOr[ArrayPropertiesSummary] = js.undefined
  
  /**
    * An object representing the details of the container that's associated with the job.
    */
  var container: js.UndefOr[ContainerSummary] = js.undefined
  
  /**
    * The Unix timestamp (in milliseconds) for when the job was created. For non-array jobs and parent array jobs, this is when the job entered the SUBMITTED state (at the time SubmitJob was called). For array child jobs, this is when the child job was spawned by its parent and entered the PENDING state.
    */
  var createdAt: js.UndefOr[Long] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var jobArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the job definition.
    */
  var jobDefinition: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the job.
    */
  var jobId: String
  
  /**
    * The name of the job.
    */
  var jobName: String
  
  /**
    * The node properties for a single node in a job summary list.  This isn't applicable to jobs that are running on Fargate resources. 
    */
  var nodeProperties: js.UndefOr[NodePropertiesSummary] = js.undefined
  
  /**
    * The Unix timestamp for when the job was started (when the job transitioned from the STARTING state to the RUNNING state).
    */
  var startedAt: js.UndefOr[Long] = js.undefined
  
  /**
    * The current status for the job.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * A short, human-readable string to provide additional details about the current status of the job.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for when the job was stopped (when the job transitioned from the RUNNING state to a terminal state, such as SUCCEEDED or FAILED).
    */
  var stoppedAt: js.UndefOr[Long] = js.undefined
}
object JobSummary {
  
  inline def apply(jobId: String, jobName: String): JobSummary = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSummary]
  }
  
  extension [Self <: JobSummary](x: Self) {
    
    inline def setArrayProperties(value: ArrayPropertiesSummary): Self = StObject.set(x, "arrayProperties", value.asInstanceOf[js.Any])
    
    inline def setArrayPropertiesUndefined: Self = StObject.set(x, "arrayProperties", js.undefined)
    
    inline def setContainer(value: ContainerSummary): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCreatedAt(value: Long): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setJobArn(value: String): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    inline def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    inline def setJobDefinition(value: String): Self = StObject.set(x, "jobDefinition", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionUndefined: Self = StObject.set(x, "jobDefinition", js.undefined)
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setNodeProperties(value: NodePropertiesSummary): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    inline def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
    
    inline def setStartedAt(value: Long): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStoppedAt(value: Long): Self = StObject.set(x, "stoppedAt", value.asInstanceOf[js.Any])
    
    inline def setStoppedAtUndefined: Self = StObject.set(x, "stoppedAt", js.undefined)
  }
}
