package typings
package analyticsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnonymousId extends js.Object {
  var anonymousId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var integrations: js.UndefOr[analyticsDashNodeLib.analyticsDashNodeMod.AnalyticsNodeNs.Integrations] = js.undefined
  var timestamp: js.UndefOr[stdLib.Date] = js.undefined
  var traits: js.UndefOr[js.Any] = js.undefined
  var userId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Anon_AnonymousId {
  @scala.inline
  def apply(
    anonymousId: java.lang.String | scala.Double = null,
    context: js.Any = null,
    integrations: analyticsDashNodeLib.analyticsDashNodeMod.AnalyticsNodeNs.Integrations = null,
    timestamp: stdLib.Date = null,
    traits: js.Any = null,
    userId: java.lang.String | scala.Double = null
  ): Anon_AnonymousId = {
    val __obj = js.Dynamic.literal()
    if (anonymousId != null) __obj.updateDynamic("anonymousId")(anonymousId.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (integrations != null) __obj.updateDynamic("integrations")(integrations)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (traits != null) __obj.updateDynamic("traits")(traits)
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnonymousId]
  }
}

