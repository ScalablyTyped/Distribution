package typings.antd

import typings.antd.antdStrings.`additions text`
import typings.antd.antdStrings.`inline`
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
import typings.antd.antdStrings.text
import typings.antd.antdStrings.time
import typings.antd.antdStrings.tree
import typings.antd.antdStrings.vertical
import typings.antd.generatePickerMod.PickerLocale
import typings.antd.sizeContextMod.SizeType
import typings.moment.mod.Moment
import typings.rcPicker.dateBodyMod.DateRender
import typings.rcPicker.interfaceMod.OnPanelChange
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.monthBodyMod.MonthCellRender
import typings.rcPicker.pickerMod.PickerRefConfig
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEventHandler
import typings.react.mod.Key
import typings.react.mod.MouseEventHandler
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.Validator
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/time-picker.TimePickerProps & react.react.RefAttributes<any>> */
trait WeakValidationMapTimePick extends js.Object {
  var addon: js.UndefOr[Validator[js.UndefOr[js.Function0[ReactNode] | Null]]] = js.undefined
  var allowClear: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-activedescendant`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-atomic`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-autocomplete`: js.UndefOr[Validator[js.UndefOr[none | `inline` | list | both | Null]]] = js.undefined
  var `aria-busy`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-checked`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.undefined
  var `aria-colcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-colindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-colspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-controls`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-current`: js.UndefOr[Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]] = js.undefined
  var `aria-describedby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-details`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-disabled`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-dropeffect`: js.UndefOr[Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]] = js.undefined
  var `aria-errormessage`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-expanded`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-flowto`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-grabbed`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-haspopup`: js.UndefOr[Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]] = js.undefined
  var `aria-hidden`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-invalid`: js.UndefOr[Validator[js.UndefOr[grammar | spelling | Boolean | Null]]] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-labelledby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-level`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-live`: js.UndefOr[Validator[js.UndefOr[off | assertive | polite | Null]]] = js.undefined
  var `aria-modal`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-multiline`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-orientation`: js.UndefOr[Validator[js.UndefOr[horizontal | vertical | Null]]] = js.undefined
  var `aria-owns`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-placeholder`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-posinset`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-pressed`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.undefined
  var `aria-readonly`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-relevant`: js.UndefOr[
    Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]]
  ] = js.undefined
  var `aria-required`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-roledescription`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var `aria-rowcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-rowindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-rowspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-selected`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var `aria-setsize`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-sort`: js.UndefOr[Validator[js.UndefOr[none | ascending | descending | other | Null]]] = js.undefined
  var `aria-valuemax`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-valuemin`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-valuenow`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var `aria-valuetext`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var autoFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var bordered: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var clearIcon: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var dateRender: js.UndefOr[Validator[js.UndefOr[DateRender[Moment] | Null]]] = js.undefined
  var defaultOpen: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var defaultOpenValue: js.UndefOr[Validator[js.UndefOr[Moment | Null]]] = js.undefined
  var defaultPickerValue: js.UndefOr[Validator[js.UndefOr[Moment | Null]]] = js.undefined
  var defaultValue: js.UndefOr[Validator[js.UndefOr[Moment | Null]]] = js.undefined
  var direction: js.UndefOr[Validator[js.UndefOr[ltr | rtl | Null]]] = js.undefined
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var disabledDate: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* date */ Moment, Boolean]) | Null]]] = js.undefined
  var disabledHours: js.UndefOr[Validator[js.UndefOr[js.Function0[js.Array[Double]] | Null]]] = js.undefined
  var disabledMinutes: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* hour */ Double, js.Array[Double]]) | Null]]
  ] = js.undefined
  var disabledSeconds: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]) | Null]
    ]
  ] = js.undefined
  var dropdownAlign: js.UndefOr[
    Validator[
      js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ _) | Null
      ]
    ]
  ] = js.undefined
  var dropdownClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var format: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null | String]]] = js.undefined
  var getPopupContainer: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, HTMLElement]) | Null]]
  ] = js.undefined
  var hideDisabledOptions: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var hourStep: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var inputReadOnly: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.undefined
  var locale: js.UndefOr[Validator[js.UndefOr[Null | PickerLocale]]] = js.undefined
  var minuteStep: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var mode: js.UndefOr[Validator[js.UndefOr[Null | PanelMode]]] = js.undefined
  var monthCellRender: js.UndefOr[Validator[js.UndefOr[MonthCellRender[Moment] | Null]]] = js.undefined
  var name: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var onBlur: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]]] = js.undefined
  var onChange: js.UndefOr[
    Validator[js.UndefOr[(js.Function2[Moment | Null, /* dateString */ String, Unit]) | Null]]
  ] = js.undefined
  var onClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onContextMenu: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onFocus: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]]] = js.undefined
  var onMouseDown: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseEnter: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseLeave: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onMouseUp: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]] = js.undefined
  var onOk: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* date */ Moment, Unit]) | Null]]] = js.undefined
  var onOpenChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* open */ Boolean, Unit]) | Null]]] = js.undefined
  var onPanelChange: js.UndefOr[Validator[js.UndefOr[Null | OnPanelChange[Moment]]]] = js.undefined
  var onSelect: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* value */ Moment, Unit]) | Null]]] = js.undefined
  var open: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var pickerRef: js.UndefOr[Validator[js.UndefOr[MutableRefObject[PickerRefConfig] | Null]]] = js.undefined
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var popupClassName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var popupStyle: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[_]]]] = js.undefined
  var renderExtraFooter: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* mode */ PanelMode, ReactNode]) | Null]]] = js.undefined
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var secondStep: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var showHour: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var showMinute: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var showSecond: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var size: js.UndefOr[Validator[js.UndefOr[Null | SizeType]]] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
  var suffixIcon: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var transitionName: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var use12Hours: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var value: js.UndefOr[Validator[js.UndefOr[Moment | Null]]] = js.undefined
}

