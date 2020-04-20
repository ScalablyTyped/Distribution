package typings.airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypecast extends js.Object {
  var typecast: Boolean
}

object AnonTypecast {
  @scala.inline
  def apply(typecast: Boolean): AnonTypecast = {
    val __obj = js.Dynamic.literal(typecast = typecast.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypecast]
  }
}

