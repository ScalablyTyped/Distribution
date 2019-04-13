package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteImportDataError extends js.Object {
  /**
    * The type of error that occurred for a specific import task.
    */
  var errorCode: js.UndefOr[BatchDeleteImportDataErrorCode] = js.undefined
  /**
    * The description of the error that occurred for a specific import task.
    */
  var errorDescription: js.UndefOr[BatchDeleteImportDataErrorDescription] = js.undefined
  /**
    * The unique import ID associated with the error that occurred.
    */
  var importTaskId: js.UndefOr[ImportTaskIdentifier] = js.undefined
}

object BatchDeleteImportDataError {
  @scala.inline
  def apply(
    errorCode: BatchDeleteImportDataErrorCode = null,
    errorDescription: BatchDeleteImportDataErrorDescription = null,
    importTaskId: ImportTaskIdentifier = null
  ): BatchDeleteImportDataError = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorDescription != null) __obj.updateDynamic("errorDescription")(errorDescription)
    if (importTaskId != null) __obj.updateDynamic("importTaskId")(importTaskId)
    __obj.asInstanceOf[BatchDeleteImportDataError]
  }
}

