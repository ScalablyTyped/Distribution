package typings.argon2

import typings.argon2.argon2Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var raw: js.UndefOr[`false`] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(raw: `false` = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

