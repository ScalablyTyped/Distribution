package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RejectionType extends js.Object

/**
  * List of possible types of order rejection.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.RejectionType")
@js.native
object RejectionType extends js.Object {
  /**
    * Payment was declined.
    */
  @js.native
  sealed trait PAYMENT_DECLINED extends RejectionType
  
  /**
    * Unknown
    */
  @js.native
  sealed trait UNKNOWN extends RejectionType
  
  /* 1 */ val PAYMENT_DECLINED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.RejectionType.PAYMENT_DECLINED with Double = js.native
  /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.RejectionType.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RejectionType with Double] = js.native
}

