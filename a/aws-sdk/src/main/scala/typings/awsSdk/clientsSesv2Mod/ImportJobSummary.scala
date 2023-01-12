package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportJobSummary extends StObject {
  
  /**
    * The date and time when the import job was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of records that failed processing because of invalid input or other reasons.
    */
  var FailedRecordsCount: js.UndefOr[typings.awsSdk.clientsSesv2Mod.FailedRecordsCount] = js.undefined
  
  var ImportDestination: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ImportDestination] = js.undefined
  
  var JobId: js.UndefOr[typings.awsSdk.clientsSesv2Mod.JobId] = js.undefined
  
  var JobStatus: js.UndefOr[typings.awsSdk.clientsSesv2Mod.JobStatus] = js.undefined
  
  /**
    * The current number of records processed.
    */
  var ProcessedRecordsCount: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ProcessedRecordsCount] = js.undefined
}
object ImportJobSummary {
  
  inline def apply(): ImportJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportJobSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportJobSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setFailedRecordsCount(value: FailedRecordsCount): Self = StObject.set(x, "FailedRecordsCount", value.asInstanceOf[js.Any])
    
    inline def setFailedRecordsCountUndefined: Self = StObject.set(x, "FailedRecordsCount", js.undefined)
    
    inline def setImportDestination(value: ImportDestination): Self = StObject.set(x, "ImportDestination", value.asInstanceOf[js.Any])
    
    inline def setImportDestinationUndefined: Self = StObject.set(x, "ImportDestination", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setProcessedRecordsCount(value: ProcessedRecordsCount): Self = StObject.set(x, "ProcessedRecordsCount", value.asInstanceOf[js.Any])
    
    inline def setProcessedRecordsCountUndefined: Self = StObject.set(x, "ProcessedRecordsCount", js.undefined)
  }
}
