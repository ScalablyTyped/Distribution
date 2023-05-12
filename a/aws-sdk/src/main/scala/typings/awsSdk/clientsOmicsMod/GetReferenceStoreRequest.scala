package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReferenceStoreRequest extends StObject {
  
  /**
    * The store's ID.
    */
  var id: ReferenceStoreId
}
object GetReferenceStoreRequest {
  
  inline def apply(id: ReferenceStoreId): GetReferenceStoreRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReferenceStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReferenceStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ReferenceStoreId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
