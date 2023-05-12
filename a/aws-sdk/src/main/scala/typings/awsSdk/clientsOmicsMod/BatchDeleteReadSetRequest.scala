package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteReadSetRequest extends StObject {
  
  /**
    * The read sets' IDs.
    */
  var ids: ReadSetIdList
  
  /**
    * The read sets' sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
}
object BatchDeleteReadSetRequest {
  
  inline def apply(ids: ReadSetIdList, sequenceStoreId: SequenceStoreId): BatchDeleteReadSetRequest = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteReadSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteReadSetRequest] (val x: Self) extends AnyVal {
    
    inline def setIds(value: ReadSetIdList): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: ReadSetId*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
  }
}
