package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateReportGroupInput extends js.Object {
  /**
    *  The ARN of the report group to update. 
    */
  var arn: NonEmptyString = js.native
  /**
    *  Used to specify an updated export type. Valid values are:     S3: The report results are exported to an S3 bucket.     NO_EXPORT: The report results are not exported.   
    */
  var exportConfig: js.UndefOr[ReportExportConfig] = js.native
}

object UpdateReportGroupInput {
  @scala.inline
  def apply(arn: NonEmptyString, exportConfig: ReportExportConfig = null): UpdateReportGroupInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (exportConfig != null) __obj.updateDynamic("exportConfig")(exportConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReportGroupInput]
  }
}

