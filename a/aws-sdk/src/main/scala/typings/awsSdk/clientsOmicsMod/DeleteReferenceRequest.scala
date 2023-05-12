package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReferenceRequest extends StObject {
  
  /**
    * The reference's ID.
    */
  var id: ReferenceId
  
  /**
    * The reference's store ID.
    */
  var referenceStoreId: ReferenceStoreId
}
object DeleteReferenceRequest {
  
  inline def apply(id: ReferenceId, referenceStoreId: ReferenceStoreId): DeleteReferenceRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referenceStoreId = referenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReferenceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteReferenceRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ReferenceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReferenceStoreId(value: ReferenceStoreId): Self = StObject.set(x, "referenceStoreId", value.asInstanceOf[js.Any])
  }
}
