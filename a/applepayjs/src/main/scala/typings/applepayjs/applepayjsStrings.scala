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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applepayjsStrings {
  
  @js.native
  sealed trait activated extends ApplePayPaymentPassActivationState
  @scala.inline
  def activated: activated = "activated".asInstanceOf[activated]
  
  @js.native
  sealed trait activating extends ApplePayPaymentPassActivationState
  @scala.inline
  def activating: activating = "activating".asInstanceOf[activating]
  
  @js.native
  sealed trait addressLines extends ApplePayErrorContactField
  @scala.inline
  def addressLines: addressLines = "addressLines".asInstanceOf[addressLines]
  
  @js.native
  sealed trait addressUnserviceable extends ApplePayErrorCode
  @scala.inline
  def addressUnserviceable: addressUnserviceable = "addressUnserviceable".asInstanceOf[addressUnserviceable]
  
  @js.native
  sealed trait administrativeArea extends ApplePayErrorContactField
  @scala.inline
  def administrativeArea: administrativeArea = "administrativeArea".asInstanceOf[administrativeArea]
  
  @js.native
  sealed trait billingContactInvalid extends ApplePayErrorCode
  @scala.inline
  def billingContactInvalid: billingContactInvalid = "billingContactInvalid".asInstanceOf[billingContactInvalid]
  
  @js.native
  sealed trait country extends ApplePayErrorContactField
  @scala.inline
  def country: country = "country".asInstanceOf[country]
  
  @js.native
  sealed trait countryCode extends ApplePayErrorContactField
  @scala.inline
  def countryCode: countryCode = "countryCode".asInstanceOf[countryCode]
  
  @js.native
  sealed trait credit extends ApplePayPaymentMethodType
  @scala.inline
  def credit: credit = "credit".asInstanceOf[credit]
  
  @js.native
  sealed trait deactivated extends ApplePayPaymentPassActivationState
  @scala.inline
  def deactivated: deactivated = "deactivated".asInstanceOf[deactivated]
  
  @js.native
  sealed trait debit extends ApplePayPaymentMethodType
  @scala.inline
  def debit: debit = "debit".asInstanceOf[debit]
  
  @js.native
  sealed trait delivery extends ApplePayShippingType
  @scala.inline
  def delivery: delivery = "delivery".asInstanceOf[delivery]
  
  @js.native
  sealed trait email extends ApplePayContactField
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait emailAddress extends ApplePayErrorContactField
  @scala.inline
  def emailAddress: emailAddress = "emailAddress".asInstanceOf[emailAddress]
  
  @js.native
  sealed trait `final` extends ApplePayLineItemType
  @scala.inline
  def `final`: `final` = "final".asInstanceOf[`final`]
  
  @js.native
  sealed trait locality extends ApplePayErrorContactField
  @scala.inline
  def locality: locality = "locality".asInstanceOf[locality]
  
  @js.native
  sealed trait name
    extends ApplePayContactField
       with ApplePayErrorContactField
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait pending extends ApplePayLineItemType
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait phone extends ApplePayContactField
  @scala.inline
  def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait phoneNumber extends ApplePayErrorContactField
  @scala.inline
  def phoneNumber: phoneNumber = "phoneNumber".asInstanceOf[phoneNumber]
  
  @js.native
  sealed trait phoneticName
    extends ApplePayContactField
       with ApplePayErrorContactField
  @scala.inline
  def phoneticName: phoneticName = "phoneticName".asInstanceOf[phoneticName]
  
  @js.native
  sealed trait postalAddress
    extends ApplePayContactField
       with ApplePayErrorContactField
  @scala.inline
  def postalAddress: postalAddress = "postalAddress".asInstanceOf[postalAddress]
  
  @js.native
  sealed trait postalCode extends ApplePayErrorContactField
  @scala.inline
  def postalCode: postalCode = "postalCode".asInstanceOf[postalCode]
  
  @js.native
  sealed trait prepaid extends ApplePayPaymentMethodType
  @scala.inline
  def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  
  @js.native
  sealed trait requiresActivation extends ApplePayPaymentPassActivationState
  @scala.inline
  def requiresActivation: requiresActivation = "requiresActivation".asInstanceOf[requiresActivation]
  
  @js.native
  sealed trait servicePickup extends ApplePayShippingType
  @scala.inline
  def servicePickup: servicePickup = "servicePickup".asInstanceOf[servicePickup]
  
  @js.native
  sealed trait shipping extends ApplePayShippingType
  @scala.inline
  def shipping: shipping = "shipping".asInstanceOf[shipping]
  
  @js.native
  sealed trait shippingContactInvalid extends ApplePayErrorCode
  @scala.inline
  def shippingContactInvalid: shippingContactInvalid = "shippingContactInvalid".asInstanceOf[shippingContactInvalid]
  
  @js.native
  sealed trait store extends ApplePayPaymentMethodType
  @scala.inline
  def store: store = "store".asInstanceOf[store]
  
  @js.native
  sealed trait storePickup extends ApplePayShippingType
  @scala.inline
  def storePickup: storePickup = "storePickup".asInstanceOf[storePickup]
  
  @js.native
  sealed trait subAdministrativeArea extends ApplePayErrorContactField
  @scala.inline
  def subAdministrativeArea: subAdministrativeArea = "subAdministrativeArea".asInstanceOf[subAdministrativeArea]
  
  @js.native
  sealed trait subLocality extends ApplePayErrorContactField
  @scala.inline
  def subLocality: subLocality = "subLocality".asInstanceOf[subLocality]
  
  @js.native
  sealed trait supports3DS extends ApplePayMerchantCapability
  @scala.inline
  def supports3DS: supports3DS = "supports3DS".asInstanceOf[supports3DS]
  
  @js.native
  sealed trait supportsCredit extends ApplePayMerchantCapability
  @scala.inline
  def supportsCredit: supportsCredit = "supportsCredit".asInstanceOf[supportsCredit]
  
  @js.native
  sealed trait supportsDebit extends ApplePayMerchantCapability
  @scala.inline
  def supportsDebit: supportsDebit = "supportsDebit".asInstanceOf[supportsDebit]
  
  @js.native
  sealed trait supportsEMV extends ApplePayMerchantCapability
  @scala.inline
  def supportsEMV: supportsEMV = "supportsEMV".asInstanceOf[supportsEMV]
  
  @js.native
  sealed trait suspended extends ApplePayPaymentPassActivationState
  @scala.inline
  def suspended: suspended = "suspended".asInstanceOf[suspended]
  
  @js.native
  sealed trait unknown extends ApplePayErrorCode
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
}
