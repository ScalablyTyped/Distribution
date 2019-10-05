package typings.androiduix.android.view.Menu

import typings.androiduix.android.view.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def onMenuItemSelected(menu: typings.androiduix.android.view.Menu, item: MenuItem): Boolean
}

object Callback {
  @scala.inline
  def apply(onMenuItemSelected: (typings.androiduix.android.view.Menu, MenuItem) => Boolean): Callback = {
    val __obj = js.Dynamic.literal(onMenuItemSelected = js.Any.fromFunction2(onMenuItemSelected))
  
    __obj.asInstanceOf[Callback]
  }
}

