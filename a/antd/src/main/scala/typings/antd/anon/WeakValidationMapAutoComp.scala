package typings.antd.anon

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
import typings.antd.antdStrings.none
import typings.antd.antdStrings.off
import typings.antd.antdStrings.other
import typings.antd.antdStrings.page
import typings.antd.antdStrings.polite
import typings.antd.antdStrings.popup
import typings.antd.antdStrings.removals
import typings.antd.antdStrings.spelling
import typings.antd.antdStrings.step
import typings.antd.antdStrings.text
import typings.antd.antdStrings.time
import typings.antd.antdStrings.tree
import typings.antd.antdStrings.vertical
import typings.antd.autoCompleteMod.DataSourceItemType
import typings.antd.selectMod.SelectValue
import typings.antd.selectMod.default
import typings.antd.sizeContextMod.SizeType
import typings.rcSelect.anon.Mark
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
import typings.react.mod.Key
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.UIEventHandler
import typings.react.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/auto-complete.AutoCompleteProps & react.react.RefAttributes<antd.antd/lib/select.default<antd.antd/lib/select.SelectValue>>> */
@js.native
trait WeakValidationMapAutoComp extends js.Object {
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
  var internalProps: js.UndefOr[Validator[js.UndefOr[Mark[OptionsType] | Null]]] = js.native
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.native
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
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[default[SelectValue]]]]] = js.native
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
  implicit class WeakValidationMapAutoCompOps[Self <: WeakValidationMapAutoComp] (val x: Self) extends AnyVal {
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
    def setAllowClear(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    @scala.inline
    def setAnimation(value: Validator[js.UndefOr[Null | String]]): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
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
    def setAutoClearSearchValue(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("autoClearSearchValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClearSearchValue: Self = this.set("autoClearSearchValue", js.undefined)
    @scala.inline
    def setAutoFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setBackfill(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("backfill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackfill: Self = this.set("backfill", js.undefined)
    @scala.inline
    def setBordered(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setChoiceTransitionName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("choiceTransitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChoiceTransitionName: Self = this.set("choiceTransitionName", js.undefined)
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClearIcon(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    @scala.inline
    def setDataSource(value: Validator[js.UndefOr[js.Array[DataSourceItemType] | Null]]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDefaultActiveFirstOption(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("defaultActiveFirstOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActiveFirstOption: Self = this.set("defaultActiveFirstOption", js.undefined)
    @scala.inline
    def setDefaultOpen(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    @scala.inline
    def setDefaultValue(value: Validator[js.UndefOr[Null | String]]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDirection(value: Validator[js.UndefOr[Null | String]]): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropdownAlign(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("dropdownAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownAlign: Self = this.set("dropdownAlign", js.undefined)
    @scala.inline
    def setDropdownClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("dropdownClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownClassName: Self = this.set("dropdownClassName", js.undefined)
    @scala.inline
    def setDropdownMatchSelectWidth(value: Validator[js.UndefOr[Boolean | Double | Null]]): Self = this.set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMatchSelectWidth: Self = this.set("dropdownMatchSelectWidth", js.undefined)
    @scala.inline
    def setDropdownRender(value: Validator[js.UndefOr[(js.Function1[/* menu */ ReactElement, ReactElement]) | Null]]): Self = this.set("dropdownRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownRender: Self = this.set("dropdownRender", js.undefined)
    @scala.inline
    def setDropdownStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = this.set("dropdownStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownStyle: Self = this.set("dropdownStyle", js.undefined)
    @scala.inline
    def setFilterOption(
      value: Validator[
          js.UndefOr[
            Boolean | (FilterFunc[
              /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
            ]) | Null
          ]
        ]
    ): Self = this.set("filterOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterOption: Self = this.set("filterOption", js.undefined)
    @scala.inline
    def setGetInputElement(value: Validator[js.UndefOr[js.Function0[Element] | Null]]): Self = this.set("getInputElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetInputElement: Self = this.set("getInputElement", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: Validator[js.UndefOr[Null | RenderDOMFunc]]): Self = this.set("getPopupContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputValue(value: Validator[js.UndefOr[Null | String]]): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    @scala.inline
    def setInternalProps(value: Validator[js.UndefOr[Mark[OptionsType] | Null]]): Self = this.set("internalProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalProps: Self = this.set("internalProps", js.undefined)
    @scala.inline
    def setKey(value: Validator[js.UndefOr[Key | Null]]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setListHeight(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("listHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListHeight: Self = this.set("listHeight", js.undefined)
    @scala.inline
    def setListItemHeight(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("listItemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItemHeight: Self = this.set("listItemHeight", js.undefined)
    @scala.inline
    def setMaxTagCount(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("maxTagCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagCount: Self = this.set("maxTagCount", js.undefined)
    @scala.inline
    def setMaxTagPlaceholder(
      value: Validator[
          js.UndefOr[
            (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactNode]) | Null | ReactNode
          ]
        ]
    ): Self = this.set("maxTagPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagPlaceholder: Self = this.set("maxTagPlaceholder", js.undefined)
    @scala.inline
    def setMaxTagTextLength(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("maxTagTextLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagTextLength: Self = this.set("maxTagTextLength", js.undefined)
    @scala.inline
    def setMenuItemSelectedIcon(value: Validator[js.UndefOr[Null | RenderNode]]): Self = this.set("menuItemSelectedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItemSelectedIcon: Self = this.set("menuItemSelectedIcon", js.undefined)
    @scala.inline
    def setNotFoundContent(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundContent: Self = this.set("notFoundContent", js.undefined)
    @scala.inline
    def setOnBlur(value: Validator[js.UndefOr[FocusEventHandler[HTMLElement] | Null]]): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
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
    ): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClear(value: Validator[js.UndefOr[Null | OnClear]]): Self = this.set("onClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    @scala.inline
    def setOnClick(value: Validator[js.UndefOr[MouseEventHandler[typings.std.Element] | Null]]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
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
    ): Self = this.set("onDeselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDeselect: Self = this.set("onDeselect", js.undefined)
    @scala.inline
    def setOnDropdownVisibleChange(value: Validator[js.UndefOr[(js.Function1[/* open */ Boolean, Unit]) | Null]]): Self = this.set("onDropdownVisibleChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDropdownVisibleChange: Self = this.set("onDropdownVisibleChange", js.undefined)
    @scala.inline
    def setOnFocus(value: Validator[js.UndefOr[FocusEventHandler[HTMLElement] | Null]]): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnInputKeyDown(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLInputElement] | Null]]): Self = this.set("onInputKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInputKeyDown: Self = this.set("onInputKeyDown", js.undefined)
    @scala.inline
    def setOnKeyDown(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]): Self = this.set("onKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyUp(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLDivElement] | Null]]): Self = this.set("onKeyUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
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
    def setOnPopupScroll(value: Validator[js.UndefOr[Null | UIEventHandler[HTMLDivElement]]]): Self = this.set("onPopupScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPopupScroll: Self = this.set("onPopupScroll", js.undefined)
    @scala.inline
    def setOnSearch(value: Validator[js.UndefOr[(js.Function1[/* value */ String, Unit]) | Null]]): Self = this.set("onSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
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
    ): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOpen(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOptionFilterProp(value: Validator[js.UndefOr[Null | String]]): Self = this.set("optionFilterProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionFilterProp: Self = this.set("optionFilterProp", js.undefined)
    @scala.inline
    def setOptions(value: Validator[js.UndefOr[Null | OptionsType]]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPlaceholder(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRef(value: Validator[js.UndefOr[Null | Ref[default[SelectValue]]]]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRemoveIcon(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveIcon: Self = this.set("removeIcon", js.undefined)
    @scala.inline
    def setSearchValue(value: Validator[js.UndefOr[Null | String]]): Self = this.set("searchValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchValue: Self = this.set("searchValue", js.undefined)
    @scala.inline
    def setShowAction(value: Validator[js.UndefOr[(js.Array[focus | click]) | Null]]): Self = this.set("showAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAction: Self = this.set("showAction", js.undefined)
    @scala.inline
    def setShowArrow(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("showArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowArrow: Self = this.set("showArrow", js.undefined)
    @scala.inline
    def setShowSearch(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSearch: Self = this.set("showSearch", js.undefined)
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
    def setTagRender(value: Validator[js.UndefOr[(js.Function1[/* props */ CustomTagProps, ReactElement]) | Null]]): Self = this.set("tagRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagRender: Self = this.set("tagRender", js.undefined)
    @scala.inline
    def setTokenSeparators(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = this.set("tokenSeparators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenSeparators: Self = this.set("tokenSeparators", js.undefined)
    @scala.inline
    def setTransitionName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setValue(value: Validator[js.UndefOr[Null | String]]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVirtual(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("virtual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
  
}

