package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDataIngestionJobResponse extends StObject {
  
  /**
    * Indicates the job ID of the data ingestion job. 
    */
  var JobId: js.UndefOr[IngestionJobId] = js.undefined
  
  /**
    * Indicates the status of the StartDataIngestionJob operation. 
    */
  var Status: js.UndefOr[IngestionJobStatus] = js.undefined
}
object StartDataIngestionJobResponse {
  
  inline def apply(): StartDataIngestionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDataIngestionJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDataIngestionJobResponse] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: IngestionJobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setStatus(value: IngestionJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
