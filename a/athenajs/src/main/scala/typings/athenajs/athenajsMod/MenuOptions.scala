package typings.athenajs.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOptions extends js.Object {
  var color: String
  var menuItems: js.Array[MenuItem]
  var title: String
}

object MenuOptions {
  @scala.inline
  def apply(color: String, menuItems: js.Array[MenuItem], title: String): MenuOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MenuOptions]
  }
}

