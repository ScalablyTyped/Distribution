package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchJobExecutionSummary extends StObject {
  
  /**
    * The unique identifier of the application that hosts this batch job.
    */
  var applicationId: Identifier
  
  var batchJobIdentifier: js.UndefOr[BatchJobIdentifier] = js.undefined
  
  /**
    * The timestamp when this batch job execution ended.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier of this execution of the batch job.
    */
  var executionId: Identifier
  
  /**
    * The unique identifier of a particular batch job.
    */
  var jobId: js.UndefOr[String100] = js.undefined
  
  /**
    * The name of a particular batch job.
    */
  var jobName: js.UndefOr[String100] = js.undefined
  
  /**
    * The type of a particular batch job execution.
    */
  var jobType: js.UndefOr[BatchJobType] = js.undefined
  
  /**
    * 
    */
  var returnCode: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when a particular batch job execution started.
    */
  var startTime: js.Date
  
  /**
    * The status of a particular batch job execution.
    */
  var status: BatchJobExecutionStatus
}
object BatchJobExecutionSummary {
  
  inline def apply(
    applicationId: Identifier,
    executionId: Identifier,
    startTime: js.Date,
    status: BatchJobExecutionStatus
  ): BatchJobExecutionSummary = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], executionId = executionId.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchJobExecutionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchJobExecutionSummary] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setBatchJobIdentifier(value: BatchJobIdentifier): Self = StObject.set(x, "batchJobIdentifier", value.asInstanceOf[js.Any])
    
    inline def setBatchJobIdentifierUndefined: Self = StObject.set(x, "batchJobIdentifier", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setExecutionId(value: Identifier): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: String100): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setJobName(value: String100): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setJobType(value: BatchJobType): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
    
    inline def setReturnCode(value: String): Self = StObject.set(x, "returnCode", value.asInstanceOf[js.Any])
    
    inline def setReturnCodeUndefined: Self = StObject.set(x, "returnCode", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: BatchJobExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
