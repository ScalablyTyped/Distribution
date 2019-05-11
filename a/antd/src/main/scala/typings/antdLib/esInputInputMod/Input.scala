package typings
package antdLib.esInputInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends reactLib.reactMod.Component[InputProps, js.Any, js.Any] {
  var input: stdLib.HTMLInputElement = js.native
  def blur(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInput(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getInputClassName(prefixCls: java.lang.String): java.lang.String = js.native
  @JSName("getSnapshotBeforeUpdate")
  def getSnapshotBeforeUpdate_MInput(prevProps: InputProps): scala.Null = js.native
  def handleChange(e: reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def handleKeyDown(e: reactLib.reactMod.KeyboardEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def handleReset(e: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent]): scala.Unit = js.native
  def renderClearIcon(prefixCls: java.lang.String): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderComponent(hasGetPrefixCls: antdLib.esConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderInput(prefixCls: java.lang.String): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderLabeledIcon(prefixCls: java.lang.String, children: reactLib.reactMod.ReactElement[_]): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderLabeledInput(prefixCls: java.lang.String, children: reactLib.reactMod.ReactElement[_]): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderSuffix(prefixCls: java.lang.String): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def saveInput(node: stdLib.HTMLInputElement): scala.Unit = js.native
  def select(): scala.Unit = js.native
  def setValue(value: java.lang.String, e: reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def setValue(
    value: java.lang.String,
    e: reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setValue(value: java.lang.String, e: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent]): scala.Unit = js.native
  def setValue(
    value: java.lang.String,
    e: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

