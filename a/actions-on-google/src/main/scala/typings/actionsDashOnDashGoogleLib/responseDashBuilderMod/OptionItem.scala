package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/response-builder", "OptionItem")
@js.native
/**
  * Constructor for OptionItem. Accepts optional OptionItem to clone.
  *
  * @param optionItem Optional OptionItem to clone.
  */
class OptionItem () extends js.Object {
  def this(optionItem: OptionItem) = this()
  /**
    * Description text of the item. Optional.
    */
  var description: js.UndefOr[java.lang.String] = js.native
  /**
    * Image to show on item. Optional.
    */
  var image: js.UndefOr[Image] = js.native
  /**
    * Option info of the option item. Required.
    */
  var optionInfo: OptionInfo = js.native
  /**
    * Title of the option item. Required.
    */
  var title: java.lang.String = js.native
  /**
    * Adds a single synonym or list of synonyms to item.
    *
    * @param synonyms Either a single string synonyms
    *     or list of synonyms to add.
    * @return Returns current constructed OptionItem.
    */
  def addSynonyms(synonyms: java.lang.String): OptionItem = js.native
  def addSynonyms(synonyms: js.Array[java.lang.String]): OptionItem = js.native
  /**
    * Sets the description for this Option Item.
    *
    * @param description Description to show on item.
    * @return Returns current constructed OptionItem.
    */
  def setDescription(description: java.lang.String): OptionItem = js.native
  /**
    * Sets the image for this Option Item.
    *
    * @param url Image source URL.
    * @param accessibilityText Text to replace for image for
    *     accessibility.
    * @param width Width of the image.
    * @param height Height of the image.
    * @return Returns current constructed OptionItem.
    */
  def setImage(url: java.lang.String, accessibilityText: java.lang.String): OptionItem = js.native
  def setImage(url: java.lang.String, accessibilityText: java.lang.String, width: scala.Double): OptionItem = js.native
  def setImage(
    url: java.lang.String,
    accessibilityText: java.lang.String,
    width: scala.Double,
    height: scala.Double
  ): OptionItem = js.native
  /**
    * Sets the key for the OptionInfo of this Option Item. This will be returned
    * as an argument in the resulting actions.intent.OPTION intent.
    *
    * @param key Key to uniquely identify this item.
    * @return Returns current constructed OptionItem.
    */
  def setKey(key: java.lang.String): OptionItem = js.native
  /**
    * Sets the title for this Option Item.
    *
    * @param title Title to show on item.
    * @return Returns current constructed OptionItem.
    */
  def setTitle(title: java.lang.String): OptionItem = js.native
}

