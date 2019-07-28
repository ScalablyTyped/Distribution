package typings.atAtlaskitSingleDashSelect.atAtlaskitSingleDashSelectMod

import typings.atAtlaskitSingleDashSelect.Anon_Event
import typings.atAtlaskitSingleDashSelect.atAtlaskitSingleDashSelectStrings.subtle
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /** Subtle items do not have a background color. */
  var appearance: js.UndefOr[
    typings.atAtlaskitSingleDashSelect.atAtlaskitSingleDashSelectStrings.default | subtle
  ] = js.undefined
  /** Item to be selected on component mount. */
  var defaultSelected: js.UndefOr[ItemType] = js.undefined
  /** Sets whether the dropdown should be constrained to the width of its trigger */
  var droplistShouldFitContainer: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets whether the field should be selectable. If it is, the field will be
    * a text box, which will filter the items.
    */
  var hasAutocomplete: js.UndefOr[Boolean] = js.undefined
  /** id property to be passed down to the html select component. */
  var id: js.UndefOr[String] = js.undefined
  /** message to show on the dialog when isInvalid is true */
  var invalidMessage: js.UndefOr[ReactNode] = js.undefined
  /** Sets whether the component should be open on mount. */
  var isDefaultOpen: js.UndefOr[Boolean] = js.undefined
  /** Sets whether the select is selectable. Changes hover state. */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  /** controls the top margin of the label component rendered. */
  var isFirstChild: js.UndefOr[Boolean] = js.undefined
  /**
    * Set whether there is an error with the selection. Sets an orange border
    * and shows the warning icon.
    */
  var isInvalid: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets whether form including select can be submitted without an option
    * being made.
    */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of objects, each one of which must have an array of items, and
    * may have a heading. All items should have content and value properties, with
    * content being the displayed text.
    */
  var items: js.UndefOr[js.Array[GroupType]] = js.undefined
  /** Label to be displayed above select. */
  var label: js.UndefOr[String] = js.undefined
  /** Set the max height of the dropdown list in pixels. */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /** name property to be passed to the html select element. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Message to display in any group in items if there are no items in it,
    * including if there is one item that has been selected.
    */
  var noMatchesFound: js.UndefOr[String] = js.undefined
  /** Handler to be called when the filtered items changes. */
  var onFilterChange: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.undefined
  /**
    * Handler called when the select is opened or closed. Called with an object
    * that has both the event, and the new isOpen state.
    */
  var onOpenChange: js.UndefOr[js.Function1[/* change */ Anon_Event, Unit]] = js.undefined
  /**
    * Handler to be called when an item is selected. Called with an object that
    * has the item selected as a property on the object.
    */
  var onSelected: js.UndefOr[js.Function1[/* item */ ItemType, Unit]] = js.undefined
  /** Text to be shown within the select when no item is selected. */
  var placeholder: js.UndefOr[String] = js.undefined
  /** Where the select dropdown should be displayed relative to the field position. */
  var position: js.UndefOr[String] = js.undefined
  /** Sets whether the field should be constrained to the width of its trigger */
  var shouldFitContainer: js.UndefOr[Boolean] = js.undefined
  /** Sets whether the droplist should flip its position when there is not enough space. */
  var shouldFlip: js.UndefOr[Boolean] = js.undefined
  /** Sets whether the field will become focused. */
  var shouldFocus: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    appearance: typings.atAtlaskitSingleDashSelect.atAtlaskitSingleDashSelectStrings.default | subtle = null,
    defaultSelected: ItemType = null,
    droplistShouldFitContainer: js.UndefOr[Boolean] = js.undefined,
    hasAutocomplete: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    invalidMessage: ReactNode = null,
    isDefaultOpen: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isFirstChild: js.UndefOr[Boolean] = js.undefined,
    isInvalid: js.UndefOr[Boolean] = js.undefined,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[GroupType] = null,
    label: String = null,
    maxHeight: Int | Double = null,
    name: String = null,
    noMatchesFound: String = null,
    onFilterChange: /* filter */ String => Unit = null,
    onOpenChange: /* change */ Anon_Event => Unit = null,
    onSelected: /* item */ ItemType => Unit = null,
    placeholder: String = null,
    position: String = null,
    shouldFitContainer: js.UndefOr[Boolean] = js.undefined,
    shouldFlip: js.UndefOr[Boolean] = js.undefined,
    shouldFocus: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected)
    if (!js.isUndefined(droplistShouldFitContainer)) __obj.updateDynamic("droplistShouldFitContainer")(droplistShouldFitContainer)
    if (!js.isUndefined(hasAutocomplete)) __obj.updateDynamic("hasAutocomplete")(hasAutocomplete)
    if (id != null) __obj.updateDynamic("id")(id)
    if (invalidMessage != null) __obj.updateDynamic("invalidMessage")(invalidMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultOpen)) __obj.updateDynamic("isDefaultOpen")(isDefaultOpen)
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isFirstChild)) __obj.updateDynamic("isFirstChild")(isFirstChild)
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid)
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired)
    if (items != null) __obj.updateDynamic("items")(items)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (noMatchesFound != null) __obj.updateDynamic("noMatchesFound")(noMatchesFound)
    if (onFilterChange != null) __obj.updateDynamic("onFilterChange")(js.Any.fromFunction1(onFilterChange))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onSelected != null) __obj.updateDynamic("onSelected")(js.Any.fromFunction1(onSelected))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(shouldFitContainer)) __obj.updateDynamic("shouldFitContainer")(shouldFitContainer)
    if (!js.isUndefined(shouldFlip)) __obj.updateDynamic("shouldFlip")(shouldFlip)
    if (!js.isUndefined(shouldFocus)) __obj.updateDynamic("shouldFocus")(shouldFocus)
    __obj.asInstanceOf[Props]
  }
}

