package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageClassAnalysis extends js.Object {
  /**
    * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be exported.
    */
  var DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.native
}

object StorageClassAnalysis {
  @scala.inline
  def apply(DataExport: StorageClassAnalysisDataExport = null): StorageClassAnalysis = {
    val __obj = js.Dynamic.literal()
    if (DataExport != null) __obj.updateDynamic("DataExport")(DataExport.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClassAnalysis]
  }
}

