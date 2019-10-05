package typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleMod.Transactions.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of possible tokenization types for the payment method
  */
@JSImport("actions-on-google", "Transactions.TransactionValues.PaymentMethodTokenizationType")
@js.native
object PaymentMethodTokenizationType extends js.Object {
  /* 2 */ val DIRECT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentMethodTokenizationType.DIRECT with Double = js.native
  /* 1 */ val PAYMENT_GATEWAY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentMethodTokenizationType.PAYMENT_GATEWAY with Double = js.native
  /* 0 */ val UNSPECIFIED_TOKENIZATION_TYPE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentMethodTokenizationType.UNSPECIFIED_TOKENIZATION_TYPE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentMethodTokenizationType with Double
  ] = js.native
}

