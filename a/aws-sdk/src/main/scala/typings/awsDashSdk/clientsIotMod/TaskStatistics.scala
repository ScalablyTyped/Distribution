package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskStatistics extends js.Object {
  /**
    * The number of checks that did not run because the audit was canceled.
    */
  var canceledChecks: js.UndefOr[CanceledChecksCount] = js.undefined
  /**
    * The number of checks that found compliant resources.
    */
  var compliantChecks: js.UndefOr[CompliantChecksCount] = js.undefined
  /**
    * The number of checks.
    */
  var failedChecks: js.UndefOr[FailedChecksCount] = js.undefined
  /**
    * The number of checks in progress.
    */
  var inProgressChecks: js.UndefOr[InProgressChecksCount] = js.undefined
  /**
    * The number of checks that found noncompliant resources.
    */
  var nonCompliantChecks: js.UndefOr[NonCompliantChecksCount] = js.undefined
  /**
    * The number of checks in this audit.
    */
  var totalChecks: js.UndefOr[TotalChecksCount] = js.undefined
  /**
    * The number of checks waiting for data collection.
    */
  var waitingForDataCollectionChecks: js.UndefOr[WaitingForDataCollectionChecksCount] = js.undefined
}

object TaskStatistics {
  @scala.inline
  def apply(
    canceledChecks: Int | Double = null,
    compliantChecks: Int | Double = null,
    failedChecks: Int | Double = null,
    inProgressChecks: Int | Double = null,
    nonCompliantChecks: Int | Double = null,
    totalChecks: Int | Double = null,
    waitingForDataCollectionChecks: Int | Double = null
  ): TaskStatistics = {
    val __obj = js.Dynamic.literal()
    if (canceledChecks != null) __obj.updateDynamic("canceledChecks")(canceledChecks.asInstanceOf[js.Any])
    if (compliantChecks != null) __obj.updateDynamic("compliantChecks")(compliantChecks.asInstanceOf[js.Any])
    if (failedChecks != null) __obj.updateDynamic("failedChecks")(failedChecks.asInstanceOf[js.Any])
    if (inProgressChecks != null) __obj.updateDynamic("inProgressChecks")(inProgressChecks.asInstanceOf[js.Any])
    if (nonCompliantChecks != null) __obj.updateDynamic("nonCompliantChecks")(nonCompliantChecks.asInstanceOf[js.Any])
    if (totalChecks != null) __obj.updateDynamic("totalChecks")(totalChecks.asInstanceOf[js.Any])
    if (waitingForDataCollectionChecks != null) __obj.updateDynamic("waitingForDataCollectionChecks")(waitingForDataCollectionChecks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStatistics]
  }
}

