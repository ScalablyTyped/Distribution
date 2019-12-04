package typings.antd.libUnderscoreUtilTransButtonMod

import typings.react.reactMod.Component
import typings.react.reactMod.KeyboardEventHandler
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

