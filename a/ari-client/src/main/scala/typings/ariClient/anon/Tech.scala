package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tech extends js.Object {
  var tech: String
}

object Tech {
  @scala.inline
  def apply(tech: String): Tech = {
    val __obj = js.Dynamic.literal(tech = tech.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tech]
  }
}

