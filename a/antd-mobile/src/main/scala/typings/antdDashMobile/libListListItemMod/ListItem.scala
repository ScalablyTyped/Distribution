package typings.antdDashMobile.libListListItemMod

import typings.react.reactMod.Component
import typings.react.reactMod.MouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem
  extends Component[ListItemProps, js.Any, js.Any] {
  var debounceTimeout: js.Any = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MListItem(): Unit = js.native
  def onClick(ev: MouseEvent[HTMLDivElement, typings.std.MouseEvent]): Unit = js.native
}

