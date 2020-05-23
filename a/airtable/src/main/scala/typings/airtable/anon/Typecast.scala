package typings.airtable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typecast extends js.Object {
  var typecast: Boolean
}

object Typecast {
  @scala.inline
  def apply(typecast: Boolean): Typecast = {
    val __obj = js.Dynamic.literal(typecast = typecast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typecast]
  }
}

