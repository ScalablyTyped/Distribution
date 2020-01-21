package typings.auth0Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHint extends js.Object {
  var hint: js.UndefOr[String] = js.undefined
  var valid: Boolean
}

object AnonHint {
  @scala.inline
  def apply(valid: Boolean, hint: String = null): AnonHint = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHint]
  }
}

