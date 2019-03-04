package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hint extends js.Object {
  var hint: js.UndefOr[java.lang.String] = js.undefined
  var valid: scala.Boolean
}

object Anon_Hint {
  @scala.inline
  def apply(valid: scala.Boolean, hint: java.lang.String = null): Anon_Hint = {
    val __obj = js.Dynamic.literal(valid = valid)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    __obj.asInstanceOf[Anon_Hint]
  }
}

