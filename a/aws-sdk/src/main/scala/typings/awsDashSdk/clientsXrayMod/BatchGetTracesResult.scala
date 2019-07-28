package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetTracesResult extends js.Object {
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Full traces for the specified requests.
    */
  var Traces: js.UndefOr[TraceList] = js.undefined
  /**
    * Trace IDs of requests that haven't been processed.
    */
  var UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList] = js.undefined
}

object BatchGetTracesResult {
  @scala.inline
  def apply(
    NextToken: String = null,
    Traces: TraceList = null,
    UnprocessedTraceIds: UnprocessedTraceIdList = null
  ): BatchGetTracesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Traces != null) __obj.updateDynamic("Traces")(Traces)
    if (UnprocessedTraceIds != null) __obj.updateDynamic("UnprocessedTraceIds")(UnprocessedTraceIds)
    __obj.asInstanceOf[BatchGetTracesResult]
  }
}

