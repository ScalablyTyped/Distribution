package typings.apolloServerErrors

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensions extends js.Object {
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
}

object AnonExtensions {
  @scala.inline
  def apply(extensions: Record[String, _] = null): AnonExtensions = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtensions]
  }
}

