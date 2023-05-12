package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReadSetActivationJobRequest extends StObject {
  
  /**
    * The job's ID.
    */
  var id: ActivationJobId
  
  /**
    * The job's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
}
object GetReadSetActivationJobRequest {
  
  inline def apply(id: ActivationJobId, sequenceStoreId: SequenceStoreId): GetReadSetActivationJobRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReadSetActivationJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReadSetActivationJobRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ActivationJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
  }
}
