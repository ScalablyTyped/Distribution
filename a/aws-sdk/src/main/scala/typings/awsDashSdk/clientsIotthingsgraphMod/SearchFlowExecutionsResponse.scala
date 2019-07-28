package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFlowExecutionsResponse extends js.Object {
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An array of objects that contain summary information about each workflow execution in the result set.
    */
  var summaries: js.UndefOr[FlowExecutionSummaries] = js.undefined
}

object SearchFlowExecutionsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, summaries: FlowExecutionSummaries = null): SearchFlowExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (summaries != null) __obj.updateDynamic("summaries")(summaries)
    __obj.asInstanceOf[SearchFlowExecutionsResponse]
  }
}

