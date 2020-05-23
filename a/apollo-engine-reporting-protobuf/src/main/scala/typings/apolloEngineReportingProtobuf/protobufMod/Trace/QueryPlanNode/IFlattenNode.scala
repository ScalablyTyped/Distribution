package typings.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode

import typings.apolloEngineReportingProtobuf.protobufMod.Trace.IQueryPlanNode
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
  def apply(
    node: js.UndefOr[Null | IQueryPlanNode] = js.undefined,
    responsePath: js.UndefOr[Null | js.Array[IResponsePathElement]] = js.undefined
  ): IFlattenNode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(node)) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (!js.isUndefined(responsePath)) __obj.updateDynamic("responsePath")(responsePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFlattenNode]
  }
}

