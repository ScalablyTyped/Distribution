package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageClassAnalysis extends js.Object {
  /**
    * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be exported.
    */
  var DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.undefined
}

object StorageClassAnalysis {
  @scala.inline
  def apply(DataExport: StorageClassAnalysisDataExport = null): StorageClassAnalysis = {
    val __obj = js.Dynamic.literal()
    if (DataExport != null) __obj.updateDynamic("DataExport")(DataExport)
    __obj.asInstanceOf[StorageClassAnalysis]
  }
}

