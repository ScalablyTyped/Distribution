package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReadSetImportJobRequest extends StObject {
  
  /**
    * The job's ID.
    */
  var id: ImportJobId
  
  /**
    * The job's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
}
object GetReadSetImportJobRequest {
  
  inline def apply(id: ImportJobId, sequenceStoreId: SequenceStoreId): GetReadSetImportJobRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReadSetImportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReadSetImportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ImportJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
  }
}
