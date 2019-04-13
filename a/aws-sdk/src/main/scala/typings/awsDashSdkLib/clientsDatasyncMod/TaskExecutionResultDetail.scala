package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskExecutionResultDetail extends js.Object {
  /**
    * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help troubleshoot issues.
    */
  var ErrorCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Detailed description of an error that was encountered during the task execution. You can use this information to help troubleshoot issues. 
    */
  var ErrorDetail: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The total time in milliseconds that AWS DataSync spent in the PREPARING phase. 
    */
  var PrepareDuration: js.UndefOr[Duration] = js.undefined
  /**
    * The status of the PREPARING phase.
    */
  var PrepareStatus: js.UndefOr[PhaseStatus] = js.undefined
  /**
    * The total time in milliseconds that AWS DataSync spent in the TRANSFERRING phase.
    */
  var TransferDuration: js.UndefOr[Duration] = js.undefined
  /**
    * The status of the TRANSFERRING Phase.
    */
  var TransferStatus: js.UndefOr[PhaseStatus] = js.undefined
  /**
    * The total time in milliseconds that AWS DataSync spent in the VERIFYING phase.
    */
  var VerifyDuration: js.UndefOr[Duration] = js.undefined
  /**
    * The status of the VERIFYING Phase.
    */
  var VerifyStatus: js.UndefOr[PhaseStatus] = js.undefined
}

object TaskExecutionResultDetail {
  @scala.inline
  def apply(
    ErrorCode: java.lang.String = null,
    ErrorDetail: java.lang.String = null,
    PrepareDuration: js.UndefOr[Duration] = js.undefined,
    PrepareStatus: PhaseStatus = null,
    TransferDuration: js.UndefOr[Duration] = js.undefined,
    TransferStatus: PhaseStatus = null,
    VerifyDuration: js.UndefOr[Duration] = js.undefined,
    VerifyStatus: PhaseStatus = null
  ): TaskExecutionResultDetail = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorDetail != null) __obj.updateDynamic("ErrorDetail")(ErrorDetail)
    if (!js.isUndefined(PrepareDuration)) __obj.updateDynamic("PrepareDuration")(PrepareDuration)
    if (PrepareStatus != null) __obj.updateDynamic("PrepareStatus")(PrepareStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(TransferDuration)) __obj.updateDynamic("TransferDuration")(TransferDuration)
    if (TransferStatus != null) __obj.updateDynamic("TransferStatus")(TransferStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(VerifyDuration)) __obj.updateDynamic("VerifyDuration")(VerifyDuration)
    if (VerifyStatus != null) __obj.updateDynamic("VerifyStatus")(VerifyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskExecutionResultDetail]
  }
}

