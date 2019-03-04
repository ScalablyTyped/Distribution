package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOptions extends js.Object {
  var color: java.lang.String
  var menuItems: js.Array[MenuItem]
  var title: java.lang.String
}

object MenuOptions {
  @scala.inline
  def apply(color: java.lang.String, menuItems: js.Array[MenuItem], title: java.lang.String): MenuOptions = {
    val __obj = js.Dynamic.literal(color = color, menuItems = menuItems, title = title)
  
    __obj.asInstanceOf[MenuOptions]
  }
}

