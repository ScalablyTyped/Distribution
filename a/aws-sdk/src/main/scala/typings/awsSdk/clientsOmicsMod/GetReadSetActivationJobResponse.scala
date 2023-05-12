package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReadSetActivationJobResponse extends StObject {
  
  /**
    * When the job completed.
    */
  var completionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * When the job was created.
    */
  var creationTime: js.Date
  
  /**
    * The job's ID.
    */
  var id: ActivationJobId
  
  /**
    * The job's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    * The job's source files.
    */
  var sources: js.UndefOr[ActivateReadSetSourceList] = js.undefined
  
  /**
    * The job's status.
    */
  var status: ReadSetActivationJobStatus
  
  /**
    * The job's status message.
    */
  var statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
}
object GetReadSetActivationJobResponse {
  
  inline def apply(
    creationTime: js.Date,
    id: ActivationJobId,
    sequenceStoreId: SequenceStoreId,
    status: ReadSetActivationJobStatus
  ): GetReadSetActivationJobResponse = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReadSetActivationJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReadSetActivationJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: ActivationJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setSources(value: ActivateReadSetSourceList): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: ActivateReadSetSourceItem*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setStatus(value: ReadSetActivationJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: JobStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
