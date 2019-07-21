package typings
package atAntDashDesignReactDashNativeLib.libInputDashItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputItem
  extends reactLib.reactMod.Component[InputItemProps, InputItemState, js.Any] {
  var inputRef: atAntDashDesignReactDashNativeLib.libInputDashItemInputMod.default | scala.Null = js.native
  def focus(): scala.Unit = js.native
  def onChange(text: java.lang.String): scala.Unit = js.native
  def onInputBlur(): scala.Unit = js.native
  def onInputClear(): scala.Unit = js.native
  def onInputFocus(): scala.Unit = js.native
}

