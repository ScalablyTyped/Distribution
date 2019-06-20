package typings
package antdLib.esStatisticCountdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Countdown
  extends reactLib.reactMod.Component[CountdownProps, js.Object, js.Any] {
  var countdownId: js.UndefOr[scala.Double] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCountdown(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCountdown(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCountdown(): scala.Unit = js.native
  def formatCountdown(value: java.lang.String, config: antdLib.esStatisticUtilsMod.FormatConfig): java.lang.String = js.native
  def formatCountdown(value: scala.Double, config: antdLib.esStatisticUtilsMod.FormatConfig): java.lang.String = js.native
  def startTimer(): scala.Unit = js.native
  def stopTimer(): scala.Unit = js.native
  def syncTimer(): scala.Unit = js.native
  def valueRender(node: reactLib.reactMod.ReactElement): reactLib.reactMod.ReactElement = js.native
}

