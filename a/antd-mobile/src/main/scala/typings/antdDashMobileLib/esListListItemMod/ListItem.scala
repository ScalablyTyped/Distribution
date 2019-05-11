package typings
package antdDashMobileLib.esListListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem
  extends reactLib.reactMod.Component[ListItemProps, js.Any, js.Any] {
  var debounceTimeout: js.Any = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MListItem(): scala.Unit = js.native
  def onClick(ev: reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, stdLib.MouseEvent]): scala.Unit = js.native
}

