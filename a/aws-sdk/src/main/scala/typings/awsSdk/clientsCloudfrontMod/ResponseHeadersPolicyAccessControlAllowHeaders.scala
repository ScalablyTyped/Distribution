package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyAccessControlAllowHeaders extends StObject {
  
  /**
    * The list of HTTP header names. You can specify * to allow all headers.
    */
  var Items: AccessControlAllowHeadersList
  
  /**
    * The number of HTTP header names in the list.
    */
  var Quantity: integer
}
object ResponseHeadersPolicyAccessControlAllowHeaders {
  
  inline def apply(Items: AccessControlAllowHeadersList, Quantity: integer): ResponseHeadersPolicyAccessControlAllowHeaders = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyAccessControlAllowHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseHeadersPolicyAccessControlAllowHeaders] (val x: Self) extends AnyVal {
    
    inline def setItems(value: AccessControlAllowHeadersList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
