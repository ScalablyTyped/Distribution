package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfter extends js.Object {
  var after: String
  var before: String
}

object AnonAfter {
  @scala.inline
  def apply(after: String, before: String): AnonAfter = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfter]
  }
}

