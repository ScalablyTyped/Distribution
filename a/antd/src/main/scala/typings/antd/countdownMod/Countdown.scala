package typings.antd.countdownMod

import typings.antd.statisticUtilsMod.FormatConfig
import typings.antd.statisticUtilsMod.countdownValueType
import typings.react.mod.Component
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Countdown
  extends Component[CountdownProps, js.Object, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MCountdown(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCountdown(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCountdown(): Unit = js.native
  
  var countdownId: js.UndefOr[Double] = js.native
  
  def formatCountdown(value: countdownValueType, config: FormatConfig): String = js.native
  
  def startTimer(): Unit = js.native
  
  def stopTimer(): Unit = js.native
  
  def syncTimer(): Unit = js.native
  
  def valueRender(node: ReactElement): ReactElement = js.native
}
