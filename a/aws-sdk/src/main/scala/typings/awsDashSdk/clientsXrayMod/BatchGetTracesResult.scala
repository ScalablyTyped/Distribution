package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetTracesResult extends js.Object {
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Full traces for the specified requests.
    */
  var Traces: js.UndefOr[TraceList] = js.native
  /**
    * Trace IDs of requests that haven't been processed.
    */
  var UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList] = js.native
}

object BatchGetTracesResult {
  @scala.inline
  def apply(
    NextToken: String = null,
    Traces: TraceList = null,
    UnprocessedTraceIds: UnprocessedTraceIdList = null
  ): BatchGetTracesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Traces != null) __obj.updateDynamic("Traces")(Traces.asInstanceOf[js.Any])
    if (UnprocessedTraceIds != null) __obj.updateDynamic("UnprocessedTraceIds")(UnprocessedTraceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetTracesResult]
  }
}

