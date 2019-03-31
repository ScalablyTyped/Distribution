package typings
package antdDashMobileLib.libInputDashItemInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input
  extends reactLib.reactMod.Component[InputProps, js.Any, js.Any] {
  var inputRef: stdLib.HTMLInputElement | scala.Null = js.native
  def focus(): scala.Unit = js.native
  def onInputBlur(e: reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def onInputFocus(e: reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
}

