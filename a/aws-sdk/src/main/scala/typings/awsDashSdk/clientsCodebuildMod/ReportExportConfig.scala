package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportExportConfig extends js.Object {
  /**
    *  The export configuration type. Valid values are:     S3: The report results are exported to an S3 bucket.     NO_EXPORT: The report results are not exported.   
    */
  var exportConfigType: js.UndefOr[ReportExportConfigType] = js.native
  /**
    *  A S3ReportExportConfig object that contains information about the S3 bucket where the run of a report is exported. 
    */
  var s3Destination: js.UndefOr[S3ReportExportConfig] = js.native
}

object ReportExportConfig {
  @scala.inline
  def apply(exportConfigType: ReportExportConfigType = null, s3Destination: S3ReportExportConfig = null): ReportExportConfig = {
    val __obj = js.Dynamic.literal()
    if (exportConfigType != null) __obj.updateDynamic("exportConfigType")(exportConfigType.asInstanceOf[js.Any])
    if (s3Destination != null) __obj.updateDynamic("s3Destination")(s3Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportExportConfig]
  }
}

