package typings.antd.anon

import typings.antd.antdStrings.`additions removals`
import typings.antd.antdStrings.`additions text`
import typings.antd.antdStrings.`inline`
import typings.antd.antdStrings.`removals additions`
import typings.antd.antdStrings.`removals text`
import typings.antd.antdStrings.`text additions`
import typings.antd.antdStrings.`text removals`
import typings.antd.antdStrings.additions
import typings.antd.antdStrings.all
import typings.antd.antdStrings.ascending
import typings.antd.antdStrings.assertive
import typings.antd.antdStrings.both
import typings.antd.antdStrings.click
import typings.antd.antdStrings.copy
import typings.antd.antdStrings.date
import typings.antd.antdStrings.descending
import typings.antd.antdStrings.dialog
import typings.antd.antdStrings.execute
import typings.antd.antdStrings.focus
import typings.antd.antdStrings.grammar
import typings.antd.antdStrings.grid
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.link
import typings.antd.antdStrings.list
import typings.antd.antdStrings.listbox
import typings.antd.antdStrings.location
import typings.antd.antdStrings.menu
import typings.antd.antdStrings.mixed
import typings.antd.antdStrings.move
import typings.antd.antdStrings.none
import typings.antd.antdStrings.off
import typings.antd.antdStrings.other
import typings.antd.antdStrings.page
import typings.antd.antdStrings.polite
import typings.antd.antdStrings.popup
import typings.antd.antdStrings.removals
import typings.antd.antdStrings.spelling
import typings.antd.antdStrings.step
import typings.antd.antdStrings.text_
import typings.antd.antdStrings.time
import typings.antd.antdStrings.tree
import typings.antd.antdStrings.vertical
import typings.antd.autoCompleteMod.DataSourceItemType
import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.selectMod.RefSelectProps
import typings.rcSelect.generatorMod.CustomTagProps
import typings.rcSelect.generatorMod.FilterFunc
import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.generatorMod.OnClear
import typings.rcSelect.generatorMod.SingleType
import typings.rcSelect.interfaceMod.OptionsType
import typings.rcSelect.interfaceMod.RenderDOMFunc
import typings.rcSelect.interfaceMod.RenderNode
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.UIEventHandler
import typings.react.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<antd.antd/lib/auto-complete.AutoCompleteProps & react.react.RefAttributes<antd.antd/lib/select.RefSelectProps>> */
@js.native
trait WeakValidationMapAutoComp extends StObject {
  
  var allowClear: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var animation: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-activedescendant`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-atomic`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-autocomplete`: js.UndefOr[Validator[js.UndefOr[none | `inline` | list | both | Null]]] = js.native
  
  var `aria-busy`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-checked`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.native
  
  var `aria-colcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-colindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-colspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-controls`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-current`: js.UndefOr[Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]] = js.native
  
  var `aria-describedby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-details`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-disabled`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-dropeffect`: js.UndefOr[Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]] = js.native
  
  var `aria-errormessage`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-expanded`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-flowto`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-grabbed`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-haspopup`: js.UndefOr[Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]] = js.native
  
  var `aria-hidden`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-invalid`: js.UndefOr[Validator[js.UndefOr[grammar | spelling | Boolean | Null]]] = js.native
  
  var `aria-keyshortcuts`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-labelledby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-level`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-live`: js.UndefOr[Validator[js.UndefOr[off | assertive | polite | Null]]] = js.native
  
  var `aria-modal`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-multiline`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-multiselectable`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-orientation`: js.UndefOr[Validator[js.UndefOr[horizontal | vertical | Null]]] = js.native
  
  var `aria-owns`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-placeholder`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-posinset`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-pressed`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.native
  
