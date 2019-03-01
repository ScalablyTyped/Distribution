package typings
package analyticsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnonymousIdIntegrations extends js.Object {
  var anonymousId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var integrations: js.UndefOr[analyticsDashNodeLib.analyticsDashNodeMod.AnalyticsNodeNs.Integrations] = js.undefined
  var previousId: java.lang.String | scala.Double
  var userId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Anon_AnonymousIdIntegrations {
  @scala.inline
  def apply(
    previousId: java.lang.String | scala.Double,
    anonymousId: java.lang.String | scala.Double = null,
    integrations: analyticsDashNodeLib.analyticsDashNodeMod.AnalyticsNodeNs.Integrations = null,
    userId: java.lang.String | scala.Double = null
  ): Anon_AnonymousIdIntegrations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("previousId")(previousId.asInstanceOf[js.Any])
    if (anonymousId != null) __obj.updateDynamic("anonymousId")(anonymousId.asInstanceOf[js.Any])
    if (integrations != null) __obj.updateDynamic("integrations")(integrations)
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnonymousIdIntegrations]
  }
}

