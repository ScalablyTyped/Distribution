package typings.antdDashMobileDashRn.libNoticeDashBarMarqueeDotNativeMod

import typings.react.reactMod.PureComponent
import typings.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Marquee
  extends PureComponent[MarqueeProps, js.Any, js.Any] {
  var texts: js.Any = js.native
  var twidth: Double = js.native
  var width: Double = js.native
  def moveToHeader(): Unit = js.native
  def onLayout(e: LayoutChangeEvent): Unit = js.native
  def onLayoutContainer(e: LayoutChangeEvent): Unit = js.native
  def startMove(): Unit = js.native
  def tryStart(): Unit = js.native
}

