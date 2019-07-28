package typings.auth0DashLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hint extends js.Object {
  var hint: js.UndefOr[String] = js.undefined
  var valid: Boolean
}

object Anon_Hint {
  @scala.inline
  def apply(valid: Boolean, hint: String = null): Anon_Hint = {
    val __obj = js.Dynamic.literal(valid = valid)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    __obj.asInstanceOf[Anon_Hint]
  }
}

