package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionString extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
}

object DirectionString {
  @scala.inline
  def apply(direction: String = null): DirectionString = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionString]
  }
}

