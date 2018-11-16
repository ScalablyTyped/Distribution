package typings
package actionsDashOnDashGoogleLib.transactionsMod

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
  def this(lineItemId: java.lang.String, name: java.lang.String) = this()
  /**
       * Description for the item.
       */
  var description: js.UndefOr[java.lang.String] = js.native
  /**
       * Item ID.
       */
  var id: java.lang.String = js.native
  /**
       * Image of the item.
       */
  var image: js.UndefOr[actionsDashOnDashGoogleLib.responseDashBuilderMod.Image] = js.native
  /**
       * Name of the item.
       */
  var name: java.lang.String = js.native
  /**
       * Offer ID for the item.
       */
  var offerId: js.UndefOr[java.lang.String] = js.native
  /**
       * Item price.
       */
  var price: js.UndefOr[Price] = js.native
  /**
       * Quantity of the item.
       */
  var quantity: js.UndefOr[scala.Double] = js.native
  /**
       * Sublines for current item. Only valid if item type is REGULAR.
       */
  var subLines: js.UndefOr[js.Array[java.lang.String | LineItem]] = js.native
  /**
       * Type of the item. One of TransactionValues.LineItemType.
       */
  var `type`: js.UndefOr[actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType] = js.native
  /**
       * Adds a single item or list of items or notes to the sublines. Only valid
       * if item type is REGULAR.
       *
       * @param items Sublines to add.
       * @return Returns current constructed LineItem.
       */
  def addSublines(items: LineItem): LineItem = js.native
  /**
       * Adds a single item or list of items or notes to the sublines. Only valid
       * if item type is REGULAR.
       *
       * @param items Sublines to add.
       * @return Returns current constructed LineItem.
       */
  def addSublines(items: java.lang.String): LineItem = js.native
  /**
       * Adds a single item or list of items or notes to the sublines. Only valid
       * if item type is REGULAR.
       *
       * @param items Sublines to add.
       * @return Returns current constructed LineItem.
       */
  def addSublines(items: js.Array[java.lang.String | LineItem]): LineItem = js.native
  /**
       * Set the description of the item.
       *
       * @param description Description of the item.
       * @return Returns current constructed LineItem.
       */
  def setDescription(description: java.lang.String): LineItem = js.native
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
  def setImage(url: java.lang.String, accessibilityText: java.lang.String): LineItem = js.native
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
  def setImage(url: java.lang.String, accessibilityText: java.lang.String, width: scala.Double): LineItem = js.native
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
  def setImage(
    url: java.lang.String,
    accessibilityText: java.lang.String,
    width: scala.Double,
    height: scala.Double
  ): LineItem = js.native
  /**
       * Set the Offer ID of the item.
       *
       * @param offerId Offer ID of the item.
       * @return Returns current constructed LineItem.
       */
  def setOfferId(offerId: java.lang.String): LineItem = js.native
  /**
       * Sets the price of this item.
       *
       * @param priceType One of TransactionValues.PriceType.
       * @param currencyCode Currency code of price.
       * @param units Unit count of price.
       * @param nanos Partial unit count of price.
       * @return Returns current constructed LineItem.
       */
  def setPrice(
    priceType: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType,
    currencyCode: java.lang.String,
    units: scala.Double
  ): LineItem = js.native
  /**
       * Sets the price of this item.
       *
       * @param priceType One of TransactionValues.PriceType.
       * @param currencyCode Currency code of price.
       * @param units Unit count of price.
       * @param nanos Partial unit count of price.
       * @return Returns current constructed LineItem.
       */
  def setPrice(
    priceType: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType,
    currencyCode: java.lang.String,
    units: scala.Double,
    nanos: scala.Double
  ): LineItem = js.native
  /**
       * Set the quantity of the item.
       *
       * @param quantity Quantity of the item.
       * @return Returns current constructed LineItem.
       */
  def setQuantity(quantity: scala.Double): LineItem = js.native
  /**
       * Set the type of the item.
       *
       * @param type Type of the item. One of TransactionValues.LineItemType.
       * @return Returns current constructed LineItem.
       */
  def setType(`type`: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType): LineItem = js.native
}

