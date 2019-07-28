package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFlowsResponse extends js.Object {
  /**
    * A list of flow summaries.
    */
  var Flows: js.UndefOr[__listOfListedFlow] = js.undefined
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListFlows request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListFlows request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListFlowsResponse {
  @scala.inline
  def apply(Flows: __listOfListedFlow = null, NextToken: __string = null): ListFlowsResponse = {
    val __obj = js.Dynamic.literal()
    if (Flows != null) __obj.updateDynamic("Flows")(Flows)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFlowsResponse]
  }
}

