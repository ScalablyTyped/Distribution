package typings
package antdDashMobileLib.libNoticeDashBarMarqueeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Marquee
  extends reactLib.reactMod.Component[MarqueeProps, js.Any, js.Any] {
  var _marqueeTimer: js.Any = js.native
  @JSName("state")
  var state_Marquee: antdDashMobileLib.Anon_AnimatedWidth = js.native
  var textRef: js.Any = js.native
  def _measureText(): scala.Unit = js.native
  def _startAnimation(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MMarquee(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMarquee(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MMarquee(): scala.Unit = js.native
}

