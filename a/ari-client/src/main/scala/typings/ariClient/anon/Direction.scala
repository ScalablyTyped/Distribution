package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var channelId: String
  var direction: js.UndefOr[String] = js.undefined
}

object Direction {
  @scala.inline
  def apply(channelId: String, direction: String = null): Direction = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

