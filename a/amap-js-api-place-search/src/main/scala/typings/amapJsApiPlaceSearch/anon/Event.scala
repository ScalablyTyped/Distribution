package typings.amapJsApiPlaceSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event[E] extends js.Object {
  var event: E
}

object Event {
  @scala.inline
  def apply[E](event: E): Event[E] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[E]]
  }
}

