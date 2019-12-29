package typings.antd.libDateDashPickerRangePickerMod

import typings.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typings.antd.libDateDashPickerInterfaceMod.RangePickerPresetRange
import typings.antd.libDateDashPickerInterfaceMod.RangePickerProps
import typings.antd.libDateDashPickerInterfaceMod.RangePickerValue
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangePicker
  extends Component[RangePickerProps, RangePickerState, js.Any] {
  var picker: js.Any = js.native
  var prefixCls: js.UndefOr[js.Any] = js.native
  var tagPrefixCls: js.UndefOr[js.Any] = js.native
  def blur(): Unit = js.native
  def clearHoverValue(): Unit = js.native
  def clearSelection(e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MRangePicker(_underscore: js.Any, prevState: RangePickerState): Unit = js.native
  def focus(): Unit = js.native
  def handleCalendarInputSelect(value: RangePickerValue): Unit = js.native
  def handleChange(value: RangePickerValue): Unit = js.native
  def handleHoverChange(hoverValue: js.Any): Unit = js.native
  def handleOpenChange(open: Boolean): Unit = js.native
  def handleRangeClick(value: RangePickerPresetRange): Unit = js.native
  def handleRangeMouseLeave(): Unit = js.native
  def handleShowDateChange(showDate: RangePickerValue): Unit = js.native
  def renderFooter(): (js.Array[Element | Null]) | Null = js.native
  def renderRangePicker(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def savePicker(node: HTMLSpanElement): Unit = js.native
  def setValue(value: RangePickerValue): Unit = js.native
  def setValue(value: RangePickerValue, hidePanel: Boolean): Unit = js.native
}

