package typings.antdMobile.listItemMod

import typings.react.mod.Component
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem
  extends Component[ListItemProps, js.Any, js.Any] {
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MListItem(): Unit = js.native
  
  var debounceTimeout: js.Any = js.native
  
  def onClick(ev: typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent]): Unit = js.native
}
