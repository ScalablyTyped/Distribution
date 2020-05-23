package typings.analyticsNode.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupId extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var groupId: String | Double
  var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
  var timestamp: js.UndefOr[Date] = js.undefined
  var traits: js.UndefOr[js.Any] = js.undefined
}

object GroupId {
  @scala.inline
  def apply(
    groupId: String | Double,
    context: js.Any = null,
    integrations: typings.analyticsNode.mod.AnalyticsNode.Integrations = null,
    timestamp: Date = null,
    traits: js.Any = null
  ): GroupId = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (integrations != null) __obj.updateDynamic("integrations")(integrations.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (traits != null) __obj.updateDynamic("traits")(traits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupId]
  }
}

