package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.QueryPlanNode

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
  def apply(fieldName: String = null, index: Int | Double = null): IResponsePathElement = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponsePathElement]
  }
}

