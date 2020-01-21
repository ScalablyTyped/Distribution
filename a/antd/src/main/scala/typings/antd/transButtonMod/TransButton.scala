package typings.antd.transButtonMod

import typings.react.mod.Component
import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransButton
  extends Component[TransButtonProps, js.Object, js.Any] {
  var div: js.UndefOr[HTMLDivElement] = js.native
  var lastKeyCode: js.UndefOr[Double] = js.native
  var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
  var onKeyUp: KeyboardEventHandler[HTMLDivElement] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def setRef(btn: HTMLDivElement): Unit = js.native
}

