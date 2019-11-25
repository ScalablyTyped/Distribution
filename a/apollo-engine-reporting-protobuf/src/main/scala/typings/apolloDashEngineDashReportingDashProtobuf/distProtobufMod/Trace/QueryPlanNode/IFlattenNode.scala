package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.QueryPlanNode

import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.IQueryPlanNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FlattenNode. */
trait IFlattenNode extends js.Object {
  /** FlattenNode node */
  var node: js.UndefOr[IQueryPlanNode | Null] = js.undefined
  /** FlattenNode responsePath */
  var responsePath: js.UndefOr[js.Array[IResponsePathElement] | Null] = js.undefined
}

object IFlattenNode {
  @scala.inline
  def apply(node: IQueryPlanNode = null, responsePath: js.Array[IResponsePathElement] = null): IFlattenNode = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (responsePath != null) __obj.updateDynamic("responsePath")(responsePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFlattenNode]
  }
}

