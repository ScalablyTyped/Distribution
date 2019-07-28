package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateScheduledAuditResponse extends js.Object {
  /**
    * The ARN of the scheduled audit.
    */
  var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined
}

object CreateScheduledAuditResponse {
  @scala.inline
  def apply(scheduledAuditArn: ScheduledAuditArn = null): CreateScheduledAuditResponse = {
    val __obj = js.Dynamic.literal()
    if (scheduledAuditArn != null) __obj.updateDynamic("scheduledAuditArn")(scheduledAuditArn)
    __obj.asInstanceOf[CreateScheduledAuditResponse]
  }
}

