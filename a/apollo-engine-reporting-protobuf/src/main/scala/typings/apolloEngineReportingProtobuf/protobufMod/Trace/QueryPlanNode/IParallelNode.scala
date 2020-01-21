package typings.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode

import typings.apolloEngineReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ParallelNode. */
trait IParallelNode extends js.Object {
  /** ParallelNode nodes */
  var nodes: js.UndefOr[js.Array[IQueryPlanNode] | Null] = js.undefined
}

object IParallelNode {
  @scala.inline
  def apply(nodes: js.Array[IQueryPlanNode] = null): IParallelNode = {
    val __obj = js.Dynamic.literal()
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParallelNode]
  }
}

