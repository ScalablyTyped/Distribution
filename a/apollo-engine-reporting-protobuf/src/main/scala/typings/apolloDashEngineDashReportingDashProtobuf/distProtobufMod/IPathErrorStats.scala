package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPathErrorStats extends js.Object {
  /** PathErrorStats children */
  var children: js.UndefOr[StringDictionary[IPathErrorStats] | Null] = js.undefined
  /** PathErrorStats errorsCount */
  var errorsCount: js.UndefOr[Double | Null] = js.undefined
  /** PathErrorStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.undefined
}

object IPathErrorStats {
  @scala.inline
  def apply(
    children: StringDictionary[IPathErrorStats] = null,
    errorsCount: Int | Double = null,
    requestsWithErrorsCount: Int | Double = null
  ): IPathErrorStats = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (errorsCount != null) __obj.updateDynamic("errorsCount")(errorsCount.asInstanceOf[js.Any])
    if (requestsWithErrorsCount != null) __obj.updateDynamic("requestsWithErrorsCount")(requestsWithErrorsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathErrorStats]
  }
}

