package typings.arangodb

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCause extends js.Object {
  var cause: js.UndefOr[Error] = js.undefined
  var extra: js.UndefOr[js.Any] = js.undefined
}

object AnonCause {
  @scala.inline
  def apply(cause: Error = null, extra: js.Any = null): AnonCause = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCause]
  }
}

