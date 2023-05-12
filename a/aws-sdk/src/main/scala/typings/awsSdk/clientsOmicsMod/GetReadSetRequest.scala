package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReadSetRequest extends StObject {
  
  /**
    * The file to retrieve.
    */
  var file: js.UndefOr[ReadSetFile] = js.undefined
  
  /**
    * The read set's ID.
    */
  var id: ReadSetId
  
  /**
    * The part number to retrieve.
    */
  var partNumber: GetReadSetRequestPartNumberInteger
  
  /**
    * The read set's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
}
object GetReadSetRequest {
  
  inline def apply(id: ReadSetId, partNumber: GetReadSetRequestPartNumberInteger, sequenceStoreId: SequenceStoreId): GetReadSetRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReadSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReadSetRequest] (val x: Self) extends AnyVal {
    
    inline def setFile(value: ReadSetFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setId(value: ReadSetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPartNumber(value: GetReadSetRequestPartNumberInteger): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
  }
}
