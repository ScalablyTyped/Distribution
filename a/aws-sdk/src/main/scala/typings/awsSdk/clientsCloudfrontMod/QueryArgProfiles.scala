package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryArgProfiles extends StObject {
  
  /**
    * Number of items for query argument-profile mapping for field-level encryption.
    */
  var Items: js.UndefOr[QueryArgProfileList] = js.undefined
  
  /**
    * Number of profiles for query argument-profile mapping for field-level encryption.
    */
  var Quantity: integer
}
object QueryArgProfiles {
  
  inline def apply(Quantity: integer): QueryArgProfiles = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArgProfiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryArgProfiles] (val x: Self) extends AnyVal {
    
    inline def setItems(value: QueryArgProfileList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: QueryArgProfile*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
