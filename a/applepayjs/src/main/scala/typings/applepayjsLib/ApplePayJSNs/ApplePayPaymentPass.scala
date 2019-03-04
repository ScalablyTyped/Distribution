package typings
package applepayjsLib.ApplePayJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a provisioned payment card for Apple Pay payments.
  */
trait ApplePayPaymentPass extends js.Object {
  /**
    * The activation state of the pass.
    */
  var activationState: ApplePayPaymentPassActivationState
  /**
    * The unique identifier for the device-specific account number.
    */
  var deviceAccountIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A version of the device account number suitable for display in your UI.
    */
  var deviceAccountNumberSuffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique identifier for the primary account number for the payment card.
    */
  var primaryAccountIdentifier: java.lang.String
  /**
    * A version of the primary account number suitable for display in your UI.
    */
  var primaryAccountNumberSuffix: java.lang.String
}

object ApplePayPaymentPass {
  @scala.inline
  def apply(
    activationState: ApplePayPaymentPassActivationState,
    primaryAccountIdentifier: java.lang.String,
    primaryAccountNumberSuffix: java.lang.String,
    deviceAccountIdentifier: java.lang.String = null,
    deviceAccountNumberSuffix: java.lang.String = null
  ): ApplePayPaymentPass = {
    val __obj = js.Dynamic.literal(activationState = activationState, primaryAccountIdentifier = primaryAccountIdentifier, primaryAccountNumberSuffix = primaryAccountNumberSuffix)
    if (deviceAccountIdentifier != null) __obj.updateDynamic("deviceAccountIdentifier")(deviceAccountIdentifier)
    if (deviceAccountNumberSuffix != null) __obj.updateDynamic("deviceAccountNumberSuffix")(deviceAccountNumberSuffix)
    __obj.asInstanceOf[ApplePayPaymentPass]
  }
}

