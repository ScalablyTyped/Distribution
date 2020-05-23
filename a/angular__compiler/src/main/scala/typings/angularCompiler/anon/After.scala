package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait After extends js.Object {
  var after: String
  var before: String
}

object After {
  @scala.inline
  def apply(after: String, before: String): After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
}

