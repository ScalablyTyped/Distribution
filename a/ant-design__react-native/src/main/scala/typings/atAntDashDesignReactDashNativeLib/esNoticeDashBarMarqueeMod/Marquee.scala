package typings
package atAntDashDesignReactDashNativeLib.esNoticeDashBarMarqueeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Marquee
  extends reactLib.reactMod.PureComponent[MarqueeProps, js.Any, js.Any] {
  var texts: js.Any = js.native
  var twidth: scala.Double = js.native
  var width: scala.Double = js.native
  def moveToHeader(): scala.Unit = js.native
  def onLayout(e: reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent): scala.Unit = js.native
  def onLayoutContainer(e: reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent): scala.Unit = js.native
  def startMove(): scala.Unit = js.native
  def tryStart(): scala.Unit = js.native
}

