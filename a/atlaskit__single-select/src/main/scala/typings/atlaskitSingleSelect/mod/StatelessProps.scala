package typings.atlaskitSingleSelect.mod

import typings.atlaskitSingleSelect.AnonEvent
import typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.subtle
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatelessProps extends Props {
  /** Value to be used when filtering the items. Compared against 'content'. */
  var filterValue: js.UndefOr[String] = js.undefined
  /**
    * Sets whether the field is loading data. The same property is used
    * for either initial fetch (when no options are available) as well for
    * subsequent loading of more options. The component reacts accordingly
    * based on the `items` provided.
    */
  var isLoading: js.UndefOr[Boolean] = js.undefined
  /** Sets whether the Select dropdown is open. */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Message to be displayed when the component is set to its loading state.
    * The message might be displayed differently depending on whether or not
    * there are items already being rendered.
    */
  var loadingMessage: js.UndefOr[String] = js.undefined
  /** The selected item data */
  var selectedItem: js.UndefOr[ItemType] = js.undefined
}

object StatelessProps {
  @scala.inline
  def apply(
    appearance: typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.default | subtle = null,
    defaultSelected: ItemType = null,
    droplistShouldFitContainer: js.UndefOr[Boolean] = js.undefined,
    filterValue: String = null,
    hasAutocomplete: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    invalidMessage: ReactNode = null,
    isDefaultOpen: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isFirstChild: js.UndefOr[Boolean] = js.undefined,
    isInvalid: js.UndefOr[Boolean] = js.undefined,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[GroupType] = null,
    label: String = null,
    loadingMessage: String = null,
    maxHeight: Int | Double = null,
    name: String = null,
    noMatchesFound: String = null,
    onFilterChange: /* filter */ String => Unit = null,
    onOpenChange: /* change */ AnonEvent => Unit = null,
    onSelected: /* item */ ItemType => Unit = null,
    placeholder: String = null,
    position: String = null,
    selectedItem: ItemType = null,
    shouldFitContainer: js.UndefOr[Boolean] = js.undefined,
    shouldFlip: js.UndefOr[Boolean] = js.undefined,
    shouldFocus: js.UndefOr[Boolean] = js.undefined
  ): StatelessProps = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(droplistShouldFitContainer)) __obj.updateDynamic("droplistShouldFitContainer")(droplistShouldFitContainer.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAutocomplete)) __obj.updateDynamic("hasAutocomplete")(hasAutocomplete.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (invalidMessage != null) __obj.updateDynamic("invalidMessage")(invalidMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultOpen)) __obj.updateDynamic("isDefaultOpen")(isDefaultOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isFirstChild)) __obj.updateDynamic("isFirstChild")(isFirstChild.asInstanceOf[js.Any])
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (loadingMessage != null) __obj.updateDynamic("loadingMessage")(loadingMessage.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noMatchesFound != null) __obj.updateDynamic("noMatchesFound")(noMatchesFound.asInstanceOf[js.Any])
    if (onFilterChange != null) __obj.updateDynamic("onFilterChange")(js.Any.fromFunction1(onFilterChange))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onSelected != null) __obj.updateDynamic("onSelected")(js.Any.fromFunction1(onSelected))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFitContainer)) __obj.updateDynamic("shouldFitContainer")(shouldFitContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFlip)) __obj.updateDynamic("shouldFlip")(shouldFlip.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocus)) __obj.updateDynamic("shouldFocus")(shouldFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessProps]
  }
}

