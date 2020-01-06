package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Report extends js.Object {
  /**
    *  The ARN of the report run. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The date and time this report run occurred. 
    */
  var created: js.UndefOr[Timestamp] = js.native
  /**
    *  The ARN of the build run that generated this report. 
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    *  The date and time a report expires. A report expires 30 days after it is created. An expired report is not available to view in CodeBuild. 
    */
  var expired: js.UndefOr[Timestamp] = js.native
  /**
    *  Information about where the raw data used to generate this report was exported. 
    */
  var exportConfig: js.UndefOr[ReportExportConfig] = js.native
  /**
    *  The name of the report that was run. 
    */
  var name: js.UndefOr[String] = js.native
  /**
    *  The ARN of the report group associated with this report. 
    */
  var reportGroupArn: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The status of this report. 
    */
  var status: js.UndefOr[ReportStatusType] = js.native
  /**
    *  A TestReportSummary object that contains information about this test report. 
    */
  var testSummary: js.UndefOr[TestReportSummary] = js.native
  /**
    *  A boolean that specifies if this report run is truncated. The list of test cases is truncated after the maximum number of test cases is reached. 
    */
  var truncated: js.UndefOr[WrapperBoolean] = js.native
  /**
    *  The type of the report that was run. 
    */
  var `type`: js.UndefOr[ReportType] = js.native
}

object Report {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    created: Timestamp = null,
    executionId: String = null,
    expired: Timestamp = null,
    exportConfig: ReportExportConfig = null,
    name: String = null,
    reportGroupArn: NonEmptyString = null,
    status: ReportStatusType = null,
    testSummary: TestReportSummary = null,
    truncated: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: ReportType = null
  ): Report = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (executionId != null) __obj.updateDynamic("executionId")(executionId.asInstanceOf[js.Any])
    if (expired != null) __obj.updateDynamic("expired")(expired.asInstanceOf[js.Any])
    if (exportConfig != null) __obj.updateDynamic("exportConfig")(exportConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (reportGroupArn != null) __obj.updateDynamic("reportGroupArn")(reportGroupArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (testSummary != null) __obj.updateDynamic("testSummary")(testSummary.asInstanceOf[js.Any])
    if (!js.isUndefined(truncated)) __obj.updateDynamic("truncated")(truncated.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Report]
  }
}

