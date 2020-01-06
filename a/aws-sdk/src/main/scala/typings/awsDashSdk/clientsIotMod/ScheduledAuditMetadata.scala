package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledAuditMetadata extends js.Object {
  /**
    * The day of the month on which the scheduled audit is run (if the frequency is "MONTHLY"). If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
    */
  var dayOfMonth: js.UndefOr[DayOfMonth] = js.native
  /**
    * The day of the week on which the scheduled audit is run (if the frequency is "WEEKLY" or "BIWEEKLY").
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.native
  /**
    * How often the scheduled audit occurs.
    */
  var frequency: js.UndefOr[AuditFrequency] = js.native
  /**
    * The ARN of the scheduled audit.
    */
  var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.native
  /**
    * The name of the scheduled audit.
    */
  var scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.native
}

object ScheduledAuditMetadata {
  @scala.inline
  def apply(
    dayOfMonth: DayOfMonth = null,
    dayOfWeek: DayOfWeek = null,
    frequency: AuditFrequency = null,
    scheduledAuditArn: ScheduledAuditArn = null,
    scheduledAuditName: ScheduledAuditName = null
  ): ScheduledAuditMetadata = {
    val __obj = js.Dynamic.literal()
    if (dayOfMonth != null) __obj.updateDynamic("dayOfMonth")(dayOfMonth.asInstanceOf[js.Any])
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (scheduledAuditArn != null) __obj.updateDynamic("scheduledAuditArn")(scheduledAuditArn.asInstanceOf[js.Any])
    if (scheduledAuditName != null) __obj.updateDynamic("scheduledAuditName")(scheduledAuditName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledAuditMetadata]
  }
}

