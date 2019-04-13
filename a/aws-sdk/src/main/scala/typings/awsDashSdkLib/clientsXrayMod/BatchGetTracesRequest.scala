package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetTracesRequest extends js.Object {
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Specify the trace IDs of requests for which to retrieve segments.
    */
  var TraceIds: TraceIdList
}

object BatchGetTracesRequest {
  @scala.inline
  def apply(TraceIds: TraceIdList, NextToken: String = null): BatchGetTracesRequest = {
    val __obj = js.Dynamic.literal(TraceIds = TraceIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[BatchGetTracesRequest]
  }
}

