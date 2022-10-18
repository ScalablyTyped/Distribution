package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginGroups extends StObject {
  
  /**
    * The items (origin groups) in a distribution.
    */
  var Items: js.UndefOr[OriginGroupList] = js.undefined
  
  /**
    * The number of origin groups.
    */
  var Quantity: integer
}
object OriginGroups {
  
  inline def apply(Quantity: integer): OriginGroups = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroups]
  }
  
  extension [Self <: OriginGroups](x: Self) {
    
    inline def setItems(value: OriginGroupList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: OriginGroup*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
