package typings.antd.mod

import typings.antd.anon.PickPickPickerDatePropsMo
import typings.antd.anon.PickPickPickerTimePropsMo
import typings.antd.generatePickerMod.PickerProps
import typings.antd.generatePickerMod.RangePickerProps
import typings.moment.mod.Moment
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("antd", "DatePicker")
@js.native
class DatePicker protected ()
  extends Component[PickerProps[Moment], js.Any, js.Any] {
  def this(props: PickerProps[Moment]) = this()
  def this(props: PickerProps[Moment], context: js.Any) = this()
}
/* Inlined react.react.ComponentClass<antd.antd/lib/date-picker/generatePicker.PickerProps<moment.moment.Moment>, any> & {  WeekPicker :react.react.ComponentClass<std.Pick<std.Pick<rc-picker.rc-picker/es/Picker.PickerDateProps<moment.moment.Moment>, 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'picker' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showToday' | 'showNow' | 'showTime' | 'disabledTime'> & {  locale :antd.antd/lib/date-picker/generatePicker.PickerLocale | undefined,   size :antd.antd/lib/button.ButtonSize | undefined,   bordered :boolean | undefined}, 'size' | 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'locale' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showToday' | 'showNow' | 'showTime' | 'disabledTime' | 'bordered'>, any>,   MonthPicker :react.react.ComponentClass<std.Pick<std.Pick<rc-picker.rc-picker/es/Picker.PickerDateProps<moment.moment.Moment>, 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'picker' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showToday' | 'showNow' | 'showTime' | 'disabledTime'> & {  locale :antd.antd/lib/date-picker/generatePicker.PickerLocale | undefined,   size :antd.antd/lib/button.ButtonSize | undefined,   bordered :boolean | undefined}, 'size' | 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'locale' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showToday' | 'showNow' | 'showTime' | 'disabledTime' | 'bordered'>, any>,   YearPicker :react.react.ComponentClass<std.Pick<std.Pick<rc-picker.rc-picker/es/Picker.PickerDateProps<moment.moment.Moment>, 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'picker' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showToday' | 'showNow' | 'showTime' | 'disabledTime'> & {  locale :antd.antd/lib/date-picker/generatePicker.PickerLocale | undefined,   size :antd.antd/lib/button.ButtonSize | undefined,   bordered :boolean | undefined}, 'size' | 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'locale' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showToday' | 'showNow' | 'showTime' | 'disabledTime' | 'bordered'>, any>,   RangePicker :react.react.ComponentClass<antd.antd/lib/date-picker/generatePicker.RangePickerProps<moment.moment.Moment>, any>,   TimePicker :react.react.ComponentClass<std.Pick<std.Pick<rc-picker.rc-picker/es/Picker.PickerTimeProps<moment.moment.Moment>, 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'picker' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showNow' | 'showHour' | 'showMinute' | 'showSecond' | 'use12Hours' | 'hourStep' | 'minuteStep' | 'secondStep' | 'hideDisabledOptions' | 'disabledHours' | 'disabledMinutes' | 'disabledSeconds' | 'defaultOpenValue'> & {  locale :antd.antd/lib/date-picker/generatePicker.PickerLocale | undefined,   size :antd.antd/lib/button.ButtonSize | undefined,   bordered :boolean | undefined}, 'size' | 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'locale' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showNow' | 'showHour' | 'showMinute' | 'showSecond' | 'use12Hours' | 'hourStep' | 'minuteStep' | 'secondStep' | 'hideDisabledOptions' | 'disabledHours' | 'disabledMinutes' | 'disabledSeconds' | 'defaultOpenValue' | 'bordered'>, any>,   QuarterPicker :react.react.ComponentClass<std.Pick<std.Pick<rc-picker.rc-picker/es/Picker.PickerTimeProps<moment.moment.Moment>, 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'picker' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showNow' | 'showHour' | 'showMinute' | 'showSecond' | 'use12Hours' | 'hourStep' | 'minuteStep' | 'secondStep' | 'hideDisabledOptions' | 'disabledHours' | 'disabledMinutes' | 'disabledSeconds' | 'defaultOpenValue'> & {  locale :antd.antd/lib/date-picker/generatePicker.PickerLocale | undefined,   size :antd.antd/lib/button.ButtonSize | undefined,   bordered :boolean | undefined}, 'size' | 'style' | 'direction' | 'prefixCls' | 'className' | 'value' | 'disabled' | 'open' | 'aria-label' | 'autoComplete' | 'autoFocus' | 'name' | 'placeholder' | 'defaultValue' | 'id' | 'tabIndex' | 'role' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'onFocus' | 'onBlur' | 'onChange' | 'onClick' | 'onContextMenu' | 'onMouseDown' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseUp' | 'onSelect' | 'locale' | 'mode' | 'defaultPickerValue' | 'disabledDate' | 'dateRender' | 'monthCellRender' | 'renderExtraFooter' | 'onPanelChange' | 'onOk' | 'dropdownClassName' | 'dropdownAlign' | 'popupStyle' | 'transitionName' | 'allowClear' | 'defaultOpen' | 'inputReadOnly' | 'format' | 'suffixIcon' | 'clearIcon' | 'getPopupContainer' | 'panelRender' | 'onOpenChange' | 'pickerRef' | 'showNow' | 'showHour' | 'showMinute' | 'showSecond' | 'use12Hours' | 'hourStep' | 'minuteStep' | 'secondStep' | 'hideDisabledOptions' | 'disabledHours' | 'disabledMinutes' | 'disabledSeconds' | 'defaultOpenValue' | 'bordered'>, any>} */
object DatePicker {
  
