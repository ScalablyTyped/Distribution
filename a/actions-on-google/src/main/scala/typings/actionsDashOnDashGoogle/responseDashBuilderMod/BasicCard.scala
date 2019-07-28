package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/response-builder", "BasicCard")
@js.native
/**
  * Constructor for BasicCard. Accepts optional BasicCard to clone.
  *
  * @param basicCard Optional BasicCard to clone.
  */
class BasicCard () extends js.Object {
  def this(basicCard: BasicCard) = this()
  /**
    * Ordered list of buttons to show below card. Optional.
    */
  var buttons: js.Array[Button] = js.native
  /**
    * Body text to show on the card. Required, unless image is present.
    */
  var formattedText: String = js.native
  /**
    * Image to show on the card. Optional.
    */
  var image: js.UndefOr[Image] = js.native
  /**
    * Subtitle of the card. Optional.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * Title of the card. Optional.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Adds a button below card.
    *
    * @param text Text to show on button.
    * @param url URL to open when button is selected.
    * @return Returns current constructed BasicCard.
    */
  def addButton(text: String, url: String): BasicCard = js.native
  /**
    * Sets the body text for this Basic Card.
    *
    * @param bodyText Body text to show on card.
    * @return Returns current constructed BasicCard.
    */
  def setBodyText(bodyText: String): BasicCard = js.native
  /**
    * Sets the image for this Basic Card.
    *
    * @param url Image source URL.
    * @param accessibilityText Text to replace for image for
    *     accessibility.
    * @param width Width of the image.
    * @param height Height of the image.
    * @return Returns current constructed BasicCard.
    */
  def setImage(url: String, accessibilityText: String): BasicCard = js.native
  def setImage(url: String, accessibilityText: String, width: Double): BasicCard = js.native
  def setImage(url: String, accessibilityText: String, width: Double, height: Double): BasicCard = js.native
  /**
    * Sets the display options for the image in this Basic Card.
    * Use one of the image display constants. If none is chosen,
    * ImageDisplays.DEFAULT will be enforced.
    *
    * @param option The option for displaying the image.
    * @return Returns current constructed BasicCard.
    */
  def setImageDisplay(option: ImageDisplays): BasicCard = js.native
  /**
    * Sets the subtitle for this Basic Card.
    *
    * @param subtitle Subtitle to show on card.
    * @return Returns current constructed BasicCard.
    */
  def setSubtitle(subtitle: String): BasicCard = js.native
  /**
    * Sets the title for this Basic Card.
    *
    * @param title Title to show on card.
    * @return Returns current constructed BasicCard.
    */
  def setTitle(title: String): BasicCard = js.native
}

