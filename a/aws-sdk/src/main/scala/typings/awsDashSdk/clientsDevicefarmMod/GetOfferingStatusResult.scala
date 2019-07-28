package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOfferingStatusResult extends js.Object {
  /**
    * When specified, gets the offering status for the current period.
    */
  var current: js.UndefOr[OfferingStatusMap] = js.undefined
  /**
    * When specified, gets the offering status for the next period.
    */
  var nextPeriod: js.UndefOr[OfferingStatusMap] = js.undefined
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object GetOfferingStatusResult {
  @scala.inline
  def apply(
    current: OfferingStatusMap = null,
    nextPeriod: OfferingStatusMap = null,
    nextToken: PaginationToken = null
  ): GetOfferingStatusResult = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current)
    if (nextPeriod != null) __obj.updateDynamic("nextPeriod")(nextPeriod)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetOfferingStatusResult]
  }
}

