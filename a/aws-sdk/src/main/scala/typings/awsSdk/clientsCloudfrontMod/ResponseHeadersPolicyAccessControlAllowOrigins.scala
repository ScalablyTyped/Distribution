package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyAccessControlAllowOrigins extends StObject {
  
  /**
    * The list of origins (domain names). You can specify * to allow all origins.
    */
  var Items: AccessControlAllowOriginsList
  
  /**
    * The number of origins in the list.
    */
  var Quantity: integer
}
object ResponseHeadersPolicyAccessControlAllowOrigins {
  
  inline def apply(Items: AccessControlAllowOriginsList, Quantity: integer): ResponseHeadersPolicyAccessControlAllowOrigins = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyAccessControlAllowOrigins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseHeadersPolicyAccessControlAllowOrigins] (val x: Self) extends AnyVal {
    
    inline def setItems(value: AccessControlAllowOriginsList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
