package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPathErrorStats extends js.Object {
  /** PathErrorStats children */
  var children: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IPathErrorStats] | scala.Null] = js.undefined
  /** PathErrorStats errorsCount */
  var errorsCount: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** PathErrorStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object IPathErrorStats {
  @scala.inline
  def apply(
    children: org.scalablytyped.runtime.StringDictionary[IPathErrorStats] = null,
    errorsCount: scala.Int | scala.Double = null,
    requestsWithErrorsCount: scala.Int | scala.Double = null
  ): IPathErrorStats = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (errorsCount != null) __obj.updateDynamic("errorsCount")(errorsCount.asInstanceOf[js.Any])
    if (requestsWithErrorsCount != null) __obj.updateDynamic("requestsWithErrorsCount")(requestsWithErrorsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathErrorStats]
  }
}

