package typings.analyticsNode

import typings.analyticsNode.mod.AnalyticsNode.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnonymousId extends Identity {
  var anonymousId: String | Double
  var userId: js.UndefOr[String | Double] = js.undefined
}

object AnonAnonymousId {
  @scala.inline
  def apply(anonymousId: String | Double, userId: String | Double = null): AnonAnonymousId = {
    val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnonymousId]
  }
}

