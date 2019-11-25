package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace

import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.QueryPlanNode.IFetchNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.QueryPlanNode.IFlattenNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.QueryPlanNode.IParallelNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.QueryPlanNode.ISequenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a QueryPlanNode. */
trait IQueryPlanNode extends js.Object {
  /** QueryPlanNode fetch */
  var fetch: js.UndefOr[IFetchNode | Null] = js.undefined
  /** QueryPlanNode flatten */
  var flatten: js.UndefOr[IFlattenNode | Null] = js.undefined
  /** QueryPlanNode parallel */
  var parallel: js.UndefOr[IParallelNode | Null] = js.undefined
  /** QueryPlanNode sequence */
  var sequence: js.UndefOr[ISequenceNode | Null] = js.undefined
}

object IQueryPlanNode {
  @scala.inline
  def apply(
    fetch: IFetchNode = null,
    flatten: IFlattenNode = null,
    parallel: IParallelNode = null,
    sequence: ISequenceNode = null
  ): IQueryPlanNode = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (flatten != null) __obj.updateDynamic("flatten")(flatten.asInstanceOf[js.Any])
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryPlanNode]
  }
}

