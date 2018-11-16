package typings
package atAtlaskitSingleDashSelectLib.singleDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Props extends js.Object {
  /** Subtle items do not have a background color. */
  var appearance: js.UndefOr[
    atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectLibStrings.default | atAtlaskitSingleDashSelectLib.atAtlaskitSingleDashSelectLibStrings.subtle
  ] = js.undefined
  /** Item to be selected on component mount. */
  var defaultSelected: js.UndefOr[ItemType] = js.undefined
  /** Sets whether the dropdown should be constrained to the width of its trigger */
  var droplistShouldFitContainer: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Sets whether the field should be selectable. If it is, the field will be
       * a text box, which will filter the items.
       */
  var hasAutocomplete: js.UndefOr[scala.Boolean] = js.undefined
  /** id property to be passed down to the html select component. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** message to show on the dialog when isInvalid is true */
  var invalidMessage: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Sets whether the component should be open on mount. */
  var isDefaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets whether the select is selectable. Changes hover state. */
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /** controls the top margin of the label component rendered. */
  var isFirstChild: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Set whether there is an error with the selection. Sets an orange border
       * and shows the warning icon.
       */
  var isInvalid: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Sets whether form including select can be submitted without an option
       * being made.
       */
  var isRequired: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * An array of objects, each one of which must have an array of items, and
       * may have a heading. All items should have content and value properties, with
       * content being the displayed text.
       */
  var items: js.UndefOr[js.Array[GroupType]] = js.undefined
  /** Label to be displayed above select. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** Set the max height of the dropdown list in pixels. */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /** name property to be passed to the html select element. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Message to display in any group in items if there are no items in it,
       * including if there is one item that has been selected.
       */
  var noMatchesFound: js.UndefOr[java.lang.String] = js.undefined
  /** Handler to be called when the filtered items changes. */
  var onFilterChange: js.UndefOr[js.Function1[/* filter */ java.lang.String, scala.Unit]] = js.undefined
  /**
       * Handler called when the select is opened or closed. Called with an object
       * that has both the event, and the new isOpen state.
       */
  var onOpenChange: js.UndefOr[js.Function1[/* change */ atAtlaskitSingleDashSelectLib.Anon_Event, scala.Unit]] = js.undefined
  /**
       * Handler to be called when an item is selected. Called with an object that
       * has the item selected as a property on the object.
       */
  var onSelected: js.UndefOr[js.Function1[/* item */ ItemType, scala.Unit]] = js.undefined
  /** Text to be shown within the select when no item is selected. */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /** Where the select dropdown should be displayed relative to the field position. */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /** Sets whether the field should be constrained to the width of its trigger */
  var shouldFitContainer: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets whether the droplist should flip its position when there is not enough space. */
  var shouldFlip: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets whether the field will become focused. */
  var shouldFocus: js.UndefOr[scala.Boolean] = js.undefined
}

