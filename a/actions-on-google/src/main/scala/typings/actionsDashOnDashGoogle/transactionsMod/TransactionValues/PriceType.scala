package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PriceType extends js.Object

/**
  * List of price types.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.PriceType")
@js.native
object PriceType extends js.Object {
  /**
    * Actual.
    */
  @js.native
  sealed trait ACTUAL extends PriceType
  
  /**
    * Estimate.
    */
  @js.native
  sealed trait ESTIMATE extends PriceType
  
  /**
    * Unknown.
    */
  @js.native
  sealed trait UNKNOWN extends PriceType
  
  /* 2 */ val ACTUAL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PriceType.ACTUAL with Double = js.native
  /* 1 */ val ESTIMATE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PriceType.ESTIMATE with Double = js.native
  /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PriceType.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PriceType with Double] = js.native
}

