package typings.apolloReportingProtobuf.protobufMod.Trace

import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFetchNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFlattenNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IParallelNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ISequenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a QueryPlanNode. */
@js.native
trait IQueryPlanNode extends js.Object {
  
  /** QueryPlanNode fetch */
  var fetch: js.UndefOr[IFetchNode | Null] = js.native
  
  /** QueryPlanNode flatten */
  var flatten: js.UndefOr[IFlattenNode | Null] = js.native
  
  /** QueryPlanNode parallel */
  var parallel: js.UndefOr[IParallelNode | Null] = js.native
  
  /** QueryPlanNode sequence */
  var sequence: js.UndefOr[ISequenceNode | Null] = js.native
}
object IQueryPlanNode {
  
  @scala.inline
  def apply(): IQueryPlanNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryPlanNode]
  }
  
  @scala.inline
  implicit class IQueryPlanNodeOps[Self <: IQueryPlanNode] (val x: Self) extends AnyVal {
    
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
    def setFetch(value: IFetchNode): Self = this.set("fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    
    @scala.inline
    def setFetchNull: Self = this.set("fetch", null)
    
    @scala.inline
    def setFlatten(value: IFlattenNode): Self = this.set("flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    
    @scala.inline
    def setFlattenNull: Self = this.set("flatten", null)
    
    @scala.inline
    def setParallel(value: IParallelNode): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    
    @scala.inline
    def setParallelNull: Self = this.set("parallel", null)
    
    @scala.inline
    def setSequence(value: ISequenceNode): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    
    @scala.inline
    def setSequenceNull: Self = this.set("sequence", null)
  }
}
