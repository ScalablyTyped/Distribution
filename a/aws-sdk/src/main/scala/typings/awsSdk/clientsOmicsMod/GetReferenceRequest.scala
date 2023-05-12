package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReferenceRequest extends StObject {
  
  /**
    * The file to retrieve.
    */
  var file: js.UndefOr[ReferenceFile] = js.undefined
  
  /**
    * The reference's ID.
    */
  var id: ReferenceId
  
  /**
    * The part number to retrieve.
    */
  var partNumber: GetReferenceRequestPartNumberInteger
  
  /**
    * The range to retrieve.
    */
  var range: js.UndefOr[Range] = js.undefined
  
  /**
    * The reference's store ID.
    */
  var referenceStoreId: ReferenceStoreId
}
object GetReferenceRequest {
  
  inline def apply(
    id: ReferenceId,
    partNumber: GetReferenceRequestPartNumberInteger,
    referenceStoreId: ReferenceStoreId
  ): GetReferenceRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], referenceStoreId = referenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReferenceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReferenceRequest] (val x: Self) extends AnyVal {
    
    inline def setFile(value: ReferenceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setId(value: ReferenceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPartNumber(value: GetReferenceRequestPartNumberInteger): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setReferenceStoreId(value: ReferenceStoreId): Self = StObject.set(x, "referenceStoreId", value.asInstanceOf[js.Any])
  }
}
