package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnnotationStoreResponse extends StObject {
  
  /**
    * The store's status.
    */
  var status: StoreStatus
}
object DeleteAnnotationStoreResponse {
  
  inline def apply(status: StoreStatus): DeleteAnnotationStoreResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnnotationStoreResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAnnotationStoreResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: StoreStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