  var `aria-readonly`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-relevant`: js.UndefOr[
    Validator[
      js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`) | Null
      ]
    ]
  ] = js.native
  
  var `aria-required`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-roledescription`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var `aria-rowcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-rowindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-rowspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-selected`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var `aria-setsize`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-sort`: js.UndefOr[Validator[js.UndefOr[none | ascending | descending | other | Null]]] = js.native
  
  var `aria-valuemax`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-valuemin`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-valuenow`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var `aria-valuetext`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var autoClearSearchValue: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var autoFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var backfill: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var bordered: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  
  var choiceTransitionName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var clearIcon: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  
  var dataSource: js.UndefOr[Validator[js.UndefOr[js.Array[DataSourceItemType] | Null]]] = js.native
  
  var defaultActiveFirstOption: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var defaultOpen: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var defaultValue: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var direction: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var dropdownAlign: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  
  var dropdownClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var dropdownMatchSelectWidth: js.UndefOr[Validator[js.UndefOr[Boolean | Double | Null]]] = js.native
  
  var dropdownRender: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* menu */ ReactElement, ReactElement]) | Null]]
  ] = js.native
  
  var dropdownStyle: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  
  var filterOption: js.UndefOr[
    Validator[
      js.UndefOr[
        Boolean | (FilterFunc[
          /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
        ]) | Null
      ]
    ]
  ] = js.native
  
  var getInputElement: js.UndefOr[Validator[js.UndefOr[js.Function0[Element] | Null]]] = js.native
  
  var getPopupContainer: js.UndefOr[Validator[js.UndefOr[Null | RenderDOMFunc]]] = js.native
  
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var inputValue: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var internalProps: js.UndefOr[Validator[js.UndefOr[typings.rcSelect.anon.Mark[OptionsType] | Null]]] = js.native
  
  var key: js.UndefOr[Validator[js.UndefOr[typings.react.mod.Key | Null]]] = js.native
  
  var listHeight: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var listItemHeight: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var maxTagCount: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var maxTagPlaceholder: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode]) | Null | ReactNode
      ]
    ]
  ] = js.native
  
  var maxTagTextLength: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var menuItemSelectedIcon: js.UndefOr[Validator[js.UndefOr[Null | RenderNode]]] = js.native
  
  var notFoundContent: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  
  var onBlur: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLElement] | Null]]] = js.native
  
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function2[
          /* value */ String, 
          (/* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any) | OptionsType, 
          Unit
        ]) | Null
      ]
    ]
  ] = js.native
  
  var onClear: js.UndefOr[Validator[js.UndefOr[Null | OnClear]]] = js.native
  
  var onClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[typings.std.Element] | Null]]] = js.native
  
  var onDeselect: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function2[
          /* value */ SingleType[String], 
          /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ /* option */ js.Any, 
          Unit
        ]) | Null
      ]
    ]
  ] = js.native
  
  var onDropdownVisibleChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* open */ Boolean, Unit]) | Null]]] = js.native
  
  var onFocus: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLElement] | Null]]] = js.native
  
  var onInputKeyDown: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLInputElement] | Null]]] = js.native
  
  var onKeyDown: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]] = js.native
  
  var onKeyUp: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]] = js.native
  
  var onMouseDown: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
  
  var onMouseEnter: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
  
  var onMouseLeave: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
  
  var onPopupScroll: js.UndefOr[Validator[js.UndefOr[Null | UIEventHandler[HTMLDivElement]]]] = js.native
  
  var onSearch: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* value */ String, Unit]) | Null]]] = js.native
  
  var onSelect: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function2[
          /* value */ SingleType[String], 
          /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ /* option */ js.Any, 
          Unit
        ]) | Null
      ]
    ]
  ] = js.native
  
  var open: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var optionFilterProp: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var options: js.UndefOr[Validator[js.UndefOr[Null | OptionsType]]] = js.native
  
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var ref: js.UndefOr[Validator[js.UndefOr[Null | typings.react.mod.Ref[RefSelectProps]]]] = js.native
  
  var removeIcon: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  
  var searchValue: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var showAction: js.UndefOr[Validator[js.UndefOr[(js.Array[focus | click]) | Null]]] = js.native
  
  var showArrow: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var showSearch: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var size: js.UndefOr[Validator[js.UndefOr[Null | SizeType]]] = js.native
  
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  
  var suffixIcon: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var tagRender: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ CustomTagProps, ReactElement]) | Null]]
  ] = js.native
  
  var tokenSeparators: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.native
  
  var transitionName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var value: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var virtual: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}
