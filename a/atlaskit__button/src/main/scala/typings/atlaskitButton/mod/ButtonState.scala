package typings.atlaskitButton.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonState extends js.Object {
  val isActive: Boolean
  val isFocus: Boolean
  val isHover: Boolean
}

object ButtonState {
  @scala.inline
  def apply(isActive: Boolean, isFocus: Boolean, isHover: Boolean): ButtonState = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isFocus = isFocus.asInstanceOf[js.Any], isHover = isHover.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ButtonState]
  }
}

