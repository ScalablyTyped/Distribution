package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTableDataImportJobResult extends StObject {
  
  /**
    *  The id that is assigned to this import job. Future requests to find out the status of this import job need to send this id in the appropriate parameter in the request. 
    */
  var jobId: JobId
  
  /**
    *  The status of the import job immediately after submitting the request. 
    */
  var jobStatus: TableDataImportJobStatus
}
object StartTableDataImportJobResult {
  
  inline def apply(jobId: JobId, jobStatus: TableDataImportJobStatus): StartTableDataImportJobResult = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], jobStatus = jobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTableDataImportJobResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTableDataImportJobResult] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobStatus(value: TableDataImportJobStatus): Self = StObject.set(x, "jobStatus", value.asInstanceOf[js.Any])
  }
}
