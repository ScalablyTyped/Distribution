package typings.angularCore

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameString extends js.Object {
  var name: String
  var target: Window_ | Null
}

object AnonNameString {
  @scala.inline
  def apply(name: String, target: Window_ = null): AnonNameString = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameString]
  }
}

