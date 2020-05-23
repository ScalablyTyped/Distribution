package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerWidth extends js.Object {
  var drawerWidth: Double
  var open: Boolean
  var position: String
}

object DrawerWidth {
  @scala.inline
  def apply(drawerWidth: Double, open: Boolean, position: String): DrawerWidth = {
    val __obj = js.Dynamic.literal(drawerWidth = drawerWidth.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerWidth]
  }
}

