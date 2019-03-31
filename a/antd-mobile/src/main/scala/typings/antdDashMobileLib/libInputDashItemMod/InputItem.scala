package typings
package antdDashMobileLib.libInputDashItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputItem
  extends reactLib.reactMod.Component[InputItemProps, js.Any, js.Any] {
  var debounceTimeout: js.Any = js.native
  var inputRef: antdDashMobileLib.libInputDashItemInputMod.default | antdDashMobileLib.libInputDashItemCustomInputMod.default | scala.Null = js.native
  def calcPos(
    prePos: scala.Double,
    preCtrlVal: java.lang.String,
    rawVal: java.lang.String,
    ctrlVal: java.lang.String,
    placeholderChars: js.Array[java.lang.String],
    maskReg: stdLib.RegExp
  ): scala.Double = js.native
  def clearInput(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MInputItem(nextProps: InputItemProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MInputItem(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def handleOnChange(value: java.lang.String): scala.Unit = js.native
  def handleOnChange(value: java.lang.String, isMutated: scala.Boolean): scala.Unit = js.native
  def handleOnChange(value: java.lang.String, isMutated: scala.Boolean, adjustPos: js.Function): scala.Unit = js.native
  def onInputBlur(value: java.lang.String): scala.Unit = js.native
  def onInputChange(e: reactLib.reactMod.ReactNs.ChangeEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def onInputFocus(value: java.lang.String): scala.Unit = js.native
}

