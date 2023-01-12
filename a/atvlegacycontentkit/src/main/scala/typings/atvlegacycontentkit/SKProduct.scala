package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a product previously registered in App Store Connect.
  *
  * See https://developer.apple.com/documentation/storekit/skproduct for more information. Please note, some fields do not apply to the Apple TV and as such, have been removed.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait SKProduct extends StObject {
  
  /**
    * A description of the product.
    */
  var localizedDescription: String
  
  /**
    * The price of the product, including currency symbols.
    */
  var localizedPrice: String
  
  /**
    * The name of the product.
    */
  var localizedTitle: String
  
  /**
    * The cost of the product in the local currency.
    */
  var price: Double
  
  /**
    * The locale used to format the price of the product.
    */
  var priceLocale: TVLJSNSLocale
  
  /**
    * The string that identifies the product to the Apple App Store.
    */
  var productIdentifier: String
}
object SKProduct {
  
  inline def apply(
    localizedDescription: String,
    localizedPrice: String,
    localizedTitle: String,
    price: Double,
    priceLocale: TVLJSNSLocale,
    productIdentifier: String
  ): SKProduct = {
    val __obj = js.Dynamic.literal(localizedDescription = localizedDescription.asInstanceOf[js.Any], localizedPrice = localizedPrice.asInstanceOf[js.Any], localizedTitle = localizedTitle.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], priceLocale = priceLocale.asInstanceOf[js.Any], productIdentifier = productIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SKProduct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SKProduct] (val x: Self) extends AnyVal {
    
    inline def setLocalizedDescription(value: String): Self = StObject.set(x, "localizedDescription", value.asInstanceOf[js.Any])
    
    inline def setLocalizedPrice(value: String): Self = StObject.set(x, "localizedPrice", value.asInstanceOf[js.Any])
    
    inline def setLocalizedTitle(value: String): Self = StObject.set(x, "localizedTitle", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceLocale(value: TVLJSNSLocale): Self = StObject.set(x, "priceLocale", value.asInstanceOf[js.Any])
    
    inline def setProductIdentifier(value: String): Self = StObject.set(x, "productIdentifier", value.asInstanceOf[js.Any])
  }
}