object WeakValidationMapAutoComp {
  
  @scala.inline
  def apply(): WeakValidationMapAutoComp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapAutoComp]
  }
  
  @scala.inline
  implicit class WeakValidationMapAutoCompMutableBuilder[Self <: WeakValidationMapAutoComp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowClear(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
    
    @scala.inline
    def setAnimation(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: Validator[js.UndefOr[none | `inline` | list | both | Null]]): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: Validator[js.UndefOr[grammar | spelling | Boolean | Null]]): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: Validator[js.UndefOr[off | assertive | polite | Null]]): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: Validator[js.UndefOr[horizontal | vertical | Null]]): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(
      value: Validator[
          js.UndefOr[
            additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text_ | (`text additions`) | (`text removals`) | Null
          ]
        ]
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: Validator[js.UndefOr[none | ascending | descending | other | Null]]): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    @scala.inline
    def setAutoClearSearchValue(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "autoClearSearchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoClearSearchValueUndefined: Self = StObject.set(x, "autoClearSearchValue", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setBackfill(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "backfill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackfillUndefined: Self = StObject.set(x, "backfill", js.undefined)
    
    @scala.inline
    def setBordered(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    @scala.inline
    def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChoiceTransitionName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "choiceTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoiceTransitionNameUndefined: Self = StObject.set(x, "choiceTransitionName", js.undefined)
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClearIcon(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    @scala.inline
    def setDataSource(value: Validator[js.UndefOr[js.Array[DataSourceItemType] | Null]]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDefaultActiveFirstOption(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "defaultActiveFirstOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActiveFirstOptionUndefined: Self = StObject.set(x, "defaultActiveFirstOption", js.undefined)
    
    @scala.inline
    def setDefaultOpen(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDirection(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDropdownAlign(value: Validator[js.UndefOr[_ | Null]]): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
    
    @scala.inline
    def setDropdownClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
    
    @scala.inline
    def setDropdownMatchSelectWidth(value: Validator[js.UndefOr[Boolean | Double | Null]]): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
    
    @scala.inline
    def setDropdownRender(value: Validator[js.UndefOr[(js.Function1[/* menu */ ReactElement, ReactElement]) | Null]]): Self = StObject.set(x, "dropdownRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
    
    @scala.inline
    def setDropdownStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownStyleUndefined: Self = StObject.set(x, "dropdownStyle", js.undefined)
    
    @scala.inline
    def setFilterOption(
      value: Validator[
          js.UndefOr[
            Boolean | (FilterFunc[
              /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
            ]) | Null
          ]
        ]
    ): Self = StObject.set(x, "filterOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
    
    @scala.inline
    def setGetInputElement(value: Validator[js.UndefOr[js.Function0[Element] | Null]]): Self = StObject.set(x, "getInputElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInputElementUndefined: Self = StObject.set(x, "getInputElement", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: Validator[js.UndefOr[Null | RenderDOMFunc]]): Self = StObject.set(x, "getPopupContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
    
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInputValue(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    @scala.inline
    def setInternalProps(value: Validator[js.UndefOr[typings.rcSelect.anon.Mark[OptionsType] | Null]]): Self = StObject.set(x, "internalProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalPropsUndefined: Self = StObject.set(x, "internalProps", js.undefined)
    
    @scala.inline
    def setKey(value: Validator[js.UndefOr[typings.react.mod.Key | Null]]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setListHeight(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListHeightUndefined: Self = StObject.set(x, "listHeight", js.undefined)
    
    @scala.inline
    def setListItemHeight(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemHeightUndefined: Self = StObject.set(x, "listItemHeight", js.undefined)
    
    @scala.inline
    def setMaxTagCount(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "maxTagCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTagCountUndefined: Self = StObject.set(x, "maxTagCount", js.undefined)
    
    @scala.inline
    def setMaxTagPlaceholder(
      value: Validator[
          js.UndefOr[
            (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode]) | Null | ReactNode
          ]
        ]
    ): Self = StObject.set(x, "maxTagPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTagPlaceholderUndefined: Self = StObject.set(x, "maxTagPlaceholder", js.undefined)
    
    @scala.inline
    def setMaxTagTextLength(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "maxTagTextLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTagTextLengthUndefined: Self = StObject.set(x, "maxTagTextLength", js.undefined)
    
    @scala.inline
    def setMenuItemSelectedIcon(value: Validator[js.UndefOr[Null | RenderNode]]): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemSelectedIconUndefined: Self = StObject.set(x, "menuItemSelectedIcon", js.undefined)
    
    @scala.inline
    def setNotFoundContent(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
    
    @scala.inline
    def setOnBlur(value: Validator[js.UndefOr[FocusEventHandler[HTMLElement] | Null]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: Validator[
          js.UndefOr[
            (js.Function2[
              /* value */ String, 
              (/* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any) | OptionsType, 
              Unit
            ]) | Null
          ]
        ]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClear(value: Validator[js.UndefOr[Null | OnClear]]): Self = StObject.set(x, "onClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    
    @scala.inline
    def setOnClick(value: Validator[js.UndefOr[MouseEventHandler[typings.std.Element] | Null]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnDeselect(
      value: Validator[
          js.UndefOr[
            (js.Function2[
              /* value */ SingleType[String], 
              /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ /* option */ js.Any, 
              Unit
            ]) | Null
          ]
        ]
    ): Self = StObject.set(x, "onDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
    
    @scala.inline
    def setOnDropdownVisibleChange(value: Validator[js.UndefOr[(js.Function1[/* open */ Boolean, Unit]) | Null]]): Self = StObject.set(x, "onDropdownVisibleChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDropdownVisibleChangeUndefined: Self = StObject.set(x, "onDropdownVisibleChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: Validator[js.UndefOr[FocusEventHandler[HTMLElement] | Null]]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnInputKeyDown(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onInputKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInputKeyDownUndefined: Self = StObject.set(x, "onInputKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnPopupScroll(value: Validator[js.UndefOr[Null | UIEventHandler[HTMLDivElement]]]): Self = StObject.set(x, "onPopupScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPopupScrollUndefined: Self = StObject.set(x, "onPopupScroll", js.undefined)
    
    @scala.inline
    def setOnSearch(value: Validator[js.UndefOr[(js.Function1[/* value */ String, Unit]) | Null]]): Self = StObject.set(x, "onSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    
    @scala.inline
    def setOnSelect(
      value: Validator[
          js.UndefOr[
            (js.Function2[
              /* value */ SingleType[String], 
              /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ /* option */ js.Any, 
              Unit
            ]) | Null
          ]
        ]
    ): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOpen(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setOptionFilterProp(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "optionFilterProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionFilterPropUndefined: Self = StObject.set(x, "optionFilterProp", js.undefined)
    
    @scala.inline
    def setOptions(value: Validator[js.UndefOr[Null | OptionsType]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRef(value: Validator[js.UndefOr[Null | typings.react.mod.Ref[RefSelectProps]]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRemoveIcon(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
    
    @scala.inline
    def setSearchValue(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
    
    @scala.inline
    def setShowAction(value: Validator[js.UndefOr[(js.Array[focus | click]) | Null]]): Self = StObject.set(x, "showAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowActionUndefined: Self = StObject.set(x, "showAction", js.undefined)
    
    @scala.inline
    def setShowArrow(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    @scala.inline
    def setShowSearch(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
    
    @scala.inline
    def setSize(value: Validator[js.UndefOr[Null | SizeType]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSuffixIcon(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTagRender(value: Validator[js.UndefOr[(js.Function1[/* props */ CustomTagProps, ReactElement]) | Null]]): Self = StObject.set(x, "tagRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagRenderUndefined: Self = StObject.set(x, "tagRender", js.undefined)
    
    @scala.inline
    def setTokenSeparators(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = StObject.set(x, "tokenSeparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenSeparatorsUndefined: Self = StObject.set(x, "tokenSeparators", js.undefined)
    
    @scala.inline
    def setTransitionName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    
    @scala.inline
    def setValue(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVirtual(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
