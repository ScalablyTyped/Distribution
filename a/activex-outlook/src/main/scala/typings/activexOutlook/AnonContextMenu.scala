package typings.activexOutlook

import typings.activexOutlook.Outlook.OlContextMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextMenu extends js.Object {
  val ContextMenu: OlContextMenu
}

object AnonContextMenu {
  @scala.inline
  def apply(ContextMenu: OlContextMenu): AnonContextMenu = {
    val __obj = js.Dynamic.literal(ContextMenu = ContextMenu.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContextMenu]
  }
}