  @JSImport("antd", "DatePicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "DatePicker.MonthPicker")
  @js.native
  class MonthPicker protected ()
    extends Component[PickPickPickerDatePropsMo, js.Any, js.Any] {
    def this(props: PickPickPickerDatePropsMo) = this()
    def this(props: PickPickPickerDatePropsMo, context: js.Any) = this()
  }
  @JSImport("antd", "DatePicker.MonthPicker")
  @js.native
  def MonthPicker: ComponentClass[PickPickPickerDatePropsMo, js.Any] = js.native
  @scala.inline
  def MonthPicker_=(x: ComponentClass[PickPickPickerDatePropsMo, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MonthPicker")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "DatePicker.QuarterPicker")
  @js.native
  class QuarterPicker protected ()
    extends Component[PickPickPickerTimePropsMo, js.Any, js.Any] {
    def this(props: PickPickPickerTimePropsMo) = this()
    def this(props: PickPickPickerTimePropsMo, context: js.Any) = this()
  }
  @JSImport("antd", "DatePicker.QuarterPicker")
  @js.native
  def QuarterPicker: ComponentClass[PickPickPickerTimePropsMo, js.Any] = js.native
  @scala.inline
  def QuarterPicker_=(x: ComponentClass[PickPickPickerTimePropsMo, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QuarterPicker")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "DatePicker.RangePicker")
  @js.native
  class RangePicker protected ()
    extends Component[RangePickerProps[Moment], js.Any, js.Any] {
    def this(props: RangePickerProps[Moment]) = this()
    def this(props: RangePickerProps[Moment], context: js.Any) = this()
  }
  @JSImport("antd", "DatePicker.RangePicker")
  @js.native
  def RangePicker: ComponentClass[RangePickerProps[Moment], js.Any] = js.native
  @scala.inline
  def RangePicker_=(x: ComponentClass[RangePickerProps[Moment], js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RangePicker")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "DatePicker.TimePicker")
  @js.native
  class TimePicker protected ()
    extends Component[PickPickPickerTimePropsMo, js.Any, js.Any] {
    def this(props: PickPickPickerTimePropsMo) = this()
    def this(props: PickPickPickerTimePropsMo, context: js.Any) = this()
  }
  @JSImport("antd", "DatePicker.TimePicker")
  @js.native
  def TimePicker: ComponentClass[PickPickPickerTimePropsMo, js.Any] = js.native
  @scala.inline
  def TimePicker_=(x: ComponentClass[PickPickPickerTimePropsMo, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimePicker")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "DatePicker.WeekPicker")
  @js.native
  class WeekPicker protected ()
    extends Component[PickPickPickerDatePropsMo, js.Any, js.Any] {
    def this(props: PickPickPickerDatePropsMo) = this()
    def this(props: PickPickPickerDatePropsMo, context: js.Any) = this()
  }
  @JSImport("antd", "DatePicker.WeekPicker")
  @js.native
  def WeekPicker: ComponentClass[PickPickPickerDatePropsMo, js.Any] = js.native
  @scala.inline
  def WeekPicker_=(x: ComponentClass[PickPickPickerDatePropsMo, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeekPicker")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "DatePicker.YearPicker")
  @js.native
  class YearPicker protected ()
    extends Component[PickPickPickerDatePropsMo, js.Any, js.Any] {
    def this(props: PickPickPickerDatePropsMo) = this()
    def this(props: PickPickPickerDatePropsMo, context: js.Any) = this()
  }
  @JSImport("antd", "DatePicker.YearPicker")
  @js.native
  def YearPicker: ComponentClass[PickPickPickerDatePropsMo, js.Any] = js.native
  @scala.inline
  def YearPicker_=(x: ComponentClass[PickPickPickerDatePropsMo, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YearPicker")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "DatePicker.childContextTypes")
  @js.native
  def childContextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def childContextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "DatePicker.contextType")
  @js.native
  def contextType: js.UndefOr[Context[js.Any]] = js.native
  @scala.inline
  def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "DatePicker.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "DatePicker.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[Partial[PickerProps[Moment]]] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[Partial[PickerProps[Moment]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "DatePicker.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "DatePicker.getDerivedStateFromError")
  @js.native
  def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[PickerProps[Moment], js.Any]] = js.native
  @scala.inline
  def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[PickerProps[Moment], js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "DatePicker.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[PickerProps[Moment], js.Any]] = js.native
  @scala.inline
  def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[PickerProps[Moment], js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "DatePicker.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMap[PickerProps[Moment]]] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMap[PickerProps[Moment]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
