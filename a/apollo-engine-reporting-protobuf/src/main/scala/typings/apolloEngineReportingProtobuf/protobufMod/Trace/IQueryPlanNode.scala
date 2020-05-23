package typings.apolloEngineReportingProtobuf.protobufMod.Trace

import typings.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFetchNode
import typings.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFlattenNode
import typings.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode.IParallelNode
import typings.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode.ISequenceNode
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
    fetch: js.UndefOr[Null | IFetchNode] = js.undefined,
    flatten: js.UndefOr[Null | IFlattenNode] = js.undefined,
    parallel: js.UndefOr[Null | IParallelNode] = js.undefined,
    sequence: js.UndefOr[Null | ISequenceNode] = js.undefined
  ): IQueryPlanNode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fetch)) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten.asInstanceOf[js.Any])
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (!js.isUndefined(sequence)) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryPlanNode]
  }
}

