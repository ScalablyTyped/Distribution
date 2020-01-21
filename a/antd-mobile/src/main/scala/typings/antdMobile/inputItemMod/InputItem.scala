package typings.antdMobile.inputItemMod

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLInputElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputItem
  extends Component[InputItemProps, js.Any, js.Any] {
  var debounceTimeout: js.Any = js.native
  var inputRef: typings.antdMobile.inputMod.default | typings.antdMobile.customInputMod.default | Null = js.native
  def calcPos(
    prePos: Double,
    preCtrlVal: String,
    rawVal: String,
    ctrlVal: String,
    placeholderChars: js.Array[String],
    maskReg: RegExp
  ): Double = js.native
  def clearInput(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MInputItem(nextProps: InputItemProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MInputItem(): Unit = js.native
  def focus(): Unit = js.native
  def handleOnChange(value: String): Unit = js.native
  def handleOnChange(value: String, isMutated: Boolean): Unit = js.native
  def handleOnChange(value: String, isMutated: Boolean, adjustPos: js.Function): Unit = js.native
  def onInputBlur(value: String): Unit = js.native
  def onInputChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def onInputFocus(value: String): Unit = js.native
}

