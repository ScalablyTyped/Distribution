package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfirm extends js.Object {
  var confirm: Boolean
}

object AnonConfirm {
  @scala.inline
  def apply(confirm: Boolean): AnonConfirm = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfirm]
  }
}

