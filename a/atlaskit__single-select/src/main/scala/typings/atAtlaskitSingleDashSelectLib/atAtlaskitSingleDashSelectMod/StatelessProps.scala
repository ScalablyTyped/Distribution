package typings
package atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatelessProps extends Props {
  /** Value to be used when filtering the items. Compared against 'content'. */
  var filterValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets whether the field is loading data. The same property is used
    * for either initial fetch (when no options are available) as well for
    * subsequent loading of more options. The component reacts accordingly
    * based on the `items` provided.
    */
  var isLoading: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets whether the Select dropdown is open. */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Message to be displayed when the component is set to its loading state.
    * The message might be displayed differently depending on whether or not
    * there are items already being rendered.
    */
  var loadingMessage: js.UndefOr[java.lang.String] = js.undefined
  /** The selected item data */
  var selectedItem: js.UndefOr[ItemType] = js.undefined
}

object StatelessProps {
  @scala.inline
  def apply(
    appearance: atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectLibStrings.default | atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectLibStrings.subtle = null,
    defaultSelected: ItemType = null,
    droplistShouldFitContainer: js.UndefOr[scala.Boolean] = js.undefined,
    filterValue: java.lang.String = null,
    hasAutocomplete: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    invalidMessage: reactLib.reactMod.ReactNs.ReactNode = null,
    isDefaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    isDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isFirstChild: js.UndefOr[scala.Boolean] = js.undefined,
    isInvalid: js.UndefOr[scala.Boolean] = js.undefined,
    isLoading: js.UndefOr[scala.Boolean] = js.undefined,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    isRequired: js.UndefOr[scala.Boolean] = js.undefined,
    items: js.Array[GroupType] = null,
    label: java.lang.String = null,
    loadingMessage: java.lang.String = null,
    maxHeight: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    noMatchesFound: java.lang.String = null,
    onFilterChange: js.Function1[/* filter */ java.lang.String, scala.Unit] = null,
    onOpenChange: js.Function1[/* change */ atAtlaskitSingleDashSelectLib.Anon_Event, scala.Unit] = null,
    onSelected: js.Function1[/* item */ ItemType, scala.Unit] = null,
    placeholder: java.lang.String = null,
    position: java.lang.String = null,
    selectedItem: ItemType = null,
    shouldFitContainer: js.UndefOr[scala.Boolean] = js.undefined,
    shouldFlip: js.UndefOr[scala.Boolean] = js.undefined,
    shouldFocus: js.UndefOr[scala.Boolean] = js.undefined
  ): StatelessProps = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected)
    if (!js.isUndefined(droplistShouldFitContainer)) __obj.updateDynamic("droplistShouldFitContainer")(droplistShouldFitContainer)
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue)
    if (!js.isUndefined(hasAutocomplete)) __obj.updateDynamic("hasAutocomplete")(hasAutocomplete)
    if (id != null) __obj.updateDynamic("id")(id)
    if (invalidMessage != null) __obj.updateDynamic("invalidMessage")(invalidMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultOpen)) __obj.updateDynamic("isDefaultOpen")(isDefaultOpen)
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isFirstChild)) __obj.updateDynamic("isFirstChild")(isFirstChild)
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid)
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired)
    if (items != null) __obj.updateDynamic("items")(items)
    if (label != null) __obj.updateDynamic("label")(label)
    if (loadingMessage != null) __obj.updateDynamic("loadingMessage")(loadingMessage)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (noMatchesFound != null) __obj.updateDynamic("noMatchesFound")(noMatchesFound)
    if (onFilterChange != null) __obj.updateDynamic("onFilterChange")(onFilterChange)
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(onOpenChange)
    if (onSelected != null) __obj.updateDynamic("onSelected")(onSelected)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (position != null) __obj.updateDynamic("position")(position)
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem)
    if (!js.isUndefined(shouldFitContainer)) __obj.updateDynamic("shouldFitContainer")(shouldFitContainer)
    if (!js.isUndefined(shouldFlip)) __obj.updateDynamic("shouldFlip")(shouldFlip)
    if (!js.isUndefined(shouldFocus)) __obj.updateDynamic("shouldFocus")(shouldFocus)
    __obj.asInstanceOf[StatelessProps]
  }
}

