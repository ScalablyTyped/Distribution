package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableDataImportJobRequest extends StObject {
  
  /**
    * The ID of the job that was returned by the StartTableDataImportJob request.  If a job with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var jobId: JobId
  
  /**
    * The ID of the table into which data was imported.  If a table with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var tableId: ResourceId
  
  /**
    * The ID of the workbook into which data was imported.  If a workbook with the specified id could not be found, this API throws ResourceNotFoundException. 
    */
  var workbookId: ResourceId
}
object DescribeTableDataImportJobRequest {
  
  inline def apply(jobId: JobId, tableId: ResourceId, workbookId: ResourceId): DescribeTableDataImportJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], tableId = tableId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableDataImportJobRequest]
  }
  
  extension [Self <: DescribeTableDataImportJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setTableId(value: ResourceId): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
  }
}
