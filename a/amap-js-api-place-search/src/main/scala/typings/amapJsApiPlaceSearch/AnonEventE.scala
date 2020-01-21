package typings.amapJsApiPlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventE[E] extends js.Object {
  var event: E
}

object AnonEventE {
  @scala.inline
  def apply[E](event: E): AnonEventE[E] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventE[E]]
  }
}

