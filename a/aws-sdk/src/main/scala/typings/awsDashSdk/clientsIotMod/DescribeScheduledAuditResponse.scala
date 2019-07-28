package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScheduledAuditResponse extends js.Object {
  /**
    * The day of the month on which the scheduled audit takes place. Will be "1" through "31" or "LAST". If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
    */
  var dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined
  /**
    * The day of the week on which the scheduled audit takes place. One of "SUN", "MON", "TUE", "WED", "THU", "FRI" or "SAT".
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  /**
    * How often the scheduled audit takes place. One of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start time of each audit is determined by the system.
    */
  var frequency: js.UndefOr[AuditFrequency] = js.undefined
  /**
    * The ARN of the scheduled audit.
    */
  var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined
  /**
    * The name of the scheduled audit.
    */
  var scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.undefined
  /**
    * Which checks are performed during the scheduled audit. (Note that checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks including those that are enabled or UpdateAccountAuditConfiguration to select which checks are enabled.)
    */
  var targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined
}

object DescribeScheduledAuditResponse {
  @scala.inline
  def apply(
    dayOfMonth: DayOfMonth = null,
    dayOfWeek: DayOfWeek = null,
    frequency: AuditFrequency = null,
    scheduledAuditArn: ScheduledAuditArn = null,
    scheduledAuditName: ScheduledAuditName = null,
    targetCheckNames: TargetAuditCheckNames = null
  ): DescribeScheduledAuditResponse = {
    val __obj = js.Dynamic.literal()
    if (dayOfMonth != null) __obj.updateDynamic("dayOfMonth")(dayOfMonth)
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (scheduledAuditArn != null) __obj.updateDynamic("scheduledAuditArn")(scheduledAuditArn)
    if (scheduledAuditName != null) __obj.updateDynamic("scheduledAuditName")(scheduledAuditName)
    if (targetCheckNames != null) __obj.updateDynamic("targetCheckNames")(targetCheckNames)
    __obj.asInstanceOf[DescribeScheduledAuditResponse]
  }
}

