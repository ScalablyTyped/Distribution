package typings.apolloEngineReportingProtobuf.protobufMod

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
    children: js.UndefOr[Null | StringDictionary[IPathErrorStats]] = js.undefined,
    errorsCount: js.UndefOr[Null | Double] = js.undefined,
    requestsWithErrorsCount: js.UndefOr[Null | Double] = js.undefined
  ): IPathErrorStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(errorsCount)) __obj.updateDynamic("errorsCount")(errorsCount.asInstanceOf[js.Any])
    if (!js.isUndefined(requestsWithErrorsCount)) __obj.updateDynamic("requestsWithErrorsCount")(requestsWithErrorsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathErrorStats]
  }
}

