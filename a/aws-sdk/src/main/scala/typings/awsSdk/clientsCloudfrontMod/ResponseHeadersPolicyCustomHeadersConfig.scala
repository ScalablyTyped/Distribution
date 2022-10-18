package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyCustomHeadersConfig extends StObject {
  
  /**
    * The list of HTTP response headers and their values.
    */
  var Items: js.UndefOr[ResponseHeadersPolicyCustomHeaderList] = js.undefined
  
  /**
    * The number of HTTP response headers in the list.
    */
  var Quantity: integer
}
object ResponseHeadersPolicyCustomHeadersConfig {
  
  inline def apply(Quantity: integer): ResponseHeadersPolicyCustomHeadersConfig = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyCustomHeadersConfig]
  }
  
  extension [Self <: ResponseHeadersPolicyCustomHeadersConfig](x: Self) {
    
    inline def setItems(value: ResponseHeadersPolicyCustomHeaderList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ResponseHeadersPolicyCustomHeader*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
