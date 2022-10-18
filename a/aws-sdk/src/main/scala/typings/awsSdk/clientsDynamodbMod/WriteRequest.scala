package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteRequest extends StObject {
  
  /**
    * A request to perform a DeleteItem operation.
    */
  var DeleteRequest: js.UndefOr[typings.awsSdk.clientsDynamodbMod.DeleteRequest] = js.undefined
  
  /**
    * A request to perform a PutItem operation.
    */
  var PutRequest: js.UndefOr[typings.awsSdk.clientsDynamodbMod.PutRequest] = js.undefined
}
object WriteRequest {
  
  inline def apply(): WriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteRequest]
  }
  
  extension [Self <: WriteRequest](x: Self) {
    
    inline def setDeleteRequest(value: DeleteRequest): Self = StObject.set(x, "DeleteRequest", value.asInstanceOf[js.Any])
    
    inline def setDeleteRequestUndefined: Self = StObject.set(x, "DeleteRequest", js.undefined)
    
    inline def setPutRequest(value: PutRequest): Self = StObject.set(x, "PutRequest", value.asInstanceOf[js.Any])
    
    inline def setPutRequestUndefined: Self = StObject.set(x, "PutRequest", js.undefined)
  }
}
