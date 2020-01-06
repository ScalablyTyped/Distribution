package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointsOutput extends js.Object {
  /**
    *  An array or endpoint objects. 
    */
  var Endpoints: EndpointSummaryList = js.native
  /**
    *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use it in the subsequent request. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListEndpointsOutput {
  @scala.inline
  def apply(Endpoints: EndpointSummaryList, NextToken: PaginationToken = null): ListEndpointsOutput = {
    val __obj = js.Dynamic.literal(Endpoints = Endpoints.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointsOutput]
  }
}

