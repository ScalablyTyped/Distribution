package typings.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ResponsePathElement. */
trait IResponsePathElement extends js.Object {
  /** ResponsePathElement fieldName */
  var fieldName: js.UndefOr[String | Null] = js.undefined
  /** ResponsePathElement index */
  var index: js.UndefOr[Double | Null] = js.undefined
}

object IResponsePathElement {
  @scala.inline
  def apply(
    fieldName: js.UndefOr[Null | String] = js.undefined,
    index: js.UndefOr[Null | Double] = js.undefined
  ): IResponsePathElement = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fieldName)) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponsePathElement]
  }
}

