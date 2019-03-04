package typings
package antdLib.libMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuState extends js.Object {
  var openKeys: js.Array[java.lang.String]
}

object MenuState {
  @scala.inline
  def apply(openKeys: js.Array[java.lang.String]): MenuState = {
    val __obj = js.Dynamic.literal(openKeys = openKeys)
  
    __obj.asInstanceOf[MenuState]
  }
}

