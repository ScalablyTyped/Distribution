package typings
package androiduixLib.androidNs.viewNs.MenuItemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMenuItemClickListener extends js.Object {
  def onMenuItemClick(item: androiduixLib.androidNs.viewNs.MenuItem): scala.Boolean
}

object OnMenuItemClickListener {
  @scala.inline
  def apply(onMenuItemClick: js.Function1[androiduixLib.androidNs.viewNs.MenuItem, scala.Boolean]): OnMenuItemClickListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMenuItemClick")(onMenuItemClick)
    __obj.asInstanceOf[OnMenuItemClickListener]
  }
}

