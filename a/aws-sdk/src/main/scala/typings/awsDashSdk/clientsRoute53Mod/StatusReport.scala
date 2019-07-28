package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusReport extends js.Object {
  /**
    * The date and time that the health checker performed the health check in ISO 8601 format and Coordinated Universal Time (UTC). For example, the value 2017-03-27T17:48:16.751Z represents March 27, 2017 at 17:48:16.751 UTC.
    */
  var CheckedTime: js.UndefOr[TimeStamp] = js.undefined
  /**
    * A description of the status of the health check endpoint as reported by one of the Amazon Route 53 health checkers.
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.Status] = js.undefined
}

object StatusReport {
  @scala.inline
  def apply(CheckedTime: TimeStamp = null, Status: Status = null): StatusReport = {
    val __obj = js.Dynamic.literal()
    if (CheckedTime != null) __obj.updateDynamic("CheckedTime")(CheckedTime)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[StatusReport]
  }
}

