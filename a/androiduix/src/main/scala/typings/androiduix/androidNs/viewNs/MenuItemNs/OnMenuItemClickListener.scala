package typings.androiduix.androidNs.viewNs.MenuItemNs

import typings.androiduix.androidNs.viewNs.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMenuItemClickListener extends js.Object {
  def onMenuItemClick(item: MenuItem): Boolean
}

object OnMenuItemClickListener {
  @scala.inline
  def apply(onMenuItemClick: MenuItem => Boolean): OnMenuItemClickListener = {
    val __obj = js.Dynamic.literal(onMenuItemClick = js.Any.fromFunction1(onMenuItemClick))
  
    __obj.asInstanceOf[OnMenuItemClickListener]
  }
}

