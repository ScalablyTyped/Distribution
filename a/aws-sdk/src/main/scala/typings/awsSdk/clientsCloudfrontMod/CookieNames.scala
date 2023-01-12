package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieNames extends StObject {
  
  /**
    * A list of cookie names.
    */
  var Items: js.UndefOr[CookieNameList] = js.undefined
  
  /**
    * The number of cookie names in the Items list.
    */
  var Quantity: integer
}
object CookieNames {
  
  inline def apply(Quantity: integer): CookieNames = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CookieNames] (val x: Self) extends AnyVal {
    
    inline def setItems(value: CookieNameList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
