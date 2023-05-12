package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dictionary that represents a request to set up a recurring payment, typically a subscription.
  *
  * Important
  * You must include the recurringPaymentRequest property in the ApplePayPaymentRequest object to specify a request for a recurring payment.
  * Use an ApplePayRecurringPaymentRequest object to provide the user with payment details and a way to manage payment methods for a recurring payment.
  * You can optionally display a billing agreement and set up merchant token life-cycle notifications for the request.
  */
trait ApplePayRecurringPaymentRequest extends StObject {
  
  /**
    * A localized billing agreement that the payment sheet displays to the user before the user authorizes the payment.
    */
  var billingAgreement: js.UndefOr[String] = js.undefined
  
  /**
    * A URL to a web page where the user can update or delete the payment method for the recurring payment.
    */
  var managementURL: String
  
  /**
    * A description of the recurring payment that Apple Pay displays to the user in the payment sheet.
    */
  var paymentDescription: String
  
  /**
    * The regular billing cycle for the recurring payment, including start and end dates, an interval, and an interval count.
    */
  var regularBilling: ApplePayLineItem
  
  /**
    * A URL you provide for receiving life-cycle notifications from the Apple Pay servers about the Apple Pay merchant token for the recurring payment.
    */
  var tokenNotificationURL: js.UndefOr[String] = js.undefined
  
  /**
    * The trial billing cycle for the recurring payment.
    */
  var trialBilling: js.UndefOr[ApplePayLineItem] = js.undefined
}
object ApplePayRecurringPaymentRequest {
  
  inline def apply(managementURL: String, paymentDescription: String, regularBilling: ApplePayLineItem): ApplePayRecurringPaymentRequest = {
    val __obj = js.Dynamic.literal(managementURL = managementURL.asInstanceOf[js.Any], paymentDescription = paymentDescription.asInstanceOf[js.Any], regularBilling = regularBilling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayRecurringPaymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayRecurringPaymentRequest] (val x: Self) extends AnyVal {
    
    inline def setBillingAgreement(value: String): Self = StObject.set(x, "billingAgreement", value.asInstanceOf[js.Any])
    
    inline def setBillingAgreementUndefined: Self = StObject.set(x, "billingAgreement", js.undefined)
    
    inline def setManagementURL(value: String): Self = StObject.set(x, "managementURL", value.asInstanceOf[js.Any])
    
    inline def setPaymentDescription(value: String): Self = StObject.set(x, "paymentDescription", value.asInstanceOf[js.Any])
    
    inline def setRegularBilling(value: ApplePayLineItem): Self = StObject.set(x, "regularBilling", value.asInstanceOf[js.Any])
    
    inline def setTokenNotificationURL(value: String): Self = StObject.set(x, "tokenNotificationURL", value.asInstanceOf[js.Any])
    
    inline def setTokenNotificationURLUndefined: Self = StObject.set(x, "tokenNotificationURL", js.undefined)
    
    inline def setTrialBilling(value: ApplePayLineItem): Self = StObject.set(x, "trialBilling", value.asInstanceOf[js.Any])
    
    inline def setTrialBillingUndefined: Self = StObject.set(x, "trialBilling", js.undefined)
  }
}
