package typings.antd.weekPickerMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.moment.mod.Moment
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeekPicker
  extends Component[js.Any, WeekPickerState, js.Any] {
  var input: js.Any = js.native
  var prefixCls: js.UndefOr[js.Any] = js.native
  def blur(): Unit = js.native
  def clearSelection(e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MWeekPicker(_underscore: js.Any, prevState: WeekPickerState): Unit = js.native
  def focus(): Unit = js.native
  def handleChange(): Unit = js.native
  def handleChange(value: Moment): Unit = js.native
  def handleOpenChange(open: Boolean): Unit = js.native
  def renderFooter(args: js.Any*): Element | Null = js.native
  def renderWeekPicker(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def saveInput(node: js.Any): Unit = js.native
  def weekDateRender(current: js.Any): Element = js.native
}

