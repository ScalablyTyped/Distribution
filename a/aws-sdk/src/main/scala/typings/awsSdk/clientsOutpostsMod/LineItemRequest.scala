package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineItemRequest extends StObject {
  
  /**
    * The ID of the catalog item.
    */
  var CatalogItemId: js.UndefOr[SkuCode] = js.undefined
  
  /**
    * The quantity of a line item request.
    */
  var Quantity: js.UndefOr[LineItemQuantity] = js.undefined
}
object LineItemRequest {
  
  inline def apply(): LineItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItemRequest]
  }
  
  extension [Self <: LineItemRequest](x: Self) {
    
    inline def setCatalogItemId(value: SkuCode): Self = StObject.set(x, "CatalogItemId", value.asInstanceOf[js.Any])
    
    inline def setCatalogItemIdUndefined: Self = StObject.set(x, "CatalogItemId", js.undefined)
    
    inline def setQuantity(value: LineItemQuantity): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "Quantity", js.undefined)
  }
}
