package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReadSetActivationJobResponse extends StObject {
  
  /**
    * When the job was created.
    */
  var creationTime: js.Date
  
  /**
    * The job's ID.
    */
  var id: ActivationJobId
  
  /**
    * The read set's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    * The job's status.
    */
  var status: ReadSetActivationJobStatus
}
object StartReadSetActivationJobResponse {
  
  inline def apply(
    creationTime: js.Date,
    id: ActivationJobId,
    sequenceStoreId: SequenceStoreId,
    status: ReadSetActivationJobStatus
  ): StartReadSetActivationJobResponse = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReadSetActivationJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReadSetActivationJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: ActivationJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReadSetActivationJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
