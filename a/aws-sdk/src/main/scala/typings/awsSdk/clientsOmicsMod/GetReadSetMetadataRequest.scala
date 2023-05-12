package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReadSetMetadataRequest extends StObject {
  
  /**
    * The read set's ID.
    */
  var id: ReadSetId
  
  /**
    * The read set's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
}
object GetReadSetMetadataRequest {
  
  inline def apply(id: ReadSetId, sequenceStoreId: SequenceStoreId): GetReadSetMetadataRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReadSetMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReadSetMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ReadSetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
  }
}
