package typings
package atAtlaskitButtonLib.atAtlaskitButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonState extends js.Object {
  val isActive: scala.Boolean
  val isFocus: scala.Boolean
  val isHover: scala.Boolean
}

object ButtonState {
  @scala.inline
  def apply(isActive: scala.Boolean, isFocus: scala.Boolean, isHover: scala.Boolean): ButtonState = {
    val __obj = js.Dynamic.literal(isActive = isActive, isFocus = isFocus, isHover = isHover)
  
    __obj.asInstanceOf[ButtonState]
  }
}

