package typings.antDesignReactNative.alertContainerMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertContainer
  extends Component[AlertContainerProps, js.Any, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MAlertContainer(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAlertContainer(): Unit = js.native
  def onBackAndroid(): Boolean = js.native
  def onClose(): Unit = js.native
}

