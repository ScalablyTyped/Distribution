package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectCustomKeyStoreRequest extends StObject {
  
  /**
    * Enter the ID of the custom key store you want to disconnect. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: CustomKeyStoreIdType
}
object DisconnectCustomKeyStoreRequest {
  
  inline def apply(CustomKeyStoreId: CustomKeyStoreIdType): DisconnectCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal(CustomKeyStoreId = CustomKeyStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectCustomKeyStoreRequest]
  }
  
  extension [Self <: DisconnectCustomKeyStoreRequest](x: Self) {
    
    inline def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
  }
}
