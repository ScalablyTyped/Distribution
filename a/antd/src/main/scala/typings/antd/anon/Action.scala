package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: String
  var visibilityToggle: Boolean
}

object Action {
  @scala.inline
  def apply(action: String, visibilityToggle: Boolean): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], visibilityToggle = visibilityToggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

