package typings.amapJsApiPlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent[E] extends js.Object {
  var event: E
}

object AnonEvent {
  @scala.inline
  def apply[E](event: E): AnonEvent[E] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent[E]]
  }
}

