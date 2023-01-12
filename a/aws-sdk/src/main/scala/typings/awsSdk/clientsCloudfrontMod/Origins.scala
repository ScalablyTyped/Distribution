package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Origins extends StObject {
  
  /**
    * A list of origins.
    */
  var Items: OriginList
  
  /**
    * The number of origins for this distribution.
    */
  var Quantity: integer
}
object Origins {
  
  inline def apply(Items: OriginList, Quantity: integer): Origins = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Origins] (val x: Self) extends AnyVal {
    
    inline def setItems(value: OriginList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Origin*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
