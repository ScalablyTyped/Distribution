package typings.analyticsNode.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Integrations extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
  var timestamp: js.UndefOr[Date] = js.undefined
  var traits: js.UndefOr[js.Any] = js.undefined
}

object Integrations {
  @scala.inline
  def apply(
    context: js.Any = null,
    integrations: typings.analyticsNode.mod.AnalyticsNode.Integrations = null,
    timestamp: Date = null,
    traits: js.Any = null
  ): Integrations = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (integrations != null) __obj.updateDynamic("integrations")(integrations.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (traits != null) __obj.updateDynamic("traits")(traits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integrations]
  }
}

