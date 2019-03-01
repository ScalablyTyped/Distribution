package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleRule extends js.Object {
   // expire after the days
  var date: java.lang.String
   // rule status, allow values: Enabled or Disabled
  var days: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
   // rule id, if not set, OSS will auto create it with random string.
  var prefix: java.lang.String
   // store prefix
  var status: RuleStatusType
}

object LifecycleRule {
  @scala.inline
  def apply(
    date: java.lang.String,
    prefix: java.lang.String,
    status: RuleStatusType,
    days: scala.Double | java.lang.String = null,
    id: java.lang.String = null
  ): LifecycleRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("status")(status)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[LifecycleRule]
  }
}

