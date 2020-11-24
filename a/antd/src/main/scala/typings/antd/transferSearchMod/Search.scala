package typings.antd.transferSearchMod

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search
  extends Component[TransferSearchProps, js.Any, js.Any] {
  
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def handleClear(e: MouseEvent[HTMLAnchorElement, NativeMouseEvent]): Unit = js.native
}
