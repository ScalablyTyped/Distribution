package typings.atAntDashDesignReactDashNative.libInputDashItemInputMod

import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.TextInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends Component[TextInputProps, js.Any, js.Any] {
  var inputRef: TextInput | Null = js.native
  def clear(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MInput(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInput(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MInput(nextProps: TextInputProps): Unit = js.native
  def focus(): Unit = js.native
}

