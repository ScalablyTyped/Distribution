package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateScheduledAuditRequest extends js.Object {
  /**
    * The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This field is required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
    */
  var dayOfMonth: js.UndefOr[DayOfMonth] = js.undefined
  /**
    * The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED", "THU", "FRI" or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  /**
    * How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start time of each audit is determined by the system.
    */
  var frequency: js.UndefOr[AuditFrequency] = js.undefined
  /**
    * The name of the scheduled audit. (Max. 128 chars)
    */
  var scheduledAuditName: ScheduledAuditName
  /**
    * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks including those that are enabled or UpdateAccountAuditConfiguration to select which checks are enabled.)
    */
  var targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.undefined
}

object UpdateScheduledAuditRequest {
  @scala.inline
  def apply(
    scheduledAuditName: ScheduledAuditName,
    dayOfMonth: DayOfMonth = null,
    dayOfWeek: DayOfWeek = null,
    frequency: AuditFrequency = null,
    targetCheckNames: TargetAuditCheckNames = null
  ): UpdateScheduledAuditRequest = {
    val __obj = js.Dynamic.literal(scheduledAuditName = scheduledAuditName)
    if (dayOfMonth != null) __obj.updateDynamic("dayOfMonth")(dayOfMonth)
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (targetCheckNames != null) __obj.updateDynamic("targetCheckNames")(targetCheckNames)
    __obj.asInstanceOf[UpdateScheduledAuditRequest]
  }
}

