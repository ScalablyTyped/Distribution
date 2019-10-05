package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineItemType extends js.Object

/**
  * List of possible item types.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.LineItemType")
@js.native
object LineItemType extends js.Object {
  /**
    * Delivery
    */
  @js.native
  sealed trait DELIVERY extends LineItemType
  
  /**
    * Discount
    */
  @js.native
  sealed trait DISCOUNT extends LineItemType
  
  /**
    * Fee. For everything else, there's fee.
    */
  @js.native
  sealed trait FEE extends LineItemType
  
  /**
    * Gratuity
    */
  @js.native
  sealed trait GRATUITY extends LineItemType
  
  /**
    * Regular.
    */
  @js.native
  sealed trait REGULAR extends LineItemType
  
  /**
    * Subtotal
    */
  @js.native
  sealed trait SUBTOTAL extends LineItemType
  
  /**
    * Tax.
    */
  @js.native
  sealed trait TAX extends LineItemType
  
  /**
    * Unspecified.
    */
  @js.native
  sealed trait UNSPECIFIED extends LineItemType
  
  /* 5 */ val DELIVERY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LineItemType.DELIVERY with Double = js.native
  /* 3 */ val DISCOUNT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LineItemType.DISCOUNT with Double = js.native
  /* 7 */ val FEE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LineItemType.FEE with Double = js.native
  /* 4 */ val GRATUITY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LineItemType.GRATUITY with Double = js.native
  /* 1 */ val REGULAR: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LineItemType.REGULAR with Double = js.native
  /* 6 */ val SUBTOTAL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LineItemType.SUBTOTAL with Double = js.native
  /* 2 */ val TAX: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LineItemType.TAX with Double = js.native
  /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LineItemType.UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineItemType with Double] = js.native
}

