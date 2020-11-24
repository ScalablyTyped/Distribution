package typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode

import typings.apolloReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ParallelNode. */
@js.native
trait IParallelNode extends js.Object {
  
  /** ParallelNode nodes */
  var nodes: js.UndefOr[js.Array[IQueryPlanNode] | Null] = js.native
}
object IParallelNode {
  
  @scala.inline
  def apply(): IParallelNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParallelNode]
  }
  
  @scala.inline
  implicit class IParallelNodeOps[Self <: IParallelNode] (val x: Self) extends AnyVal {
    
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
