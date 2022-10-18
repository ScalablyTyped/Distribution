package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableDataImportJobResult extends StObject {
  
  /**
    *  If job status is failed, error code to understand reason for the failure. 
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    *  The metadata about the job that was submitted for import. 
    */
  var jobMetadata: TableDataImportJobMetadata
  
  /**
    *  The current status of the import job. 
    */
  var jobStatus: TableDataImportJobStatus
  
  /**
    *  A message providing more details about the current status of the import job. 
    */
  var message: TableDataImportJobMessage
}
object DescribeTableDataImportJobResult {
  
  inline def apply(
    jobMetadata: TableDataImportJobMetadata,
    jobStatus: TableDataImportJobStatus,
    message: TableDataImportJobMessage
  ): DescribeTableDataImportJobResult = {
    val __obj = js.Dynamic.literal(jobMetadata = jobMetadata.asInstanceOf[js.Any], jobStatus = jobStatus.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableDataImportJobResult]
  }
  
  extension [Self <: DescribeTableDataImportJobResult](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setJobMetadata(value: TableDataImportJobMetadata): Self = StObject.set(x, "jobMetadata", value.asInstanceOf[js.Any])
    
    inline def setJobStatus(value: TableDataImportJobStatus): Self = StObject.set(x, "jobStatus", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: TableDataImportJobMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
