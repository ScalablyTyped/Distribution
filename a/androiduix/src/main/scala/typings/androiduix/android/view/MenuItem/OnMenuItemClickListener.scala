package typings.androiduix.android.view.MenuItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMenuItemClickListener extends js.Object {
  def onMenuItemClick(item: typings.androiduix.android.view.MenuItem): Boolean
}

object OnMenuItemClickListener {
  @scala.inline
  def apply(onMenuItemClick: typings.androiduix.android.view.MenuItem => Boolean): OnMenuItemClickListener = {
    val __obj = js.Dynamic.literal(onMenuItemClick = js.Any.fromFunction1(onMenuItemClick))
    __obj.asInstanceOf[OnMenuItemClickListener]
  }
}