object WeakValidationMapTimePick {
  @scala.inline
  def apply(
    addon: Validator[js.UndefOr[js.Function0[ReactNode] | Null]] = null,
    allowClear: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-activedescendant`: Validator[js.UndefOr[Null | String]] = null,
    `aria-atomic`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-autocomplete`: Validator[js.UndefOr[none | `inline` | list | both | Null]] = null,
    `aria-busy`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-checked`: Validator[js.UndefOr[mixed | Boolean | Null]] = null,
    `aria-colcount`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-colindex`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-colspan`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-controls`: Validator[js.UndefOr[Null | String]] = null,
    `aria-current`: Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]] = null,
    `aria-describedby`: Validator[js.UndefOr[Null | String]] = null,
    `aria-details`: Validator[js.UndefOr[Null | String]] = null,
    `aria-disabled`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-dropeffect`: Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]] = null,
    `aria-errormessage`: Validator[js.UndefOr[Null | String]] = null,
    `aria-expanded`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-flowto`: Validator[js.UndefOr[Null | String]] = null,
    `aria-grabbed`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-haspopup`: Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]] = null,
    `aria-hidden`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-invalid`: Validator[js.UndefOr[grammar | spelling | Boolean | Null]] = null,
    `aria-keyshortcuts`: Validator[js.UndefOr[Null | String]] = null,
    `aria-label`: Validator[js.UndefOr[Null | String]] = null,
    `aria-labelledby`: Validator[js.UndefOr[Null | String]] = null,
    `aria-level`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-live`: Validator[js.UndefOr[off | assertive | polite | Null]] = null,
    `aria-modal`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-multiline`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-multiselectable`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-orientation`: Validator[js.UndefOr[horizontal | vertical | Null]] = null,
    `aria-owns`: Validator[js.UndefOr[Null | String]] = null,
    `aria-placeholder`: Validator[js.UndefOr[Null | String]] = null,
    `aria-posinset`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-pressed`: Validator[js.UndefOr[mixed | Boolean | Null]] = null,
    `aria-readonly`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-relevant`: Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]] = null,
    `aria-required`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-roledescription`: Validator[js.UndefOr[Null | String]] = null,
    `aria-rowcount`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-rowindex`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-rowspan`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-selected`: Validator[js.UndefOr[Boolean | Null]] = null,
    `aria-setsize`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-sort`: Validator[js.UndefOr[none | ascending | descending | other | Null]] = null,
    `aria-valuemax`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-valuemin`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-valuenow`: Validator[js.UndefOr[Double | Null]] = null,
    `aria-valuetext`: Validator[js.UndefOr[Null | String]] = null,
    autoFocus: Validator[js.UndefOr[Boolean | Null]] = null,
    bordered: Validator[js.UndefOr[Boolean | Null]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    clearIcon: Validator[js.UndefOr[Null | ReactNode]] = null,
    dateRender: Validator[js.UndefOr[DateRender[Moment] | Null]] = null,
    defaultOpen: Validator[js.UndefOr[Boolean | Null]] = null,
    defaultOpenValue: Validator[js.UndefOr[Moment | Null]] = null,
    defaultPickerValue: Validator[js.UndefOr[Moment | Null]] = null,
    defaultValue: Validator[js.UndefOr[Moment | Null]] = null,
    direction: Validator[js.UndefOr[ltr | rtl | Null]] = null,
    disabled: Validator[js.UndefOr[Boolean | Null]] = null,
    disabledDate: Validator[js.UndefOr[(js.Function1[/* date */ Moment, Boolean]) | Null]] = null,
    disabledHours: Validator[js.UndefOr[js.Function0[js.Array[Double]] | Null]] = null,
    disabledMinutes: Validator[js.UndefOr[(js.Function1[/* hour */ Double, js.Array[Double]]) | Null]] = null,
    disabledSeconds: Validator[
      js.UndefOr[(js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]) | Null]
    ] = null,
    dropdownAlign: Validator[
      js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ _) | Null
      ]
    ] = null,
    dropdownClassName: Validator[js.UndefOr[Null | String]] = null,
    format: Validator[js.UndefOr[js.Array[String] | Null | String]] = null,
    getPopupContainer: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, HTMLElement]) | Null]] = null,
    hideDisabledOptions: Validator[js.UndefOr[Boolean | Null]] = null,
    hourStep: Validator[js.UndefOr[Double | Null]] = null,
    inputReadOnly: Validator[js.UndefOr[Boolean | Null]] = null,
    key: Validator[js.UndefOr[Key | Null]] = null,
    locale: Validator[js.UndefOr[Null | PickerLocale]] = null,
    minuteStep: Validator[js.UndefOr[Double | Null]] = null,
    mode: Validator[js.UndefOr[Null | PanelMode]] = null,
    monthCellRender: Validator[js.UndefOr[MonthCellRender[Moment] | Null]] = null,
    name: Validator[js.UndefOr[Null | String]] = null,
    onBlur: Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]] = null,
    onChange: Validator[js.UndefOr[(js.Function2[Moment | Null, /* dateString */ String, Unit]) | Null]] = null,
    onClick: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onContextMenu: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onFocus: Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]] = null,
    onMouseDown: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onMouseEnter: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onMouseLeave: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onMouseUp: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]] = null,
    onOk: Validator[js.UndefOr[(js.Function1[/* date */ Moment, Unit]) | Null]] = null,
    onOpenChange: Validator[js.UndefOr[(js.Function1[/* open */ Boolean, Unit]) | Null]] = null,
    onPanelChange: Validator[js.UndefOr[Null | OnPanelChange[Moment]]] = null,
    onSelect: Validator[js.UndefOr[(js.Function1[/* value */ Moment, Unit]) | Null]] = null,
    open: Validator[js.UndefOr[Boolean | Null]] = null,
    pickerRef: Validator[js.UndefOr[MutableRefObject[PickerRefConfig] | Null]] = null,
    placeholder: Validator[js.UndefOr[Null | String]] = null,
    popupClassName: Validator[js.UndefOr[Null | String]] = null,
    popupStyle: Validator[js.UndefOr[CSSProperties | Null]] = null,
    prefixCls: Validator[js.UndefOr[Null | String]] = null,
    ref: Validator[js.UndefOr[Null | Ref[_]]] = null,
    renderExtraFooter: Validator[js.UndefOr[(js.Function1[/* mode */ PanelMode, ReactNode]) | Null]] = null,
    role: Validator[js.UndefOr[Null | String]] = null,
    secondStep: Validator[js.UndefOr[Double | Null]] = null,
    showHour: Validator[js.UndefOr[Boolean | Null]] = null,
    showMinute: Validator[js.UndefOr[Boolean | Null]] = null,
    showSecond: Validator[js.UndefOr[Boolean | Null]] = null,
    size: Validator[js.UndefOr[Null | SizeType]] = null,
    style: Validator[js.UndefOr[CSSProperties | Null]] = null,
    suffixIcon: Validator[js.UndefOr[Null | ReactNode]] = null,
    tabIndex: Validator[js.UndefOr[Double | Null]] = null,
    transitionName: Validator[js.UndefOr[Null | String]] = null,
    use12Hours: Validator[js.UndefOr[Boolean | Null]] = null,
    value: Validator[js.UndefOr[Moment | Null]] = null
  ): WeakValidationMapTimePick = {
    val __obj = js.Dynamic.literal()
    if (addon != null) __obj.updateDynamic("addon")(addon.asInstanceOf[js.Any])
    if (allowClear != null) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (`aria-atomic` != null) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (`aria-busy` != null) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (`aria-disabled` != null) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (`aria-expanded` != null) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (`aria-grabbed` != null) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (`aria-hidden` != null) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (`aria-modal` != null) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (`aria-multiline` != null) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (`aria-multiselectable` != null) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (`aria-readonly` != null) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (`aria-required` != null) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (`aria-selected` != null) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoFocus != null) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (bordered != null) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(dateRender.asInstanceOf[js.Any])
    if (defaultOpen != null) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultOpenValue != null) __obj.updateDynamic("defaultOpenValue")(defaultOpenValue.asInstanceOf[js.Any])
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(disabledDate.asInstanceOf[js.Any])
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(disabledHours.asInstanceOf[js.Any])
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(disabledMinutes.asInstanceOf[js.Any])
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(disabledSeconds.asInstanceOf[js.Any])
    if (dropdownAlign != null) __obj.updateDynamic("dropdownAlign")(dropdownAlign.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(getPopupContainer.asInstanceOf[js.Any])
    if (hideDisabledOptions != null) __obj.updateDynamic("hideDisabledOptions")(hideDisabledOptions.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (inputReadOnly != null) __obj.updateDynamic("inputReadOnly")(inputReadOnly.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(monthCellRender.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onOk != null) __obj.updateDynamic("onOk")(onOk.asInstanceOf[js.Any])
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(onOpenChange.asInstanceOf[js.Any])
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(onPanelChange.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (pickerRef != null) __obj.updateDynamic("pickerRef")(pickerRef.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(renderExtraFooter.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (showHour != null) __obj.updateDynamic("showHour")(showHour.asInstanceOf[js.Any])
    if (showMinute != null) __obj.updateDynamic("showMinute")(showMinute.asInstanceOf[js.Any])
    if (showSecond != null) __obj.updateDynamic("showSecond")(showSecond.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (use12Hours != null) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapTimePick]
  }
}

