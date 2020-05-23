package typings.auth0.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: String
  var value: String
}

object Description {
  @scala.inline
  def apply(description: String, value: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

