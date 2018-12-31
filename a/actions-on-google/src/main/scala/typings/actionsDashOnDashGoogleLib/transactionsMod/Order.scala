package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/transactions", "Order")
@js.native
class Order protected () extends js.Object {
  /**
    * Constructor for Order.
    *
    * @param orderId Unique identifier for the order.
    */
  def this(orderId: java.lang.String) = this()
  /**
    * Cart for the order.
    */
  var cart: js.UndefOr[Cart] = js.native
  /**
    * Extensions for this order. Used for vertical-specific order attributes,
    * like times and locations.
    */
  var extension: js.UndefOr[js.Object] = js.native
  /**
    * ID for the order. Required.
    */
  var id: java.lang.String = js.native
  /**
    * Image for the order.
    */
  var image: js.UndefOr[actionsDashOnDashGoogleLib.responseDashBuilderMod.Image] = js.native
  /**
    * Items not held in the order cart.
    */
  var otherItems: js.Array[LineItem] = js.native
  /**
    * TOS for the order.
    */
  var termsOfServiceUrl: js.UndefOr[java.lang.String] = js.native
  /**
    * Total price for the order.
    */
  var totalPrice: js.UndefOr[Price] = js.native
  /**
    * Adds an associated location to the order. Up to 2 locations can be added.
    *
    * @param type One of TransactionValues.OrderLocationType.
    * @param location Location to add.
    * @return Returns current constructed Order.
    */
  def addLocation(
    `type`: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType,
    location: Location
  ): Order = js.native
  /**
    * Adds a single item or list of items to the non-cart items list.
    *
    * @param items Line Items to add.
    * @return Returns current constructed Order.
    */
  def addOtherItems(items: LineItem): Order = js.native
  def addOtherItems(items: js.Array[LineItem]): Order = js.native
  /**
    * Set the cart for this order.
    *
    * @param cart Cart for this order.
    * @return Returns current constructed Order.
    */
  def setCart(cart: Cart): Order = js.native
  /**
    * Sets the image for this order.
    *
    * @param url Image source URL.
    * @param accessibilityText Text to replace for image for
    *     accessibility.
    * @param width Width of the image.
    * @param height Height of the image.
    * @return Returns current constructed Order.
    */
  def setImage(url: java.lang.String, accessibilityText: java.lang.String): Order = js.native
  def setImage(url: java.lang.String, accessibilityText: java.lang.String, width: scala.Double): Order = js.native
  def setImage(
    url: java.lang.String,
    accessibilityText: java.lang.String,
    width: scala.Double,
    height: scala.Double
  ): Order = js.native
  /**
    * Set the TOS for this order.
    *
    * @param url String URL of the TOS.
    * @return Returns current constructed Order.
    */
  def setTermsOfService(url: java.lang.String): Order = js.native
  /**
    * Sets an associated time to the order.
    *
    * @param type One of TransactionValues.TimeType.
    * @param time Time to add. Time should be ISO 8601 representation
    *     of time value. Could be date, datetime, or duration.
    * @return Returns current constructed Order.
    */
  def setTime(
    `type`: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType,
    time: java.lang.String
  ): Order = js.native
  /**
    * Sets the total price for this order.
    *
    * @param priceType One of TransactionValues.PriceType.
    * @param currencyCode Currency code of price.
    * @param units Unit count of price.
    * @param nanos Partial unit count of price.
    * @return Returns current constructed Order.
    */
  def setTotalPrice(
    priceType: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType,
    currencyCode: java.lang.String,
    units: scala.Double
  ): Order = js.native
  def setTotalPrice(
    priceType: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType,
    currencyCode: java.lang.String,
    units: scala.Double,
    nanos: scala.Double
  ): Order = js.native
}

