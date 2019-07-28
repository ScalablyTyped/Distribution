package typings.androiduix.androidNs.viewNs.MenuNs

import typings.androiduix.androidNs.viewNs.Menu
import typings.androiduix.androidNs.viewNs.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def onMenuItemSelected(menu: Menu, item: MenuItem): Boolean
}

object Callback {
  @scala.inline
  def apply(onMenuItemSelected: (Menu, MenuItem) => Boolean): Callback = {
    val __obj = js.Dynamic.literal(onMenuItemSelected = js.Any.fromFunction2(onMenuItemSelected))
  
    __obj.asInstanceOf[Callback]
  }
}

