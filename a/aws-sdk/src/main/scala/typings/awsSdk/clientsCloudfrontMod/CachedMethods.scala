package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachedMethods extends StObject {
  
  /**
    * A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
    */
  var Items: MethodsList
  
  /**
    * The number of HTTP methods for which you want CloudFront to cache responses. Valid values are 2 (for caching responses to GET and HEAD requests) and 3 (for caching responses to GET, HEAD, and OPTIONS requests).
    */
  var Quantity: integer
}
object CachedMethods {
  
  inline def apply(Items: MethodsList, Quantity: integer): CachedMethods = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedMethods]
  }
  
  extension [Self <: CachedMethods](x: Self) {
    
    inline def setItems(value: MethodsList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Method*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
