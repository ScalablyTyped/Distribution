package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaymentMethodTokenizationType extends js.Object

/**
  * List of possible tokenization types for the payment method
  */
@JSImport("actions-on-google/transactions", "TransactionValues.PaymentMethodTokenizationType")
@js.native
object PaymentMethodTokenizationType extends js.Object {
  /**
    * Allows payment service to pass public key for payment info encryption and receive encrypted
    * response.
    */
  @js.native
  sealed trait DIRECT extends PaymentMethodTokenizationType
  
  /**
    * Use external payment gateway tokenization API to tokenize selected payment method.
    */
  @js.native
  sealed trait PAYMENT_GATEWAY extends PaymentMethodTokenizationType
  
  /**
    * Unspecified tokenization type.
    */
  @js.native
  sealed trait UNSPECIFIED_TOKENIZATION_TYPE extends PaymentMethodTokenizationType
  
  /* 2 */ val DIRECT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentMethodTokenizationType.DIRECT with Double = js.native
  /* 1 */ val PAYMENT_GATEWAY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentMethodTokenizationType.PAYMENT_GATEWAY with Double = js.native
  /* 0 */ val UNSPECIFIED_TOKENIZATION_TYPE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentMethodTokenizationType.UNSPECIFIED_TOKENIZATION_TYPE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PaymentMethodTokenizationType with Double] = js.native
}

