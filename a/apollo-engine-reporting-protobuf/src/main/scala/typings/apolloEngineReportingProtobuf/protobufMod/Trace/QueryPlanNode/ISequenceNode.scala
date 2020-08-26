package typings.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode

import typings.apolloEngineReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SequenceNode. */
@js.native
trait ISequenceNode extends js.Object {
  /** SequenceNode nodes */
  var nodes: js.UndefOr[js.Array[IQueryPlanNode] | Null] = js.native
}

object ISequenceNode {
  @scala.inline
  def apply(): ISequenceNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISequenceNode]
  }
  @scala.inline
  implicit class ISequenceNodeOps[Self <: ISequenceNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNodesVarargs(value: IQueryPlanNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[IQueryPlanNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    @scala.inline
    def setNodesNull: Self = this.set("nodes", null)
  }
  
}

