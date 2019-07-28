package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleRule extends js.Object {
   // expire after the days
  var date: String
   // rule status, allow values: Enabled or Disabled
  var days: js.UndefOr[Double | String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
   // rule id, if not set, OSS will auto create it with random string.
  var prefix: String
   // store prefix
  var status: RuleStatusType
}

object LifecycleRule {
  @scala.inline
  def apply(
    date: String,
    prefix: String,
    status: RuleStatusType,
    days: Double | String = null,
    id: String = null
  ): LifecycleRule = {
    val __obj = js.Dynamic.literal(date = date, prefix = prefix, status = status)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[LifecycleRule]
  }
}

