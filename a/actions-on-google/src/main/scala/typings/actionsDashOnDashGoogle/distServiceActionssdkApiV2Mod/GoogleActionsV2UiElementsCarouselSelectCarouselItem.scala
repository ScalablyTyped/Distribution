package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsCarouselSelectCarouselItem extends js.Object {
  /**
    * Body text of the card.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * See google.actions.v2.OptionInfo
    * for details.
    * Required.
    */
  var optionInfo: js.UndefOr[GoogleActionsV2OptionInfo] = js.undefined
  /**
    * Title of the carousel item. When tapped, this text will be
    * posted back to the conversation verbatim as if the user had typed it.
    * Each title must be unique among the set of carousel items.
    * Required.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsCarouselSelectCarouselItem {
  @scala.inline
  def apply(
    description: String = null,
    image: GoogleActionsV2UiElementsImage = null,
    optionInfo: GoogleActionsV2OptionInfo = null,
    title: String = null
  ): GoogleActionsV2UiElementsCarouselSelectCarouselItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (optionInfo != null) __obj.updateDynamic("optionInfo")(optionInfo.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsCarouselSelectCarouselItem]
  }
}

