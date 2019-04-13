package typings
package antdLib.libCalendarHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header
  extends reactLib.reactMod.Component[HeaderProps, js.Any, js.Any] {
  var calenderHeaderNode: js.Any = js.native
  def getCalenderHeaderNode(node: stdLib.HTMLDivElement): scala.Unit = js.native
  def getMonthSelectElement(prefixCls: java.lang.String, month: scala.Double, months: js.Array[scala.Double]): reactLib.reactMod.Global.JSXNs.Element = js.native
  def getMonthsLocale(value: momentLib.momentMod.Moment): js.Array[_] = js.native
  def getYearSelectElement(prefixCls: java.lang.String, year: scala.Double): reactLib.reactMod.Global.JSXNs.Element = js.native
  def onMonthChange(month: java.lang.String): scala.Unit = js.native
  def onTypeChange(e: antdLib.libRadioInterfaceMod.RadioChangeEvent): scala.Unit = js.native
  def onYearChange(year: java.lang.String): scala.Unit = js.native
  def renderHeader(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

