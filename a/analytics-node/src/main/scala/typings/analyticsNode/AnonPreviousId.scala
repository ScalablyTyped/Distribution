package typings.analyticsNode

import typings.analyticsNode.mod.AnalyticsNode.Integrations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreviousId extends js.Object {
  var integrations: js.UndefOr[Integrations] = js.undefined
  var previousId: String | Double
}

object AnonPreviousId {
  @scala.inline
  def apply(previousId: String | Double, integrations: Integrations = null): AnonPreviousId = {
    val __obj = js.Dynamic.literal(previousId = previousId.asInstanceOf[js.Any])
    if (integrations != null) __obj.updateDynamic("integrations")(integrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreviousId]
  }
}

