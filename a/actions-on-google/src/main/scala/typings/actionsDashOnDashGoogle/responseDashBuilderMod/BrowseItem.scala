package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/response-builder", "BrowseItem")
@js.native
/**
  * Constructor for BrowseItem. Accepts a title and URL for the Browse Item
  * card.
  *
  * @param title The title of the Browse Item card.
  * @param url The URL of the link opened by clicking the  Browse Item card.
  */
class BrowseItem () extends js.Object {
  def this(title: String) = this()
  def this(title: String, url: String) = this()
  /**
    * Description text of the item. Optional.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Footer text of the item. Optional.
    */
  var footer: js.UndefOr[String] = js.native
  /**
    * Image to show on item. Optional.
    */
  var image: js.UndefOr[Image] = js.native
  /**
    * Url to that clicking the card opens. Optional.
    */
  var openUrlAction: js.UndefOr[js.Object] = js.native
  /**
    * Title of the browse item. Required.
    */
  var title: String = js.native
  /**
    * Sets the description for this Browse Item.
    *
    * @param description Description to show on item.
    * @return Returns current constructed BrowseItem.
    */
  def setDescription(description: String): BrowseItem = js.native
  /**
    * Sets the footer for this Browse Item.
    *
    * @param footerText text to show on item.
    * @return Returns current constructed BrowseItem.
    */
  def setFooter(footerText: String): BrowseItem = js.native
  /**
    * Sets the image for this Browse Item.
    *
    * @param url Image source URL.
    * @param accessibilityText Text to replace for image for accessibility.
    * @param width Width of the image.
    * @param height Height of the image.
    * @return Returns current constructed BrowseItem.
    */
  def setImage(url: String, accessibilityText: String): BrowseItem = js.native
  def setImage(url: String, accessibilityText: String, width: Double): BrowseItem = js.native
  def setImage(url: String, accessibilityText: String, width: Double, height: Double): BrowseItem = js.native
  /**
    * Sets the Open URL action - which includes the url and possibly the typeHint
    *
    * @param url Image source URL.
    * @param urlTypeHint One of the typeHints enumerated by this.urlTypeHints()
    * @return Returns the current constructed BrowseItem
    */
  def setOpenUrlAction(url: String): BrowseItem = js.native
  def setOpenUrlAction(url: String, urlTypeHint: String): BrowseItem = js.native
  /**
    * Sets the title for this Browse Item.
    *
    * @param title Title to show on item.
    * @return Returns current constructed BrowseItem.
    */
  def setTitle(title: String): BrowseItem = js.native
  /**
    * Sets the URL target of the BrowseItem card
    *
    * @param url Image source URL.
    * @return Returns the current constructed BrowseItem
    */
  def setUrl(url: String): BrowseItem = js.native
  /**
    * Sets the URL type hint for the BrowseItem card
    *
    * @param urlTypeHint One of the typeHints enumerated by this.urlTypeHints()
    * @return Returns the current constructed BrowseItem
    */
  def setUrlTypeHint(urlTypeHint: String): BrowseItem = js.native
  /**
    * @return Returns the possible valid values for URL type hints
    */
  def urlTypeHints(): js.Object = js.native
}

