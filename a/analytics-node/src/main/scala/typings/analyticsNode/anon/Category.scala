package typings.analyticsNode.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var timestamp: js.UndefOr[Date] = js.undefined
}

object Category {
  @scala.inline
  def apply(
    category: String = null,
    context: js.Any = null,
    integrations: typings.analyticsNode.mod.AnalyticsNode.Integrations = null,
    name: String = null,
    properties: js.Any = null,
    timestamp: Date = null
  ): Category = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (integrations != null) __obj.updateDynamic("integrations")(integrations.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

