package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/transactions", "Cart")
@js.native
/**
  * Constructor for Cart.
  *
  * @param cartId Optional unique identifier for the cart.
  */
class Cart () extends js.Object {
  def this(cartId: java.lang.String) = this()
  /**
    * ID for the cart. Optional.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * Items held in the order cart.
    */
  var lineItems: js.Array[LineItem] = js.native
  /**
    * Merchant providing the cart.
    */
  var merchant: js.UndefOr[js.Object] = js.native
  /**
    * Optional notes about the cart.
    */
  var notes: js.UndefOr[java.lang.String] = js.native
  /**
    * Non-line items.
    */
  var otherItems: js.Array[LineItem] = js.native
  /**
    * Adds a single item or list of items to the cart.
    *
    * @param items Line Items to add.
    * @return Returns current constructed Cart.
    */
  def addLineItems(items: LineItem): Cart = js.native
  def addLineItems(items: js.Array[LineItem]): Cart = js.native
  /**
    * Adds a single item or list of items to the non-items list of this cart.
    *
    * @param items Line Items to add.
    * @return Returns current constructed Cart.
    */
  def addOtherItems(items: LineItem): Cart = js.native
  def addOtherItems(items: js.Array[LineItem]): Cart = js.native
  /**
    * Set the merchant for this cart.
    *
    * @param id Merchant ID.
    * @param name Name of the merchant.
    * @return Returns current constructed Cart.
    */
  def setMerchant(id: java.lang.String, name: java.lang.String): Cart = js.native
  /**
    * Set the notes for this cart.
    *
    * @param notes Notes.
    * @return Returns current constructed Cart.
    */
  def setNotes(notes: java.lang.String): Cart = js.native
}

