package typings.antdMobile

import typings.antdMobile.anon.CSSPropertiesPartialRecorBlockOverflow
import typings.antdMobile.anon.PickPageIndicatorPropscol
import typings.antdMobile.anon.defaultIndexnumberundefinAllowTouchMove
import typings.antdMobile.antdMobileStrings.`additions removals`
import typings.antdMobile.antdMobileStrings.`additions text`
import typings.antdMobile.antdMobileStrings.`inline`
import typings.antdMobile.antdMobileStrings.`removals additions`
import typings.antdMobile.antdMobileStrings.`removals text`
import typings.antdMobile.antdMobileStrings.`text additions`
import typings.antdMobile.antdMobileStrings.`text removals`
import typings.antdMobile.antdMobileStrings.additions
import typings.antdMobile.antdMobileStrings.all
import typings.antdMobile.antdMobileStrings.ascending
import typings.antdMobile.antdMobileStrings.assertive
import typings.antdMobile.antdMobileStrings.both
import typings.antdMobile.antdMobileStrings.copy
import typings.antdMobile.antdMobileStrings.date
import typings.antdMobile.antdMobileStrings.descending
import typings.antdMobile.antdMobileStrings.dialog
import typings.antdMobile.antdMobileStrings.execute
import typings.antdMobile.antdMobileStrings.grammar
import typings.antdMobile.antdMobileStrings.grid
import typings.antdMobile.antdMobileStrings.horizontal
import typings.antdMobile.antdMobileStrings.link
import typings.antdMobile.antdMobileStrings.list
import typings.antdMobile.antdMobileStrings.listbox
import typings.antdMobile.antdMobileStrings.location
import typings.antdMobile.antdMobileStrings.menu
import typings.antdMobile.antdMobileStrings.mixed
import typings.antdMobile.antdMobileStrings.move
import typings.antdMobile.antdMobileStrings.none
import typings.antdMobile.antdMobileStrings.off
import typings.antdMobile.antdMobileStrings.other
import typings.antdMobile.antdMobileStrings.page
import typings.antdMobile.antdMobileStrings.polite
import typings.antdMobile.antdMobileStrings.popup
import typings.antdMobile.antdMobileStrings.removals
import typings.antdMobile.antdMobileStrings.spelling
import typings.antdMobile.antdMobileStrings.step
import typings.antdMobile.antdMobileStrings.text
import typings.antdMobile.antdMobileStrings.time
import typings.antdMobile.antdMobileStrings.tree
import typings.antdMobile.antdMobileStrings.vertical
import typings.react.mod.Booleanish
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSwiperSwiperMod {
  
  @JSImport("antd-mobile/es/components/swiper/swiper", "Swiper")
  @js.native
  val Swiper: ForwardRefExoticComponent[defaultIndexnumberundefinAllowTouchMove] = js.native
  
  /* Inlined {  defaultIndex :number | undefined,   allowTouchMove :boolean | undefined,   autoplay :boolean | undefined,   autoplayInterval :number | undefined,   loop :boolean | undefined,   direction :'horizontal' | 'vertical' | undefined,   onIndexChange :(index : number): void | undefined,   indicatorProps :std.Pick<antd-mobile.antd-mobile/es/components/page-indicator.PageIndicatorProps, 'color' | 'style' | 'className'> | undefined,   indicator :(total : number, current : number): react.react.ReactNode | undefined,   slideSize :number | undefined,   trackOffset :number | undefined,   stuckAtBoundary :boolean | undefined,   rubberband :boolean | undefined,   children :react.react.ReactElement | std.Array<react.react.ReactElement> | undefined} & antd-mobile.antd-mobile/es/utils/native-props.NativeProps<'--height' | '--width' | '--border-radius' | '--track-padding'> */
  trait SwiperProps extends StObject {
    
    var allowTouchMove: js.UndefOr[Boolean] = js.undefined
    
    /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
    var `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
      * presented if they are made.
      */
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
    
    /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
    var `aria-busy`: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
      * @see aria-pressed @see aria-selected.
      */
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
    
    /**
      * Defines the total number of columns in a table, grid, or treegrid.
      * @see aria-colindex.
      */
    var `aria-colcount`: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
      * @see aria-colcount @see aria-colspan.
      */
    var `aria-colindex`: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
      * @see aria-colindex @see aria-rowspan.
      */
    var `aria-colspan`: js.UndefOr[Double] = js.undefined
    
    /**
      * Identifies the element (or elements) whose contents or presence are controlled by the current element.
      * @see aria-owns.
      */
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    /** Indicates the element that represents the current item within a container or set of related elements. */
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
    
    /**
      * Identifies the element (or elements) that describes the object.
      * @see aria-labelledby
      */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /**
      * Identifies the element that provides a detailed, extended description for the object.
      * @see aria-describedby.
      */
    var `aria-details`: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
      * @see aria-hidden @see aria-readonly.
      */
    var `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Indicates what functions can be performed when a dragged object is released on the drop target.
      * @deprecated in ARIA 1.1
      */
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
    
    /**
      * Identifies the element that provides an error message for the object.
      * @see aria-invalid @see aria-describedby.
      */
    var `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
    var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
      * allows assistive technology to override the general default of reading in document source order.
      */
    var `aria-flowto`: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates an element's "grabbed" state in a drag-and-drop operation.
      * @deprecated in ARIA 1.1
      */
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
    
    /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    /**
      * Indicates whether the element is exposed to an accessibility API.
      * @see aria-disabled.
      */
    var `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Indicates the entered value does not conform to the format expected by the application.
      * @see aria-errormessage.
      */
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
    var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    /**
      * Defines a string value that labels the current element.
      * @see aria-labelledby.
      */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /**
      * Identifies the element (or elements) that labels the current element.
      * @see aria-describedby.
      */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    /** Defines the hierarchical level of an element within a structure. */
    var `aria-level`: js.UndefOr[Double] = js.undefined
    
    /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
    
    /** Indicates whether an element is modal when displayed. */
    var `aria-modal`: js.UndefOr[Booleanish] = js.undefined
    
    /** Indicates whether a text box accepts multiple lines of input or only a single line. */
    var `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
    
    /** Indicates that the user may select more than one item from the current selectable descendants. */
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
    
    /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
      * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
      * @see aria-controls.
      */
    var `aria-owns`: js.UndefOr[String] = js.undefined
    
    /**
      * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
      * A hint could be a sample value or a brief description of the expected format.
      */
    var `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    /**
      * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
      * @see aria-setsize.
      */
    var `aria-posinset`: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates the current "pressed" state of toggle buttons.
      * @see aria-checked @see aria-selected.
      */
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
    
    /**
      * Indicates that the element is not editable, but is otherwise operable.
      * @see aria-disabled.
      */
    var `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
      * @see aria-atomic.
      */
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.undefined
    
    /** Indicates that user input is required on the element before a form may be submitted. */
    var `aria-required`: js.UndefOr[Booleanish] = js.undefined
    
    /** Defines a human-readable, author-localized description for the role of an element. */
    var `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the total number of rows in a table, grid, or treegrid.
      * @see aria-rowindex.
      */
    var `aria-rowcount`: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
      * @see aria-rowcount @see aria-rowspan.
      */
    var `aria-rowindex`: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
      * @see aria-rowindex @see aria-colspan.
      */
    var `aria-rowspan`: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates the current "selected" state of various widgets.
      * @see aria-checked @see aria-pressed.
      */
    var `aria-selected`: js.UndefOr[Booleanish] = js.undefined
    
    /**
      * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
      * @see aria-posinset.
      */
    var `aria-setsize`: js.UndefOr[Double] = js.undefined
    
    /** Indicates if items in a table or grid are sorted in ascending or descending order. */
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
    
    /** Defines the maximum allowed value for a range widget. */
    var `aria-valuemax`: js.UndefOr[Double] = js.undefined
    
    /** Defines the minimum allowed value for a range widget. */
    var `aria-valuemin`: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines the current value for a range widget.
      * @see aria-valuetext.
      */
    var `aria-valuenow`: js.UndefOr[Double] = js.undefined
    
    /** Defines the human readable text alternative of aria-valuenow for a range widget. */
    var `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var autoplayInterval: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultIndex: js.UndefOr[Double] = js.undefined
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var indicator: js.UndefOr[js.Function2[/* total */ Double, /* current */ Double, ReactNode]] = js.undefined
    
    var indicatorProps: js.UndefOr[PickPageIndicatorPropscol] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var rubberband: js.UndefOr[Boolean] = js.undefined
    
    var slideSize: js.UndefOr[Double] = js.undefined
    
    var stuckAtBoundary: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSPropertiesPartialRecorBlockOverflow] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var trackOffset: js.UndefOr[Double] = js.undefined
  }
  object SwiperProps {
    
    inline def apply(): SwiperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwiperProps]
    }
    
    extension [Self <: SwiperProps](x: Self) {
      
      inline def setAllowTouchMove(value: Boolean): Self = StObject.set(x, "allowTouchMove", value.asInstanceOf[js.Any])
      
      inline def setAllowTouchMoveUndefined: Self = StObject.set(x, "allowTouchMove", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
      
      inline def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultIndex(value: Double): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultIndexUndefined: Self = StObject.set(x, "defaultIndex", js.undefined)
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setIndicator(value: (/* total */ Double, /* current */ Double) => ReactNode): Self = StObject.set(x, "indicator", js.Any.fromFunction2(value))
      
      inline def setIndicatorProps(value: PickPageIndicatorPropscol): Self = StObject.set(x, "indicatorProps", value.asInstanceOf[js.Any])
      
      inline def setIndicatorPropsUndefined: Self = StObject.set(x, "indicatorProps", js.undefined)
      
      inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnIndexChange(value: /* index */ Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
      
      inline def setOnIndexChangeUndefined: Self = StObject.set(x, "onIndexChange", js.undefined)
      
      inline def setRubberband(value: Boolean): Self = StObject.set(x, "rubberband", value.asInstanceOf[js.Any])
      
      inline def setRubberbandUndefined: Self = StObject.set(x, "rubberband", js.undefined)
      
      inline def setSlideSize(value: Double): Self = StObject.set(x, "slideSize", value.asInstanceOf[js.Any])
      
      inline def setSlideSizeUndefined: Self = StObject.set(x, "slideSize", js.undefined)
      
      inline def setStuckAtBoundary(value: Boolean): Self = StObject.set(x, "stuckAtBoundary", value.asInstanceOf[js.Any])
      
      inline def setStuckAtBoundaryUndefined: Self = StObject.set(x, "stuckAtBoundary", js.undefined)
      
      inline def setStyle(value: CSSPropertiesPartialRecorBlockOverflow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTrackOffset(value: Double): Self = StObject.set(x, "trackOffset", value.asInstanceOf[js.Any])
      
      inline def setTrackOffsetUndefined: Self = StObject.set(x, "trackOffset", js.undefined)
    }
  }
  
  trait SwiperRef extends StObject {
    
    def swipeNext(): Unit
    
    def swipePrev(): Unit
    
    def swipeTo(index: Double): Unit
  }
  object SwiperRef {
    
    inline def apply(swipeNext: () => Unit, swipePrev: () => Unit, swipeTo: Double => Unit): SwiperRef = {
      val __obj = js.Dynamic.literal(swipeNext = js.Any.fromFunction0(swipeNext), swipePrev = js.Any.fromFunction0(swipePrev), swipeTo = js.Any.fromFunction1(swipeTo))
      __obj.asInstanceOf[SwiperRef]
    }
    
    extension [Self <: SwiperRef](x: Self) {
      
      inline def setSwipeNext(value: () => Unit): Self = StObject.set(x, "swipeNext", js.Any.fromFunction0(value))
      
      inline def setSwipePrev(value: () => Unit): Self = StObject.set(x, "swipePrev", js.Any.fromFunction0(value))
      
      inline def setSwipeTo(value: Double => Unit): Self = StObject.set(x, "swipeTo", js.Any.fromFunction1(value))
    }
  }
}
