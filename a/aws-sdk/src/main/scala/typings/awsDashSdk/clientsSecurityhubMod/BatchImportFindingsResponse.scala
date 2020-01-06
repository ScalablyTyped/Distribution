package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchImportFindingsResponse extends js.Object {
  /**
    * The number of findings that failed to import.
    */
  var FailedCount: Integer = js.native
  /**
    * The list of the findings that failed to import.
    */
  var FailedFindings: js.UndefOr[ImportFindingsErrorList] = js.native
  /**
    * The number of findings that were successfully imported.
    */
  var SuccessCount: Integer = js.native
}

object BatchImportFindingsResponse {
  @scala.inline
  def apply(FailedCount: Integer, SuccessCount: Integer, FailedFindings: ImportFindingsErrorList = null): BatchImportFindingsResponse = {
    val __obj = js.Dynamic.literal(FailedCount = FailedCount.asInstanceOf[js.Any], SuccessCount = SuccessCount.asInstanceOf[js.Any])
    if (FailedFindings != null) __obj.updateDynamic("FailedFindings")(FailedFindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchImportFindingsResponse]
  }
}

