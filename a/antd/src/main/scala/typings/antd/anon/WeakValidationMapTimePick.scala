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
import typings.antd.antdStrings.copy
import typings.antd.antdStrings.date
import typings.antd.antdStrings.descending
import typings.antd.antdStrings.dialog
import typings.antd.antdStrings.execute
import typings.antd.antdStrings.grammar
import typings.antd.antdStrings.grid
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.link
import typings.antd.antdStrings.list
import typings.antd.antdStrings.listbox
import typings.antd.antdStrings.location
import typings.antd.antdStrings.ltr
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
import typings.antd.antdStrings.rtl
import typings.antd.antdStrings.spelling
import typings.antd.antdStrings.step
import typings.antd.antdStrings.text_
import typings.antd.antdStrings.time
import typings.antd.antdStrings.tree
import typings.antd.antdStrings.vertical
import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.generatePickerMod.PickerLocale
import typings.moment.mod.Moment
import typings.rcPicker.dateBodyMod.DateRender
import typings.rcPicker.interfaceMod.CustomFormat
import typings.rcPicker.interfaceMod.OnPanelChange
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.monthBodyMod.MonthCellRender
import typings.rcPicker.pickerMod.PickerRefConfig
import typings.rcTrigger.interfaceMod.AlignType
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<antd.antd/lib/time-picker.TimePickerProps & react.react.RefAttributes<any>> */
@js.native
trait WeakValidationMapTimePick extends StObject {
  
  var addon: js.UndefOr[Validator[js.UndefOr[js.Function0[ReactNode] | Null]]] = js.native
  
  var allowClear: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
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
  
  var autoComplete: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var autoFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var bordered: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var clearIcon: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  
  var dateRender: js.UndefOr[Validator[js.UndefOr[DateRender[Moment] | Null]]] = js.native
  
  var defaultOpen: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var defaultOpenValue: js.UndefOr[Validator[js.UndefOr[Moment | Null]]] = js.native
  
  var defaultPickerValue: js.UndefOr[Validator[js.UndefOr[Moment | Null]]] = js.native
  
  var defaultValue: js.UndefOr[Validator[js.UndefOr[Moment | Null]]] = js.native
  
  var direction: js.UndefOr[Validator[js.UndefOr[ltr | rtl | Null]]] = js.native
  
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var disabledDate: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* date */ Moment, Boolean]) | Null]]] = js.native
  
  var disabledHours: js.UndefOr[Validator[js.UndefOr[js.Function0[js.Array[Double]] | Null]]] = js.native
  
  var disabledMinutes: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* hour */ Double, js.Array[Double]]) | Null]]
  ] = js.native
  
  var disabledSeconds: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]) | Null]
    ]
  ] = js.native
  
  var dropdownAlign: js.UndefOr[Validator[js.UndefOr[AlignType | Null]]] = js.native
  
  var dropdownClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var format: js.UndefOr[
    Validator[
      js.UndefOr[(js.Array[CustomFormat[Moment] | String]) | CustomFormat[Moment] | Null | String]
    ]
  ] = js.native
  
  var getPopupContainer: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, HTMLElement]) | Null]]
  ] = js.native
  
  var hideDisabledOptions: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var hourStep: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var inputReadOnly: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var key: js.UndefOr[Validator[js.UndefOr[typings.react.mod.Key | Null]]] = js.native
  
  var locale: js.UndefOr[Validator[js.UndefOr[Null | PickerLocale]]] = js.native
  
  var minuteStep: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var mode: js.UndefOr[Validator[js.UndefOr[Null | PanelMode]]] = js.native
  
  var monthCellRender: js.UndefOr[Validator[js.UndefOr[MonthCellRender[Moment] | Null]]] = js.native
  
  var name: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var onBlur: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]]] = js.native
  
  var onChange: js.UndefOr[
    Validator[js.UndefOr[(js.Function2[Moment | Null, /* dateString */ String, Unit]) | Null]]
  ] = js.native
  
  var onClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
  
  var onContextMenu: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
  
  var onFocus: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]]] = js.native
  
  var onMouseDown: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
  
  var onMouseEnter: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
  
  var onMouseLeave: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
  
  var onMouseUp: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.native
  
  var onOk: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* date */ Moment, Unit]) | Null]]] = js.native
  
  var onOpenChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* open */ Boolean, Unit]) | Null]]] = js.native
  
  var onPanelChange: js.UndefOr[Validator[js.UndefOr[Null | OnPanelChange[Moment]]]] = js.native
  
  var onSelect: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* value */ Moment, Unit]) | Null]]] = js.native
  
  var open: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var panelRender: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* originPanel */ ReactNode, ReactNode]) | Null]]
  ] = js.native
  
  var pickerRef: js.UndefOr[Validator[js.UndefOr[MutableRefObject[PickerRefConfig] | Null]]] = js.native
  
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var popupClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var popupStyle: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var ref: js.UndefOr[Validator[js.UndefOr[Null | typings.react.mod.Ref[_]]]] = js.native
  
  var renderExtraFooter: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* mode */ PanelMode, ReactNode]) | Null]]] = js.native
  
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var secondStep: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var showHour: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var showMinute: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var showNow: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var showSecond: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var size: js.UndefOr[Validator[js.UndefOr[Null | SizeType]]] = js.native
  
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  
  var suffixIcon: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var transitionName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var use12Hours: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var value: js.UndefOr[Validator[js.UndefOr[Moment | Null]]] = js.native
}
object WeakValidationMapTimePick {
  
