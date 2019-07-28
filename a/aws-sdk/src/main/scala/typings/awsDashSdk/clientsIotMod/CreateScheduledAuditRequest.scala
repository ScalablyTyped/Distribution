package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateScheduledAuditRequest extends js.Object {
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
  var frequency: AuditFrequency
  /**
    * The name you want to give to the scheduled audit. (Max. 128 chars)
    */
  var scheduledAuditName: ScheduledAuditName
  /**
    * Metadata which can be used to manage the scheduled audit.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks including those that are enabled or UpdateAccountAuditConfiguration to select which checks are enabled.)
    */
  var targetCheckNames: TargetAuditCheckNames
}

object CreateScheduledAuditRequest {
  @scala.inline
  def apply(
    frequency: AuditFrequency,
    scheduledAuditName: ScheduledAuditName,
    targetCheckNames: TargetAuditCheckNames,
    dayOfMonth: DayOfMonth = null,
    dayOfWeek: DayOfWeek = null,
    tags: TagList = null
  ): CreateScheduledAuditRequest = {
    val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any], scheduledAuditName = scheduledAuditName, targetCheckNames = targetCheckNames)
    if (dayOfMonth != null) __obj.updateDynamic("dayOfMonth")(dayOfMonth)
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateScheduledAuditRequest]
  }
}

