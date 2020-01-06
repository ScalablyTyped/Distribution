package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointConfigsOutput extends js.Object {
  /**
    * An array of endpoint configurations.
    */
  var EndpointConfigs: EndpointConfigSummaryList = js.native
  /**
    *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of endpoint configurations, use it in the subsequent request 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListEndpointConfigsOutput {
  @scala.inline
  def apply(EndpointConfigs: EndpointConfigSummaryList, NextToken: PaginationToken = null): ListEndpointConfigsOutput = {
    val __obj = js.Dynamic.literal(EndpointConfigs = EndpointConfigs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointConfigsOutput]
  }
}

