package typings.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteAttributesRequest extends StObject {
  
  /**
    * The name of the domain in which the attributes are being deleted.
    */
  var DomainName: String
  
  /**
    * A list of items on which to perform the operation.
    */
  var Items: DeletableItemList
}
object BatchDeleteAttributesRequest {
  
  inline def apply(DomainName: String, Items: DeletableItemList): BatchDeleteAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteAttributesRequest]
  }
  
  extension [Self <: BatchDeleteAttributesRequest](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setItems(value: DeletableItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: DeletableItem*): Self = StObject.set(x, "Items", js.Array(value*))
  }
}
