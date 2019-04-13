package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFlowLogsResult extends js.Object {
  /**
    * Information about the flow logs.
    */
  var FlowLogs: js.UndefOr[FlowLogSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeFlowLogsResult {
  @scala.inline
  def apply(FlowLogs: FlowLogSet = null, NextToken: String = null): DescribeFlowLogsResult = {
    val __obj = js.Dynamic.literal()
    if (FlowLogs != null) __obj.updateDynamic("FlowLogs")(FlowLogs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeFlowLogsResult]
  }
}

