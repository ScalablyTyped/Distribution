package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReferenceStoreRequest extends StObject {
  
  /**
    * The store's ID.
    */
  var id: ReferenceStoreId
}
object DeleteReferenceStoreRequest {
  
  inline def apply(id: ReferenceStoreId): DeleteReferenceStoreRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReferenceStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteReferenceStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ReferenceStoreId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
