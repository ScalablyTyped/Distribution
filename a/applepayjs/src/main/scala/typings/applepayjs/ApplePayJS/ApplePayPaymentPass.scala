package typings.applepayjs.ApplePayJS

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
  var deviceAccountIdentifier: js.UndefOr[String] = js.undefined
  /**
    * A version of the device account number suitable for display in your UI.
    */
  var deviceAccountNumberSuffix: js.UndefOr[String] = js.undefined
  /**
    * The unique identifier for the primary account number for the payment card.
    */
  var primaryAccountIdentifier: String
  /**
    * A version of the primary account number suitable for display in your UI.
    */
  var primaryAccountNumberSuffix: String
}

object ApplePayPaymentPass {
  @scala.inline
  def apply(
    activationState: ApplePayPaymentPassActivationState,
    primaryAccountIdentifier: String,
    primaryAccountNumberSuffix: String,
    deviceAccountIdentifier: String = null,
    deviceAccountNumberSuffix: String = null
  ): ApplePayPaymentPass = {
    val __obj = js.Dynamic.literal(activationState = activationState.asInstanceOf[js.Any], primaryAccountIdentifier = primaryAccountIdentifier.asInstanceOf[js.Any], primaryAccountNumberSuffix = primaryAccountNumberSuffix.asInstanceOf[js.Any])
    if (deviceAccountIdentifier != null) __obj.updateDynamic("deviceAccountIdentifier")(deviceAccountIdentifier.asInstanceOf[js.Any])
    if (deviceAccountNumberSuffix != null) __obj.updateDynamic("deviceAccountNumberSuffix")(deviceAccountNumberSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentPass]
  }
}

