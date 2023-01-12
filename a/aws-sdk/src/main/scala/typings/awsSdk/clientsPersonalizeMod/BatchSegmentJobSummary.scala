package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchSegmentJobSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the batch segment job.
    */
  var batchSegmentJobArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time at which the batch segment job was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If the batch segment job failed, the reason for the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The name of the batch segment job.
    */
  var jobName: js.UndefOr[Name] = js.undefined
  
  /**
    * The time at which the batch segment job was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the solution version used by the batch segment job to generate batch segments.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the batch segment job. The status is one of the following values:   PENDING   IN PROGRESS   ACTIVE   CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object BatchSegmentJobSummary {
  
  inline def apply(): BatchSegmentJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSegmentJobSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchSegmentJobSummary] (val x: Self) extends AnyVal {
    
    inline def setBatchSegmentJobArn(value: Arn): Self = StObject.set(x, "batchSegmentJobArn", value.asInstanceOf[js.Any])
    
    inline def setBatchSegmentJobArnUndefined: Self = StObject.set(x, "batchSegmentJobArn", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setJobName(value: Name): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
