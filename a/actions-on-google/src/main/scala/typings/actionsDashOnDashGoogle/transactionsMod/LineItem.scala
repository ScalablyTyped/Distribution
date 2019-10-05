package typings.actionsDashOnDashGoogle.transactionsMod

import typings.actionsDashOnDashGoogle.responseDashBuilderMod.Image
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LineItemType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.PriceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/transactions", "LineItem")
@js.native
class LineItem protected () extends js.Object {
  /**
    * Constructor for LineItem.
    *
    * @param lineItemId Unique identifier for the item.
    * @param name Name of the item.
    */
  def this(lineItemId: String, name: String) = this()
  /**
    * Description for the item.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Item ID.
    */
  var id: String = js.native
  /**
    * Image of the item.
    */
  var image: js.UndefOr[Image] = js.native
  /**
    * Name of the item.
    */
  var name: String = js.native
  /**
    * Offer ID for the item.
    */
  var offerId: js.UndefOr[String] = js.native
  /**
    * Item price.
    */
  var price: js.UndefOr[Price] = js.native
  /**
    * Quantity of the item.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * Sublines for current item. Only valid if item type is REGULAR.
    */
  var subLines: js.UndefOr[js.Array[String | LineItem]] = js.native
  /**
    * Type of the item. One of TransactionValues.LineItemType.
    */
  var `type`: js.UndefOr[LineItemType] = js.native
  /**
    * Adds a single item or list of items or notes to the sublines. Only valid
    * if item type is REGULAR.
    *
    * @param items Sublines to add.
    * @return Returns current constructed LineItem.
    */
  def addSublines(items: String): LineItem = js.native
  def addSublines(items: js.Array[String | LineItem]): LineItem = js.native
  def addSublines(items: LineItem): LineItem = js.native
  /**
    * Set the description of the item.
    *
    * @param description Description of the item.
    * @return Returns current constructed LineItem.
    */
  def setDescription(description: String): LineItem = js.native
  /**
    * Sets the image for this item.
    *
    * @param url Image source URL.
    * @param accessibilityText Text to replace for image for
    *     accessibility.
    * @param width Width of the image.
    * @param height Height of the image.
    * @return Returns current constructed LineItem.
    */
  def setImage(url: String, accessibilityText: String): LineItem = js.native
  def setImage(url: String, accessibilityText: String, width: Double): LineItem = js.native
  def setImage(url: String, accessibilityText: String, width: Double, height: Double): LineItem = js.native
  /**
    * Set the Offer ID of the item.
    *
    * @param offerId Offer ID of the item.
    * @return Returns current constructed LineItem.
    */
  def setOfferId(offerId: String): LineItem = js.native
  /**
    * Sets the price of this item.
    *
    * @param priceType One of TransactionValues.PriceType.
    * @param currencyCode Currency code of price.
    * @param units Unit count of price.
    * @param nanos Partial unit count of price.
    * @return Returns current constructed LineItem.
    */
  def setPrice(priceType: PriceType, currencyCode: String, units: Double): LineItem = js.native
  def setPrice(priceType: PriceType, currencyCode: String, units: Double, nanos: Double): LineItem = js.native
  /**
    * Set the quantity of the item.
    *
    * @param quantity Quantity of the item.
    * @return Returns current constructed LineItem.
    */
  def setQuantity(quantity: Double): LineItem = js.native
  /**
    * Set the type of the item.
    *
    * @param type Type of the item. One of TransactionValues.LineItemType.
    * @return Returns current constructed LineItem.
    */
  def setType(`type`: LineItemType): LineItem = js.native
}

