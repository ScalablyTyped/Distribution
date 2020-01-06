package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMonitoringExecutionsResponse extends js.Object {
  /**
    * A JSON array in which each element is a summary for a monitoring execution.
    */
  var MonitoringExecutionSummaries: MonitoringExecutionSummaryList = js.native
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in the subsequent reques
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.native
}

object ListMonitoringExecutionsResponse {
  @scala.inline
  def apply(MonitoringExecutionSummaries: MonitoringExecutionSummaryList, NextToken: NextToken = null): ListMonitoringExecutionsResponse = {
    val __obj = js.Dynamic.literal(MonitoringExecutionSummaries = MonitoringExecutionSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoringExecutionsResponse]
  }
}

