package typings.antd.esTransferSearchMod

import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
import typings.react.reactMod.MouseEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends Component[TransferSearchProps, js.Any, js.Any] {
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleClear(e: MouseEvent[HTMLAnchorElement, typings.std.MouseEvent]): Unit = js.native
}

