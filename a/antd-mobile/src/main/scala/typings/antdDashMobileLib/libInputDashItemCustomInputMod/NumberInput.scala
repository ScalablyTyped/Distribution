package typings
package antdDashMobileLib.libInputDashItemCustomInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberInput
  extends reactLib.reactMod.Component[NumberInputProps, js.Any, js.Any] {
  var container: stdLib.HTMLDivElement = js.native
  var inputRef: stdLib.HTMLDivElement | scala.Null = js.native
  def addBlurListener(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MNumberInput(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MNumberInput(nextProps: NumberInputProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MNumberInput(): scala.Unit = js.native
  def doBlur(ev: stdLib.MouseEvent): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getComponent(): reactLib.reactMod.Global.JSXNs.Element = js.native
  def getContainer(): stdLib.HTMLDivElement = js.native
  def onChange(value: js.Any): scala.Unit = js.native
  def onConfirm(value: js.Any): scala.Unit = js.native
  def onFakeInputClick(): scala.Unit = js.native
  def onInputBlur(value: java.lang.String): scala.Unit = js.native
  def onInputFocus(): scala.Unit = js.native
  def onKeyboardClick(KeyboardItemValue: java.lang.String): scala.Unit = js.native
  def removeBlurListener(): scala.Unit = js.native
  def removeCurrentExtraKeyboard(): scala.Unit = js.native
  def renderCustomKeyboard(): scala.Unit = js.native
  def renderPortal(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def saveRef(): scala.Unit = js.native
  def saveRef(el: antdDashMobileLib.libInputDashItemCustomKeyboardMod.default): scala.Unit = js.native
  def unLinkInput(): scala.Unit = js.native
}

