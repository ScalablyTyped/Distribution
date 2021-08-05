package typings.applepayjs

import typings.applepayjs.ApplePayJS.ApplePayContactField
import typings.applepayjs.ApplePayJS.ApplePayErrorCode
import typings.applepayjs.ApplePayJS.ApplePayErrorContactField
import typings.applepayjs.ApplePayJS.ApplePayLineItemType
import typings.applepayjs.ApplePayJS.ApplePayMerchantCapability
import typings.applepayjs.ApplePayJS.ApplePayPaymentMethodType
import typings.applepayjs.ApplePayJS.ApplePayPaymentPassActivationState
import typings.applepayjs.ApplePayJS.ApplePayShippingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applepayjsStrings {
  
  @js.native
  sealed trait activated
    extends StObject
       with ApplePayPaymentPassActivationState
  inline def activated: activated = "activated".asInstanceOf[activated]
  
  @js.native
  sealed trait activating
    extends StObject
       with ApplePayPaymentPassActivationState
  inline def activating: activating = "activating".asInstanceOf[activating]
  
  @js.native
  sealed trait addressLines
    extends StObject
       with ApplePayErrorContactField
  inline def addressLines: addressLines = "addressLines".asInstanceOf[addressLines]
  
  @js.native
  sealed trait addressUnserviceable
    extends StObject
       with ApplePayErrorCode
  inline def addressUnserviceable: addressUnserviceable = "addressUnserviceable".asInstanceOf[addressUnserviceable]
  
  @js.native
  sealed trait administrativeArea
    extends StObject
       with ApplePayErrorContactField
  inline def administrativeArea: administrativeArea = "administrativeArea".asInstanceOf[administrativeArea]
  
  @js.native
  sealed trait billingContactInvalid
    extends StObject
       with ApplePayErrorCode
  inline def billingContactInvalid: billingContactInvalid = "billingContactInvalid".asInstanceOf[billingContactInvalid]
  
  @js.native
  sealed trait country
    extends StObject
       with ApplePayErrorContactField
  inline def country: country = "country".asInstanceOf[country]
  
  @js.native
  sealed trait countryCode
    extends StObject
       with ApplePayErrorContactField
  inline def countryCode: countryCode = "countryCode".asInstanceOf[countryCode]
  
  @js.native
  sealed trait credit
    extends StObject
       with ApplePayPaymentMethodType
  inline def credit: credit = "credit".asInstanceOf[credit]
  
  @js.native
  sealed trait deactivated
    extends StObject
       with ApplePayPaymentPassActivationState
  inline def deactivated: deactivated = "deactivated".asInstanceOf[deactivated]
  
  @js.native
  sealed trait debit
    extends StObject
       with ApplePayPaymentMethodType
  inline def debit: debit = "debit".asInstanceOf[debit]
  
  @js.native
  sealed trait delivery
    extends StObject
       with ApplePayShippingType
  inline def delivery: delivery = "delivery".asInstanceOf[delivery]
  
  @js.native
  sealed trait email
    extends StObject
       with ApplePayContactField
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait emailAddress
    extends StObject
       with ApplePayErrorContactField
  inline def emailAddress: emailAddress = "emailAddress".asInstanceOf[emailAddress]
  
  @js.native
  sealed trait `final`
    extends StObject
       with ApplePayLineItemType
  inline def `final`: `final` = "final".asInstanceOf[`final`]
  
  @js.native
  sealed trait locality
    extends StObject
       with ApplePayErrorContactField
  inline def locality: locality = "locality".asInstanceOf[locality]
  
  @js.native
  sealed trait name
    extends StObject
       with ApplePayContactField
       with ApplePayErrorContactField
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait pending
    extends StObject
       with ApplePayLineItemType
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait phone
    extends StObject
       with ApplePayContactField
  inline def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait phoneNumber
    extends StObject
       with ApplePayErrorContactField
  inline def phoneNumber: phoneNumber = "phoneNumber".asInstanceOf[phoneNumber]
  
  @js.native
  sealed trait phoneticName
    extends StObject
       with ApplePayContactField
       with ApplePayErrorContactField
  inline def phoneticName: phoneticName = "phoneticName".asInstanceOf[phoneticName]
  
  @js.native
  sealed trait postalAddress
    extends StObject
       with ApplePayContactField
       with ApplePayErrorContactField
  inline def postalAddress: postalAddress = "postalAddress".asInstanceOf[postalAddress]
  
  @js.native
  sealed trait postalCode
    extends StObject
       with ApplePayErrorContactField
  inline def postalCode: postalCode = "postalCode".asInstanceOf[postalCode]
  
  @js.native
  sealed trait prepaid
    extends StObject
       with ApplePayPaymentMethodType
  inline def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  
  @js.native
  sealed trait requiresActivation
    extends StObject
       with ApplePayPaymentPassActivationState
  inline def requiresActivation: requiresActivation = "requiresActivation".asInstanceOf[requiresActivation]
  
  @js.native
  sealed trait servicePickup
    extends StObject
       with ApplePayShippingType
  inline def servicePickup: servicePickup = "servicePickup".asInstanceOf[servicePickup]
  
  @js.native
  sealed trait shipping
    extends StObject
       with ApplePayShippingType
  inline def shipping: shipping = "shipping".asInstanceOf[shipping]
  
  @js.native
  sealed trait shippingContactInvalid
    extends StObject
       with ApplePayErrorCode
  inline def shippingContactInvalid: shippingContactInvalid = "shippingContactInvalid".asInstanceOf[shippingContactInvalid]
  
  @js.native
  sealed trait store
    extends StObject
       with ApplePayPaymentMethodType
  inline def store: store = "store".asInstanceOf[store]
  
  @js.native
  sealed trait storePickup
    extends StObject
       with ApplePayShippingType
  inline def storePickup: storePickup = "storePickup".asInstanceOf[storePickup]
  
  @js.native
  sealed trait subAdministrativeArea
    extends StObject
       with ApplePayErrorContactField
  inline def subAdministrativeArea: subAdministrativeArea = "subAdministrativeArea".asInstanceOf[subAdministrativeArea]
  
  @js.native
  sealed trait subLocality
    extends StObject
       with ApplePayErrorContactField
  inline def subLocality: subLocality = "subLocality".asInstanceOf[subLocality]
  
  @js.native
  sealed trait supports3DS
    extends StObject
       with ApplePayMerchantCapability
  inline def supports3DS: supports3DS = "supports3DS".asInstanceOf[supports3DS]
  
  @js.native
  sealed trait supportsCredit
    extends StObject
       with ApplePayMerchantCapability
  inline def supportsCredit: supportsCredit = "supportsCredit".asInstanceOf[supportsCredit]
  
  @js.native
  sealed trait supportsDebit
    extends StObject
       with ApplePayMerchantCapability
  inline def supportsDebit: supportsDebit = "supportsDebit".asInstanceOf[supportsDebit]
  
  @js.native
  sealed trait supportsEMV
    extends StObject
       with ApplePayMerchantCapability
  inline def supportsEMV: supportsEMV = "supportsEMV".asInstanceOf[supportsEMV]
  
  @js.native
  sealed trait suspended
    extends StObject
       with ApplePayPaymentPassActivationState
  inline def suspended: suspended = "suspended".asInstanceOf[suspended]
  
  @js.native
  sealed trait unknown
    extends StObject
       with ApplePayErrorCode
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
}
