package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to the App Store to process payment for additional functionality offered by your app.
  *
  * See https://developer.apple.com/documentation/storekit/skpayment for more information.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait SKPayment extends StObject {
  
  /**
    * The product to purchase.
    */
  var product: SKProduct
  
  /**
    * The number of items the user wants to purchase.
    */
  var quantity: Double
  
  /**
    * Any other parameters you wish to send.
    */
  var requestParameters: js.UndefOr[js.Object] = js.undefined
}
object SKPayment {
  
  inline def apply(product: SKProduct, quantity: Double): SKPayment = {
    val __obj = js.Dynamic.literal(product = product.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SKPayment]
  }
  
  extension [Self <: SKPayment](x: Self) {
    
    inline def setProduct(value: SKProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setRequestParameters(value: js.Object): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
    
    inline def setRequestParametersUndefined: Self = StObject.set(x, "requestParameters", js.undefined)
  }
}
