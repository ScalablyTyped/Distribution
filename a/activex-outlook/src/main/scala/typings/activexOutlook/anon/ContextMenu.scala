package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OlContextMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenu extends js.Object {
  val ContextMenu: OlContextMenu
}

object ContextMenu {
  @scala.inline
  def apply(ContextMenu: OlContextMenu): ContextMenu = {
    val __obj = js.Dynamic.literal(ContextMenu = ContextMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenu]
  }
}

