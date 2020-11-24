package typings.antdMobile.customKeyboardMod

import typings.antdMobile.anon.Arialabel
import typings.antdMobile.anon.IconOnly
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLTableDataCellElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomKeyboard
  extends Component[js.Any, js.Any, js.Any] {
  
  var antmKeyboard: HTMLDivElement | Null = js.native
  
  var confirmDisabled: Boolean = js.native
  
  var confirmKeyboardItem: HTMLTableDataCellElement | Null = js.native
  
  def getAriaAttr(label: String): Arialabel | IconOnly = js.native
  
  var linkedInput: js.Any = js.native
  
  def onKeyboardClick(e: typings.react.mod.MouseEvent[HTMLTableDataCellElement, MouseEvent]): js.UndefOr[Null] = js.native
  def onKeyboardClick(e: typings.react.mod.MouseEvent[HTMLTableDataCellElement, MouseEvent], value: String): js.UndefOr[Null] = js.native
  
  def renderKeyboardItem(item: String, index: Double): Element = js.native
}
