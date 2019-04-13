package typings
package awsDashSdkLib.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReportDefinitionsResponse extends js.Object {
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
    * A list of AWS Cost and Usage reports owned by the account.
    */
  var ReportDefinitions: js.UndefOr[ReportDefinitionList] = js.undefined
}

object DescribeReportDefinitionsResponse {
  @scala.inline
  def apply(NextToken: GenericString = null, ReportDefinitions: ReportDefinitionList = null): DescribeReportDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ReportDefinitions != null) __obj.updateDynamic("ReportDefinitions")(ReportDefinitions)
    __obj.asInstanceOf[DescribeReportDefinitionsResponse]
  }
}

