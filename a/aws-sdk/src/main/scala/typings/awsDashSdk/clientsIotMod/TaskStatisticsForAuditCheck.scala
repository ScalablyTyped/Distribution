package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskStatisticsForAuditCheck extends js.Object {
  /**
    * The number of findings to which the mitigation action task was canceled when applied.
    */
  var canceledFindingsCount: js.UndefOr[CanceledFindingsCount] = js.native
  /**
    * The number of findings for which at least one of the actions failed when applied.
    */
  var failedFindingsCount: js.UndefOr[FailedFindingsCount] = js.native
  /**
    * The number of findings skipped because of filter conditions provided in the parameters to the command.
    */
  var skippedFindingsCount: js.UndefOr[SkippedFindingsCount] = js.native
  /**
    * The number of findings for which all mitigation actions succeeded when applied.
    */
  var succeededFindingsCount: js.UndefOr[SucceededFindingsCount] = js.native
  /**
    * The total number of findings to which a task is being applied.
    */
  var totalFindingsCount: js.UndefOr[TotalFindingsCount] = js.native
}

object TaskStatisticsForAuditCheck {
  @scala.inline
  def apply(
    canceledFindingsCount: Int | Double = null,
    failedFindingsCount: Int | Double = null,
    skippedFindingsCount: Int | Double = null,
    succeededFindingsCount: Int | Double = null,
    totalFindingsCount: Int | Double = null
  ): TaskStatisticsForAuditCheck = {
    val __obj = js.Dynamic.literal()
    if (canceledFindingsCount != null) __obj.updateDynamic("canceledFindingsCount")(canceledFindingsCount.asInstanceOf[js.Any])
    if (failedFindingsCount != null) __obj.updateDynamic("failedFindingsCount")(failedFindingsCount.asInstanceOf[js.Any])
    if (skippedFindingsCount != null) __obj.updateDynamic("skippedFindingsCount")(skippedFindingsCount.asInstanceOf[js.Any])
    if (succeededFindingsCount != null) __obj.updateDynamic("succeededFindingsCount")(succeededFindingsCount.asInstanceOf[js.Any])
    if (totalFindingsCount != null) __obj.updateDynamic("totalFindingsCount")(totalFindingsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStatisticsForAuditCheck]
  }
}

