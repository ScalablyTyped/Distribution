package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomKeyStoreRequest extends StObject {
  
  /**
    * Enter the ID of the custom key store you want to delete. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: CustomKeyStoreIdType
}
object DeleteCustomKeyStoreRequest {
  
  inline def apply(CustomKeyStoreId: CustomKeyStoreIdType): DeleteCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal(CustomKeyStoreId = CustomKeyStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomKeyStoreRequest]
  }
  
  extension [Self <: DeleteCustomKeyStoreRequest](x: Self) {
    
    inline def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
  }
}
