package typings.antd.transferSearchMod

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLAnchorElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends Component[TransferSearchProps, js.Any, js.Any] {
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleClear(e: typings.react.mod.MouseEvent[HTMLAnchorElement, MouseEvent]): Unit = js.native
}

