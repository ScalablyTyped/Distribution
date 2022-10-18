package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportJobResponse extends StObject {
  
  /**
    * The time stamp of when the import job was completed.
    */
  var CompletedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time stamp of when the import job was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of records that failed processing because of invalid input or other reasons.
    */
  var FailedRecordsCount: js.UndefOr[typings.awsSdk.clientsSesv2Mod.FailedRecordsCount] = js.undefined
  
  /**
    * The failure details about an import job.
    */
  var FailureInfo: js.UndefOr[typings.awsSdk.clientsSesv2Mod.FailureInfo] = js.undefined
  
  /**
    * The data source of the import job.
    */
  var ImportDataSource: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ImportDataSource] = js.undefined
  
  /**
    * The destination of the import job.
    */
  var ImportDestination: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ImportDestination] = js.undefined
  
  /**
    * A string that represents the import job ID.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsSesv2Mod.JobId] = js.undefined
  
  /**
    * The status of the import job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.clientsSesv2Mod.JobStatus] = js.undefined
  
  /**
    * The current number of records processed.
    */
  var ProcessedRecordsCount: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ProcessedRecordsCount] = js.undefined
}
object GetImportJobResponse {
  
  inline def apply(): GetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImportJobResponse]
  }
  
  extension [Self <: GetImportJobResponse](x: Self) {
    
    inline def setCompletedTimestamp(value: js.Date): Self = StObject.set(x, "CompletedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCompletedTimestampUndefined: Self = StObject.set(x, "CompletedTimestamp", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setFailedRecordsCount(value: FailedRecordsCount): Self = StObject.set(x, "FailedRecordsCount", value.asInstanceOf[js.Any])
    
    inline def setFailedRecordsCountUndefined: Self = StObject.set(x, "FailedRecordsCount", js.undefined)
    
    inline def setFailureInfo(value: FailureInfo): Self = StObject.set(x, "FailureInfo", value.asInstanceOf[js.Any])
    
    inline def setFailureInfoUndefined: Self = StObject.set(x, "FailureInfo", js.undefined)
    
    inline def setImportDataSource(value: ImportDataSource): Self = StObject.set(x, "ImportDataSource", value.asInstanceOf[js.Any])
    
    inline def setImportDataSourceUndefined: Self = StObject.set(x, "ImportDataSource", js.undefined)
    
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
