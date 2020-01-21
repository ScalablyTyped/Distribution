package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecked extends js.Object {
  var checked: Boolean
  var indeterminate: Boolean
}

object AnonChecked {
  @scala.inline
  def apply(checked: Boolean, indeterminate: Boolean): AnonChecked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChecked]
  }
}

