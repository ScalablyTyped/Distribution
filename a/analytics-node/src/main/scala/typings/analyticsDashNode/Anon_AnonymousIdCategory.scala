package typings.analyticsDashNode

import typings.analyticsDashNode.analyticsDashNodeMod.AnalyticsNode.Integrations
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnonymousIdCategory extends js.Object {
  var anonymousId: js.UndefOr[String | Double] = js.undefined
  var category: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var integrations: js.UndefOr[Integrations] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var timestamp: js.UndefOr[Date] = js.undefined
  var userId: js.UndefOr[String | Double] = js.undefined
}

object Anon_AnonymousIdCategory {
  @scala.inline
  def apply(
    anonymousId: String | Double = null,
    category: String = null,
    context: js.Any = null,
    integrations: Integrations = null,
    name: String = null,
    properties: js.Any = null,
    timestamp: Date = null,
    userId: String | Double = null
  ): Anon_AnonymousIdCategory = {
    val __obj = js.Dynamic.literal()
    if (anonymousId != null) __obj.updateDynamic("anonymousId")(anonymousId.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (integrations != null) __obj.updateDynamic("integrations")(integrations.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnonymousIdCategory]
  }
}

