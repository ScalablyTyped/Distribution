package typings.analyticsNode.anon

import typings.analyticsNode.mod.AnalyticsNode.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonymousId extends Identity {
  var anonymousId: String | Double
  var userId: js.UndefOr[String | Double] = js.undefined
}

object AnonymousId {
  @scala.inline
  def apply(anonymousId: String | Double, userId: String | Double = null): AnonymousId = {
    val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousId]
  }
}

