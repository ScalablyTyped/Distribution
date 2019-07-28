package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTraceGraphRequest extends js.Object {
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Trace IDs of requests for which to generate a service graph.
    */
  var TraceIds: TraceIdList
}

object GetTraceGraphRequest {
  @scala.inline
  def apply(TraceIds: TraceIdList, NextToken: String = null): GetTraceGraphRequest = {
    val __obj = js.Dynamic.literal(TraceIds = TraceIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetTraceGraphRequest]
  }
}

