package typings.analyticsNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousId extends js.Object {
  var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
  var previousId: String | Double
}

object PreviousId {
  @scala.inline
  def apply(
    previousId: String | Double,
    integrations: typings.analyticsNode.mod.AnalyticsNode.Integrations = null
  ): PreviousId = {
    val __obj = js.Dynamic.literal(previousId = previousId.asInstanceOf[js.Any])
    if (integrations != null) __obj.updateDynamic("integrations")(integrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousId]
  }
}

