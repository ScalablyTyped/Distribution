package typings.awsDashSdk.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReportDefinitionsResponse extends js.Object {
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * A list of AWS Cost and Usage reports owned by the account.
    */
  var ReportDefinitions: js.UndefOr[ReportDefinitionList] = js.native
}

object DescribeReportDefinitionsResponse {
  @scala.inline
  def apply(NextToken: GenericString = null, ReportDefinitions: ReportDefinitionList = null): DescribeReportDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ReportDefinitions != null) __obj.updateDynamic("ReportDefinitions")(ReportDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReportDefinitionsResponse]
  }
}

