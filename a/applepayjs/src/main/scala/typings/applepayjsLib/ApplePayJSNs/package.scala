package typings
package applepayjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ApplePayJSNs {
  /**
       * Field names used for requesting contact information in a payment request.
       */
  type ApplePayContactField = applepayjsLib.applepayjsLibStrings.email | applepayjsLib.applepayjsLibStrings.name | applepayjsLib.applepayjsLibStrings.phone | applepayjsLib.applepayjsLibStrings.postalAddress | applepayjsLib.applepayjsLibStrings.phoneticName
  /**
       * The error code that indicates whether an error on the payment sheet is for shipping or billing information, or for another kind of error.
       */
  type ApplePayErrorCode = applepayjsLib.applepayjsLibStrings.shippingContactInvalid | applepayjsLib.applepayjsLibStrings.billingContactInvalid | applepayjsLib.applepayjsLibStrings.addressUnserviceable | applepayjsLib.applepayjsLibStrings.unknown
  /**
       * Names of the fields in the shipping or billing contact information, used to locate errors in the payment sheet.
       */
  type ApplePayErrorContactField = applepayjsLib.applepayjsLibStrings.phoneNumber | applepayjsLib.applepayjsLibStrings.emailAddress | applepayjsLib.applepayjsLibStrings.name | applepayjsLib.applepayjsLibStrings.phoneticName | applepayjsLib.applepayjsLibStrings.postalAddress | applepayjsLib.applepayjsLibStrings.addressLines | applepayjsLib.applepayjsLibStrings.locality | applepayjsLib.applepayjsLibStrings.subLocality | applepayjsLib.applepayjsLibStrings.postalCode | applepayjsLib.applepayjsLibStrings.administrativeArea | applepayjsLib.applepayjsLibStrings.subAdministrativeArea | applepayjsLib.applepayjsLibStrings.country | applepayjsLib.applepayjsLibStrings.countryCode
  /**
       * A type that indicates whether a line item is final or pending.
       */
  type ApplePayLineItemType = applepayjsLib.applepayjsLibStrings.`final` | applepayjsLib.applepayjsLibStrings.pending
  /**
       * The payment capabilities supported by the merchant.
       */
  type ApplePayMerchantCapability = applepayjsLib.applepayjsLibStrings.supports3DS | applepayjsLib.applepayjsLibStrings.supportsEMV | applepayjsLib.applepayjsLibStrings.supportsCredit | applepayjsLib.applepayjsLibStrings.supportsDebit
  /**
       * A payment card's type of payment.
       */
  type ApplePayPaymentMethodType = applepayjsLib.applepayjsLibStrings.debit | applepayjsLib.applepayjsLibStrings.credit | applepayjsLib.applepayjsLibStrings.prepaid | applepayjsLib.applepayjsLibStrings.store
  /**
       * Payment pass activation states.
       */
  type ApplePayPaymentPassActivationState = applepayjsLib.applepayjsLibStrings.activated | applepayjsLib.applepayjsLibStrings.requiresActivation | applepayjsLib.applepayjsLibStrings.activating | applepayjsLib.applepayjsLibStrings.suspended | applepayjsLib.applepayjsLibStrings.deactivated
  /**
       * A type that indicates how purchased items are to be shipped.
       */
  type ApplePayShippingType = applepayjsLib.applepayjsLibStrings.shipping | applepayjsLib.applepayjsLibStrings.delivery | applepayjsLib.applepayjsLibStrings.storePickup | applepayjsLib.applepayjsLibStrings.servicePickup
}
