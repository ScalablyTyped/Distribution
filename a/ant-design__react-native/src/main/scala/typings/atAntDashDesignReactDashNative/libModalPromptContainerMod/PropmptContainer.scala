package typings.atAntDashDesignReactDashNative.libModalPromptContainerMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropmptContainer
  extends Component[PropmptContainerProps, js.Any, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MPropmptContainer(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPropmptContainer(): Unit = js.native
  def onBackAndroid(): Boolean = js.native
  def onChangeText(`type`: String, value: String): Unit = js.native
  def onClose(): Unit = js.native
}

