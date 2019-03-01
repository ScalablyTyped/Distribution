package typings
package analyticsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnonymousIdCategory extends js.Object {
  var anonymousId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var category: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var integrations: js.UndefOr[analyticsDashNodeLib.analyticsDashNodeMod.AnalyticsNodeNs.Integrations] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var timestamp: js.UndefOr[stdLib.Date] = js.undefined
  var userId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Anon_AnonymousIdCategory {
  @scala.inline
  def apply(
    anonymousId: java.lang.String | scala.Double = null,
    category: java.lang.String = null,
    context: js.Any = null,
    integrations: analyticsDashNodeLib.analyticsDashNodeMod.AnalyticsNodeNs.Integrations = null,
    name: java.lang.String = null,
    properties: js.Any = null,
    timestamp: stdLib.Date = null,
    userId: java.lang.String | scala.Double = null
  ): Anon_AnonymousIdCategory = {
    val __obj = js.Dynamic.literal()
    if (anonymousId != null) __obj.updateDynamic("anonymousId")(anonymousId.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category)
    if (context != null) __obj.updateDynamic("context")(context)
    if (integrations != null) __obj.updateDynamic("integrations")(integrations)
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnonymousIdCategory]
  }
}