  @scala.inline
  def apply(): WeakValidationMapTimePick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTimePick]
  }
  
  @scala.inline
  implicit class WeakValidationMapTimePickMutableBuilder[Self <: WeakValidationMapTimePick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddon(value: Validator[js.UndefOr[js.Function0[ReactNode] | Null]]): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
    
    @scala.inline
    def setAllowClear(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
    
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
    def setAutoComplete(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setBordered(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClearIcon(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    @scala.inline
    def setDateRender(value: Validator[js.UndefOr[DateRender[Moment] | Null]]): Self = StObject.set(x, "dateRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
    
    @scala.inline
    def setDefaultOpen(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
    
    @scala.inline
    def setDefaultOpenValue(value: Validator[js.UndefOr[Moment | Null]]): Self = StObject.set(x, "defaultOpenValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOpenValueUndefined: Self = StObject.set(x, "defaultOpenValue", js.undefined)
    
    @scala.inline
    def setDefaultPickerValue(value: Validator[js.UndefOr[Moment | Null]]): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Validator[js.UndefOr[Moment | Null]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDirection(value: Validator[js.UndefOr[ltr | rtl | Null]]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledDate(value: Validator[js.UndefOr[(js.Function1[/* date */ Moment, Boolean]) | Null]]): Self = StObject.set(x, "disabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
    
    @scala.inline
    def setDisabledHours(value: Validator[js.UndefOr[js.Function0[js.Array[Double]] | Null]]): Self = StObject.set(x, "disabledHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
    
    @scala.inline
    def setDisabledMinutes(value: Validator[js.UndefOr[(js.Function1[/* hour */ Double, js.Array[Double]]) | Null]]): Self = StObject.set(x, "disabledMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
    
    @scala.inline
    def setDisabledSeconds(
      value: Validator[
          js.UndefOr[(js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]) | Null]
        ]
    ): Self = StObject.set(x, "disabledSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDropdownAlign(value: Validator[js.UndefOr[AlignType | Null]]): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
    
    @scala.inline
    def setDropdownClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
    
    @scala.inline
    def setFormat(
      value: Validator[
          js.UndefOr[(js.Array[CustomFormat[Moment] | String]) | CustomFormat[Moment] | Null | String]
        ]
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, HTMLElement]) | Null]]): Self = StObject.set(x, "getPopupContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
    
    @scala.inline
    def setHideDisabledOptions(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
    
    @scala.inline
    def setHourStep(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
    
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInputReadOnly(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
    
    @scala.inline
    def setKey(value: Validator[js.UndefOr[typings.react.mod.Key | Null]]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLocale(value: Validator[js.UndefOr[Null | PickerLocale]]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMinuteStep(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
    
    @scala.inline
    def setMode(value: Validator[js.UndefOr[Null | PanelMode]]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setMonthCellRender(value: Validator[js.UndefOr[MonthCellRender[Moment] | Null]]): Self = StObject.set(x, "monthCellRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
    
    @scala.inline
    def setName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnBlur(value: Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: Validator[js.UndefOr[(js.Function2[Moment | Null, /* dateString */ String, Unit]) | Null]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnFocus(value: Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
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
    def setOnMouseUp(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnOk(value: Validator[js.UndefOr[(js.Function1[/* date */ Moment, Unit]) | Null]]): Self = StObject.set(x, "onOk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    
    @scala.inline
    def setOnOpenChange(value: Validator[js.UndefOr[(js.Function1[/* open */ Boolean, Unit]) | Null]]): Self = StObject.set(x, "onOpenChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
    
    @scala.inline
    def setOnPanelChange(value: Validator[js.UndefOr[Null | OnPanelChange[Moment]]]): Self = StObject.set(x, "onPanelChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
    
    @scala.inline
    def setOnSelect(value: Validator[js.UndefOr[(js.Function1[/* value */ Moment, Unit]) | Null]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOpen(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPanelRender(value: Validator[js.UndefOr[(js.Function1[/* originPanel */ ReactNode, ReactNode]) | Null]]): Self = StObject.set(x, "panelRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelRenderUndefined: Self = StObject.set(x, "panelRender", js.undefined)
    
    @scala.inline
    def setPickerRef(value: Validator[js.UndefOr[MutableRefObject[PickerRefConfig] | Null]]): Self = StObject.set(x, "pickerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerRefUndefined: Self = StObject.set(x, "pickerRef", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPopupClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
    
    @scala.inline
    def setPopupStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRef(value: Validator[js.UndefOr[Null | typings.react.mod.Ref[_]]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRenderExtraFooter(value: Validator[js.UndefOr[(js.Function1[/* mode */ PanelMode, ReactNode]) | Null]]): Self = StObject.set(x, "renderExtraFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
    
    @scala.inline
    def setRole(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSecondStep(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
    
    @scala.inline
    def setShowHour(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
    
    @scala.inline
    def setShowMinute(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
    
    @scala.inline
    def setShowNow(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
    
    @scala.inline
    def setShowSecond(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
    
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
    def setTransitionName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    
    @scala.inline
    def setUse12Hours(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
    
    @scala.inline
    def setValue(value: Validator[js.UndefOr[Moment | Null]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
