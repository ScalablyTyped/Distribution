package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyRemoveHeadersConfig extends StObject {
  
  /**
    * The list of HTTP header names.
    */
  var Items: js.UndefOr[ResponseHeadersPolicyRemoveHeaderList] = js.undefined
  
  /**
    * The number of HTTP header names in the list.
    */
  var Quantity: integer
}
object ResponseHeadersPolicyRemoveHeadersConfig {
  
  inline def apply(Quantity: integer): ResponseHeadersPolicyRemoveHeadersConfig = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyRemoveHeadersConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseHeadersPolicyRemoveHeadersConfig] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ResponseHeadersPolicyRemoveHeaderList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ResponseHeadersPolicyRemoveHeader*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
