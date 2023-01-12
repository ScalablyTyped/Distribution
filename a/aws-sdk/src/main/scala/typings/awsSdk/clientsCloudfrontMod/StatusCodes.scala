package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusCodes extends StObject {
  
  /**
    * The items (status codes) for an origin group.
    */
  var Items: StatusCodeList
  
  /**
    * The number of status codes.
    */
  var Quantity: integer
}
object StatusCodes {
  
  inline def apply(Items: StatusCodeList, Quantity: integer): StatusCodes = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCodes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusCodes] (val x: Self) extends AnyVal {
    
    inline def setItems(value: StatusCodeList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: integer*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
