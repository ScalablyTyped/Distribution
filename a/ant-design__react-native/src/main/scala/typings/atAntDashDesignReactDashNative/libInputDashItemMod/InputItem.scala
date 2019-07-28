package typings.atAntDashDesignReactDashNative.libInputDashItemMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputItem
  extends Component[InputItemProps, InputItemState, js.Any] {
  var inputRef: typings.atAntDashDesignReactDashNative.libInputDashItemInputMod.default | Null = js.native
  def focus(): Unit = js.native
  def onChange(text: String): Unit = js.native
  def onInputBlur(): Unit = js.native
  def onInputClear(): Unit = js.native
  def onInputFocus(): Unit = js.native
}

