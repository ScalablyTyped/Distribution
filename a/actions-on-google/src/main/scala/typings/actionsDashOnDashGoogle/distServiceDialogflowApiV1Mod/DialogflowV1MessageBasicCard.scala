package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.basic_card
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageBasicCard
  extends DialogflowV1BaseGoogleMessage[basic_card]
     with DialogflowV1Message {
  var buttons: js.UndefOr[js.Array[DialogflowV1MessageBasicCardButton]] = js.undefined
  var formattedText: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[DialogflowV1MessageImage] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageBasicCard {
  @scala.inline
  def apply(
    platform: google,
    buttons: js.Array[DialogflowV1MessageBasicCardButton] = null,
    formattedText: String = null,
    image: DialogflowV1MessageImage = null,
    subtitle: String = null,
    title: String = null,
    `type`: basic_card = null
  ): DialogflowV1MessageBasicCard = {
    val __obj = js.Dynamic.literal(platform = platform)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (formattedText != null) __obj.updateDynamic("formattedText")(formattedText)
    if (image != null) __obj.updateDynamic("image")(image)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DialogflowV1MessageBasicCard]
  }
}

