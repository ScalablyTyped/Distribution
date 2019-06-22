package typings
package antdLib.libBadgeScrollNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollNumber
  extends reactLib.reactMod.Component[ScrollNumberProps, ScrollNumberState, js.Any] {
  var lastCount: js.UndefOr[java.lang.String | scala.Double | scala.Null] = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MScrollNumber(`_`: js.Any, prevState: ScrollNumberState): scala.Unit = js.native
  def getPositionByNum(num: scala.Double, i: scala.Double): scala.Double = js.native
  def onAnimated(): scala.Unit = js.native
  def renderCurrentNumber(prefixCls: java.lang.String, num: java.lang.String, i: scala.Double): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderCurrentNumber(prefixCls: java.lang.String, num: scala.Double, i: scala.Double): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderNumberElement(prefixCls: java.lang.String): js.UndefOr[
    java.lang.String | scala.Double | js.Array[reactLib.reactMod.Global.JSXNs.Element] | scala.Null
  ] = js.native
  def renderNumberList(position: scala.Double): js.Array[reactLib.reactMod.ReactElement] = js.native
  def renderScrollNumber(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): (reactLib.reactMod.ComponentElement[_, reactLib.reactMod.Component[_, _, _]]) | reactLib.reactMod.ReactElement = js.native
}

