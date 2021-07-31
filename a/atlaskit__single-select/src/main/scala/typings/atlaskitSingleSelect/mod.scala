package typings.atlaskitSingleSelect

import typings.atlaskitSingleSelect.anon.Event
import typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.bottom
import typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.left
import typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.subtle
import typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.top
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/single-select", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  @JSImport("@atlaskit/single-select", "StatelessSelect")
  @js.native
  class StatelessSelect protected ()
    extends Component[StatelessProps, js.Object, js.Any] {
    def this(props: StatelessProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StatelessProps, context: js.Any) = this()
  }
  
  trait GroupType extends StObject {
    
    var heading: js.UndefOr[String] = js.undefined
    
    var items: js.Array[ItemType]
  }
  object GroupType {
    
    @scala.inline
    def apply(items: js.Array[ItemType]): GroupType = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupType]
    }
    
    @scala.inline
    implicit class GroupTypeMutableBuilder[Self <: GroupType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[ItemType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: ItemType*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  trait ItemType extends StObject {
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var elemBefore: js.UndefOr[ReactNode] = js.undefined
    
    var filterValues: js.UndefOr[js.Array[String]] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var tooltipDescription: js.UndefOr[String] = js.undefined
    
    var tooltipPosition: js.UndefOr[top | bottom | left] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object ItemType {
    
    @scala.inline
    def apply(): ItemType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemType]
    }
    
    @scala.inline
    implicit class ItemTypeMutableBuilder[Self <: ItemType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setElemBefore(value: ReactNode): Self = StObject.set(x, "elemBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElemBeforeUndefined: Self = StObject.set(x, "elemBefore", js.undefined)
      
      @scala.inline
      def setFilterValues(value: js.Array[String]): Self = StObject.set(x, "filterValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterValuesUndefined: Self = StObject.set(x, "filterValues", js.undefined)
      
      @scala.inline
      def setFilterValuesVarargs(value: String*): Self = StObject.set(x, "filterValues", js.Array(value :_*))
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setTooltipDescription(value: String): Self = StObject.set(x, "tooltipDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipDescriptionUndefined: Self = StObject.set(x, "tooltipDescription", js.undefined)
      
      @scala.inline
      def setTooltipPosition(value: top | bottom | left): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Props extends StObject {
    
    /** Subtle items do not have a background color. */
    var appearance: js.UndefOr[typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.default | subtle] = js.undefined
    
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
    var onOpenChange: js.UndefOr[js.Function1[/* change */ Event, Unit]] = js.undefined
    
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
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppearance(value: typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.default | subtle): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      @scala.inline
      def setDefaultSelected(value: ItemType): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedUndefined: Self = StObject.set(x, "defaultSelected", js.undefined)
      
      @scala.inline
      def setDroplistShouldFitContainer(value: Boolean): Self = StObject.set(x, "droplistShouldFitContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDroplistShouldFitContainerUndefined: Self = StObject.set(x, "droplistShouldFitContainer", js.undefined)
      
      @scala.inline
      def setHasAutocomplete(value: Boolean): Self = StObject.set(x, "hasAutocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasAutocompleteUndefined: Self = StObject.set(x, "hasAutocomplete", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInvalidMessage(value: ReactNode): Self = StObject.set(x, "invalidMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidMessageUndefined: Self = StObject.set(x, "invalidMessage", js.undefined)
      
      @scala.inline
      def setIsDefaultOpen(value: Boolean): Self = StObject.set(x, "isDefaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDefaultOpenUndefined: Self = StObject.set(x, "isDefaultOpen", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setIsFirstChild(value: Boolean): Self = StObject.set(x, "isFirstChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFirstChildUndefined: Self = StObject.set(x, "isFirstChild", js.undefined)
      
      @scala.inline
      def setIsInvalid(value: Boolean): Self = StObject.set(x, "isInvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInvalidUndefined: Self = StObject.set(x, "isInvalid", js.undefined)
      
      @scala.inline
      def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[GroupType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: GroupType*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoMatchesFound(value: String): Self = StObject.set(x, "noMatchesFound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoMatchesFoundUndefined: Self = StObject.set(x, "noMatchesFound", js.undefined)
      
      @scala.inline
      def setOnFilterChange(value: /* filter */ String => Unit): Self = StObject.set(x, "onFilterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterChangeUndefined: Self = StObject.set(x, "onFilterChange", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: /* change */ Event => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOnSelected(value: /* item */ ItemType => Unit): Self = StObject.set(x, "onSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectedUndefined: Self = StObject.set(x, "onSelected", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShouldFitContainer(value: Boolean): Self = StObject.set(x, "shouldFitContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldFitContainerUndefined: Self = StObject.set(x, "shouldFitContainer", js.undefined)
      
      @scala.inline
      def setShouldFlip(value: Boolean): Self = StObject.set(x, "shouldFlip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldFlipUndefined: Self = StObject.set(x, "shouldFlip", js.undefined)
      
      @scala.inline
      def setShouldFocus(value: Boolean): Self = StObject.set(x, "shouldFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldFocusUndefined: Self = StObject.set(x, "shouldFocus", js.undefined)
    }
  }
  
  type SingleSelect = Component[Props, js.Object, js.Any]
  
  trait StatelessProps
    extends StObject
       with Props {
    
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
    def apply(): StatelessProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatelessProps]
    }
    
    @scala.inline
    implicit class StatelessPropsMutableBuilder[Self <: StatelessProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterValue(value: String): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setLoadingMessage(value: String): Self = StObject.set(x, "loadingMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
      
      @scala.inline
      def setSelectedItem(value: ItemType): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    }
  }
}
