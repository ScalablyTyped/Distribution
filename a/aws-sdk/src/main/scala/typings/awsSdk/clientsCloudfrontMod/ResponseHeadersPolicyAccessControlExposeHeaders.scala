package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyAccessControlExposeHeaders extends StObject {
  
  /**
    * The list of HTTP headers. You can specify * to expose all headers.
    */
  var Items: js.UndefOr[AccessControlExposeHeadersList] = js.undefined
  
  /**
    * The number of HTTP headers in the list.
    */
  var Quantity: integer
}
object ResponseHeadersPolicyAccessControlExposeHeaders {
  
  inline def apply(Quantity: integer): ResponseHeadersPolicyAccessControlExposeHeaders = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyAccessControlExposeHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseHeadersPolicyAccessControlExposeHeaders] (val x: Self) extends AnyVal {
    
    inline def setItems(value: AccessControlExposeHeadersList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
