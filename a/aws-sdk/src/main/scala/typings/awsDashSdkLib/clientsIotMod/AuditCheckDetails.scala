package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditCheckDetails extends js.Object {
  /**
    * True if the check completed and found all resources compliant.
    */
  var checkCompliant: js.UndefOr[CheckCompliant] = js.undefined
  /**
    * The completion status of this check, one of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
    */
  var checkRunStatus: js.UndefOr[AuditCheckRunStatus] = js.undefined
  /**
    * The code of any error encountered when performing this check during this audit. One of "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  /**
    * The message associated with any error encountered when performing this check during this audit.
    */
  var message: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * The number of resources that the check found non-compliant.
    */
  var nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount] = js.undefined
  /**
    * The number of resources on which the check was performed.
    */
  var totalResourcesCount: js.UndefOr[TotalResourcesCount] = js.undefined
}

object AuditCheckDetails {
  @scala.inline
  def apply(
    checkCompliant: js.UndefOr[CheckCompliant] = js.undefined,
    checkRunStatus: AuditCheckRunStatus = null,
    errorCode: ErrorCode = null,
    message: ErrorMessage = null,
    nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount] = js.undefined,
    totalResourcesCount: js.UndefOr[TotalResourcesCount] = js.undefined
  ): AuditCheckDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkCompliant)) __obj.updateDynamic("checkCompliant")(checkCompliant)
    if (checkRunStatus != null) __obj.updateDynamic("checkRunStatus")(checkRunStatus.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(nonCompliantResourcesCount)) __obj.updateDynamic("nonCompliantResourcesCount")(nonCompliantResourcesCount)
    if (!js.isUndefined(totalResourcesCount)) __obj.updateDynamic("totalResourcesCount")(totalResourcesCount)
    __obj.asInstanceOf[AuditCheckDetails]
  }
}

