package typings.antdDashMobile.esListListItemMod

import typings.react.reactMod.Component
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem
  extends Component[ListItemProps, js.Any, js.Any] {
  var debounceTimeout: js.Any = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MListItem(): Unit = js.native
  def onClick(ev: typings.react.reactMod.MouseEvent[HTMLDivElement, MouseEvent]): Unit = js.native
}

