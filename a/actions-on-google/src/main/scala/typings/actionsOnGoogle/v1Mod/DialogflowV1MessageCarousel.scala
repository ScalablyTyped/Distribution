package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.carousel_card
import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageCarousel
  extends DialogflowV1BaseGoogleMessage[carousel_card]
     with DialogflowV1Message {
  var items: js.UndefOr[js.Array[DialogflowV1MessageOptionItem]] = js.undefined
}

object DialogflowV1MessageCarousel {
  @scala.inline
  def apply(
    platform: google,
    items: js.Array[DialogflowV1MessageOptionItem] = null,
    `type`: carousel_card = null
  ): DialogflowV1MessageCarousel = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageCarousel]
  }
}

