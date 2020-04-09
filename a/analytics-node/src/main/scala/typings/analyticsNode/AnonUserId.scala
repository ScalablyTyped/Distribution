package typings.analyticsNode

import typings.analyticsNode.mod.AnalyticsNode.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUserId extends Identity {
  var userId: String | Double
}

object AnonUserId {
  @scala.inline
  def apply(userId: String | Double): AnonUserId = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUserId]
  }
}

