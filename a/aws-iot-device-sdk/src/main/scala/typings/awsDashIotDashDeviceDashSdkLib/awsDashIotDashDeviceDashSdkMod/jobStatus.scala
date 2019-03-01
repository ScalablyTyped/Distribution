package typings
package awsDashIotDashDeviceDashSdkLib.awsDashIotDashDeviceDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait jobStatus extends js.Object {
  var status: java.lang.String
  var statusDetails: statusDetails
}

object jobStatus {
  @scala.inline
  def apply(status: java.lang.String, statusDetails: statusDetails): jobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusDetails")(statusDetails)
    __obj.asInstanceOf[jobStatus]
  }
}

