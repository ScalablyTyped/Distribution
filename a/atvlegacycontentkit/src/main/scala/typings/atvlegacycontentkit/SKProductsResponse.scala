package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An App Store response to a request for information about a list of products.
  *
  * See https://developer.apple.com/documentation/storekit/skproductsresponse for more information.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait SKProductsResponse extends StObject {
  
  /**
    * An array of product identifier strings that the App Store doesn’t recognize.
    */
  var invalidProductIdentifiers: js.Array[String]
  
  /**
    * A list of products, one product for each valid product identifier provided in the original request.
    */
  var products: js.Array[SKProduct]
}
object SKProductsResponse {
  
  inline def apply(invalidProductIdentifiers: js.Array[String], products: js.Array[SKProduct]): SKProductsResponse = {
    val __obj = js.Dynamic.literal(invalidProductIdentifiers = invalidProductIdentifiers.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any])
    __obj.asInstanceOf[SKProductsResponse]
  }
  
  extension [Self <: SKProductsResponse](x: Self) {
    
    inline def setInvalidProductIdentifiers(value: js.Array[String]): Self = StObject.set(x, "invalidProductIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setInvalidProductIdentifiersVarargs(value: String*): Self = StObject.set(x, "invalidProductIdentifiers", js.Array(value*))
    
    inline def setProducts(value: js.Array[SKProduct]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsVarargs(value: SKProduct*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
