package typings.auth0Lock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hint extends js.Object {
  var hint: js.UndefOr[String] = js.undefined
  var valid: Boolean
}

object Hint {
  @scala.inline
  def apply(valid: Boolean, hint: String = null): Hint = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hint]
  }
}

