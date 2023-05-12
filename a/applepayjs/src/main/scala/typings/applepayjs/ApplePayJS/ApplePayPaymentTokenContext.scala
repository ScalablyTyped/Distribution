package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use ApplePayPaymentTokenContext to authorize a payment amount for each payment token in a multimerchant payment request.
  * To enable multiple merchants for a transaction, use one ApplePayPaymentTokenContext object for each merchant.
  *
  * You can optionally associate each payment token with the merchant’s top-level domain.
  */
trait ApplePayPaymentTokenContext extends StObject {
  
  /**
    * The amount to authorize for the payment token context.
    */
  var amount: String
  
  /**
    * An external identifier for the merchant.
    */
  var externalIdentifier: String
  
  /**
    * The merchant’s top-level domain that the Apple Pay server associates with the payment token.
    */
  var merchantDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The Apply Pay merchant identifier.
    */
  var merchantIdentifier: String
  
  /**
    * The merchant’s display name that the Apple Pay server associates with the payment token.
    */
  var merchantName: String
}
object ApplePayPaymentTokenContext {
  
  inline def apply(amount: String, externalIdentifier: String, merchantIdentifier: String, merchantName: String): ApplePayPaymentTokenContext = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], externalIdentifier = externalIdentifier.asInstanceOf[js.Any], merchantIdentifier = merchantIdentifier.asInstanceOf[js.Any], merchantName = merchantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentTokenContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayPaymentTokenContext] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setExternalIdentifier(value: String): Self = StObject.set(x, "externalIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMerchantDomain(value: String): Self = StObject.set(x, "merchantDomain", value.asInstanceOf[js.Any])
    
    inline def setMerchantDomainUndefined: Self = StObject.set(x, "merchantDomain", js.undefined)
    
    inline def setMerchantIdentifier(value: String): Self = StObject.set(x, "merchantIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMerchantName(value: String): Self = StObject.set(x, "merchantName", value.asInstanceOf[js.Any])
  }
}
