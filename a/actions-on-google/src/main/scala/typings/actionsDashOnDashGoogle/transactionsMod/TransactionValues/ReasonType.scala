package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReasonType extends js.Object

/**
  * List of possible types of order rejection.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.ReasonType")
@js.native
object ReasonType extends js.Object {
  /**
    * Payment was declined.
    */
  @js.native
  sealed trait PAYMENT_DECLINED extends ReasonType
  
  /**
    * Unknown
    */
  @js.native
  sealed trait UNKNOWN extends ReasonType
  
  /* 1 */ val PAYMENT_DECLINED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ReasonType.PAYMENT_DECLINED with Double = js.native
  /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ReasonType.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReasonType with Double] = js.native
}

