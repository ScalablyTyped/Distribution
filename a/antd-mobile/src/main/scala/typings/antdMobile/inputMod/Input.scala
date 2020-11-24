package typings.antdMobile.inputMod

import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input
  extends Component[InputProps, js.Any, js.Any] {
  
  def focus(): Unit = js.native
  
  var inputRef: HTMLInputElement | Null = js.native
  
  def onInputBlur(e: FocusEvent[HTMLInputElement]): Unit = js.native
  
  def onInputFocus(e: FocusEvent[HTMLInputElement]): Unit = js.native
}
