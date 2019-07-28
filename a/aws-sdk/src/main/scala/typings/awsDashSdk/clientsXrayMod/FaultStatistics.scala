package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaultStatistics extends js.Object {
  /**
    * The number of requests that failed with untracked 5xx Server Error status codes.
    */
  var OtherCount: js.UndefOr[NullableLong] = js.undefined
  /**
    * The total number of requests that failed with a 5xx Server Error status code.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.undefined
}

object FaultStatistics {
  @scala.inline
  def apply(
    OtherCount: js.UndefOr[NullableLong] = js.undefined,
    TotalCount: js.UndefOr[NullableLong] = js.undefined
  ): FaultStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(OtherCount)) __obj.updateDynamic("OtherCount")(OtherCount)
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount)
    __obj.asInstanceOf[FaultStatistics]
  }
}

