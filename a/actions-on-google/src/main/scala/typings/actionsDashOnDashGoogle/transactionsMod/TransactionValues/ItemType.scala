package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ItemType extends js.Object

/**
  * List of possible item types.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.ItemType")
@js.native
object ItemType extends js.Object {
  /**
    * Delivery
    */
  @js.native
  sealed trait DELIVERY extends ItemType
  
  /**
    * Discount
    */
  @js.native
  sealed trait DISCOUNT extends ItemType
  
  /**
    * Fee. For everything else, there's fee.
    */
  @js.native
  sealed trait FEE extends ItemType
  
  /**
    * Gratuity
    */
  @js.native
  sealed trait GRATUITY extends ItemType
  
  /**
    * Regular.
    */
  @js.native
  sealed trait REGULAR extends ItemType
  
  /**
    * Subtotal
    */
  @js.native
  sealed trait SUBTOTAL extends ItemType
  
  /**
    * Tax.
    */
  @js.native
  sealed trait TAX extends ItemType
  
  /**
    * Unspecified.
    */
  @js.native
  sealed trait UNSPECIFIED extends ItemType
  
  /* 5 */ val DELIVERY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ItemType.DELIVERY with Double = js.native
  /* 3 */ val DISCOUNT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ItemType.DISCOUNT with Double = js.native
  /* 7 */ val FEE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ItemType.FEE with Double = js.native
  /* 4 */ val GRATUITY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ItemType.GRATUITY with Double = js.native
  /* 1 */ val REGULAR: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ItemType.REGULAR with Double = js.native
  /* 6 */ val SUBTOTAL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ItemType.SUBTOTAL with Double = js.native
  /* 2 */ val TAX: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ItemType.TAX with Double = js.native
  /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ItemType.UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ItemType with Double] = js.native
}

