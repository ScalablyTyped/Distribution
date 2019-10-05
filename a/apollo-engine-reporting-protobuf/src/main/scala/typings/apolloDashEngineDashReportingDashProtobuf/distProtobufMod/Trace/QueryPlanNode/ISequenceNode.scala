package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.QueryPlanNode

import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.IQueryPlanNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SequenceNode. */
trait ISequenceNode extends js.Object {
  /** SequenceNode nodes */
  var nodes: js.UndefOr[js.Array[IQueryPlanNode] | Null] = js.undefined
}

object ISequenceNode {
  @scala.inline
  def apply(nodes: js.Array[IQueryPlanNode] = null): ISequenceNode = {
    val __obj = js.Dynamic.literal()
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[ISequenceNode]
  }
}

