package typings.antd.libCalendarHeaderMod

import typings.antd.Anon_MonthReactNode
import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.antd.libRadioInterfaceMod.RadioChangeEvent
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header
  extends Component[HeaderProps, js.Any, js.Any] {
  var calenderHeaderNode: js.Any = js.native
  def getCalenderHeaderNode(node: HTMLDivElement): Unit = js.native
  def getMonthSelectElement(prefixCls: String, month: Double, months: js.Array[Double]): Element = js.native
  def getMonthYearSelections(
    getPrefixCls: js.Function2[/* suffixCls */ String, /* customizePrefixCls */ js.UndefOr[String], String]
  ): Anon_MonthReactNode = js.native
  def getTypeSwitch(): Element = js.native
  def getYearSelectElement(prefixCls: String, year: Double): Element = js.native
  def headerRenderCustom(headerRender: HeaderRender): ReactNode = js.native
  def onInternalTypeChange(e: RadioChangeEvent): Unit = js.native
  def onMonthChange(month: String): Unit = js.native
  def onTypeChange(`type`: String): Unit = js.native
  def onYearChange(year: String): Unit = js.native
  def renderHeader(hasGetPrefixCls: ConfigConsumerProps): js.UndefOr[js.Object | Null] = js.native
}

