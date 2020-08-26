package typings.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode

import typings.apolloEngineReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FlattenNode. */
@js.native
trait IFlattenNode extends js.Object {
  /** FlattenNode node */
  var node: js.UndefOr[IQueryPlanNode | Null] = js.native
  /** FlattenNode responsePath */
  var responsePath: js.UndefOr[js.Array[IResponsePathElement] | Null] = js.native
}

object IFlattenNode {
  @scala.inline
  def apply(): IFlattenNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFlattenNode]
  }
  @scala.inline
  implicit class IFlattenNodeOps[Self <: IFlattenNode] (val x: Self) extends AnyVal {
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
    def setNode(value: IQueryPlanNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setNodeNull: Self = this.set("node", null)
    @scala.inline
    def setResponsePathVarargs(value: IResponsePathElement*): Self = this.set("responsePath", js.Array(value :_*))
    @scala.inline
    def setResponsePath(value: js.Array[IResponsePathElement]): Self = this.set("responsePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsePath: Self = this.set("responsePath", js.undefined)
    @scala.inline
    def setResponsePathNull: Self = this.set("responsePath", null)
  }
  
}

