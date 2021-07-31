package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a provisioned payment card for Apple Pay payments.
  */
trait ApplePayPaymentPass extends StObject {
  
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
    primaryAccountNumberSuffix: String
  ): ApplePayPaymentPass = {
    val __obj = js.Dynamic.literal(activationState = activationState.asInstanceOf[js.Any], primaryAccountIdentifier = primaryAccountIdentifier.asInstanceOf[js.Any], primaryAccountNumberSuffix = primaryAccountNumberSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentPass]
  }
  
  @scala.inline
  implicit class ApplePayPaymentPassMutableBuilder[Self <: ApplePayPaymentPass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationState(value: ApplePayPaymentPassActivationState): Self = StObject.set(x, "activationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceAccountIdentifier(value: String): Self = StObject.set(x, "deviceAccountIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceAccountIdentifierUndefined: Self = StObject.set(x, "deviceAccountIdentifier", js.undefined)
    
    @scala.inline
    def setDeviceAccountNumberSuffix(value: String): Self = StObject.set(x, "deviceAccountNumberSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceAccountNumberSuffixUndefined: Self = StObject.set(x, "deviceAccountNumberSuffix", js.undefined)
    
    @scala.inline
    def setPrimaryAccountIdentifier(value: String): Self = StObject.set(x, "primaryAccountIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryAccountNumberSuffix(value: String): Self = StObject.set(x, "primaryAccountNumberSuffix", value.asInstanceOf[js.Any])
  }
}
