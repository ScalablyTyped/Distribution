package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use an ApplePayAutomaticReloadPaymentRequest object to provide the user with payment details and a way to manage payment methods for an automatic reload payment.
  * You can optionally display a billing agreement and set up merchant token life-cycle notifications for the request.
  * For more information about the merchant token life-cycle notifications, see Apple Pay Merchant Token Management API.
  *
  * Apple Pay issues an Apple Pay Merchant Token if the user’s payment network supports merchant-specific payment tokens.
  * Otherwise, Apple Pay issues a device token for the payment request.
  */
trait ApplePayAutomaticReloadPaymentRequest extends StObject {
  
  /**
    * A line item that contains the reload amount and balance threshold for the automatic reload payment.
    */
  var automaticReloadBilling: ApplePayLineItem
  
  /**
    * A localized billing agreement that the payment sheet displays to the user before the user authorizes the payment.
    */
  var billingAgreement: js.UndefOr[String] = js.undefined
  
  /**
    * A URL to a web page where the user can update or delete the payment method for the automatic reload payment.
    */
  var managementURL: String
  
  /**
    * A description of the automatic reload payment that Apple Pay displays in the payment sheet.
    */
  var paymentDescription: String
  
  /**
    * A URL you provide to receive life-cycle notifications from the Apple Pay servers about the Apple Pay merchant token for the recurring payment.
    */
  var tokenNotificationURL: js.UndefOr[String] = js.undefined
}
object ApplePayAutomaticReloadPaymentRequest {
  
  inline def apply(automaticReloadBilling: ApplePayLineItem, managementURL: String, paymentDescription: String): ApplePayAutomaticReloadPaymentRequest = {
    val __obj = js.Dynamic.literal(automaticReloadBilling = automaticReloadBilling.asInstanceOf[js.Any], managementURL = managementURL.asInstanceOf[js.Any], paymentDescription = paymentDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayAutomaticReloadPaymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayAutomaticReloadPaymentRequest] (val x: Self) extends AnyVal {
    
    inline def setAutomaticReloadBilling(value: ApplePayLineItem): Self = StObject.set(x, "automaticReloadBilling", value.asInstanceOf[js.Any])
    
    inline def setBillingAgreement(value: String): Self = StObject.set(x, "billingAgreement", value.asInstanceOf[js.Any])
    
    inline def setBillingAgreementUndefined: Self = StObject.set(x, "billingAgreement", js.undefined)
    
    inline def setManagementURL(value: String): Self = StObject.set(x, "managementURL", value.asInstanceOf[js.Any])
    
    inline def setPaymentDescription(value: String): Self = StObject.set(x, "paymentDescription", value.asInstanceOf[js.Any])
    
    inline def setTokenNotificationURL(value: String): Self = StObject.set(x, "tokenNotificationURL", value.asInstanceOf[js.Any])
    
    inline def setTokenNotificationURLUndefined: Self = StObject.set(x, "tokenNotificationURL", js.undefined)
  }
}
