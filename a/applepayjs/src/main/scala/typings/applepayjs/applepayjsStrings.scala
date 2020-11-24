package typings.applepayjs

import typings.applepayjs.ApplePayJS.ApplePayContactField
import typings.applepayjs.ApplePayJS.ApplePayErrorCode
import typings.applepayjs.ApplePayJS.ApplePayErrorContactField
import typings.applepayjs.ApplePayJS.ApplePayLineItemType
import typings.applepayjs.ApplePayJS.ApplePayMerchantCapability
import typings.applepayjs.ApplePayJS.ApplePayPaymentMethodType
import typings.applepayjs.ApplePayJS.ApplePayPaymentPassActivationState
import typings.applepayjs.ApplePayJS.ApplePayShippingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applepayjsStrings {
  
  @scala.inline
  def activated: activated = "activated".asInstanceOf[activated]
  
  @scala.inline
  def activating: activating = "activating".asInstanceOf[activating]
  
  @scala.inline
  def addressLines: addressLines = "addressLines".asInstanceOf[addressLines]
  
  @scala.inline
  def addressUnserviceable: addressUnserviceable = "addressUnserviceable".asInstanceOf[addressUnserviceable]
  
  @scala.inline
  def administrativeArea: administrativeArea = "administrativeArea".asInstanceOf[administrativeArea]
  
  @scala.inline
  def billingContactInvalid: billingContactInvalid = "billingContactInvalid".asInstanceOf[billingContactInvalid]
  
  @scala.inline
  def country: country = "country".asInstanceOf[country]
  
  @scala.inline
  def countryCode: countryCode = "countryCode".asInstanceOf[countryCode]
  
  @scala.inline
  def credit: credit = "credit".asInstanceOf[credit]
  
  @scala.inline
  def deactivated: deactivated = "deactivated".asInstanceOf[deactivated]
  
  @scala.inline
  def debit: debit = "debit".asInstanceOf[debit]
  
  @scala.inline
  def delivery: delivery = "delivery".asInstanceOf[delivery]
  
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @scala.inline
  def emailAddress: emailAddress = "emailAddress".asInstanceOf[emailAddress]
  
  @scala.inline
  def `final`: `final` = "final".asInstanceOf[`final`]
  
  @scala.inline
  def locality: locality = "locality".asInstanceOf[locality]
  
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @scala.inline
  def phone: phone = "phone".asInstanceOf[phone]
  
  @scala.inline
  def phoneNumber: phoneNumber = "phoneNumber".asInstanceOf[phoneNumber]
  
  @scala.inline
  def phoneticName: phoneticName = "phoneticName".asInstanceOf[phoneticName]
  
  @scala.inline
  def postalAddress: postalAddress = "postalAddress".asInstanceOf[postalAddress]
  
  @scala.inline
  def postalCode: postalCode = "postalCode".asInstanceOf[postalCode]
  
  @scala.inline
  def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  
  @scala.inline
  def requiresActivation: requiresActivation = "requiresActivation".asInstanceOf[requiresActivation]
  
  @scala.inline
  def servicePickup: servicePickup = "servicePickup".asInstanceOf[servicePickup]
  
  @scala.inline
  def shipping: shipping = "shipping".asInstanceOf[shipping]
  
  @scala.inline
  def shippingContactInvalid: shippingContactInvalid = "shippingContactInvalid".asInstanceOf[shippingContactInvalid]
  
  @scala.inline
  def store: store = "store".asInstanceOf[store]
  
  @scala.inline
  def storePickup: storePickup = "storePickup".asInstanceOf[storePickup]
  
  @scala.inline
  def subAdministrativeArea: subAdministrativeArea = "subAdministrativeArea".asInstanceOf[subAdministrativeArea]
  
  @scala.inline
  def subLocality: subLocality = "subLocality".asInstanceOf[subLocality]
  
  @scala.inline
  def supports3DS: supports3DS = "supports3DS".asInstanceOf[supports3DS]
  
  @scala.inline
  def supportsCredit: supportsCredit = "supportsCredit".asInstanceOf[supportsCredit]
  
  @scala.inline
  def supportsDebit: supportsDebit = "supportsDebit".asInstanceOf[supportsDebit]
  
  @scala.inline
  def supportsEMV: supportsEMV = "supportsEMV".asInstanceOf[supportsEMV]
  
  @scala.inline
  def suspended: suspended = "suspended".asInstanceOf[suspended]
  
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait activated extends ApplePayPaymentPassActivationState
  
  @js.native
  sealed trait activating extends ApplePayPaymentPassActivationState
  
  @js.native
  sealed trait addressLines extends ApplePayErrorContactField
  
  @js.native
  sealed trait addressUnserviceable extends ApplePayErrorCode
  
  @js.native
  sealed trait administrativeArea extends ApplePayErrorContactField
  
  @js.native
  sealed trait billingContactInvalid extends ApplePayErrorCode
  
  @js.native
  sealed trait country extends ApplePayErrorContactField
  
  @js.native
  sealed trait countryCode extends ApplePayErrorContactField
  
  @js.native
  sealed trait credit extends ApplePayPaymentMethodType
  
  @js.native
  sealed trait deactivated extends ApplePayPaymentPassActivationState
  
  @js.native
  sealed trait debit extends ApplePayPaymentMethodType
  
  @js.native
  sealed trait delivery extends ApplePayShippingType
  
  @js.native
  sealed trait email extends ApplePayContactField
  
  @js.native
  sealed trait emailAddress extends ApplePayErrorContactField
  
  @js.native
  sealed trait `final` extends ApplePayLineItemType
  
  @js.native
  sealed trait locality extends ApplePayErrorContactField
  
  @js.native
  sealed trait name
    extends ApplePayContactField
       with ApplePayErrorContactField
  
  @js.native
  sealed trait pending extends ApplePayLineItemType
  
  @js.native
  sealed trait phone extends ApplePayContactField
  
  @js.native
  sealed trait phoneNumber extends ApplePayErrorContactField
  
  @js.native
  sealed trait phoneticName
    extends ApplePayContactField
       with ApplePayErrorContactField
  
  @js.native
  sealed trait postalAddress
    extends ApplePayContactField
       with ApplePayErrorContactField
  
  @js.native
  sealed trait postalCode extends ApplePayErrorContactField
  
  @js.native
  sealed trait prepaid extends ApplePayPaymentMethodType
  
  @js.native
  sealed trait requiresActivation extends ApplePayPaymentPassActivationState
  
  @js.native
  sealed trait servicePickup extends ApplePayShippingType
  
  @js.native
  sealed trait shipping extends ApplePayShippingType
  
  @js.native
  sealed trait shippingContactInvalid extends ApplePayErrorCode
  
  @js.native
  sealed trait store extends ApplePayPaymentMethodType
  
  @js.native
  sealed trait storePickup extends ApplePayShippingType
  
  @js.native
  sealed trait subAdministrativeArea extends ApplePayErrorContactField
  
  @js.native
  sealed trait subLocality extends ApplePayErrorContactField
  
  @js.native
  sealed trait supports3DS extends ApplePayMerchantCapability
  
  @js.native
  sealed trait supportsCredit extends ApplePayMerchantCapability
  
  @js.native
  sealed trait supportsDebit extends ApplePayMerchantCapability
  
  @js.native
  sealed trait supportsEMV extends ApplePayMerchantCapability
  
  @js.native
  sealed trait suspended extends ApplePayPaymentPassActivationState
  
  @js.native
  sealed trait unknown extends ApplePayErrorCode
}
