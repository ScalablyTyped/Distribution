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
  def getMonthYearSelections(
    getPrefixCls: js.Function2[
      /* suffixCls */ java.lang.String, 
      /* customizePrefixCls */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ): antdLib.Anon_MonthReactNode = js.native
  def getMonthsLocale(value: momentLib.momentMod.Moment): js.Array[_] = js.native
  def getTypeSwitch(): reactLib.reactMod.Global.JSXNs.Element = js.native
  def getYearSelectElement(prefixCls: java.lang.String, year: scala.Double): reactLib.reactMod.Global.JSXNs.Element = js.native
  def headerRenderCustom(headerRender: HeaderRender): reactLib.reactMod.ReactNode = js.native
  def onInternalTypeChange(e: antdLib.libRadioInterfaceMod.RadioChangeEvent): scala.Unit = js.native
  def onMonthChange(month: java.lang.String): scala.Unit = js.native
  def onTypeChange(`type`: java.lang.String): scala.Unit = js.native
  def onYearChange(year: java.lang.String): scala.Unit = js.native
  def renderHeader(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): js.UndefOr[js.Object | scala.Null] = js.native
}

