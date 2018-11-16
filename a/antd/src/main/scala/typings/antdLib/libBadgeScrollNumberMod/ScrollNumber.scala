package typings
package antdLib.libBadgeScrollNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollNumber
  extends reactLib.reactMod.Component[ScrollNumberProps, ScrollNumberState, js.Any] {
  var lastCount: js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MScrollNumber(nextProps: ScrollNumberProps): scala.Unit = js.native
  def getPositionByNum(num: scala.Double, i: scala.Double): scala.Double = js.native
  def renderCurrentNumber(num: scala.Double, i: scala.Double): reactLib.reactMod.ReactNs.DetailedReactHTMLElement[antdLib.Anon_ClassNameKey, reactLib.HTMLElement] = js.native
  def renderNumberElement(): js.UndefOr[
    java.lang.String | scala.Double | (js.Array[
      reactLib.reactMod.ReactNs.DetailedReactHTMLElement[antdLib.Anon_ClassNameKey, reactLib.HTMLElement]
    ]) | scala.Null
  ] = js.native
  def renderNumberList(position: scala.Double): js.Array[reactLib.reactMod.ReactNs.ReactElement[_]] = js.native
}

