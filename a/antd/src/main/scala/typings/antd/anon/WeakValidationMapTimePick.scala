package typings.antd.anon

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
import typings.rcTrigger.interfaceMod.AlignType
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<antd.antd/lib/time-picker.TimePickerProps & react.react.RefAttributes<any>> */
@js.native
trait WeakValidationMapTimePick extends js.Object {
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
    Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]]
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
  var format: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null | String]]] = js.native
  var getPopupContainer: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, HTMLElement]) | Null]]
  ] = js.native
  var hideDisabledOptions: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var hourStep: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var inputReadOnly: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.native
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
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[_]]]] = js.native
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
  implicit class WeakValidationMapTimePickOps[Self <: WeakValidationMapTimePick] (val x: Self) extends AnyVal {
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
    def setAddon(value: Validator[js.UndefOr[js.Function0[ReactNode] | Null]]): Self = this.set("addon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddon: Self = this.set("addon", js.undefined)
    @scala.inline
    def setAllowClear(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    @scala.inline
    def `setAria-activedescendant`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    @scala.inline
    def `setAria-atomic`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    @scala.inline
    def `setAria-autocomplete`(value: Validator[js.UndefOr[none | `inline` | list | both | Null]]): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    @scala.inline
    def `setAria-busy`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    @scala.inline
    def `setAria-checked`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    @scala.inline
    def `setAria-colcount`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    @scala.inline
    def `setAria-colindex`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    @scala.inline
    def `setAria-colspan`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    @scala.inline
    def `setAria-controls`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    @scala.inline
    def `setAria-current`(value: Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    @scala.inline
    def `setAria-describedby`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    @scala.inline
    def `setAria-details`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    @scala.inline
    def `setAria-disabled`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    @scala.inline
    def `setAria-dropeffect`(value: Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    @scala.inline
    def `setAria-errormessage`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    @scala.inline
    def `setAria-expanded`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    @scala.inline
    def `setAria-flowto`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    @scala.inline
    def `setAria-grabbed`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    @scala.inline
    def `setAria-haspopup`(value: Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    @scala.inline
    def `setAria-hidden`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    @scala.inline
    def `setAria-invalid`(value: Validator[js.UndefOr[grammar | spelling | Boolean | Null]]): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    @scala.inline
    def `setAria-keyshortcuts`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    @scala.inline
    def `setAria-label`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def `setAria-level`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    @scala.inline
    def `setAria-live`(value: Validator[js.UndefOr[off | assertive | polite | Null]]): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    @scala.inline
    def `setAria-modal`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    @scala.inline
    def `setAria-multiline`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    @scala.inline
    def `setAria-multiselectable`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    @scala.inline
    def `setAria-orientation`(value: Validator[js.UndefOr[horizontal | vertical | Null]]): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    @scala.inline
    def `setAria-owns`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    @scala.inline
    def `setAria-placeholder`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    @scala.inline
    def `setAria-posinset`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    @scala.inline
    def `setAria-pressed`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    @scala.inline
    def `setAria-readonly`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    @scala.inline
    def `setAria-relevant`(value: Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]]): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    @scala.inline
    def `setAria-required`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    @scala.inline
    def `setAria-roledescription`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    @scala.inline
    def `setAria-rowcount`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    @scala.inline
    def `setAria-rowindex`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    @scala.inline
    def `setAria-rowspan`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    @scala.inline
    def `setAria-selected`(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    @scala.inline
    def `setAria-setsize`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    @scala.inline
    def `setAria-sort`(value: Validator[js.UndefOr[none | ascending | descending | other | Null]]): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    @scala.inline
    def `setAria-valuemax`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    @scala.inline
    def `setAria-valuemin`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    @scala.inline
    def `setAria-valuenow`(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    @scala.inline
    def `setAria-valuetext`(value: Validator[js.UndefOr[Null | String]]): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    @scala.inline
    def setAutoComplete(value: Validator[js.UndefOr[Null | String]]): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setBordered(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClearIcon(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    @scala.inline
    def setDateRender(value: Validator[js.UndefOr[DateRender[Moment] | Null]]): Self = this.set("dateRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateRender: Self = this.set("dateRender", js.undefined)
    @scala.inline
    def setDefaultOpen(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    @scala.inline
    def setDefaultOpenValue(value: Validator[js.UndefOr[Moment | Null]]): Self = this.set("defaultOpenValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpenValue: Self = this.set("defaultOpenValue", js.undefined)
    @scala.inline
    def setDefaultPickerValue(value: Validator[js.UndefOr[Moment | Null]]): Self = this.set("defaultPickerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPickerValue: Self = this.set("defaultPickerValue", js.undefined)
    @scala.inline
    def setDefaultValue(value: Validator[js.UndefOr[Moment | Null]]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDirection(value: Validator[js.UndefOr[ltr | rtl | Null]]): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledDate(value: Validator[js.UndefOr[(js.Function1[/* date */ Moment, Boolean]) | Null]]): Self = this.set("disabledDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDate: Self = this.set("disabledDate", js.undefined)
    @scala.inline
    def setDisabledHours(value: Validator[js.UndefOr[js.Function0[js.Array[Double]] | Null]]): Self = this.set("disabledHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledHours: Self = this.set("disabledHours", js.undefined)
    @scala.inline
    def setDisabledMinutes(value: Validator[js.UndefOr[(js.Function1[/* hour */ Double, js.Array[Double]]) | Null]]): Self = this.set("disabledMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledMinutes: Self = this.set("disabledMinutes", js.undefined)
    @scala.inline
    def setDisabledSeconds(
      value: Validator[
          js.UndefOr[(js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]) | Null]
        ]
    ): Self = this.set("disabledSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledSeconds: Self = this.set("disabledSeconds", js.undefined)
    @scala.inline
    def setDropdownAlign(value: Validator[js.UndefOr[AlignType | Null]]): Self = this.set("dropdownAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownAlign: Self = this.set("dropdownAlign", js.undefined)
    @scala.inline
    def setDropdownClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("dropdownClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownClassName: Self = this.set("dropdownClassName", js.undefined)
    @scala.inline
    def setFormat(value: Validator[js.UndefOr[js.Array[String] | Null | String]]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: Validator[js.UndefOr[(js.Function1[/* node */ HTMLElement, HTMLElement]) | Null]]): Self = this.set("getPopupContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setHideDisabledOptions(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("hideDisabledOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDisabledOptions: Self = this.set("hideDisabledOptions", js.undefined)
    @scala.inline
    def setHourStep(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("hourStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourStep: Self = this.set("hourStep", js.undefined)
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputReadOnly(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("inputReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputReadOnly: Self = this.set("inputReadOnly", js.undefined)
    @scala.inline
    def setKey(value: Validator[js.UndefOr[Key | Null]]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLocale(value: Validator[js.UndefOr[Null | PickerLocale]]): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMinuteStep(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    @scala.inline
    def setMode(value: Validator[js.UndefOr[Null | PanelMode]]): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMonthCellRender(value: Validator[js.UndefOr[MonthCellRender[Moment] | Null]]): Self = this.set("monthCellRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthCellRender: Self = this.set("monthCellRender", js.undefined)
    @scala.inline
    def setName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnBlur(value: Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]]): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: Validator[js.UndefOr[(js.Function2[Moment | Null, /* dateString */ String, Unit]) | Null]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnContextMenu(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = this.set("onContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnFocus(value: Validator[js.UndefOr[FocusEventHandler[HTMLInputElement] | Null]]): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnMouseDown(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = this.set("onMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = this.set("onMouseEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = this.set("onMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseUp(value: Validator[js.UndefOr[MouseEventHandler[HTMLDivElement] | Null]]): Self = this.set("onMouseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnOk(value: Validator[js.UndefOr[(js.Function1[/* date */ Moment, Unit]) | Null]]): Self = this.set("onOk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    @scala.inline
    def setOnOpenChange(value: Validator[js.UndefOr[(js.Function1[/* open */ Boolean, Unit]) | Null]]): Self = this.set("onOpenChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOpenChange: Self = this.set("onOpenChange", js.undefined)
    @scala.inline
    def setOnPanelChange(value: Validator[js.UndefOr[Null | OnPanelChange[Moment]]]): Self = this.set("onPanelChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPanelChange: Self = this.set("onPanelChange", js.undefined)
    @scala.inline
    def setOnSelect(value: Validator[js.UndefOr[(js.Function1[/* value */ Moment, Unit]) | Null]]): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOpen(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPanelRender(value: Validator[js.UndefOr[(js.Function1[/* originPanel */ ReactNode, ReactNode]) | Null]]): Self = this.set("panelRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelRender: Self = this.set("panelRender", js.undefined)
    @scala.inline
    def setPickerRef(value: Validator[js.UndefOr[MutableRefObject[PickerRefConfig] | Null]]): Self = this.set("pickerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerRef: Self = this.set("pickerRef", js.undefined)
    @scala.inline
    def setPlaceholder(value: Validator[js.UndefOr[Null | String]]): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopupClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("popupClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupClassName: Self = this.set("popupClassName", js.undefined)
    @scala.inline
    def setPopupStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = this.set("popupStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupStyle: Self = this.set("popupStyle", js.undefined)
    @scala.inline
    def setPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRef(value: Validator[js.UndefOr[Null | Ref[_]]]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRenderExtraFooter(value: Validator[js.UndefOr[(js.Function1[/* mode */ PanelMode, ReactNode]) | Null]]): Self = this.set("renderExtraFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderExtraFooter: Self = this.set("renderExtraFooter", js.undefined)
    @scala.inline
    def setRole(value: Validator[js.UndefOr[Null | String]]): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSecondStep(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("secondStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondStep: Self = this.set("secondStep", js.undefined)
    @scala.inline
    def setShowHour(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("showHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHour: Self = this.set("showHour", js.undefined)
    @scala.inline
    def setShowMinute(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("showMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMinute: Self = this.set("showMinute", js.undefined)
    @scala.inline
    def setShowNow(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("showNow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNow: Self = this.set("showNow", js.undefined)
    @scala.inline
    def setShowSecond(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("showSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSecond: Self = this.set("showSecond", js.undefined)
    @scala.inline
    def setSize(value: Validator[js.UndefOr[Null | SizeType]]): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuffixIcon(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixIcon: Self = this.set("suffixIcon", js.undefined)
    @scala.inline
    def setTabIndex(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTransitionName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setUse12Hours(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("use12Hours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse12Hours: Self = this.set("use12Hours", js.undefined)
    @scala.inline
    def setValue(value: Validator[js.UndefOr[Moment | Null]]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

