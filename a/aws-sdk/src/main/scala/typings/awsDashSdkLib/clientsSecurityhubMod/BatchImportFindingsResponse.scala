package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchImportFindingsResponse extends js.Object {
  /**
    * The number of findings that cannot be imported.
    */
  var FailedCount: Integer
  /**
    * The list of the findings that cannot be imported.
    */
  var FailedFindings: js.UndefOr[ImportFindingsErrorList] = js.undefined
  /**
    * The number of findings that were successfully imported
    */
  var SuccessCount: Integer
}

object BatchImportFindingsResponse {
  @scala.inline
  def apply(FailedCount: Integer, SuccessCount: Integer, FailedFindings: ImportFindingsErrorList = null): BatchImportFindingsResponse = {
    val __obj = js.Dynamic.literal(FailedCount = FailedCount, SuccessCount = SuccessCount)
    if (FailedFindings != null) __obj.updateDynamic("FailedFindings")(FailedFindings)
    __obj.asInstanceOf[BatchImportFindingsResponse]
  }
}

