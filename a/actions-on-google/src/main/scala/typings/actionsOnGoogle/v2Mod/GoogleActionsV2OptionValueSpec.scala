package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OptionValueSpec extends js.Object {
  /**
    * A select with a card carousel GUI, use collection_select instead.
    */
  var carouselSelect: js.UndefOr[GoogleActionsV2UiElementsCarouselSelect] = js.undefined
  /**
    * A select with a card collection GUI
    */
  var collectionSelect: js.UndefOr[GoogleActionsV2UiElementsCollectionSelect] = js.undefined
  /**
    * A select with a list card GUI
    */
  var listSelect: js.UndefOr[GoogleActionsV2UiElementsListSelect] = js.undefined
  /**
    * A simple select with no associated GUI
    */
  var simpleSelect: js.UndefOr[GoogleActionsV2SimpleSelect] = js.undefined
}

object GoogleActionsV2OptionValueSpec {
  @scala.inline
  def apply(
    carouselSelect: GoogleActionsV2UiElementsCarouselSelect = null,
    collectionSelect: GoogleActionsV2UiElementsCollectionSelect = null,
    listSelect: GoogleActionsV2UiElementsListSelect = null,
    simpleSelect: GoogleActionsV2SimpleSelect = null
  ): GoogleActionsV2OptionValueSpec = {
    val __obj = js.Dynamic.literal()
    if (carouselSelect != null) __obj.updateDynamic("carouselSelect")(carouselSelect.asInstanceOf[js.Any])
    if (collectionSelect != null) __obj.updateDynamic("collectionSelect")(collectionSelect.asInstanceOf[js.Any])
    if (listSelect != null) __obj.updateDynamic("listSelect")(listSelect.asInstanceOf[js.Any])
    if (simpleSelect != null) __obj.updateDynamic("simpleSelect")(simpleSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OptionValueSpec]
  }
}

