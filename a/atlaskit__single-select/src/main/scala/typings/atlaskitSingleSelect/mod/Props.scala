package typings.atlaskitSingleSelect.mod

import typings.atlaskitSingleSelect.anon.Event
import typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.subtle
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /** Subtle items do not have a background color. */
  var appearance: js.UndefOr[typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.default | subtle] = js.native
  /** Item to be selected on component mount. */
  var defaultSelected: js.UndefOr[ItemType] = js.native
  /** Sets whether the dropdown should be constrained to the width of its trigger */
  var droplistShouldFitContainer: js.UndefOr[Boolean] = js.native
  /**
    * Sets whether the field should be selectable. If it is, the field will be
    * a text box, which will filter the items.
    */
  var hasAutocomplete: js.UndefOr[Boolean] = js.native
  /** id property to be passed down to the html select component. */
  var id: js.UndefOr[String] = js.native
  /** message to show on the dialog when isInvalid is true */
  var invalidMessage: js.UndefOr[ReactNode] = js.native
  /** Sets whether the component should be open on mount. */
  var isDefaultOpen: js.UndefOr[Boolean] = js.native
  /** Sets whether the select is selectable. Changes hover state. */
  var isDisabled: js.UndefOr[Boolean] = js.native
  /** controls the top margin of the label component rendered. */
  var isFirstChild: js.UndefOr[Boolean] = js.native
  /**
    * Set whether there is an error with the selection. Sets an orange border
    * and shows the warning icon.
    */
  var isInvalid: js.UndefOr[Boolean] = js.native
  /**
    * Sets whether form including select can be submitted without an option
    * being made.
    */
  var isRequired: js.UndefOr[Boolean] = js.native
  /**
    * An array of objects, each one of which must have an array of items, and
    * may have a heading. All items should have content and value properties, with
    * content being the displayed text.
    */
  var items: js.UndefOr[js.Array[GroupType]] = js.native
  /** Label to be displayed above select. */
  var label: js.UndefOr[String] = js.native
  /** Set the max height of the dropdown list in pixels. */
  var maxHeight: js.UndefOr[Double] = js.native
  /** name property to be passed to the html select element. */
  var name: js.UndefOr[String] = js.native
  /**
    * Message to display in any group in items if there are no items in it,
    * including if there is one item that has been selected.
    */
  var noMatchesFound: js.UndefOr[String] = js.native
  /** Handler to be called when the filtered items changes. */
  var onFilterChange: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.native
  /**
    * Handler called when the select is opened or closed. Called with an object
    * that has both the event, and the new isOpen state.
    */
  var onOpenChange: js.UndefOr[js.Function1[/* change */ Event, Unit]] = js.native
  /**
    * Handler to be called when an item is selected. Called with an object that
    * has the item selected as a property on the object.
    */
  var onSelected: js.UndefOr[js.Function1[/* item */ ItemType, Unit]] = js.native
  /** Text to be shown within the select when no item is selected. */
  var placeholder: js.UndefOr[String] = js.native
  /** Where the select dropdown should be displayed relative to the field position. */
  var position: js.UndefOr[String] = js.native
  /** Sets whether the field should be constrained to the width of its trigger */
  var shouldFitContainer: js.UndefOr[Boolean] = js.native
  /** Sets whether the droplist should flip its position when there is not enough space. */
  var shouldFlip: js.UndefOr[Boolean] = js.native
  /** Sets whether the field will become focused. */
  var shouldFocus: js.UndefOr[Boolean] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppearance(value: typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.default | subtle): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    @scala.inline
    def setDefaultSelected(value: ItemType): Self = this.set("defaultSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelected: Self = this.set("defaultSelected", js.undefined)
    @scala.inline
    def setDroplistShouldFitContainer(value: Boolean): Self = this.set("droplistShouldFitContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDroplistShouldFitContainer: Self = this.set("droplistShouldFitContainer", js.undefined)
    @scala.inline
    def setHasAutocomplete(value: Boolean): Self = this.set("hasAutocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAutocomplete: Self = this.set("hasAutocomplete", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInvalidMessage(value: ReactNode): Self = this.set("invalidMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidMessage: Self = this.set("invalidMessage", js.undefined)
    @scala.inline
    def setIsDefaultOpen(value: Boolean): Self = this.set("isDefaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefaultOpen: Self = this.set("isDefaultOpen", js.undefined)
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    @scala.inline
    def setIsFirstChild(value: Boolean): Self = this.set("isFirstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFirstChild: Self = this.set("isFirstChild", js.undefined)
    @scala.inline
    def setIsInvalid(value: Boolean): Self = this.set("isInvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInvalid: Self = this.set("isInvalid", js.undefined)
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRequired: Self = this.set("isRequired", js.undefined)
    @scala.inline
    def setItemsVarargs(value: GroupType*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[GroupType]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNoMatchesFound(value: String): Self = this.set("noMatchesFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoMatchesFound: Self = this.set("noMatchesFound", js.undefined)
    @scala.inline
    def setOnFilterChange(value: /* filter */ String => Unit): Self = this.set("onFilterChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFilterChange: Self = this.set("onFilterChange", js.undefined)
    @scala.inline
    def setOnOpenChange(value: /* change */ Event => Unit): Self = this.set("onOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpenChange: Self = this.set("onOpenChange", js.undefined)
    @scala.inline
    def setOnSelected(value: /* item */ ItemType => Unit): Self = this.set("onSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelected: Self = this.set("onSelected", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShouldFitContainer(value: Boolean): Self = this.set("shouldFitContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldFitContainer: Self = this.set("shouldFitContainer", js.undefined)
    @scala.inline
    def setShouldFlip(value: Boolean): Self = this.set("shouldFlip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldFlip: Self = this.set("shouldFlip", js.undefined)
    @scala.inline
    def setShouldFocus(value: Boolean): Self = this.set("shouldFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldFocus: Self = this.set("shouldFocus", js.undefined)
  }
  
}

