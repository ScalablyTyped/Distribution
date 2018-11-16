package typings
package aliDashOssLib.aliDashOssMod

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

