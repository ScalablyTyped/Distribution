package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PaymentType extends js.Object

/**
  * List of possible item types.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.PaymentType")
@js.native
object PaymentType extends js.Object {
  /**
    * Bank.
    */
  @js.native
  sealed trait BANK extends PaymentType
  
  /**
    * Gift card.
    */
  @js.native
  sealed trait GIFT_CARD extends PaymentType
  
  /**
    * Loyalty program.
    */
  @js.native
  sealed trait LOYALTY_PROGRAM extends PaymentType
  
  /**
    * On order fulfillment, such as cash on delivery.
    */
  @js.native
  sealed trait ON_FULFILLMENT extends PaymentType
  
  /**
    * Payment card.
    */
  @js.native
  sealed trait PAYMENT_CARD extends PaymentType
  
  /**
    * Unspecified.
    */
  @js.native
  sealed trait UNSPECIFIED extends PaymentType
  
  /* 2 */ val BANK: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentType.BANK with Double = js.native
  /* 5 */ val GIFT_CARD: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentType.GIFT_CARD with Double = js.native
  /* 3 */ val LOYALTY_PROGRAM: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentType.LOYALTY_PROGRAM with Double = js.native
  /* 4 */ val ON_FULFILLMENT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentType.ON_FULFILLMENT with Double = js.native
  /* 1 */ val PAYMENT_CARD: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentType.PAYMENT_CARD with Double = js.native
  /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PaymentType.UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PaymentType with Double] = js.native
}

