package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After extends js.Object {
  var after: String
  var before: String
}

object Anon_After {
  @scala.inline
  def apply(after: String, before: String): Anon_After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_After]
  }
}

