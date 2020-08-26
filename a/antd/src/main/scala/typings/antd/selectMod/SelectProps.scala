package typings.antd.selectMod

import typings.antd.antdStrings.`additions text`
import typings.antd.antdStrings.`inline`
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
import typings.antd.antdStrings.multiple
import typings.antd.antdStrings.none
import typings.antd.antdStrings.off
import typings.antd.antdStrings.other
import typings.antd.antdStrings.page
import typings.antd.antdStrings.polite
import typings.antd.antdStrings.popup
import typings.antd.antdStrings.removals
import typings.antd.antdStrings.spelling
import typings.antd.antdStrings.step
import typings.antd.antdStrings.tags
import typings.antd.antdStrings.text
import typings.antd.antdStrings.time
import typings.antd.antdStrings.tree
import typings.antd.antdStrings.vertical
import typings.antd.sizeContextMod.SizeType
import typings.rcSelect.anon.Mark
import typings.rcSelect.generatorMod.CustomTagProps
import typings.rcSelect.generatorMod.FilterFunc
import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.generatorMod.OnClear
import typings.rcSelect.generatorMod.SingleType
import typings.rcSelect.interfaceMod.OptionData
import typings.rcSelect.interfaceMod.OptionGroupData
import typings.rcSelect.interfaceMod.OptionsType
import typings.rcSelect.interfaceMod.RenderDOMFunc
import typings.rcSelect.interfaceMod.RenderNode
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<antd.antd/lib/select.InternalSelectProps<VT>, 'inputIcon' | 'mode' | 'getInputElement' | 'backfill'> */
@js.native
trait SelectProps[VT] extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[String] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: js.UndefOr[String] = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var autoClearSearchValue: js.UndefOr[Boolean] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var bordered: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var choiceTransitionName: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var clearIcon: js.UndefOr[ReactNode] = js.native
  var defaultActiveFirstOption: js.UndefOr[Boolean] = js.native
  var defaultOpen: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[VT] = js.native
  var direction: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropdownAlign: js.UndefOr[js.Any] = js.native
  var dropdownClassName: js.UndefOr[String] = js.native
  var dropdownMatchSelectWidth: js.UndefOr[Boolean | Double] = js.native
  var dropdownRender: js.UndefOr[js.Function1[/* menu */ ReactElement, ReactElement]] = js.native
  var dropdownStyle: js.UndefOr[CSSProperties] = js.native
  var filterOption: js.UndefOr[
    Boolean | (FilterFunc[
      /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
    ])
  ] = js.native
  var getPopupContainer: js.UndefOr[RenderDOMFunc] = js.native
  var id: js.UndefOr[String] = js.native
  var inputValue: js.UndefOr[String] = js.native
  var internalProps: js.UndefOr[Mark[OptionsType]] = js.native
  var labelInValue: js.UndefOr[Boolean] = js.native
  var listHeight: js.UndefOr[Double] = js.native
  var listItemHeight: js.UndefOr[Double] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var maxTagCount: js.UndefOr[Double] = js.native
  var maxTagPlaceholder: js.UndefOr[
    ReactNode | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode])
  ] = js.native
  var maxTagTextLength: js.UndefOr[Double] = js.native
  var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.native
  var mode: js.UndefOr[multiple | tags] = js.native
  var notFoundContent: js.UndefOr[ReactNode] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ VT, 
      /* option */ (/* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any) | OptionsType, 
      Unit
    ]
  ] = js.native
  var onClear: js.UndefOr[OnClear] = js.native
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.native
  var onDeselect: js.UndefOr[
    js.Function2[
      /* value */ SingleType[VT], 
      /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ /* option */ js.Any, 
      Unit
    ]
  ] = js.native
  var onDropdownVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
  var onInputKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onPopupScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
  var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onSelect: js.UndefOr[
    js.Function2[
      /* value */ SingleType[VT], 
      /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ /* option */ js.Any, 
      Unit
    ]
  ] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var optionFilterProp: js.UndefOr[String] = js.native
  var optionLabelProp: js.UndefOr[String] = js.native
  var options: js.UndefOr[OptionsType] = js.native
  var placeholder: js.UndefOr[ReactNode] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var removeIcon: js.UndefOr[ReactNode] = js.native
  var searchValue: js.UndefOr[String] = js.native
  var showAction: js.UndefOr[js.Array[focus | click]] = js.native
  var showArrow: js.UndefOr[Boolean] = js.native
  var showSearch: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[SizeType] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suffixIcon: js.UndefOr[ReactNode] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.native
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var value: js.UndefOr[VT] = js.native
  var virtual: js.UndefOr[Boolean] = js.native
}

