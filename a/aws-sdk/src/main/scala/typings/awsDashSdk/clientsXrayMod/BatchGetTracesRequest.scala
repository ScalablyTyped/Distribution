package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetTracesRequest extends js.Object {
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Specify the trace IDs of requests for which to retrieve segments.
    */
  var TraceIds: TraceIdList = js.native
}

object BatchGetTracesRequest {
  @scala.inline
  def apply(TraceIds: TraceIdList, NextToken: String = null): BatchGetTracesRequest = {
    val __obj = js.Dynamic.literal(TraceIds = TraceIds.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetTracesRequest]
  }
}

