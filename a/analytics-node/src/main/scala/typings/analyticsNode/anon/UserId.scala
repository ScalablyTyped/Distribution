package typings.analyticsNode.anon

import typings.analyticsNode.mod.AnalyticsNode.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserId extends Identity {
  var userId: String | Double
}

object UserId {
  @scala.inline
  def apply(userId: String | Double): UserId = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserId]
  }
}