object SelectProps {
  @scala.inline
  def apply[VT](): SelectProps[VT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectProps[VT]]
  }
  @scala.inline
  implicit class SelectPropsOps[Self <: SelectProps[_], VT] (val x: Self with SelectProps[VT]) extends AnyVal {
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
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    @scala.inline
    def `setAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    @scala.inline
    def setAutoClearSearchValue(value: Boolean): Self = this.set("autoClearSearchValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClearSearchValue: Self = this.set("autoClearSearchValue", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setChoiceTransitionName(value: String): Self = this.set("choiceTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChoiceTransitionName: Self = this.set("choiceTransitionName", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClearIcon(value: ReactNode): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    @scala.inline
    def setDefaultActiveFirstOption(value: Boolean): Self = this.set("defaultActiveFirstOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActiveFirstOption: Self = this.set("defaultActiveFirstOption", js.undefined)
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    @scala.inline
    def setDefaultValue(value: VT): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropdownAlign(value: js.Any): Self = this.set("dropdownAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownAlign: Self = this.set("dropdownAlign", js.undefined)
    @scala.inline
    def setDropdownClassName(value: String): Self = this.set("dropdownClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownClassName: Self = this.set("dropdownClassName", js.undefined)
    @scala.inline
    def setDropdownMatchSelectWidth(value: Boolean | Double): Self = this.set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMatchSelectWidth: Self = this.set("dropdownMatchSelectWidth", js.undefined)
    @scala.inline
    def setDropdownRender(value: /* menu */ ReactElement => ReactElement): Self = this.set("dropdownRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDropdownRender: Self = this.set("dropdownRender", js.undefined)
    @scala.inline
    def setDropdownStyle(value: CSSProperties): Self = this.set("dropdownStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownStyle: Self = this.set("dropdownStyle", js.undefined)
    @scala.inline
    def setFilterOptionFunction2(
      value: (/* inputValue */ String, /* option */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
        ]) => Boolean
    ): Self = this.set("filterOption", js.Any.fromFunction2(value))
    @scala.inline
    def setFilterOption(
      value: Boolean | (FilterFunc[
          /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
        ])
    ): Self = this.set("filterOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterOption: Self = this.set("filterOption", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: /* props */ js.Any => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    @scala.inline
    def setInternalProps(value: Mark[OptionsType]): Self = this.set("internalProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalProps: Self = this.set("internalProps", js.undefined)
    @scala.inline
    def setLabelInValue(value: Boolean): Self = this.set("labelInValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelInValue: Self = this.set("labelInValue", js.undefined)
    @scala.inline
    def setListHeight(value: Double): Self = this.set("listHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListHeight: Self = this.set("listHeight", js.undefined)
    @scala.inline
    def setListItemHeight(value: Double): Self = this.set("listItemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItemHeight: Self = this.set("listItemHeight", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setMaxTagCount(value: Double): Self = this.set("maxTagCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagCount: Self = this.set("maxTagCount", js.undefined)
    @scala.inline
    def setMaxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[LabelValueType] => ReactNode): Self = this.set("maxTagPlaceholder", js.Any.fromFunction1(value))
    @scala.inline
    def setMaxTagPlaceholder(value: ReactNode | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode])): Self = this.set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagPlaceholder: Self = this.set("maxTagPlaceholder", js.undefined)
    @scala.inline
    def setMaxTagTextLength(value: Double): Self = this.set("maxTagTextLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagTextLength: Self = this.set("maxTagTextLength", js.undefined)
    @scala.inline
    def setMenuItemSelectedIconFunction1(value: /* props */ js.Any => ReactNode): Self = this.set("menuItemSelectedIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setMenuItemSelectedIcon(value: RenderNode): Self = this.set("menuItemSelectedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItemSelectedIcon: Self = this.set("menuItemSelectedIcon", js.undefined)
    @scala.inline
    def setMode(value: multiple | tags): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setNotFoundContent(value: ReactNode): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundContent: Self = this.set("notFoundContent", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEvent[HTMLElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* value */ VT, /* option */ (/* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any) | OptionsType) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnDeselect(
      value: (/* value */ SingleType[VT], /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ /* option */ js.Any) => Unit
    ): Self = this.set("onDeselect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDeselect: Self = this.set("onDeselect", js.undefined)
    @scala.inline
    def setOnDropdownVisibleChange(value: /* open */ Boolean => Unit): Self = this.set("onDropdownVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDropdownVisibleChange: Self = this.set("onDropdownVisibleChange", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnInputKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = this.set("onInputKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInputKeyDown: Self = this.set("onInputKeyDown", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnPopupScroll(value: UIEvent[HTMLDivElement, NativeUIEvent] => Unit): Self = this.set("onPopupScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPopupScroll: Self = this.set("onPopupScroll", js.undefined)
    @scala.inline
    def setOnSearch(value: /* value */ String => Unit): Self = this.set("onSearch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    @scala.inline
    def setOnSelect(
      value: (/* value */ SingleType[VT], /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ /* option */ js.Any) => Unit
    ): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOptionFilterProp(value: String): Self = this.set("optionFilterProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionFilterProp: Self = this.set("optionFilterProp", js.undefined)
    @scala.inline
    def setOptionLabelProp(value: String): Self = this.set("optionLabelProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionLabelProp: Self = this.set("optionLabelProp", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: (OptionData | OptionGroupData)*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: OptionsType): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPlaceholder(value: ReactNode): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRemoveIcon(value: ReactNode): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveIcon: Self = this.set("removeIcon", js.undefined)
    @scala.inline
    def setSearchValue(value: String): Self = this.set("searchValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchValue: Self = this.set("searchValue", js.undefined)
    @scala.inline
    def setShowActionVarargs(value: (focus | click)*): Self = this.set("showAction", js.Array(value :_*))
    @scala.inline
    def setShowAction(value: js.Array[focus | click]): Self = this.set("showAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAction: Self = this.set("showAction", js.undefined)
    @scala.inline
    def setShowArrow(value: Boolean): Self = this.set("showArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowArrow: Self = this.set("showArrow", js.undefined)
    @scala.inline
    def setShowSearch(value: Boolean): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSearch: Self = this.set("showSearch", js.undefined)
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuffixIcon(value: ReactNode): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixIcon: Self = this.set("suffixIcon", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTagRender(value: /* props */ CustomTagProps => ReactElement): Self = this.set("tagRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTagRender: Self = this.set("tagRender", js.undefined)
    @scala.inline
    def setTokenSeparatorsVarargs(value: String*): Self = this.set("tokenSeparators", js.Array(value :_*))
    @scala.inline
    def setTokenSeparators(value: js.Array[String]): Self = this.set("tokenSeparators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenSeparators: Self = this.set("tokenSeparators", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setValue(value: VT): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVirtual(value: Boolean): Self = this.set("virtual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
  
}

