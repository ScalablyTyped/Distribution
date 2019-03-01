package typings
package antdLib.libTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagState extends js.Object {
  var visible: scala.Boolean
}

object TagState {
  @scala.inline
  def apply(visible: scala.Boolean): TagState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TagState]
  }
}

