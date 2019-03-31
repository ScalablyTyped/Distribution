package typings
package antdDashMobileLib.libInputDashItemCustomKeyboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomKeyboard
  extends reactLib.reactMod.Component[js.Any, js.Any, js.Any] {
  var antmKeyboard: stdLib.HTMLDivElement | scala.Null = js.native
  var confirmDisabled: scala.Boolean = js.native
  var confirmKeyboardItem: stdLib.HTMLTableDataCellElement | scala.Null = js.native
  var linkedInput: js.Any = js.native
  def getAriaAttr(label: java.lang.String): antdDashMobileLib.Anon_Arialabel | antdDashMobileLib.Anon_ArialabelIconOnly = js.native
  def onKeyboardClick(
    e: reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLTableDataCellElement, reactLib.NativeMouseEvent]
  ): js.UndefOr[scala.Null] = js.native
  def onKeyboardClick(
    e: reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLTableDataCellElement, reactLib.NativeMouseEvent],
    value: java.lang.String
  ): js.UndefOr[scala.Null] = js.native
  def renderKeyboardItem(item: java.lang.String, index: scala.Double): reactLib.reactMod.Global.JSXNs.Element = js.native
}

