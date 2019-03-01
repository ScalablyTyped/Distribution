package typings
package analyticsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnonymousIdContext extends js.Object {
  var anonymousId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var event: java.lang.String
  var integrations: js.UndefOr[analyticsDashNodeLib.analyticsDashNodeMod.AnalyticsNodeNs.Integrations] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var timestamp: js.UndefOr[stdLib.Date] = js.undefined
  var userId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Anon_AnonymousIdContext {
  @scala.inline
  def apply(
    event: java.lang.String,
    anonymousId: java.lang.String | scala.Double = null,
    context: js.Any = null,
    integrations: analyticsDashNodeLib.analyticsDashNodeMod.AnalyticsNodeNs.Integrations = null,
    properties: js.Any = null,
    timestamp: stdLib.Date = null,
    userId: java.lang.String | scala.Double = null
  ): Anon_AnonymousIdContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    if (anonymousId != null) __obj.updateDynamic("anonymousId")(anonymousId.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (integrations != null) __obj.updateDynamic("integrations")(integrations)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnonymousIdContext]
  }
}

