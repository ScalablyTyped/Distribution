package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CardNetwork extends js.Object

/**
  * List of transaction card networks available when paying with Google.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.CardNetwork")
@js.native
object CardNetwork extends js.Object {
  /**
    * American Express.
    */
  @js.native
  sealed trait AMEX extends CardNetwork
  
  /**
    * Discover.
    */
  @js.native
  sealed trait DISCOVER extends CardNetwork
  
  /**
    * JCB.
    */
  @js.native
  sealed trait JCB extends CardNetwork
  
  /**
    * Master Card.
    */
  @js.native
  sealed trait MASTERCARD extends CardNetwork
  
  /**
    * Unspecified.
    */
  @js.native
  sealed trait UNSPECIFIED extends CardNetwork
  
  /**
    * Visa.
    */
  @js.native
  sealed trait VISA extends CardNetwork
  
  /* 1 */ val AMEX: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.CardNetwork.AMEX with Double = js.native
  /* 2 */ val DISCOVER: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.CardNetwork.DISCOVER with Double = js.native
  /* 5 */ val JCB: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.CardNetwork.JCB with Double = js.native
  /* 3 */ val MASTERCARD: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.CardNetwork.MASTERCARD with Double = js.native
  /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.CardNetwork.UNSPECIFIED with Double = js.native
  /* 4 */ val VISA: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.CardNetwork.VISA with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CardNetwork with Double] = js.native
}

